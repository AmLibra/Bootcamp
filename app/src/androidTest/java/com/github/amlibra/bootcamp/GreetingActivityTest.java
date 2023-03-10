package com.github.amlibra.bootcamp;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

import android.content.Intent;

import androidx.test.core.app.ActivityScenario;
import androidx.test.core.app.ApplicationProvider;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class GreetingActivityTest {


    @Rule
    public ActivityScenarioRule<GreetingActivity> testRule = new ActivityScenarioRule<>(GreetingActivity.class);

    @Test
    public void testGreetingText() {
        Intent intent = new Intent(ApplicationProvider.getApplicationContext(), GreetingActivity.class);
        intent.putExtra("name", "John");
        ActivityScenario<GreetingActivity> scenario = ActivityScenario.launch(intent);

        onView(withId(R.id.greetingName)).check(matches(withText("Hello, John!")));
        scenario.close();
    }
}

