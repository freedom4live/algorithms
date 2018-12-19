package me.freedom4live.algorithms.integration

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

internal class TrapeziumIntegrationTest {

    private val integration = TrapeziumIntegration()

    @Test
    fun integrate_hardFunction_rightAnswer() {
        val function: (Float) -> Float = { x -> Math.sin(x * x + 2.5).toFloat() / (x * x * x + 3) }

        val result = integration.integrate(function, 0.4f, 2.2f, 10000, 0.0f)

        Assertions.assertEquals(-0.07812270522117615, result.toDouble())
    }

}
