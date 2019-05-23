package Samochod

open class SamochodFactory{
    companion object {
        val instance: SamochodFactory by lazy { SamochodFactory() }
    }
    fun rentACar(brand: ISamochod.Brand): ISamochod? {
        when(brand){
            ISamochod.Brand.AUDI -> return Audi()
            ISamochod.Brand.BMW -> return BMW()
            ISamochod.Brand.OPEL -> return Opel()
            ISamochod.Brand.KIA -> return Kia()
            ISamochod.Brand.MERCEDES -> return Mercedes()
            else -> return null
        }
    }
}