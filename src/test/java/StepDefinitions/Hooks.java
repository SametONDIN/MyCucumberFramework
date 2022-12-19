package StepDefinitions;

import Utilities.GWD;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public static void before()
    {

    }

    @After
    public static void after()
    {
        GWD.quitDriver();
    }



}
