package com.inno.infrastructure.adapters

import com.inno.domain.models.CleaningRobot
import com.inno.domain.ports.RobotInputPort
import com.inno.domain.models.Orientation
import com.inno.domain.models.Position
import com.inno.domain.models.Robot

class RobotInputAdapter : RobotInputPort {
    override fun executeCleaningRobotInstructions(x: Int, y: Int, orientation: Orientation, instructions: String): Robot {
        val robot = Robot(Position(x, y), orientation)
        val cleaningRobot = CleaningRobot(robot)
        cleaningRobot.executeInstructions(instructions)

        return cleaningRobot.getCurrentPosition()
    }
}


