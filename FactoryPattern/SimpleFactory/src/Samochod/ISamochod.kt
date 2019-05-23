package Samochod
interface ISamochod {
    enum class Brand{ AUDI, MERCEDES, OPEL, KIA, BMW }
    var model : String
    var rokProdukcji : Int
    var zuzyciePaliwa : Double
    var dlugosc : Int
    var szerokosc : Int
    fun informacja() = println("Model: "+this.model+", Rok produkcji: "+this.rokProdukcji+", Zużycie paliwa: "+this.zuzyciePaliwa+", długość: "+this.dlugosc+", szerokość: "+this.szerokosc)
}
