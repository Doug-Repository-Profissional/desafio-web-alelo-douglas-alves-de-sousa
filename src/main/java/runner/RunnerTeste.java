package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/main/resources/features", glue = "br/com/desafio/alelo/business", plugin = "pretty", monochrome = true, tags = "@correios")
public class RunnerTeste {

}