public class Bog {

    private String description = "Opgavebeskrivelse: \nSkriv en klasse kaldet Bog, der indeholder ISBN-nummer, titel og udgivelsesår. Skriv flg. metoder: •Constructor• Getters og setters• toString. \nSkriv en klasse kaldet Bibliotek, der indeholder en liste af Bog objekter. •Indsæt tre forskellige bøger i Biblioteket• \nSkriv en metode i Bibliotek klassen, som tager et Bog objekt som parameter, og returnerer true, hvis listen indeholder et Bog objekt med samme ISBN.";
    private String ISBN;
    private String titel;
    private String udgivelsesår;

    public Bog (String ISBN, String titel, String udgivelsesår){
        this.ISBN = ISBN;
        this.titel = titel;
        this.udgivelsesår = udgivelsesår;
    }





    public String getDescription() {
        return description;
    }


    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getUdgivelsesår() {
        return udgivelsesår;
    }

    public void setUdgivelsesår(String udgivelsesår) {
        this.udgivelsesår = udgivelsesår;
    }


    @Override
    public String toString(){
        return "Bøger i biblioteket: \n" + "ISBN: " + getISBN() + ", Titel: " + getTitel() + ", Udgivelsesår: " +
                getUdgivelsesår() + "\n";
    }
}
