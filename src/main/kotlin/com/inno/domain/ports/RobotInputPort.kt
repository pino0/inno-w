package com.inno.domain.ports

import com.inno.domain.models.Orientation
import com.inno.domain.models.Robot

interface RobotInputPort {
    fun executeCleaningRobotInstructions(x: Int, y: Int, orientation: Orientation, instructions: String): Robot
}


