package Tests
import inheritance.Pracownik
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import inheritance.PracownikObiekt
import inheritance.PracownikLazy
import org.mockito.Mockito.`when`
import org.mockito.Mockito.mock
import kotlin.test.assertSame

class SingletonTests {
    @Test
    fun chceckPracownikObiekt() {
        var pr3 = PracownikObiekt
        pr3.setImie("Katarzyna")
        pr3.setNazwisko("Kowalska")
        pr3.setWyplata(89.90)

        var pr4 = PracownikObiekt
        pr4.setImie("Magdalena")
        pr4.setNazwisko("Nowak")
        pr4.setWyplata(43.90)

        //println("${pr3.getImie()} ${pr3.getNazwisko()} ${pr3.getWyplata()} ${pr3.getStanowisko()}")
        //println("${pr4.getImie()} ${pr4.getNazwisko()} ${pr4.getWyplata()} ${pr4.getStanowisko()}")
        assertEquals(pr4,pr3)
        assertEquals("Nieokreślone", pr3.getStanowisko())
    }

    @Test
    fun chceckPracownikLazy() {
        var pr3 = PracownikLazy.instance
        pr3.setImie("Katarzyna")
        pr3.setNazwisko("Kowalska")
        pr3.setWyplata(89.90)

        var pr4 = PracownikLazy.instance
        pr4.setImie("Magdalena")
        pr4.setNazwisko("Nowak")
        pr4.setWyplata(43.90)

        //println("${pr3.getImie()} ${pr3.getNazwisko()} ${pr3.getWyplata()} ${pr3.getStanowisko()}")
        //println("${pr4.getImie()} ${pr4.getNazwisko()} ${pr4.getWyplata()} ${pr4.getStanowisko()}")
        assertEquals(pr4,pr3)
        assertEquals("Nieokreślone", pr4.getStanowisko())
    }

    @Test
    fun checkPracownik() {
        var pr1 = Pracownik.instance
        pr1.setImie("Katarzyna")
        pr1.setNazwisko("Kowalska")
        pr1.setWyplata(89.90)

        var pr2 = Pracownik.instance
        pr2.setImie("Magdalena")
        pr2.setNazwisko("Nowak")
        pr2.setWyplata(43.90)

        //println("${pr1.getImie()} ${pr1.getNazwisko()} ${pr1.getWyplata()} ${pr1.getStanowisko()}")
        //println("${pr2.getImie()} ${pr2.getNazwisko()} ${pr2.getWyplata()} ${pr2.getStanowisko()}")
        assertSame(pr1,pr2)
        assertEquals("Nieokreślone", pr1.getStanowisko())
    }

    @Test
    fun mockSingleton()
    {
        var mock1 : Pracownik = mock(Pracownik.instance::class.java)
        `when`(mock1.getImie()).thenReturn("Basia")
        mock1.setImie("Kasia")

        var notmock1 = Pracownik.instance
        notmock1.setImie("Magda")
        var notmock2 = Pracownik.instance
        notmock2.setImie("Andrzej")

        var mock2 : Pracownik = mock(Pracownik.instance::class.java)
        `when`(mock2.getImie()).thenReturn("Jan")
        mock2.setImie("Kasia")

        println("${mock1.getImie()}")
        println("${mock2.getImie()}")
        println("${notmock1.getImie()}")
        println("${notmock2.getImie()}")
    }
}