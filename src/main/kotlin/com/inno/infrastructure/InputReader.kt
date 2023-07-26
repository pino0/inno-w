package com.inno.infrastructure

import com.inno.domain.models.Orientation
import com.inno.domain.models.Position
import com.inno.domain.models.Robot
import java.io.File

class InputReader {
    fun fromFile(fileName: String): List<Pair<Robot, String>> {
        val filePath = javaClass.classLoader.getResource(fileName)?.path

        val inputLines = File(filePath).readLines()
        val workspaceCoordinates = inputLines[0].split(" ").map { it.toInt() }

        val robotsWithInstructions = mutableListOf<Pair<Robot, String>>()
        var index = 1
        while (index < inputLines.size) {
            val robotPosition = inputLines[index].split(" ")
            val x = robotPosition[0].toInt()
            val y = robotPosition[1].toInt()
            val orientation = Orientation.valueOf(robotPosition[2])
            val instructions = inputLines[index + 1]

            val robot = Robot(Position(x, y), orientation)
            robotsWithInstructions.add(robot to instructions)

            index += 2
        }

        return robotsWithInstructions
    }
}