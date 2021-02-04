public class Kvadrat {

    private String description = "Skriv en metode, der som parameter modtager et heltal. Metoden skal udskrive et kvadrat på skærmen svarende til heltallet. I det følgende eksempel er tallet 6 modtaget som parameter til metoden\n\nUdvid metoden, så den også modtager et tegn, som er det tegn, somprintes på skærmen\n";

    public void assignment(int rowsAndLines) {

    for (int i = 0; i < rowsAndLines; i++) {
        for (int j = 0; j < rowsAndLines; j++) {
            System.out.print("* ");
        }
        System.out.println();
    }

        System.out.println();

    }

    public String getDescription() {
        return description;
    }
}
