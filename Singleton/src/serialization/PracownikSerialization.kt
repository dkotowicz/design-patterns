package serialization

import java.io.Serializable

class PracownikSerialization : Serializable {

    private var imie: String? = null
    private var nazwisko: String? = null
    private var wyplata: Double = 0.0
    constructor() {
        imie = ""
        nazwisko = ""
        wyplata = 0.0
    }
    private fun readResolve(): Any {
        return instance
    }
    protected var uniqueInstance: PracownikSerialization? = null
    companion object {
        protected var uniqueInstance: PracownikSerialization? = null
        val instance: PracownikSerialization
            @Synchronized get() {
                if (uniqueInstance == null) {
                    uniqueInstance = PracownikSerialization()
                }
                return uniqueInstance!!
            }
    }

    fun getImie():String?{
        return imie
    }
    fun setImie(i: String){
        imie = i
    }
    fun getNazwisko():String?{
        return nazwisko
    }
    fun setNazwisko(n: String){
        nazwisko = n
    }
    fun getWyplata():Double?{
        return wyplata
    }
    fun setWyplata(w: Double){
        wyplata = w
    }
    fun ZwiekszWyplate(){
        wyplata = wyplata + 54.65
    }
}