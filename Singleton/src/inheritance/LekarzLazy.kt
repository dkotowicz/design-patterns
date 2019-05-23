package inheritance

class LekarzLazy private constructor() : PracownikLazy() {
    private var stanowisko: String= "Lekarz"
    private var premia: Double = 0.0
    companion object {
        val instance: LekarzLazy by lazy { LekarzLazy() }
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