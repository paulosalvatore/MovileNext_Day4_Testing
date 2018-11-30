package br.com.paulosalvatore.movilenext_day4_testing

import android.widget.TextView
import org.hamcrest.CoreMatchers
import org.junit.Assert.*
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.Robolectric
import org.robolectric.RobolectricTestRunner

@RunWith(RobolectricTestRunner::class)
class MainActivityRoboletricTest {

    @Test
    fun loadActivity_shouldShowHelloWorld() {
        val activity = Robolectric.setupActivity(MainActivity::class.java)
        val viewById = activity.findViewById<TextView>(R.id.textView)
        assertThat<TextView>(viewById, CoreMatchers.notNullValue())
        assertThat(viewById.text.toString(), CoreMatchers.equalTo("Hello World!"))
    }

    @Test
    fun loadActivity_shouldShowHelloWorld2() {
        val activity = Robolectric.setupActivity(MainActivity::class.java)
        val viewById = activity.findViewById<TextView>(R.id.textView)
        assertThat<TextView>(viewById, CoreMatchers.notNullValue())
        assertThat(viewById.text.toString(), CoreMatchers.equalTo("Hello World!"))
    }
}
