package Samochod

class KiaFactory : SamochodFactory(){
    companion object {
        val instance: KiaFactory by lazy { KiaFactory() }
    }
    override fun RentACar(): ISamochod {
        return Kia()
    }
}