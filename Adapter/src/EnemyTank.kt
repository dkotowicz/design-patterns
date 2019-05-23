class EnemyTank : EnemyAttacker {
    override fun fireWeapon()  = println("fire WeaponTank ")
    override fun driveForward() = println("driveForwardTank ")
    override fun assignDriver(driver: String)= println("assignDriverTank ")
}