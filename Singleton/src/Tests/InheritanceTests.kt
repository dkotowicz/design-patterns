package Tests
import inheritance.Lekarz
import inheritance.Pielegniarka
import inheritance.PielegniarkaObiekt
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertSame

class InheritanceTests {
    @Test
    fun checkLekarzPracownik() {
        var l1 = Lekarz.instance
        l1.setImie("Jan")
        l1.setNazwisko("Bonk")
        l1.setWyplata(456.98)
        l1.setPremia(32.89)

        var l2 = Lekarz.instance
        l2.setImie("Janusz")
        l2.setNazwisko("Nowik")
        l2.setWyplata(986.98)
        l2.setPremia(23.89)

        //println("${l1.getImie()} ${l1.getNazwisko()} ${l1.getWyplata()} ${l1.getPremia()} ${l1.getStanowisko()}")
        //println("${l2.getImie()} ${l2.getNazwisko()} ${l2.getWyplata()} ${l2.getPremia()} ${l2.getStanowisko()}")
        assertSame(l1,l2)
        assertEquals("Lekarz",l1.getStanowisko())
    }

    @Test
    fun checkPielegniarkaPracownik() {
        var p1 = Pielegniarka.instance
        p1.setImie("Milena")
        p1.setNazwisko("Sadowska")
        p1.setWyplata(675.76)
        p1.setNadgodziny(23)

        var p2 = Pielegniarka.instance
        p2.setImie("Ewilina")
        p2.setNazwisko("Sadowska-Nowak")
        p2.setWyplata(632.76)
        p2.setNadgodziny(8)

        //println("${p1.getImie()} ${p1.getNazwisko()} ${p1.getWyplata()} ${p1.getNadgodziny()} ${p1.getStanowisko()}")
        //println("${p2.getImie()} ${p2.getNazwisko()} ${p2.getWyplata()} ${p2.getNadgodziny()} ${p2.getStanowisko()}")
        assertSame(p1,p2)
        assertEquals("Pielegniarka",p1.getStanowisko())
    }

    @Test
    fun checkPielegniarkaObiektPracownik() {
        var p3 = PielegniarkaObiekt
        p3.setImie("Milena")
        p3.setNazwisko("Sadowska")
        p3.setWyplata(675.76)
        PielegniarkaObiekt.setNadgodziny(23)

        var p4 = PielegniarkaObiekt
        p4.setImie("Ewilina")
        p4.setNazwisko("Sadowska-Nowak")
        p4.setWyplata(632.76)
        PielegniarkaObiekt.setNadgodziny(8)

        //println("${p3.getImie()} ${p3.getNazwisko()} ${p3.getWyplata()} ${PielegniarkaObiekt.getNadgodziny()} ${PielegniarkaObiekt.getStanowisko()}")
        //println("${p4.getImie()} ${p4.getNazwisko()} ${p4.getWyplata()} ${PielegniarkaObiekt.getNadgodziny()} ${PielegniarkaObiekt.getStanowisko()}")
        assertEquals(p3,p4)
        assertEquals("PielegniarkaObiekt",p3.getStanowisko())
    }
}