package dev.alpaca0984.daggerkspissuerepro

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.ComposeView
import dagger.android.support.DaggerFragment
import dev.alpaca0984.daggerkspissuerepro.ui.theme.DaggerKspIssueReproTheme
import javax.inject.Inject

class Fragment1 : DaggerFragment() {

    @Inject lateinit var textGenerator: TextGenerator

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = ComposeView(requireContext()).apply {
        setContent {
            DaggerKspIssueReproTheme {
                Box(
                    modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.Center,
                ) {
                    Text(text = textGenerator.generate())
                }
            }
        }
    }
}
