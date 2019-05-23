package inheritance

object PielegniarkaObiekt : Pracownik() {
    private var stanowisko: String= "PielegniarkaObiekt"
    private var nadgodziny: Int = 0

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