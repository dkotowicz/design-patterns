import org.junit.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotSame
import kotlin.test.assertSame

open class Tests{
    @Test
    open fun shallowCopyKsiazka() {
        val autor = Autor("Knight", "Phil", "24.02.1938")
        val wydawnictwo = Wydawnictwo("Dom Wydawniczy Rebis", "Poznań")
        val ksiazka = Ksiazka("Sztuka zwycięstwa. Wspomnienia twórcy Nike",388, "miękka", autor = autor, wydawnictwo = wydawnictwo)
        println("-------------SHALLOW COPY----------------------")
        println("--------------KSIAZKA--------------")
        println(ksiazka)
        val wydawnictwoCopy = wydawnictwo.copy()
        val ksiazkaCopy = ksiazka.shallowCopy()
        ksiazka.tytul = "Sztuka Zwyciestwa czesc 2"
        wydawnictwo.nazwa= "Wydawnictwo Mag"
        println("--------------KSIAZKA PO ZMIANIE--------------")
        println(ksiazka)
        println("--------------KSIAZKA KOPIA--------------")
        println(ksiazkaCopy)
        println("--------------WYDAWNICTWO KOPIA--------------")
        println(wydawnictwoCopy)
        println(ksiazka.hashCode())
        println(ksiazkaCopy.hashCode())
        assertEquals(ksiazka.wydawnictwo.nazwa, ksiazkaCopy.wydawnictwo.nazwa)
        assertSame(ksiazka.wydawnictwo.nazwa, ksiazkaCopy.wydawnictwo.nazwa)
    }

    @Test
    open fun deepCopyKsiazka() {
        val autor = Autor("Knight", "Phil", "24.02.1938")
        val wydawnictwo = Wydawnictwo("Dom Wydawniczy Rebis", "Poznań")
        val ksiazka = Ksiazka("Sztuka zwycięstwa. Wspomnienia twórcy Nike",388, "miękka", autor = autor, wydawnictwo = wydawnictwo)
        println("-------------DEEP COPY----------------------")
        println("--------------KSIAZKA--------------")
        println(ksiazka)
        val wydawnictwoCopy = wydawnictwo.copy()
        val ksiazkaCopy = ksiazka.deepCopy()
        ksiazka.tytul = "Sztuka Zwyciestwa czesc 2"
        wydawnictwo.nazwa= "Wydawnictwo Mag"
        println("--------------KSIAZKA PO ZMIANIE--------------")
        println(ksiazka)
        println("--------------KSIAZKA KOPIA--------------")
        println(ksiazkaCopy)
        println("--------------WYDAWNICTWO KOPIA--------------")
        println(wydawnictwoCopy)
        assertNotSame(ksiazka.wydawnictwo.nazwa, ksiazkaCopy.wydawnictwo.nazwa)
    }


    @Test
    open fun shallowCopyRegal() {
        val autor = Autor("Knight", "Phil", "24.02.1938")
        val wydawnictwo = Wydawnictwo("Dom Wydawniczy Rebis", "Poznań")
        val ksiazka = Ksiazka("Sztuka zwycięstwa. Wspomnienia twórcy Nike",388, "miękka", autor = autor, wydawnictwo = wydawnictwo)
        val ksiazka2 = Ksiazka("2 Sztuka zwycięstwa. Wspomnienia twórcy Nike",388, "miękka", autor = autor, wydawnictwo = wydawnictwo)
        val ksiazka3 = Ksiazka("3 Sztuka zwycięstwa. Wspomnienia twórcy Nike",388, "miękka", autor = autor, wydawnictwo = wydawnictwo)

        val listaKsiazek: MutableList<Ksiazka> = mutableListOf()
        listaKsiazek.add(ksiazka)
        listaKsiazek.add(ksiazka2)
        listaKsiazek.add(ksiazka3)
        val regal = Regal(20, 56, listaKsiazek)
        println("-------------SHALLOW COPY----------------------")
        println("-------------REGAŁ----------------------")
        println(regal)
        val regalCopy = regal.copy()
        listaKsiazek.add(ksiazka)
        println("-------------REGAŁ PO DODANIU NOWEJ KSIAZKI----------------------")
        println(regal)
        println("-------------KOPIA REGAŁU----------------------")
        println(regalCopy)
        assertSame(regal.ksiazkaList, regalCopy.ksiazkaList)
        assertEquals(4, regalCopy.ksiazkaList.count())
    }

