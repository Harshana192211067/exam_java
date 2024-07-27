import java.util.Scanner;
public class e2_usernamevalid {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String s1=input.nextLine();
        String s2=input.nextLine();
        if(s1.equals(s2))
        {System.out.print("user name valid");}
        else {System.out.print("user name Invalid");}
    }
}
