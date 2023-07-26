package com.inno.domain.models

import org.junit.Assert.assertEquals
import org.junit.Test


class CleaningRobotTest {

    @Test
    fun testExecuteInstructions() {
        val robot = Robot(Position(0, 0), Orientation.N)
        val cleaningRobot = CleaningRobot(robot)

        cleaningRobot.executeInstructions("RMMMLM")

        assertEquals(Position(3, 1), cleaningRobot.getCurrentPosition().position)
        assertEquals(Orientation.N, cleaningRobot.getCurrentPosition().orientation)
    }
}