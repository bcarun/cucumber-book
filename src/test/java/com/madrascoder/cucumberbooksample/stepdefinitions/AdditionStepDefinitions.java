package com.madrascoder.cucumberbooksample.stepdefinitions;

import static org.assertj.core.api.Assertions.assertThat;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AdditionStepDefinitions {

  private int firstNumber;
  private int secondNumber;
  private int calculatedSum;

  @Given("first number is {int}")
  public void firstNumberIs(int firstNumber) {
    this.firstNumber = firstNumber;
  }

  @And("second number is {int}")
  public void secondNumberIs(int secondNumber) {
    this.secondNumber = secondNumber;
  }

  @When("user executes sum function")
  public void userExecutesSumFunction() {
    calculatedSum = firstNumber + secondNumber;
  }

  @Then("the sum is {int}")
  public void theSumIs(int expectedSum) {
    assertThat(calculatedSum).isEqualTo(expectedSum);
  }
}
