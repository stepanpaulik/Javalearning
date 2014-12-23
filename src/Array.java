public class Array {
    public static void main(String[] args) {
        int[] prvniPole = {2,3,6};
        for(int i=0; i<prvniPole.length; i++){
            System.out.println(prvniPole[i]);
        }

        String[] words = {"I","love","Anca"};
        for(String word: words){
            System.out.println(word);
        }

        String nulla = null;
        System.out.println(nulla);

        int[] cisla1d = {2,3,6};
        int[][] cisla2d = {
                {2,3,6},
                {2,5,7,10},
                {11,20,33}
        };
        System.out.println(cisla2d[1][3]);

        for(int i=0; i<cisla2d.length; i++){
            for(int k=0; k<cisla2d[i].length; k++){
                System.out.print(cisla2d[i][k] + "\t");
            }
            System.out.println();
        }
    }
}
