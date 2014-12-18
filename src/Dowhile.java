import java.util.Scanner;
public class Dowhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int userInput;
        do {
            System.out.println("Napiste cislo: ");

            userInput = input.nextInt();
        }
        while(userInput != 5);
        System.out.println("Nasel jsem 5!");
    }
}
