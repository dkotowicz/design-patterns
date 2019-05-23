package inheritance

fun main(args: Array<String>) {
    /*var pr3 = inheritance.PracownikObiekt
    pr3.setImie("Katarzyna")
    pr3.setNazwisko("Kowalska")
    pr3.setWyplata(89.90)

    var pr4 = inheritance.PracownikObiekt
    pr4.setImie("Magdalena")
    pr4.setNazwisko("Nowak")
    pr4.setWyplata(43.90)

    println("${pr3.getImie()} ${pr3.getNazwisko()} ${pr3.getWyplata()} ${pr3.getStanowisko()}")
    println("${pr4.getImie()} ${pr4.getNazwisko()} ${pr4.getWyplata()} ${pr4.getStanowisko()}")*/

    var pr1 = Pracownik.instance
    pr1.setImie("Katarzyna")
    pr1.setNazwisko("Kowalska")
    pr1.setWyplata(89.90)

    var pr2 = Pracownik.instance
    pr2.setImie("Magdalena")
    pr2.setNazwisko("Nowak")
    pr2.setWyplata(43.90)

    println("${pr1.getImie()} ${pr1.getNazwisko()} ${pr1.getWyplata()} ${pr1.getStanowisko()}")
    println("${pr2.getImie()} ${pr2.getNazwisko()} ${pr2.getWyplata()} ${pr2.getStanowisko()}")

    var l1 = Lekarz.instance
    l1.setImie("Jan")
    l1.setNazwisko("Bonk")
    l1.setWyplata(456.98)
    l1.setPremia(32.89)

    var l2 = Lekarz.instance
    l2.setImie("Janusz")
    l2.setNazwisko("Nowik")
    l2.setWyplata(986.98)
    l2.setPremia(23.89)

    println("${l1.getImie()} ${l1.getNazwisko()} ${l1.getWyplata()} ${l1.getPremia()} ${l1.getStanowisko()}")
    println("${l2.getImie()} ${l2.getNazwisko()} ${l2.getWyplata()} ${l2.getPremia()} ${l2.getStanowisko()}")

    var p1 = Pielegniarka.instance
    p1.setImie("Milena")
    p1.setNazwisko("Sadowska")
    p1.setWyplata(675.76)
    p1.setNadgodziny(23)

    var p2 = Pielegniarka.instance
    p2.setImie("Ewilina")
    p2.setNazwisko("Sadowska-Nowak")
    p2.setWyplata(632.76)
    p2.setNadgodziny(8)

    println("${p1.getImie()} ${p1.getNazwisko()} ${p1.getWyplata()} ${p1.getNadgodziny()} ${p1.getStanowisko()}")
    println("${p2.getImie()} ${p2.getNazwisko()} ${p2.getWyplata()} ${p2.getNadgodziny()} ${p2.getStanowisko()}")

    var l3 = LekarzLazy.instance
    l3.setImie("Jan")
    l3.setNazwisko("Bonk")
    l3.setWyplata(456.98)
    l3.setPremia(32.89)

    var l4 = LekarzLazy.instance
    l4.setImie("Janusz")
    l4.setNazwisko("Nowik")
    l4.setWyplata(986.98)
    l4.setPremia(23.89)

    println("${l3.getImie()} ${l3.getNazwisko()} ${l3.getWyplata()} ${l3.getPremia()} ${l3.getStanowisko()}")
    println("${l4.getImie()} ${l4.getNazwisko()} ${l4.getWyplata()} ${l4.getPremia()} ${l4.getStanowisko()}")

    var p3 = PielegniarkaObiekt
    p3.setImie("Milena")
    p3.setNazwisko("Sadowska")
    p3.setWyplata(675.76)
    PielegniarkaObiekt.setNadgodziny(23)

    var p4 = PielegniarkaObiekt
    p4.setImie("Ewilina")
    p4.setNazwisko("Sadowska-Nowak")
    p4.setWyplata(632.76)
    PielegniarkaObiekt.setNadgodziny(8)

    println("${p3.getImie()} ${p3.getNazwisko()} ${p3.getWyplata()} ${PielegniarkaObiekt.getNadgodziny()} ${PielegniarkaObiekt.getStanowisko()}")
    println("${p4.getImie()} ${p4.getNazwisko()} ${p4.getWyplata()} ${PielegniarkaObiekt.getNadgodziny()} ${PielegniarkaObiekt.getStanowisko()}")

    //test abstract
    var l5 = LekarzObiekt
    l5.setImie("Jan")
    l5.setNazwisko("Bonk")
    l5.setWyplata(456.98)
    l5.setPremia(32.89)

    var l6 = LekarzObiekt
    l6.setImie("Janusz")
    l6.setNazwisko("Nowik")
    l6.setWyplata(986.98)
    l6.setPremia(23.89)

    println("${l5.getImie()} ${l5.getNazwisko()} ${l5.getWyplata()} ${l5.getPremia()} ${l5.getStanowisko()}")
    println("${l6.getImie()} ${l6.getNazwisko()} ${l6.getWyplata()} ${l6.getPremia()} ${l6.getStanowisko()}")

}
