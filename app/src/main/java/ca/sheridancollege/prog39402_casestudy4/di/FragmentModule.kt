package ca.sheridancollege.prog39402_casestudy4.di

import ca.sheridancollege.prog39402_casestudy4.ui.displayFragment.DisplayFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class FragmentModule {

    @ContributesAndroidInjector
    abstract fun bindDisplayFragment(): DisplayFragment

}
