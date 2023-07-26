package com.inno.domain.ports

import com.inno.domain.models.Robot

interface RobotOutputPort {
    fun displayResult(robot: Robot)
}


