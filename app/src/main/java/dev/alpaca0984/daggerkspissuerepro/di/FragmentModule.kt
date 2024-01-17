package dev.alpaca0984.daggerkspissuerepro.di

import dagger.Module
import dagger.android.ContributesAndroidInjector
import dev.alpaca0984.daggerkspissuerepro.Fragment1

@Module
abstract class FragmentModule {

    @ContributesAndroidInjector
    abstract fun fragment1(): Fragment1
}
