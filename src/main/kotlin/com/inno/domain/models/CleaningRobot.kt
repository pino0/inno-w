package com.inno.domain.models

class CleaningRobot(private var robot: Robot) {

    fun executeInstructions(instructions: String) {
        for (instruction in instructions) {
            when (instruction) {
                'L' -> turnLeft()
                'R' -> turnRight()
                'M' -> moveForward()
            }
        }
    }

    private fun turnLeft() {
        robot = robot.copy(orientation = when (robot.orientation) {
            Orientation.N -> Orientation.W
            Orientation.W -> Orientation.S
            Orientation.S -> Orientation.E
            Orientation.E -> Orientation.N
        })
    }

    private fun turnRight() {
        robot = robot.copy(orientation = when (robot.orientation) {
            Orientation.N -> Orientation.E
            Orientation.E -> Orientation.S
            Orientation.S -> Orientation.W
            Orientation.W -> Orientation.N
        })
    }

    private fun moveForward() {
        val newPosition = when (robot.orientation) {
            Orientation.N -> Position(robot.position.x, robot.position.y + 1)
            Orientation.E -> Position(robot.position.x + 1, robot.position.y)
            Orientation.S -> Position(robot.position.x, robot.position.y - 1)
            Orientation.W -> Position(robot.position.x - 1, robot.position.y)
        }
        robot = robot.copy(position = newPosition)
    }

    fun getCurrentPosition(): Robot = robot
}
