package com.inno.infrastructure.adapters

import com.inno.domain.ports.RobotOutputPort
import com.inno.domain.models.Robot

class ConsoleOutputAdapter : RobotOutputPort {
    override fun displayResult(robot: Robot) {
        println("${robot.position.x} ${robot.position.y} ${robot.orientation}")
    }
}
