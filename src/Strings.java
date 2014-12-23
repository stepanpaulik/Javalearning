public class Strings {
    public static void main(String[] args) {
        String info = "";
        info += "My name is Stepan";
        info += " ";
        info += "Jsem hrac";
        System.out.println(info);

        StringBuilder text = new StringBuilder("");

        text.append("Ja jsem kokot")
        .append(" a nesnasim se")
        .append(" ale zaroven miluju Ancu!");
        System.out.println(text.toString());


        System.out.println("Here is some text.\tto byl tab\nnova radka!");
        System.out.print("Na jedne radce!");
        System.out.println("Swag");

        int cena = 10;
        int pocet = 15;
        System.out.printf("Prida int %d; a dalsi %d\n", cena, pocet);
        System.out.printf("Vynecham 5 pismen %5d", 15);

        for(int i=0 ; i<20; i++){
            System.out.printf("%2d: %s\n", i, "random picoviny");
        }
        //.2 .4 pocet desetinnych mist!
        System.out.printf("Celkova cena je: %.2f\n", 5.6789);
        System.out.printf("Celkova cena je: %8.4f\n", 5.6789);

    }
}
