package com.example.calculatorapi

import org.springframework.stereotype.Service

@Service
class CalculatorServiceImplementation:CalculatorInterface {

    override fun add(num1: Double, num2: Double): Double {
        return num1 + num2
    }

    override fun subtract(num1: Double, num2: Double): Double {
        return num1 - num2
    }

    override fun multiply(num1: Double, num2: Double): Double {
        return num1 * num2
    }

    override fun divide(num1: Double, num2: Double): Double { //BigDecimal
        if (num2 == 0.0) {
            throw IllegalArgumentException("Division by zero is not allowed.")
        }
        return num1 / num2
    }
}
