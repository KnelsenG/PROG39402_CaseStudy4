package ca.sheridancollege.prog39402_casestudy4.ui.mainActivity

import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import ca.sheridancollege.prog39402_casestudy4.R
import ca.sheridancollege.prog39402_casestudy4.adapters.ViewPagerAdapter
import ca.sheridancollege.prog39402_casestudy4.base.BaseActivity
import ca.sheridancollege.prog39402_casestudy4.data.model.Source
import ca.sheridancollege.prog39402_casestudy4.databinding.ActivityMainBinding

class MainActivity : BaseActivity() {

    private lateinit var binding: ActivityMainBinding

    private lateinit var viewModel: MainActivityViewModel

    private lateinit var adapter: ViewPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        init()
        initViews()
        initObservables()
    }

    private fun init() {
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        viewModel = ViewModelProviders.of(this, viewModelFactory).get(MainActivityViewModel::class.java)
    }

    private fun initViews() {

        if (!::adapter.isInitialized){
            val sources = listOf<Source>(
                    Source("Colorful Hallway",R.drawable.img1),
                    Source("Comfy Dogs",R.drawable.img2),
                    Source("Pac Man?",R.drawable.img3),
                    Source("Burger Person",R.drawable.img4),
                    Source("Smiling Shrub",R.drawable.img5)
            )
            adapter = ViewPagerAdapter(supportFragmentManager, sources)
        }

        binding.apply {

            this@MainActivity.setSupportActionBar(toolbar)

            content.viewPager.adapter = adapter
            content.tabLayout.setupWithViewPager(content.viewPager)

            viewModel = this@MainActivity.viewModel
        }
    }

    private fun initObservables() {
//        nothing to dd here
    }
}
