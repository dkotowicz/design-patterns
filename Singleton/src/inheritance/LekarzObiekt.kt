package inheritance

object LekarzObiekt: PracownikAbstract() {
    private var stanowisko: String= "Lekarz"
    private var premia: Double = 0.0

    open fun getPremia(): Double {
        return premia
    }
    open fun setPremia(w: Double) {
        premia = w
    }
    override fun getStanowisko(): String {
        return stanowisko
    }
}