package enumerations1

import enumerations1.Direction.*

enum class Direction {
    UP, DOWN, LEFT, RIGHT
}

class Robot {
    var x = 0
    var y = 0

    fun go(direction: Direction, steps: Int) {
        when (direction) {
           /* TODO */
        }
    }

    val location: String
        get() = "($x,$y)"
}

fun main(args: Array<String>) {
    val robot = Robot()
    println(robot.location)
    robot.go(RIGHT, 1)
    println(robot.location)
    robot.go(DOWN, 2)
    println(robot.location)
}
/* Output:
(0,0)
(1,0)
(1,2)
*/