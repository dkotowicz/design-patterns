package Samolot

interface ISamolotFactory{
    fun rentAPlane(model: ISamolot.Model): ISamolot?
}