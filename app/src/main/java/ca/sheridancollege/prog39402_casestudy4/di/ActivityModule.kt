package ca.sheridancollege.prog39402_casestudy4.di

import ca.sheridancollege.prog39402_casestudy4.ui.mainActivity.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityModule {

    @ContributesAndroidInjector(modules = [FragmentModule::class])
    abstract fun bindMainActivity(): MainActivity

}
