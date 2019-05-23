package Samochod

class AudiFactory : SamochodFactory(){
    companion object {
        val instance: AudiFactory by lazy { AudiFactory() }
    }
    override fun RentACar(): ISamochod {
        return Audi()
    }
}