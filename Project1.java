import java.util.Random;
import java.util.Scanner;
// rock  paper scissor game 
public class Project1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("press 1 :- Rock \n press 2 :- Paper \n press 3 :- scissor");
       int userinput = sc.nextInt();    //user input
       Random random=new Random();
        int computerinput = random.nextInt(3);          //computer input generate
        if (userinput==computerinput){
            System.out.println("drow");
        } else if (userinput==3 && computerinput==2 || userinput==1 && computerinput==3 || userinput==2 && computerinput==1) {
            System.out.println("You Wins!");
        }
        else {
            System.out.println("computer win!");
        }
        System.out.println("computer choice "+ computerinput);
    }
}