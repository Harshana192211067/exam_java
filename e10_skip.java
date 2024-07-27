import java.util.Scanner;
public class e10_skip {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m=input.nextInt();
        int n=input.nextInt();
        int k=input.nextInt();
        for(int i=m;i<=n;i+=k+1)
        { System.out.print(i+" "); }
    }
}
