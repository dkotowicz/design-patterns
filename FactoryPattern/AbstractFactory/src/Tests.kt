import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class Tests {
    @Test
    fun AbstractRentMonday() {
        var rent = RentFactoryAll.instance.RentAll(IRentFactory.Day.MONDAY)
        assertEquals("MF Wolin", rent?.rentAShip().nazwa)
        assertEquals("BMW X5 III", rent?.rentACar().model)
        assertEquals("Boeing 777", rent?.rentAPlane().model)
    }
    @Test
    fun AbstractRentSunday() {
        var rent = RentFactoryAll.instance.RentAll(IRentFactory.Day.SUNDAY)
        assertEquals("MF Mazovia", rent?.rentAShip().nazwa)
        assertEquals("Audi A6", rent?.rentACar().model)
        assertEquals("Boeing 747", rent?.rentAPlane().model)
    }
    @Test
    fun AbstractRentWednesday() {
        var rent = RentFactoryAll.instance.RentAll(IRentFactory.Day.WEDNESDAY)
        assertEquals("MF Stena Spirit", rent?.rentAShip().nazwa)
        assertEquals("Kia Rio III", rent?.rentACar().model)
        assertEquals("Embraer 195", rent?.rentAPlane().model)
    }
    @Test
    fun AbstractRentSaturday() {
        var rent = RentFactoryAll.instance.RentAll(IRentFactory.Day.SATURDAY)
        assertEquals("MF Skania", rent?.rentAShip().nazwa)
        assertEquals("Opel Corsa E", rent?.rentACar().model)
        assertEquals("Airbus A330", rent?.rentAPlane().model)
    }
}
