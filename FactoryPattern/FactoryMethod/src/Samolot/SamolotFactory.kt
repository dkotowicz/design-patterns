package Samolot

open class SamolotFactory : ISamolotFactory {
    companion object {
        val instance: SamolotFactory by lazy { SamolotFactory() }
    }
    override fun rentAPlane(model: ISamolot.Model): ISamolot? {
        when(model){
            ISamolot.Model.AIRBUSA300 -> return AirbusA300()
            ISamolot.Model.BOEING747 -> return Boeing747()
            ISamolot.Model.BOEING777 -> return Boeing777()
            ISamolot.Model.AIRBUSA330 -> return AirbusA330()
            ISamolot.Model.Embraer195 -> return Embraer195()
            else -> return null
        }
    }
}