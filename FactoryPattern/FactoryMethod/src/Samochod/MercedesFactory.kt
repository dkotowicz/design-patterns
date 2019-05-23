package Samochod

class MercedesFactory : SamochodFactory(){
    companion object {
        val instance: MercedesFactory by lazy { MercedesFactory() }
    }
    override fun RentACar(): ISamochod {
        return Mercedes()
    }
}