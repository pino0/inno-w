package com.inno.application

import com.inno.domain.models.Robot
import com.inno.domain.ports.RobotInputPort
import com.inno.domain.ports.RobotOutputPort
import org.koin.java.KoinJavaComponent

class CleaningFactory {
    private val robotInputPort: RobotInputPort = KoinJavaComponent.get(RobotInputPort::class.java)
    private val robotOutputPort: RobotOutputPort = KoinJavaComponent.get(RobotOutputPort::class.java)

    fun cleanFactory(robotsWithInstructions: List<Pair<Robot, String>>) {
        robotsWithInstructions.forEach { (robot, instructions) ->
            robotOutputPort.displayResult(
                    robotInputPort.executeCleaningRobotInstructions(
                            robot.position.x,
                            robot.position.y,
                            robot.orientation,
                            instructions
                    )
            )
        }
    }
}