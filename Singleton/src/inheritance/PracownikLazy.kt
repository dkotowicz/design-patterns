package inheritance

open class PracownikLazy protected constructor() {
    private var stanowisko: String= "Nieokreślone"
    private var imie: String = ""
    private var nazwisko: String = ""
    private var wyplata: Double = 0.0

    companion object {
        val instance: PracownikLazy by lazy { PracownikLazy() }
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