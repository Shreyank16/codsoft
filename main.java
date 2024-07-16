import java.util.*;
public class main{
  public static void main(String ar[]){
    Scanner s=new Scanner (System.in);
    int n=(int)(Math.random()*100);
    int i=0;
    while(true)
    {
    System.out.println("Guess the number:");
    int g=s.nextInt();
    i++;
    if(g<1 || g>100){
    System.out.println("Please enter the number between 1 to 100.");
    }
    else if(g==n){
    System.out.println("Congrats you guessed the number.");
    System.out.println("You taken "+ i +" tries");
    }
    else if(g>n)
    {
    System.out.println("The number is too high please try again.");
    }
    else if(g<n){
    System.out.println("The number is too less please try again.");
    }
    }
}
}