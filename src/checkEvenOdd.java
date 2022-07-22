import java.util.Scanner;

public class checkEvenOdd {
    public static void main(String[] args) {
        int num;
        System.out.println("enter   an  integer number");
        Scanner sc = new Scanner(System.in);
        num =   sc.nextInt();

        if(num%2==0)
            System.out.println("entered number  is  even");
        else
            System.out.println("entered number  is  odd");
    }
}
