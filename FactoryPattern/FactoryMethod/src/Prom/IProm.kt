package Prom

interface IProm {
    enum class name {MFMazovia, MFSkania, MFStenaSpirit, MFStenaVision, MFWolin}
    var nazwa : String
    var bandera : String
    var rokWodowania : Int
    var numerIMO : Int
    var portMacierzysty : String
    fun informacja() = println("Nazwa: "+this.nazwa+", rok wodowania: "+this.rokWodowania+", bandera: "+this.bandera+", numer IMO: "+this.numerIMO+", port macierzysty: "+this.portMacierzysty)
}