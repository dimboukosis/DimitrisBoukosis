//import the Scanner method
import java.util.Scanner;

//Beginning of our program. It reads from the user grades and gives some results of the exam.
public class Analysis {
    //main method begins execution of Java.
    public static void main(String[] args) //
    {
        //We create an object of type Scanner, from which we will read the grades from the user.
        //Next we create an array called vathmologies, and in this array we assign the grades.
        //Next we read the grades, checking simultaneously if the new number is zero or (<1 or >10).
        //After we have completed the array, we proceed the calculations.
        Scanner input = new Scanner(System.in);

		int thesi=0;
        //initializing the array.
        int[] vathmologies;
        vathmologies = new int[10];
        for (int i = 0; i < 10; i++) {
            vathmologies[i] = 0;
        }

        //We define a variable k, to find out how many passed the class
        int k = 0;

        //For loop, in order to full the array with the grades.
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter the grade: ");
            vathmologies[i] = input.nextInt(); //We read from the user

            if (vathmologies[i] == 0)//If the user inserts zero, we stop taking numbers
            	break;

            //If the user gives grades more than 10 or less than 1, we ask again for a grade.
            while (vathmologies[i] > 10 || vathmologies[i] < 1) {
                System.out.print("Enter the grade again, because you entered a grade out of bounds: ");
                vathmologies[i] = input.nextInt();

                if (vathmologies[i] == 0)
                	break;
            }
            if (vathmologies[i] >= 5) //Check how many passed the class.
                k = k + 1;

			thesi=i; //holding how many grades we read, helps us with the displays.
        }

        //Disps for the success. Variable rate, which is the percentage of passed students.
		if (k!=0){
			double rate;
			rate = (double) 100 * k / (thesi+1);
			System.out.println(rate + " % passed the class");

			//if more than 75% passed the exams, we have a congratulatory message.
			if (rate >= 75.0)
				System.out.println("Congratulations, you are a really good teacher, or you put really good grades");
		}
		else
			System.out.println("You didn't insert a number");

    }
}