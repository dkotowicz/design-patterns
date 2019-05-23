package inheritance

open class Pracownik protected constructor() {

    private var stanowisko: String= "Nieokreślone"
    private var imie: String = ""
    private var nazwisko: String = ""
    private var wyplata: Double = 0.0

    companion object {
        private var obiekt: Pracownik? = null

        val instance: Pracownik
            @Synchronized get() {
                if (obiekt == null) {
                    obiekt = Pracownik()
                    //println("Instancja utworzona.")
                }
                else{//println("Juz instnieje")
                }
                return obiekt!!
            }
    }

    open fun getImie(): String {
        return imie
    }
    open fun getNazwisko(): String {
        return nazwisko
    }
    open fun getWyplata(): Double {
        return wyplata
    }
    open fun getStanowisko(): String {
        return stanowisko
    }
    open fun setImie(i: String) {
        imie = i
    }
    open fun setNazwisko(n: String) {
        nazwisko = n
    }
    open fun setWyplata(w: Double) {
        wyplata = w
    }
    open fun ZwiększWyplate(w: Double) {
        wyplata = wyplata + w
    }
}