import java.util.Scanner;
public class Switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int celkovaCena = 0;
        int pokracovani = 1 ;

        do {
            System.out.println("Reknete co si chcete koupit: ");
            String userInput = input.nextLine();
            switch (userInput) {
                case "brambory":
                    System.out.println("Kolikrat kg chcete pridat brambor?(25kc/kg)");
                    int pocet = input.nextInt();
                    celkovaCena = celkovaCena + (pocet)*25;
                    break;
                case "sladkost":
                    System.out.println("Kolikrat sladkosti chcete pridat do kosiku?(10kc/ks)");
                    int pocetSladkosti = input.nextInt();
                    celkovaCena = celkovaCena + (pocetSladkosti)*10;
                    break;
            }
            System.out.println("Chcete dale pokracovat? (1/0)");
            pokracovani = input.nextInt();
            }
            while(pokracovani!=0);
            System.out.println("Musite zaplatit celkem " + celkovaCena);
    }
};

