import Prom.*
import Samochod.*
import Samolot.*
interface IRentFactory {
    enum class Day {
        MONDAY, WEDNESDAY, SUNDAY, SATURDAY
    }
    fun rentAShip(): IProm
    fun rentACar(): ISamochod
    fun rentAPlane(): ISamolot
}