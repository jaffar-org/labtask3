

import java.util.Scanner;
import java.util.Random;


class Main 
{
   public void check(){
  
    Scanner obj = new Scanner(System.in);

    System.out.println("Enter your Sentence :  ");
          String sen = obj.nextLine();
          int length = sen.length();
           char a;
          for (int i = 0; i< length ; i++)
          {
              char character = sen.charAt(i);
              if(Character.isUpperCase(character) || sen.lastIndexOf('\\')=='.')
              {
                  System.out.println("Code is Beutify");
                  break;
              }
              else if(Character.isLowerCase(character) || sen.lastIndexOf('\\')!='.')
              {
                  a =Character.toUpperCase(character);
                  System.out.println("Beutify : "+a+""+sen.substring(1)+".");
                  break;
              }
    
          }
   }
}

class task6
{
    public static void main(String[] args) {
        Main obj = new Main();
        obj.check();
    }
}