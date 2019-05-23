import Prom.*
import Samochod.*
import Samolot.*
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class Tests {
    //Samolot
    @Test
    fun FactoryMethodSamolotBoeing777() {
        var samolot = SamolotFactory.instance.rentAPlane(ISamolot.Model.BOEING777)
        assertEquals("Boeing 777", samolot?.model)
        assertEquals(1993, samolot?.rokProdukcji)
    }
    @Test
    fun FactoryMethodSamolotBoeing747() {
        var samolot = SamolotFactory.instance.rentAPlane(ISamolot.Model.BOEING747)
        assertEquals("Boeing 747", samolot?.model)
        assertEquals(1988, samolot?.rokProdukcji)
    }
    @Test
    fun FactoryMethodSamolotEmbraer195() {
        var samolot = SamolotFactory.instance.rentAPlane(ISamolot.Model.Embraer195)
        assertEquals("Embraer 195", samolot?.model)
        assertEquals(2004, samolot?.rokProdukcji)
    }
    @Test
    fun FactoryMethodSamolotAirbus330() {
        var samolot = SamolotFactory.instance.rentAPlane(ISamolot.Model.AIRBUSA330)
        assertEquals("Airbus A330", samolot?.model)
        assertEquals(1994, samolot?.rokProdukcji)
    }
    @Test
    fun FactoryMethodSamolotAirbus300() {
        var samolot = SamolotFactory.instance.rentAPlane(ISamolot.Model.AIRBUSA300)
        assertEquals("Airbus A300", samolot?.model)
        assertEquals(1972, samolot?.rokProdukcji)
    }
    //Samochod
    @Test
    fun FactoryMethodSamochodOpel() {
        var samochod = OpelFactory.instance.RentACar()
        assertEquals("Opel Corsa E", samochod?.model)
        assertEquals(2014, samochod?.rokProdukcji)
    }
    @Test
    fun FactoryMethodSamochodBMW() {
        var samochod = BMWFactory.instance.RentACar()
        assertEquals("BMW X5 III", samochod?.model)
        assertEquals(2013, samochod?.rokProdukcji)
    }
    @Test
    fun FactoryMethodSamochodKia() {
        var samochod = KiaFactory.instance.RentACar()
        assertEquals("Kia Rio III", samochod?.model)
        assertEquals(2012, samochod?.rokProdukcji)
    }
    @Test
    fun FactoryMethodSamochodAudi() {
        var samochod = AudiFactory.instance.RentACar()
        assertEquals("Audi A6", samochod?.model)
        assertEquals(2017, samochod?.rokProdukcji)
    }
    @Test
    fun FactoryMethodSamochodMercedes() {
        var samochod = MercedesFactory.instance.RentACar()
        assertEquals("Mercedes Klasa GL X164", samochod?.model)
        assertEquals(2013, samochod?.rokProdukcji)
    }
    //Prom
    @Test
    fun FactoryMethodPromMFMazovia() {
        var prom = PromFactory.instance.rentAShip(IProm.name.MFMazovia)
        assertEquals("MF Mazovia", prom?.nazwa)
        assertEquals(9010814, prom?.numerIMO)
    }
    @Test
    fun FactoryMethodPromMFSkania() {
        var prom = PromFactory.instance.rentAShip(IProm.name.MFSkania)
        assertEquals("MF Skania", prom?.nazwa)
        assertEquals(9086588, prom?.numerIMO)
    }
    @Test
    fun FactoryMethodPromMFStenaSpirit() {
        var prom = PromFactory.instance.rentAShip(IProm.name.MFStenaSpirit)
        assertEquals("MF Stena Spirit", prom?.nazwa)
        assertEquals(7907661, prom?.numerIMO)
    }
    @Test
    fun FactoryMethodPromMFStenaVision() {
        var prom = PromFactory.instance.rentAShip(IProm.name.MFStenaVision)
        assertEquals("MF Stena Vision", prom?.nazwa)
        assertEquals(7907659, prom?.numerIMO)
    }
    @Test
    fun FactoryMethodPromMFWolin() {
        var prom = PromFactory.instance.rentAShip(IProm.name.MFWolin)
        assertEquals("MF Wolin", prom?.nazwa)
        assertEquals(8420842, prom?.numerIMO)
    }
}