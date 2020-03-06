
import java.util.Scanner;
import java.util.Random;

class Main
{
    Scanner obj = new Scanner(System.in);
 public void check()
 {
    int arr[] = new int[10];
    System.out.println("Enter Intergers: ");
    for (int i =0 ;i<=9;i++) {  
        arr[i]=obj.nextInt(); 
    }
    System.out.println("\n");
    System.out.print("Reverse order :  ");
    for (int i=9 ;i>=0;i--) {     
        System.out.print("\t"+arr[i]);
    }
 }
}

class task5
{
    public static void main(String[] args) {
        Main obj = new Main();

        obj.check();
    }
}