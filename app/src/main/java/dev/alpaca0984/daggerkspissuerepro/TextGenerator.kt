package dev.alpaca0984.daggerkspissuerepro

import javax.inject.Inject

class TextGenerator @Inject constructor() {

    fun generate() = "reproduce an issue filed in https://github.com/google/dagger/issues/4181"
}
