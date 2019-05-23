package Prom

open class PromFactory {
    companion object {
        val instance: PromFactory by lazy { PromFactory() }
    }

    fun rentAShip(model: IProm.name): IProm? {
        when(model){
            IProm.name.MFMazovia -> return MFMazovia()
            IProm.name.MFSkania -> return MFSkania()
            IProm.name.MFStenaSpirit -> return MFStenaSpirit()
            IProm.name.MFStenaVision -> return MFStenaVision()
            IProm.name.MFWolin -> return MFWolin()
            else -> return null
        }
    }
}