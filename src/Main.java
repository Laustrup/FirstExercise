import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Kvadrat kvadrat = new Kvadrat();
        Bog bog = new Bog("294927", "The case of the switch", "2021");
        Bibliotek bibliotek = new Bibliotek();
        //Arrlist arrlist = new Arrlist();
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Press 1 for Kvadrat, 2 for bog or 3 for arraylist:");
            String typed = scan.nextLine();

            switch (typed) {
                case "1":

                    int kvadratInput = 0;

                    System.out.println("\n" + kvadrat.getDescription() + "\nEnter a integer:");
                    String pressed = scan.nextLine();
                    try {
                        kvadratInput = Integer.parseInt(pressed);
                    }
                    catch (Exception e) {
                        System.out.println("That is not an integer...\n");
                        break;
                    }
                kvadrat.assignment(kvadratInput);
                break;


                case "2":
                    System.out.println(bog.getDescription());
                    bibliotek.printBooks();
                    Thread.sleep(1500);
                    System.out.println("\n\nComparing if new book's ISBN is identical with one in the library");
                    for (int i = 0; i < 3; i++){
                        System.out.print(". ");
                        Thread.sleep(2000);
                    }
                    System.out.print("\nThe answer is: ");
                    System.out.println(bibliotek.sameISBN(bog));
                    System.out.println();
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
    }
