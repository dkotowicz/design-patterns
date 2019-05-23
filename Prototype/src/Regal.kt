data class Regal (var numer: Int,
                  var miejsce: Int,
                  var ksiazkaList: MutableList<Ksiazka> = mutableListOf()) {
    override fun toString(): String {
        return "Regal(numer=$numer, miejsce=$miejsce, ksiazkaList=$ksiazkaList)"
    }
    fun deepCopy(numer: Int = this.numer,
                 miejsce: Int = this.miejsce,
                 ksiazkaList: MutableList<Ksiazka> =this.ksiazkaList.map { it -> it.copy() }.toMutableList() ) =
            Regal(numer, miejsce, ksiazkaList)
}
