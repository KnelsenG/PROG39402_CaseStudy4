package ca.sheridancollege.prog39402_casestudy4.adapters

import androidx.annotation.DrawableRes
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import ca.sheridancollege.prog39402_casestudy4.data.model.Source
import ca.sheridancollege.prog39402_casestudy4.ui.displayFragment.DisplayFragment

class ViewPagerAdapter(
        fm: FragmentManager,
        @DrawableRes val sources: List<Source>
) : FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment? {
        return DisplayFragment.newInstance(sources[position].resId)
    }

    override fun getCount(): Int {
        return sources.size
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return sources[position].title
    }
}
