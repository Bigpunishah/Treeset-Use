import java.util.Scanner;
class addSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int one;
        int two;

        int sum;
        int dif;
        int div;
        int mul;

        System.out.print("Enter first integer:");
        one = sc.nextInt();
        System.out.print("\nEnter second integer:");
        two = sc.nextInt();

        sum = one + two;
        dif = one - two;
        div = one / two;
        mul = one * two;
        
        System.out.printf("%d+%d=%d\n", + one, two, sum);
        System.out.printf("%d*%d=%d\n", + one, two, mul);
        System.out.printf("%d-%d=%d \n", + one, two, dif);
        System.out.printf("%d/%d=%d\n", + one, two, div);
        System.out.printf(", %d %d", + one, two);


        sc.close();
    }
}