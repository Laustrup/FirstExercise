import java.util.ArrayList;
import java.util.Scanner;

public class  Main {

    public static void main(String[] args) {

        Kvadrat kvadrat = new Kvadrat();
        /*Bog bog = new Bog();*/
        Arrlist arrlist = new Arrlist();
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

                /*case "2":
                    System.out.println(bog.getDescription());
                    bog.assignment();
                    break;*/
                case "3":
                    ArrayList<String> arr = new ArrayList<>();

                    arr.add("Yeah");
                    arr.add("Red Bull!");
                    arr.add("coding");
                    arr.add("is");
                    arr.add("so");
                    arr.add("much");
                    arr.add("fun");

                    System.out.println(arrlist.getDescription());
                    System.out.println("Type a String and see if it matches: ");

                    String input = scan.nextLine();
                    arrlist.doesArraylistContainString(arr, input);
                    break;
                default:
                    System.out.println("Try again");
                }
            }

        }
        //bog, arraylist

    }


