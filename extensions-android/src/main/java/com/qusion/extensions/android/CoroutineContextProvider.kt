package com.qusion.extensions.android

import kotlinx.coroutines.Dispatchers
import kotlin.coroutines.CoroutineContext

/**
 * Provides the Dispatcher whe launching coroutines in ViewModels
 * Its injected in a constructor of the ViewModel
 *
 * Really useful for unit testing, since it can easily be mocked.
 * */
open class CoroutineContextProvider {
    open val Main: CoroutineContext by lazy { Dispatchers.Main }
    open val IO: CoroutineContext by lazy { Dispatchers.IO }
}
