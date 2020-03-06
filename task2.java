
import java.util.Scanner;
import java.util.Random;



class Main
{
    Scanner obj = new Scanner(System.in);

      public void rain()
      {
        double  rainfallarr[] = new double[12];

        System.out.println("Enter rain value in the following :");
 
         for (int i =0 ;i<=11;i++)
         {
             System.out.print("Month "+(i+1)+" Rain is : ");
                 rainfallarr[i] = obj.nextDouble();
         }

                                  System.out.println("\n");

            for (int i = 0; i <= 11; i++) {
                if(rainfallarr[i] >=1) {
                System.out.println("Month "+(i+1)+" Rain is : "+rainfallarr[i]);
                }else
                {
                    System.out.println("Exception should in be in 1");
                }
            }
 
 
         //total rainfall of the year
        int total = 0;
        for (int i =0 ;i<=11;i++)
        {
            total +=rainfallarr[i];
        }
        System.out.println("\n");
        System.out.println("Total rainfall of the year :  "+total);
        //average
        for (int i =0 ;i<=11;i++)
        {
            total +=rainfallarr[i];
        }
        int average = total/12;
        
        System.out.println("\n");
        System.out.println("Average monthly rain fall is : "+average);
        //month with the most rain
 
        double MAX = rainfallarr[0];
        double temp = 0;
        for (int i =0 ;i<=11;i++)
        {
           if(MAX < rainfallarr[i])
           {
               MAX = rainfallarr[i];
               temp = (i);
           }
        }
        System.out.println("\n");
        System.out.println("Maximum Rainfall month: "+(temp+1));
 

        //Integer.MAX_VALUE
        //least rain month
        double MIN = rainfallarr[0] ;
        double temp2 = 0;
        for (int i =0 ;i<=11;i++)
        {
            if(MIN > rainfallarr[i])
            {
                MIN = rainfallarr[i];
                temp2 = i;
            }
        }
        System.out.println("Minimum Rain fall month : "+(temp2+1));
 
 
      }
}

class task2
{
    public static void main(String[] args) {
        Main obj = new Main();

        obj.rain();
    }
}