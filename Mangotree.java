import java.util.Scanner;

public class Mangotree{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int c = sc.nextInt();
        int n = sc.nextInt();

        if(n<=c || n%c==1|| n%c==0){
            System.out.println("It is a Mango Tree");
        }
        else{
            System.out.println("Not a Mango Tree");
        }
    sc.close();
        
    }
}