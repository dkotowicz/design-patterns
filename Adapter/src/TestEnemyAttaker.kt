fun main(args: Array<String>) {
        val rx = EnemyTank()
        val robot = EnemyRobot()
        val robotAdapter = EnemyRobotAdapter(robot)
        println("Robot")
        robot.reactToHuman("Paul")
        robot.walkForward()
        robot.smachWithHand()

        println("RobotAdapter")
        robotAdapter.assignDriver("Paul")
        robotAdapter.driveForward()
        robotAdapter.fireWeapon()

        println("Tank")
        rx.assignDriver("Frsnk")
        rx.driveForward()
        rx.fireWeapon()
}
