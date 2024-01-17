package dev.alpaca0984.daggerkspissuerepro.di

import dagger.Component
import dagger.android.support.AndroidSupportInjectionModule
import dev.alpaca0984.daggerkspissuerepro.MainActivity

val activityComponent: ActivityComponent = DaggerActivityComponent.builder().build()

@Component(
    modules = [
        AndroidSupportInjectionModule::class,
        FragmentModule::class,
    ]
)
interface ActivityComponent {

    fun inject(activity: MainActivity)
}
