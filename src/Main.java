import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
        System.out.print("Basamak Sayısı Gir: ");
        int a= klavye.nextInt();


        for (int i =a; i>=1 ; i--) {
            for (int j = a; j>i ; j--) {
                System.out.print(" ");

            }
            for (int m = 1; m <=(2*i)-1 ; m++) {
                System.out.print("*");

            }
            System.out.println();

        }




    }
}