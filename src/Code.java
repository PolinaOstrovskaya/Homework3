import java.util.Scanner;

public class Code {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        if(n == 5)
        {
            System.out.println("HI");
        }else
        {
            System.out.println("BYE");
        }
        int a=n-1;
        if(a>2)
        {
            System.out.println("Good");
        }
        else
        {
            System.out.println("Bad");
        }
    }
}

