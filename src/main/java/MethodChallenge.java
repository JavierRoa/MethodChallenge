public class MethodChallenge {
    public static void main(String[] args) {
        System.out.println("Puntaje: Rango:");
        System.out.println("1500     " + calculateHighScorePosition(1500));
        System.out.println("1000     " + calculateHighScorePosition(1000));
        System.out.println("500      " + calculateHighScorePosition(500));
        System.out.println("100      " + calculateHighScorePosition(100));
        System.out.println("25       " + calculateHighScorePosition(25));

    }
    public static int calculateHighScorePosition(int score) {
        int rango = 4;
        if (score >=1000) {
            rango= 1;
        } else if (score>=500 && score<1000) {
            rango= 2;
        } else if (score>=100 && score<500) {
            rango= 3;
        }
        return rango;
    }
}
