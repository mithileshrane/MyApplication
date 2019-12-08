package com.example.myapplication.di

import com.example.myapplication.MainActivity
import com.example.myapplication.base.BaseActivity
import com.example.myapplication.di.scope.ActivityScope
import dagger.Module
import dagger.android.ContributesAndroidInjector


@Module
abstract class ActivityBuilder {
    @ContributesAndroidInjector
    abstract fun provideMainActivity(): MainActivity
}