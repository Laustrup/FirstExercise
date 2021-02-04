

public class Bibliotek {


    private Bog[] bøger = new Bog[3];
    private Bog bog1 = new Bog("858258", "Patrick på eventyr", "2021");
    private Bog bog2 = new Bog("294928", "Laust in the dark", "2021");
    private Bog bog3 = new Bog("953982", "Ayo and the MAC", "2021");

    public Bibliotek (){
        bøger[0] = bog1;
        bøger[1] = bog2;
        bøger[2] = bog3;
    }

    public void printBooks(){
        System.out.println("\n");
        for (int i = 0; i < bøger.length; i++){
            System.out.print("ISBN: " + bøger[i].getISBN());
            System.out.print(", Titel: " + bøger[i].getTitel());
            System.out.println(", Udgivelsår: " + bøger[i].getUdgivelsesår());
        }
    }

    public boolean sameISBN (Bog bog){
        for (int i = 0; i < bøger.length; i++){
            if (bøger[i].getISBN().equalsIgnoreCase(bog.getISBN())){
                return true;
            }
        }
        return false;
    }
}
