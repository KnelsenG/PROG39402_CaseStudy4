package ca.sheridancollege.prog39402_casestudy4.di.module

import android.app.Application
import android.content.Context
import ca.sheridancollege.prog39402_casestudy3.di.modules.viewmodel.ViewModelModule
import ca.sheridancollege.prog39402_casestudy4.di.module.activities.MainModule
import dagger.Binds
import dagger.Module
import javax.inject.Singleton

@Module(includes = [
    ViewModelModule::class,
    MainModule::class
])
abstract class AppModule {

    @Binds
    @Singleton
    abstract fun provideContext(application: Application): Context

}