    @Test
    open fun DeepCopyRegal() {
        val autor = Autor("Knight", "Phil", "24.02.1938")
        val wydawnictwo = Wydawnictwo("Dom Wydawniczy Rebis", "Poznań")
        val ksiazka = Ksiazka("Sztuka zwycięstwa. Wspomnienia twórcy Nike",388, "miękka", autor = autor, wydawnictwo = wydawnictwo)
        val ksiazka2 = Ksiazka("2 Sztuka zwycięstwa. Wspomnienia twórcy Nike",388, "miękka", autor = autor, wydawnictwo = wydawnictwo)
        val ksiazka3 = Ksiazka("3 Sztuka zwycięstwa. Wspomnienia twórcy Nike",388, "miękka", autor = autor, wydawnictwo = wydawnictwo)

        val listaKsiazek: MutableList<Ksiazka> = mutableListOf()
        listaKsiazek.add(ksiazka)
        listaKsiazek.add(ksiazka2)
        listaKsiazek.add(ksiazka3)
        val regal = Regal(20, 56, listaKsiazek)
        println("-------------DEEP COPY----------------------")
        println("-------------REGAŁ----------------------")
        println(regal)
        val regalCopy = regal.deepCopy()
        listaKsiazek.add(ksiazka)
        println("-------------REGAŁ PO DODANIU NOWEJ KSIAZKI----------------------")
        println(regal)
        println("-------------KOPIA REGAŁU----------------------")
        println(regalCopy)
        assertNotSame(regal.ksiazkaList, regalCopy.ksiazkaList)
        assertEquals(3, regalCopy.ksiazkaList.count())
        assertEquals(4, regal.ksiazkaList.count())
    }

    @Test
    open fun DeepCopyRegalChangeBook() {
        val autor = Autor("Knight", "Phil", "24.02.1938")
        val wydawnictwo = Wydawnictwo("Dom Wydawniczy Rebis", "Poznań")
        val ksiazka1 = Ksiazka("Sztuka zwycięstwa. Wspomnienia twórcy Nike",388, "miękka", autor = autor, wydawnictwo = wydawnictwo)
        val ksiazka2 = Ksiazka("2 Sztuka zwycięstwa. Wspomnienia twórcy Nike",388, "miękka", autor = autor, wydawnictwo = wydawnictwo)
        val ksiazka3 = Ksiazka("3 Sztuka zwycięstwa. Wspomnienia twórcy Nike",388, "miękka", autor = autor, wydawnictwo = wydawnictwo)

        val listaKsiazek: MutableList<Ksiazka> = mutableListOf()
        listaKsiazek.add(ksiazka1)
        listaKsiazek.add(ksiazka2)
        listaKsiazek.add(ksiazka3)
        val regal = Regal(20, 56, listaKsiazek)
        println("-------------DEEP COPY----------------------")
        println("-------------REGAŁ----------------------")
        println(regal)
        val regalCopy = regal.deepCopy()
        listaKsiazek.last().tytul = "5 Sztuka zwyciestwa"
        listaKsiazek.add(ksiazka1)
        println("-------------REGAŁ PO DODANIU NOWEJ KSIAZKI----------------------")
        println(regal)
        println("-------------KOPIA REGAŁU----------------------")
        println(regalCopy)
        assertNotSame(regal.ksiazkaList, regalCopy.ksiazkaList)
        assertEquals(3, regalCopy.ksiazkaList.count())
        assertEquals(4, regal.ksiazkaList.count())
    }

