import java.util.Scanner;
public class Sum_Method {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ans = sumnums();
        System.out.println(ans);
    }
    static int sumnums(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 1st number : ");
        int num1 = in.nextInt();
        System.out.print("Enter 2nd number : ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        return sum;
    }
}
