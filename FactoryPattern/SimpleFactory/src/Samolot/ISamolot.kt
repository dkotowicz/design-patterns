package Samolot
interface ISamolot {
    enum class Model {AIRBUSA330, AIRBUSA300, BOEING747, BOEING777, Embraer195}
    var model : String
    var producent : String
    var rokProdukcji : Int
    var kraj : String
    var liczbaSilnikow : Int
    fun informacja() = println("Model "+this.model+", Producent: "+this.producent+", rok produkcji: "+this.rokProdukcji+", liczba silników: "+this.liczbaSilnikow+", Kraj: "+this.kraj)

}