    @Test
    fun shallowCopyBiblioteka() {
        val autor = Autor("Knight", "Phil", "24.02.1938")
        val wydawnictwo = Wydawnictwo("Dom Wydawniczy Rebis", "Poznań")
        val ksiazka = Ksiazka("Sztuka zwycięstwa. Wspomnienia twórcy Nike",388, "miękka", autor = autor, wydawnictwo = wydawnictwo)
        val ksiazka2 = Ksiazka("2 Sztuka zwycięstwa. Wspomnienia twórcy Nike",388, "miękka", autor = autor, wydawnictwo = wydawnictwo)
        val ksiazka3 = Ksiazka("3 Sztuka zwycięstwa. Wspomnienia twórcy Nike",388, "miękka", autor = autor, wydawnictwo = wydawnictwo)

        val listaKsiazek: MutableList<Ksiazka> = mutableListOf()
        listaKsiazek.add(ksiazka)
        listaKsiazek.add(ksiazka2)
        listaKsiazek.add(ksiazka3)
        val regal1 = Regal(20, 56, listaKsiazek)

        val regal2 = Regal(22, 76, listaKsiazek)
        val regal3 = Regal(22, 76, listaKsiazek)
        val listaRegalow: MutableList<Regal> = mutableListOf()
        listaRegalow.add(regal1)
        listaRegalow.add(regal2)
        listaRegalow.add(regal3)

        val biblioteka = Biblioteka("Biblioteka szkolna","24.01.2009", listaRegalow)
        println("-------------SHALLOW COPY----------------------")
        println("-------------BIBLIOTEKA----------------------")
        println(biblioteka)

        val bibliotekaCopy = biblioteka.copy()
        listaRegalow.add(regal1)
        println("-------------BIBLIOTEKA PO ZMIANIE----------------------")
        println(biblioteka)
        println("-------------BIBLIOTEKA COPY----------------------------")
        println(bibliotekaCopy)

        assertSame(biblioteka.regalList, bibliotekaCopy.regalList)
        assertEquals(4, biblioteka.regalList.count())
    }

    @Test
    fun deepCopyBiblioteka() {
        val autor = Autor("Knight", "Phil", "24.02.1938")
        val wydawnictwo = Wydawnictwo("Dom Wydawniczy Rebis", "Poznań")
        val ksiazka = Ksiazka("Sztuka zwycięstwa. Wspomnienia twórcy Nike",388, "miękka", autor = autor, wydawnictwo = wydawnictwo)
        val ksiazka2 = Ksiazka("2 Sztuka zwycięstwa. Wspomnienia twórcy Nike",388, "miękka", autor = autor, wydawnictwo = wydawnictwo)
        val ksiazka3 = Ksiazka("3 Sztuka zwycięstwa. Wspomnienia twórcy Nike",388, "miękka", autor = autor, wydawnictwo = wydawnictwo)

        val listaKsiazek: MutableList<Ksiazka> = mutableListOf()
        listaKsiazek.add(ksiazka)
        listaKsiazek.add(ksiazka2)
        listaKsiazek.add(ksiazka3)
        val regal1 = Regal(20, 56, listaKsiazek)

        val regal2 = Regal(22, 76, listaKsiazek)
        val regal3 = Regal(22, 76, listaKsiazek)
        val listaRegalow: MutableList<Regal> = mutableListOf()
        listaRegalow.add(regal1)
        listaRegalow.add(regal2)
        listaRegalow.add(regal3)

        val biblioteka = Biblioteka("Biblioteka szkolna","24.01.2009", listaRegalow)
        println("-------------SHALLOW COPY----------------------")
        println("-------------BIBLIOTEKA----------------------")
        println(biblioteka)

        val bibliotekaCopy = biblioteka.deepCopy()
        listaRegalow.add(regal1)
        println("-------------BIBLIOTEKA PO ZMIANIE----------------------")
        println(biblioteka)
        println("-------------BIBLIOTEKA COPY----------------------------")
        println(bibliotekaCopy)

        assertNotSame(biblioteka.regalList, bibliotekaCopy.regalList)
        assertEquals(3, bibliotekaCopy.regalList.count())
        assertEquals(4, biblioteka.regalList.count())
    }
}