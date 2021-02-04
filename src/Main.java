import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Kvadrat kvadrat = new Kvadrat();
        Bog bog = new Bog();
        Arrlist arrlist = new Arrlist();
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Press 1 for Kvadrat, 2 for bog or 3 for arraylist:");
            String typed = scan.nextLine();

            switch (typed) {
                case "1":
                    System.out.println(kvadrat.getDescription());
                kvadrat.assignment();
                break;
                case "2":
                    System.out.println(bog.getDescription());
                    bog.assignment();
                    break;
                case "3":
                    System.out.println(arrlist.getDescription());
                    arrlist.assignment();
                    break;
                default:
                    System.out.println("Try again");
            }
            }

        }
        //bog, arraylist

    }

}
