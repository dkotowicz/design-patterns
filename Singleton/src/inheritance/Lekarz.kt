package inheritance

class Lekarz private constructor() : Pracownik() {
    private var stanowisko: String= "Lekarz"
    private var premia: Double = 0.0
    companion object {
        private var obiekt: Lekarz? = null
        val instance: Lekarz
            @Synchronized get() {
                if (obiekt == null) {
                    obiekt = Lekarz()
                }
                return obiekt!!
            }
    }
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