data class Biblioteka (var nazwa: String,
                       var dataOtwarcia: String,
                       var regalList: MutableList<Regal> = mutableListOf()){
    override fun toString(): String {
        return "Biblioteka(nazwa='$nazwa', dataOtwarcia='$dataOtwarcia', regalList=$regalList)"
    }
    fun deepCopy(nazwa: String = this.nazwa,
                 dataOtwarcia: String = this.dataOtwarcia,
                 regalList: MutableList<Regal> =this.regalList.map { it -> it.copy() }.toMutableList() ) =
            Biblioteka(nazwa, dataOtwarcia, regalList)
}