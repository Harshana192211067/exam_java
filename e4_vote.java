import java.util.Scanner;
public class e4_vote {
    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.println("Enter the age: ");
    int age=input.nextInt();
    if(age>18) {
        System.out.print("you are eligible for vote");}
     else if(age<=0)
         System.out.print("Enter the age correctly");
     else
         System.out.print("allowed to vote after "+(18-age));
}}
