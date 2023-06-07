import java.util.Scanner;

public class BirthMonth { // class BirthMonth
    public static void main(String[] args) { //main
        Scanner in = new Scanner(System.in);

        // Prompt and input
        System.out.print("Enter your birth month [1-12 inclusive]:  "); // output "Enter your birth month [1-12 inclusive]: "
        int birthMonth = in.nextInt(); // input birthMonth

        if(birthMonth >=1 && birthMonth <= 12) //if birthMonth >=1 && <=12 then
        {
            System.out.print("Your birth month is: " + birthMonth); // output "Your birth month is: N "
            in.nextLine();
        }
        else // else
        {
            System.out.print("You entered an incorrect birth month value: " + birthMonth); // output "You entered an incorrect birth month value: "
        } // endif
    } // return
} // end class