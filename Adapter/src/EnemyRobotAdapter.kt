class EnemyRobotAdapter(internal var theRobot: EnemyRobot) : EnemyAttacker {
    override fun fireWeapon() = theRobot.smachWithHand()
    override fun driveForward() = theRobot.walkForward()
    override fun assignDriver(driver: String) = theRobot.reactToHuman(driver)
}
