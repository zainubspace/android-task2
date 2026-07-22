package com.example.diceroller

import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class DiceRollerTest {

    @Test
    fun diceRollShouldAlwaysBeWithinValidRange() {
        repeat(100) {
            val diceRoll = (1..6).random()

            assertTrue(
                "Dice roll must be between 1 and 6, but was $diceRoll",
                diceRoll in 1..6
            )
        }
    }

    @Test
    fun invalidDiceValuesShouldBeRejected() {
        val invalidValues = listOf(-1, 0, 7, 10, 100)

        invalidValues.forEach { value ->
            assertFalse(
                "Value $value should not be accepted as a dice roll",
                value in 1..6
            )
        }
    }
}