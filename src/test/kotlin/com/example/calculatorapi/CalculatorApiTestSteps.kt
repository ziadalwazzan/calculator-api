package com.example.calculatorapi

import io.cucumber.junit.Cucumber
import io.cucumber.spring.CucumberContextConfiguration
import org.springframework.test.context.ContextConfiguration
import io.cucumber.junit.CucumberOptions
import io.cucumber.java.en.Given
import io.cucumber.java.en.Then
import io.cucumber.java.en.When
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest

@ContextConfiguration(classes = [CalculatorApiApplication::class])
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@CucumberContextConfiguration
open class BaseCucumberContextConfigurations

@RunWith(Cucumber::class)
@CucumberOptions(
	features = ["classpath:features/"],
	glue = ["com.example.calculatorapi"]
)

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class CalculatorSteps : BaseCucumberContextConfigurations(){

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

	@Then("the result should be {double}")
	fun verifyResult(expectedResult: Double) {
		assertEquals(expectedResult, result, 0.0001)
	}
}