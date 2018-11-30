package br.com.paulosalvatore.movilenext_day4_testing

import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.action.ViewActions.click
import android.support.test.espresso.action.ViewActions.typeText
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.matcher.ViewMatchers.*
import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import android.widget.TextView
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.CoreMatchers.notNullValue
import org.junit.Assert
import org.junit.Assert.*
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainActivityTest {

    @get:Rule
    val rule = ActivityTestRule(MainActivity::class.java)

    lateinit var activity: MainActivity

    @Before
    fun setUp() {
        activity = rule.activity
    }

    @Test
    fun loadActivity_shouldShowHelloWorld() {
        val viewById = activity.findViewById<TextView>(R.id.textView)
        Assert.assertThat<TextView>(viewById, notNullValue())
        Assert.assertThat(viewById.text.toString(), equalTo("Hello World!"))
    }

    @Test
    fun sendButton_shouldWriteHelloName() {
        onView(withHint("Type your name")).perform(typeText("Paulo Salvatore"))
        onView(withText("Send")).perform(click())
        onView(withText("Hello, Paulo Salvatore!")).check(matches(isDisplayed()))
    }
}
