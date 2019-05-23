interface EUPlug {
    fun get220Volts(electricity: Int)
}
interface USPlug{
    fun get110Volts(electricity: Int)
}

class EUPlugImpl : EUPlug{
    override fun get220Volts(electricity: Int) = print(electricity)
}

class USPlugImpl : USPlug{
    override fun get110Volts(electricity: Int) = print(electricity)
}

class EUOutput(plug: EUPlug){
    init{ plug.get220Volts(220) }
}

class VoltAdapter(private val plug: USPlug) : EUPlug{
    override fun get220Volts(electricity: Int) = plug.get110Volts(electricity/2)
}

fun main(args : Array<String>) {
    val us = USPlugImpl()
    val voltAdapter =  VoltAdapter(us)
    print("Napięcie w gniazdku europejskim wynosi ")
    EUOutput(voltAdapter)
    print(" volt po puszczeniu przez adapter na amerykański wtyk do gniazdka. W europejskim gniazdku prąd normalnie jest o napięciu 220 volt.")
}