package c322.labs.lab1.GreenBottles;

public class GreenBottle {
    public static void main(String[] args) {
        int x = 10;
        while(x < 11 && x >0){
            System.out.println(x + " green bottles hanging on the wall,");
            System.out.println(x + " green bottles hanging on the wall,");
            System.out.println("And if one green bottle should accidentally fall,\n" +
                    "There’ll be nine green bottles hanging on the wall.\n");
            x = x - 1;
        }
    }
}
