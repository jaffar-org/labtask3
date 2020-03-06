
import java.util.Scanner;
import java.util.Random;


class Main{
    public void autonumberplate()
    {
    
           Random rand = new Random();

           int check;
    
           int MAX = 26;
    
           char []alphabet = { 'a', 'b', 'c', 'd', 'e', 'f', 'g',
                   'h', 'i', 'j', 'k', 'l', 'm', 'n',
                   'o', 'p', 'q', 'r', 's', 't', 'u',
                   'v', 'w', 'x', 'y', 'z' };
    
           String res = "";
           for (int i = 0; i < 3; i++) {
               res = res + alphabet[rand.nextInt(3) % MAX];
           }
           //(int) (Math.random() * 3 % MAX)
           //alphabet
           String c = res.toUpperCase();
           System.out.print("Number plate is : ");
           System.out.print(c+" ");
           //number
           int[] arr = new int[3];
           for (int i =0 ;i <= 2 ; i++)
           {
               arr[i] = rand.nextInt(10);
           }
           for (int i =0 ;i <= 2 ; i++)
           {
               System.out.print(arr[i]);
           }
    }
}

class task1
{
    public static void main(String[] args) {
         
          Main obj = new Main();
          obj.autonumberplate();
    }
}