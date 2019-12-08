package com.example.myapplication.di

import com.example.myapplication.ui.main.MainFragment
import com.example.myapplication.ui.main.MainViewModel
import dagger.Module
import dagger.Provides
import dagger.android.ContributesAndroidInjector

@Module
abstract class FragmentModule {

    @ContributesAndroidInjector(modules = [
        ProvideViewModel::class // Install module in the generated subcomponent
    ])
    abstract fun contributeMainFragment(): MainFragment

    /* Module that provides factory and is installed in the generated subcomponent */
    @Module
    class ProvideViewModel {
    }
}