import java.util.Scanner;

public class middledigit{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if(n<100||n>999){
            System.out.println("Enter a three-digit number");
        }else{
            int mid=(n/10)%10;
            if(mid%3==0){
                System.out.println("It is divisible by 3");
            }else{
                System.out.println("It is not divisible by 3");
            }
        }

        sc.close();
    }
}