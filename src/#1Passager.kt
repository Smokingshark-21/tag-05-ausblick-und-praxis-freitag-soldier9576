fun main(){
  /*  Damit die Fluggesellschaft einen komfortablen Flug bieten kann, benötigt sie ein paar Informationen über die Passagiere. Bei Verspätungen oder Nicht-Erscheinen, sind beispielsweise Kontaktdaten von Vorteil. Um den Kunden auch ein gutes gastronomisches Angebot zu machen, ist es für die Fluggesellschaft außerdem gut zu wissen, ob die Kunden vegetarisch sind.

    Erstelle die 7 folgenden Variablen mit den passenden Datentypen: name, vorname, email, telefonnummer, geburtsjahr, reiseziel, vegetarisch.
    Diese Variablen sollen über Konsoleneingaben befüllt werden.
    Achtet auf sinnvolle Datentypen der einzelnen Variablen!
    Anschließend sollst du einen sogenannten Boarding Pass auf der Konsole ausgeben.
    Datei für die Aufgabe: Passagier.kt*/
    println("Geben sie bitte folgende daten ein \nIhr Vorname:")
    var vorname : String = readln()
    println("Ihr Nachname:")
    var name : String = readln()
    println("Ihre Email:")
    var email : String = readln()
    println("Ihre Telefonnummer: ")
    var telefonnummer :String = readln()
    println("Ihr Geburtsjahr")
    var geburtsjahr : String = readln()
    println("Ihr Reiseziel:")
    var reiseziel : String = readln()
    println("Sind sie vegetarisch ?")
    var vegetarisch : String = readln()

    println("\t-----Boardingpass-----")
    println("\t-Vorname: $vorname-\t")
    println("\t-Nachname: $name-\t")
    println("\t-Email: $email-\t")
    println("\t-Telefonnummer: $telefonnummer-\t")
    println("\t-Geburtsjahr: $geburtsjahr-\t")
    println("\t-Reiseziel: $reiseziel-\t")
    println("\t-tVegetarisch: $vegetarisch-\t")
    println("\t----------------------")
}