package inheritance

class Pielegniarka private constructor() : Pracownik() {
    private var stanowisko: String= "Pielegniarka"
    private var nadgodziny: Int = 0
    companion object {
        private var obiekt: Pielegniarka? = null

        val instance: Pielegniarka
            @Synchronized get() {
                if (obiekt == null) {
                    obiekt = Pielegniarka()
                }
                return obiekt!!
            }
    }
    open fun getNadgodziny(): Int {
        return nadgodziny
    }
    open fun setNadgodziny(w: Int) {
        nadgodziny = w
    }
    override fun getStanowisko(): String {
        return stanowisko
    }
}

