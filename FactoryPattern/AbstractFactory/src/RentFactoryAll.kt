import Prom.*
import Samochod.*
import Samolot.*

open class RentFactoryAll{
    companion object {
        val instance: RentFactoryAll by lazy { RentFactoryAll() }
    }
    fun RentAll(day: IRentFactory.Day): IRentFactory {
        when(day){
            IRentFactory.Day.MONDAY -> return RentFactoryMonday()
            IRentFactory.Day.WEDNESDAY -> return RentFactoryWednesday()
            IRentFactory.Day.SUNDAY -> return RentFactorySunday()
            IRentFactory.Day.SATURDAY -> return RentFactorySaturday()
        }
    }
}

open class RentFactorySunday : IRentFactory {
    override fun rentACar(): ISamochod  =  Audi()
    override fun rentAShip(): IProm = MFMazovia()
    override fun rentAPlane(): ISamolot = Boeing747()
}

open class RentFactoryMonday : IRentFactory {
    override fun rentACar(): ISamochod = BMW()
    override fun rentAShip(): IProm = MFWolin()
    override fun rentAPlane(): ISamolot = Boeing777()
}

open class RentFactoryWednesday : IRentFactory {
    override fun rentACar(): ISamochod = Kia()
    override fun rentAShip(): IProm = MFStenaSpirit()
    override fun rentAPlane(): ISamolot = Embraer195()
}

open class RentFactorySaturday : IRentFactory {
    override fun rentACar(): ISamochod = Opel()
    override fun rentAShip(): IProm = MFSkania()
    override fun rentAPlane(): ISamolot = AirbusA330()
}