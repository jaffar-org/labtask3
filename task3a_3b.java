
import java.util.Scanner;
import java.util.Random;


class Main
{
    public void method()
    {
        Random rand = new Random();
        Scanner obj = new Scanner(System.in);

        int counter = 0;
        while(true)
        {

            System.out.print("Enter number : ");
            int number = obj.nextInt();


            System.out.print("\t\tNumber generated : ");
            int ran = rand.nextInt(10);

            System.out.println("\t\t"+ran);
            if(number == ran)
            {
                System.out.println("\t\t\t\t\t\t**********Equal**********");
                System.out.println("Number of guesses : "+(counter+1));
                break;
            }
            else if(number > ran)
            {
                System.out.println("Greater Try again !!!!!");
            }
            else if(number < ran)
            {
                System.out.println("Less Try again !!!!!");
            }
            counter = counter + 1 ;
        }

    }
}

class task3a_3b{
    public static void main(String[] args) {
        Main obj = new Main();

        obj.method();
    }
}
