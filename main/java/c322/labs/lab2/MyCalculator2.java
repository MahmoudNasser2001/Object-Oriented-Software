package c322.labs.lab2;

import java.util.Scanner;

public class MyCalculator2 {
    public static int Addition(int N1, int N2) {
            return N1 + N2;
    }
    public static int Subtraction(int N1, int N2) {
        return N1 - N2;
    }
    public static int Multiplication(int N1, int N2) {
        return N1 * N2;
    }
    public static int Division(int N1, int N2) {
        return N1 / N2;
    }
    public static int AdditionModulo2(int N1, int N2) {
        return (N1 + N2) % 2;
    }
    public static int MultiplicationModulo2(int N1, int N2) {
        return N1 * N2 % 2;
    }
    public static void main(String[] args) {

        class Number{
            public static int main() {
                System.out.print("\nPlease enter an integer: ");
                Scanner Number = new Scanner(System.in);
                int N= Number.nextInt();
                return N;
            }
        }
        class AdditionModulo2{
            public static int main(int n1, int n2) {    return Addition(n1,n2) % 2;     }
        }
        class MultiplicationModulo2{
            public static int main(int n1, int n2) {    return Multiplication(n1,n2) % 2;   }
        }
        class getOperation{
            public static int main(int n1, int n2) {
                System.out.print("\nInput 1 for Addition ");
                System.out.print("\nInput 2 for Subtraction ");
                System.out.print("\nInput 3 for Multiplication ");
                System.out.print("\nInput 4 for Division ");
                System.out.print("\nInput 5 for Addition Modulo ");
                System.out.print("\nInput 6 for Multiplication Modulo ");
                System.out.print("\nPlease chose the operation: ");
                int x = 0;
                int N1 = n1;
                int N2 = n2;
                while (x == 0) {
                    Scanner OP = new Scanner(System.in);
                    int Operation= OP.nextInt();
                    if (Operation == 1) {
                        x = Addition(N1,N2);
                    } else if (Operation == 2) {
                        x = Subtraction(N1,N2);
                    } else if (Operation == 3) {
                        x = Multiplication(N1,N2);
                    } else if (Operation == 4) {
                        x = Division(N1,N2);
                    } else if (Operation == 5) {
                        x = AdditionModulo2.main(N1,N2);
                    }
                    else if (Operation == 6){
                        x = MultiplicationModulo2.main(N1,N2);
                    }
                    else {
                        System.out.println("Please enter a number between 1 and 6 for the operation: ");
                    }
                }
                return x;
            }
        }
        int N1 = Number.main();
        int N2 = Number.main();
        System.out.print("\nThe result is " + getOperation.main(N1,N2));
    }
}
