//constructor to generate the random number
//takeuserInput() to take a user input of number
//iscorrectnumber() to detect whether the number entered by the user is true
//getter and setter for nooguesses
//use properties such an noofguesses(int) , etc to get this task done !
import java.util.Random;
import java.util.Scanner;
class game{
    int random;
    int input;
   int NoOfGuess=1;
    Scanner sc=new Scanner(System.in);
    public int game() {
        Random rand=new Random();
        random=rand.nextInt(0,101);
        //System.out.println(random);
        return random;
    }
    public int takeuserinput(){
        System.out.println("Enter the number you assumed between 1 to 100:- ");
        input=sc.nextInt();
        return input;
    }
    public void iscorrect(){
        if(input == random) {
            System.out.println("You guessed the correct number");
            //update n.of attempts
            System.out.println("no of attempts :- " + NoOfGuess);

        }
        else if(input>random){
            NoOfGuess++;
            System.out.println("Guess the lower number");
            takeuserinput();
            iscorrect();
        }
        else{
            NoOfGuess++;
            System.out.println("guess the higher number");
            takeuserinput();
            iscorrect();
        }
    }
}
public class CWH_43_Guessing_A_Number {
    public static void main(String[] args) {
        game obj=new game();
        obj.game();
        obj.takeuserinput();
        obj.iscorrect();
    }
}
