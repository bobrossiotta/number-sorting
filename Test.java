
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        /**
         * by bobrossiotta
         */
        // değişkenler
        int no1,no2,no3;
        Scanner bob = new Scanner(System.in);
        // değerler
        System.out.print("no 1:");
        no1 = bob.nextInt();
        System.out.print("no 2:");
        no2 = bob.nextInt();
        System.out.print("no 3:");
        no3 = bob.nextInt();
        if (no1>no2 && no1>no3){
            if (no2>no3){
                System.out.println("no1>no2>no3");
            }else {
                System.out.println("no1>no3>no2");
            }
        } else if (no2>no1 && no2>no3) {
            if (no1>no3){
                System.out.println("no2>no1>no3");
            }else {
                System.out.println("no2>no3>no1");
            }

        } else if (no3>no2 && no3>no1) {
            if (no2>no1){
                System.out.println("3>2>1");
            }else {
                System.out.println("3>1>2");
            }

        }


    } }