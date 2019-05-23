package Tests
import org.junit.jupiter.api.Test
import serialization.PracownikSerialization
import java.io.FileInputStream
import java.io.FileOutputStream
import java.io.ObjectInputStream
import java.io.ObjectOutputStream
import kotlin.test.assertEquals
import kotlin.test.assertSame

class SerializationTest {
    @Test
    fun CheckSingletonSerialized(){
        val p = PracownikSerialization.instance
        p.setImie("Kasia")
        p.setNazwisko("Nowak")
        p.setWyplata(43.89)
        println(p.hashCode())
        println("Serializacja - Imie: ${p.getImie()}, nazwisko: ${p.getNazwisko()}, wypłata: ${p.getWyplata()}")

        val fp = FileOutputStream("pracownik4.ser")
        val out = ObjectOutputStream(fp)

        out.writeObject(p)
        out.close()
        fp.close()

        val fi = FileInputStream("pracownik4.ser")
        val i = ObjectInputStream(fi)

        val pNew = i.readObject() as PracownikSerialization
        i.close()
        fi.close()
        println(pNew.hashCode())
        println("Deserilizacja - Imie: ${pNew.getImie()}, nazwisko: ${pNew.getNazwisko()}, wypłata: ${pNew.getWyplata()}")
        assertEquals(p.hashCode(),pNew.hashCode())
        assertSame(p, pNew)
    }
}