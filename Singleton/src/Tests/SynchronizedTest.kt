package Tests

import inheritance.Pracownik
import org.junit.jupiter.api.Test

class SynchronizedTest {

    @Test
    @Throws(InterruptedException::class)
    fun SynchronizedSingletonPracownik() {
        val times = 1000000
        val start = System.currentTimeMillis()
        for (i in 0 until times) {
            Pracownik.instance
        }
        val end = System.currentTimeMillis()

        println("getting " + times + " times instance of class Pracownik in " + (end - start)
        + " milliseconds")
    }
}