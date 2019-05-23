data class Ksiazka (var tytul: String,
                    var liczbaStron: Int,
                    var rodzajOkladki: String,
                    var autor: Autor,
                    var wydawnictwo: Wydawnictwo){
    override fun toString(): String {
        return "Ksiazka(tytuł: $tytul, liczba stron:$liczbaStron, rodzaj okladki:$rodzajOkladki, \n$autor,\n$wydawnictwo)"
    }
    fun shallowCopy(tytul: String = this.tytul,
                    liczbaStron: Int = this.liczbaStron,
                    rodzajOkladki: String = this.rodzajOkladki,
                    autor: Autor = this.autor,
                    wydawnictwo: Wydawnictwo = this.wydawnictwo) =
            Ksiazka(tytul, liczbaStron, rodzajOkladki, autor, wydawnictwo)

    fun deepCopy(tytul: String = this.tytul,
                 liczbaStron: Int = this.liczbaStron,
                 rodzajOkladki: String = this.rodzajOkladki,
                 autor: Autor = this.autor.copy(),
                 wydawnictwo: Wydawnictwo = this.wydawnictwo.copy())=
            Ksiazka(tytul,liczbaStron, rodzajOkladki, autor, wydawnictwo )
}

data class Autor (var nazwisko: String,
                  var imie: String,
                  var  dataUrodzenia: String) {
    override fun toString(): String {
        return "Autor($nazwisko $imie, data urodzenia:$dataUrodzenia)"
    }
}

data class Wydawnictwo (var nazwa: String,
                        var miasto: String) {
    override fun toString(): String {
        return "Wydawnictwo($nazwa, $miasto)"
    }
}