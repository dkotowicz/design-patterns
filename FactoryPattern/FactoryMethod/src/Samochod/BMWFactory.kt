package Samochod

class BMWFactory : SamochodFactory(){
    companion object {
        val instance: BMWFactory by lazy { BMWFactory() }
    }
    override fun RentACar(): ISamochod {
        return BMW()
    }
}