import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;
public class Project1{
    public static void main(String args[]){
        String ch="yes";
        int score1=0,attempt1=0;
        System.out.println("Choose a number in the range of 1 to 100.");
        System.out.println("The maximum attempts are only 3 in one round. ");
        while(ch.equals("yes")){
            attempt1++;
             int db=ThreadLocalRandom.current().nextInt(1,101);
        Scanner sc=new Scanner(System.in);
        int attempt=3;
        int score=0;
        while(attempt-- > 0){
            System.out.println("Enter number: ");
            int n=sc.nextInt();
            if(n==db){
            score++;
            System.out.println("Yah!!you guessed");
            break;
            }
            else if(n<=0||n>=100)
            System.out.println("You lost a chance,enter a valid number." );
            else if(n>db)
            System.out.println("generated number is lesser than: "+n);
            else if(n<db)
            System.out.println("generated number is greater than: "+n);
            
}
        score1+=score;
        System.out.println("score:"+score);
        if(score==0){
        System.out.println("The number is "+db); }
        System.out.println("Do you want to play again?yes/no");
        ch=sc.next().toLowerCase();
         /*if(ch.equals("yes")){
             attempt1++;
         }*/
        if(ch.equals("no")){
System.out.println("Number of rounds you made are: "+attempt1);
System.out.println("Number of attempts you made are: "+attempt1*3);
        System.out.println("Total score in "+attempt1*3+" attempts is: "+score1);
            System.out.println("Thank you for playing!!");
        }
        
    }
}
}