package com.example.calculatorapi

import io.cucumber.java.en.Given
import io.cucumber.java.en.Then
import io.cucumber.java.en.When
import org.junit.jupiter.api.Assertions.assertEquals
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class CalculatorSteps {

	private var num1: Double = 0.0
	private var num2: Double = 0.0
	private var result: Double = 0.0

	@Given("I have numbers {double} and {double}")
	fun givenNumbers(n1: Double, n2: Double) {
		num1 = n1
		num2 = n2
	}

	@When("I add them")
	fun addNumbers() {
		result = num1 + num2
	}

	@When("I subtract them")
	fun subtractNumbers() {
		result = num1 - num2
	}

	@When("I multiply them")
	fun multiplyNumbers() {
		result = num1 * num2
	}

	@When("I divide them")
	fun divideNumbers() {
		result = num1 / num2
	}

	@Then("the result should be {double}")
	fun verifyResult(expectedResult: Double) {
		assertEquals(expectedResult, result, 0.0001)
	}
}