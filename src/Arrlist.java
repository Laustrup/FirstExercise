import java.util.ArrayList;

public class Arrlist {
    private String description = "Skriv en metode med navnet doesArraylistContainString, der modtager 2 parametrer: " +
            "en arrayliste og en streng.\nMetoden returnerer en boolean:\n" +
            "•Hvis strengen ikke findes i arraylisten indsættes strengen i listen og metoden returnerer false\n" +
            "•Hvis strengen findes i arraylisten returnerer metoden true og printer 'The String has been found'\n";

    public boolean doesArraylistContainString(ArrayList<String> arr, String str) {
        for (int i = 0; i < arr.size() - 1; i++) {
            if (arr.get(i).equalsIgnoreCase(str)) {
                System.out.println("The String has been found");
                return true;
            }
        }
            arr.add(str);
            System.out.println("Your String has been added to the Arraylist");
            return false;
        }


        public String getDescription () {
            return description;
        }
    }

