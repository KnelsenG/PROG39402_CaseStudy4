package ca.sheridancollege.prog39402_casestudy4.ui.displayFragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.DrawableRes
import androidx.core.os.bundleOf
import androidx.lifecycle.ViewModelProviders
import ca.sheridancollege.prog39402_casestudy4.base.BaseFragment
import ca.sheridancollege.prog39402_casestudy4.databinding.FragmentDisplayBinding

class DisplayFragment : BaseFragment() {

    @DrawableRes
    private var param1: Int? = null
    private var param2: String? = null

    private lateinit var binding: FragmentDisplayBinding
    private lateinit var viewModel: DisplayFragmentViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProviders.of(this, viewModelFactory).get(DisplayFragmentViewModel::class.java)
        arguments?.let {
            viewModel.imageId.value = it.getInt(ARG_PARAM1)
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentDisplayBinding.inflate(inflater, container, false)
        binding.vm = viewModel
        return binding.root
    }

    companion object {

        const val ARG_PARAM1 = "image_resource"

        @JvmStatic
        fun newInstance(param1: Int) =
                DisplayFragment().apply {
                    arguments = bundleOf(Pair(ARG_PARAM1, param1))
                }
    }
}
