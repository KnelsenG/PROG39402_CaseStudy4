package ca.sheridancollege.prog39402_casestudy3.di.modules.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import ca.sheridancollege.prog39402_casestudy4.ui.displayFragment.DisplayFragmentViewModel
import ca.sheridancollege.prog39402_casestudy4.ui.mainActivity.MainActivityViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class ViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(MainActivityViewModel::class)
    abstract fun bindMainActivityViewModel(viewModel: MainActivityViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(DisplayFragmentViewModel::class)
    abstract fun bindDisplayFragmentViewModel(viewModel: DisplayFragmentViewModel): ViewModel

    @Binds
    abstract fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory
}
