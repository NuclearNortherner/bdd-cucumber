package in.blagush.study.bdd.steps;

import in.blagush.study.bdd.Calculator;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class CalculatorStepsDef {

    private Calculator calculator = new Calculator();
    private int a;
    private int b;

    @Given("first int is {int} and second int is {int} for summarize")
    public void initializeDataForSummarize(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Then("summarize result will be {int}")
    public void startSummarize(int result) {
        Assert.assertEquals(result, calculator.summarize(a, b));
    }

    @Given("first int is {int} and second int is {int} for multiply")
    public void initializeDataForMultiply(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Then("multiply result will be {int}")
    public void startMultiply(int result) {
        Assert.assertEquals(result, calculator.multiply(a, b));
    }
}
