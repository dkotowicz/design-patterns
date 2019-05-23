package Samochod

class OpelFactory : SamochodFactory(){
    companion object {
        val instance: OpelFactory by lazy { OpelFactory() }
    }
    override fun RentACar(): ISamochod {
        return Opel()
    }
}