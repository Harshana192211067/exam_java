import java.util.Scanner;

public class e3_reversenumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int rev=0;
        while(n!=0)
        { int rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        } System.out.print(rev);
    }


}
