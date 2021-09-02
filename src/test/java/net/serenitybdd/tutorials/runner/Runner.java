package net.serenitybdd.tutorials.runner;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        glue = {"net.serenitybdd.tutorials"},
        features = {"src/test/resources/features/"},
        plugin = {
                "pretty"}
)
public class Runner {
}
