package org.ttnmapper.phonesurveyor

import android.support.test.InstrumentationRegistry
import android.support.test.runner.AndroidJUnit4
import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith

/**
 * Instrumented org.ttnmapper.phonesurveyor.test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @Test
    fun useAppContext() {
        // Context of the app under org.ttnmapper.phonesurveyor.test.
        val appContext = InstrumentationRegistry.getTargetContext()
        assertEquals("org.ttnmapper.phonesurveyor", appContext.packageName)
    }
}
