
import java.util.Scanner;
import java.util.Random;


class Main{

    Random rand = new Random();
    Scanner obj = new Scanner(System.in);

      public void method()
      {
        int com_dise;
        int com_user;
        int comadd = 0;
        int useradd = 0;
        int counterofcomputer=0;
        int counterofuser =0;
        for (int i = 1 ; i<=10 ; i++)
        {
             com_dise =rand.nextInt(6);
             System.out.println("\t\t\tComputer Turn : "+com_dise);
             comadd +=com_dise;
 
             com_user =rand.nextInt(6);
             System.out.println("\t\t\tUser Turn : "+com_user);
             useradd +=com_user;
 
            if(com_user == com_dise)
            {
                System.out.println("\t\t\t\t\t**********Tie**********");
                break;
            }
            else if(com_user > com_dise)
            {
                System.out.printf("Match: %d User wins",i);
                counterofuser = counterofuser + 1;
            }
            else
            {
                System.out.printf("Match: %d Computer wins",i);
                counterofcomputer = counterofcomputer +1;
            }
 
 
 
        }
        System.out.println("Total rank of computer:  "+comadd);
 
        System.out.println("Total rank of user:  "+useradd);
 
        System.out.println("\t\tComputer wins "+(counterofcomputer)+" Times");
 
        System.out.println("\t\tUser wins "+(counterofuser)+" Times");
 
        if(counterofcomputer > counterofuser)
        {
            System.out.println("\t\t\t\t\n\n*********Computer Wins Finally*********");
        }
        else
        {
            System.out.println("\t\t\t\t\n\n*********User Wins Finally*********");
        }
 
      }
}

class task4
{
    public static void main(String[] args) {
        Main obj = new Main();

        obj.method();
    }
}