package dev.alpaca0984.daggerkspissuerepro

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.ui.viewinterop.AndroidView
import androidx.core.view.ViewCompat
import androidx.fragment.app.FragmentContainerView
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import dev.alpaca0984.daggerkspissuerepro.di.activityComponent
import dev.alpaca0984.daggerkspissuerepro.ui.theme.DaggerKspIssueReproTheme
import javax.inject.Inject

class MainActivity : AppCompatActivity(), HasAndroidInjector {

    @Inject lateinit var androidInjector: DispatchingAndroidInjector<Any>

    override fun onCreate(savedInstanceState: Bundle?) {
        activityComponent.inject(this)
        super.onCreate(savedInstanceState)

        setContent {
            DaggerKspIssueReproTheme {
                AndroidView(
                    factory = {
                        FragmentContainerView(this)
                            .apply { id = ViewCompat.generateViewId() }
                            .also {
                                supportFragmentManager.beginTransaction()
                                    .add(it.id, Fragment1())
                                    .commit()
                            }
                    },
                )
            }
        }
    }

    override fun androidInjector(): AndroidInjector<Any> {
        return androidInjector
    }
}
