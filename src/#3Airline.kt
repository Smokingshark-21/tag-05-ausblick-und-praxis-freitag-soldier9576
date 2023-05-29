fun main(){
    /*Das Flugzeug hat 130 Sitzplätze, wieviele 4-köpfige Familien können mit dem Flugzeug mitgenommen werden? Gib das Ergebnis auf der Konsole aus.
    Wie viele freie Sitzplätze gibt es, wenn 25 4-köpfige Familien die Tickets kaufen? Gib das Ergebnis auf der Konsole aus.
    Der Flug kostet die Fluggesellschaft 16€ pro Kilometer. Die Flugstrecke von Berlin nach Mailand beträgt 1034.93 Kilometer. Wie teuer ist der Flug? Gib das Ergebnis auf der Konsole aus.
    Bringt dieser Flug der Fluggesellschaft einen Gewinn, wenn 130 Passagiere mitfliegen?
    Hinweis: Überlege dir wann es sinnvoll ist, Variablen und Konstanten anzulegen.*/

    //-----------------
    //Haupt Variablen
    val sitzplätze : Int = 130
    var family : Int = 4
    var anzahl : Int = 25
    val kostenA : Int = 16
    var flStrecke : Double = 1034.93
    var tkosten : Int = 125
    //----------------
    //Farben val
    val red = "\u001b[31m"
    val green = "\u001b[32m"
    val reset = "\u001b[0m"
    //----------------
    //Berechnungen
    var f : Int = sitzplätze/family //Anzahl an Familien
    var anzahlf : Int = family*anzahl
    var rest : Int = sitzplätze-anzahlf
    var kosten :Double = flStrecke*kostenA
    var einahmen : Int = tkosten*130
    var gewinn = kosten%einahmen
    //----------------

    println("Anzahl an Familien : $f")
    println("Freie Sitzplätze: $rest")
    println("Einahmen: $einahmen€")
    println(red + "Kosten: $kosten€"+ reset)
    println(green + "Gewinn: -$gewinn€"+ reset)
}