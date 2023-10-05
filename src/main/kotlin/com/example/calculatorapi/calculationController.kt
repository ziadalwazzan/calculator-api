package com.example.calculatorapi

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

data class CalculationRequest(val operation: String, val num1: Double, val num2: Double)

@RestController
class CalculationController(private val calculatorInterface: CalculatorInterface) {

    @PostMapping("/calculate")
    fun calculate(@RequestBody calculationRequest: CalculationRequest): Double {
        val operation = calculationRequest.operation
        val num1 = calculationRequest.num1
        val num2 = calculationRequest.num2

        return when (operation) {
            "add" -> calculatorInterface.add(num1, num2)
            "subtract" -> calculatorInterface.subtract(num1, num2)
            "multiply" -> calculatorInterface.multiply(num1, num2)
            "divide" -> calculatorInterface.divide(num1, num2)
            else -> throw IllegalArgumentException("Invalid operation. Supported operations are: add, subtract, multiply, divide")
        }
    }
}