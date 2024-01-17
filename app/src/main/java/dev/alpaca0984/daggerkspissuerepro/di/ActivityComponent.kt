package dev.alpaca0984.daggerkspissuerepro.di

import dagger.Component
import dagger.android.AndroidInjectionModule
import dev.alpaca0984.daggerkspissuerepro.MainActivity

val activityComponent: ActivityComponent = DaggerActivityComponent.builder().build()

@Component(
    modules = [
        AndroidInjectionModule::class,
        FragmentModule::class,
    ]
)
interface ActivityComponent {

    fun inject(activity: MainActivity)
}
