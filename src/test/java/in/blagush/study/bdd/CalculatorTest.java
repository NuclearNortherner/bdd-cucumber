package in.blagush.study.bdd;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = "pretty",
        monochrome = true,
        tags = "@calculate",
        glue = "in.blagush.study.bdd",
        features = "classpath:in.blagush.study.bdd.features"
)
public class CalculatorTest {
}
