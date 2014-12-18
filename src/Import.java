import  java.util.Scanner;
public class Import {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        System.out.println("Napiste sem co chcete: ");

        String userInput = input.nextLine();

        System.out.println("Napasl jste: " + userInput);
    }
}
