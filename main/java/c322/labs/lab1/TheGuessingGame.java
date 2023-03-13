package c322.labs.lab1.TheGuessingGame;
//import java.security.KeyStore;
import java.util.Random;
public class TheGuessingGame {
    public static int main(String[] args) {
        class GameLauncher {
            public static void main() {
            }
            class GuessGame {
                public static int guess() {
                    Random rand = new Random();
                    int guess = rand.nextInt(10);
                    System.out.println("Number to guess is " + guess);
                    return guess;
                }
            }

            class Player {
                public static int player() {
                    Random rand = new Random();
                    int playerN = rand.nextInt(10);
                    //System.out.println("I'm guessing " + Player);
                    return playerN;
                }
            }
        }
        System.out.println("I'm thinking of a number between 0 and 9");
//        int x = 0;
//        int j = 0;
//        while(x == 0){
//            for(int i=0;i<3;i++){
//                System.out.println("I'm guessing " + GameLauncher.Player.player());
//                if(GameLauncher.Player.player() == GameLauncher.GuessGame.guess()){
//                    x = 1;
//                    j = i +1;
//                }
//            }
//        }
//        System.out.println("We have a Winner!");
//        if (j == 1){
//            System.out.println("Player One got it right? True");
//        }
//        else System.out.println("Player One got it right? False");
//        if (j == 2){
//            System.out.println("Player Two got it right? True");
//        }
//        else System.out.println("Player Two got it right? False");
//        if (j == 3){
//            System.out.println("Player Three got it right? True");
//        }
//        else System.out.println("Player Three got it right? False");
        return 0;
    }
}
