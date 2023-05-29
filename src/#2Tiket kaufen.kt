fun main(){
    /*Deine Lieblingsfluggesellschaft bietet einen Hin- und Rückflug für eine 4-köpfige Familie. Ein Ticket kostet 125Euro pro Passagier und dein Kontostand beträgt 650Euro.

    Erstelle die benötigten Variablen, um die Tickets zu kaufen.
    Berechne den Gesamtpreis und den finalen Kontostand. Speichere diese in passenden Variablen und gib sie auf der Konsole aus.
    Datei für die Aufgabe: Bezahlung.kt*/
    var kontostand : Int = 650
    var tiket : Int = 125
    var p: Int = 4

    println("Kontostand: $kontostand€")
    println("Einzeltiket: $tiket€")

    var gesamt = p*tiket
    kontostand-= gesamt

    println("Gesamtpreis: $gesamt€")
    println("Neuer Kontostand: $kontostand€")
}