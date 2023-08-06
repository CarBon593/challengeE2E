package com.nttdata.runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = {"src/test/resources/features"},
        glue = "com.nttdata.stepdefinitions",
        plugin = "json:build/cucumber-reports/json/cucumber.json",
        tags = "@ejercicio001"
)
public class RunnerTest {
}
