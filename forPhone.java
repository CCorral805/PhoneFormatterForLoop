import java.util.Scanner;

public class forPhone {
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Please input a 10 digit phone number: ");
    double num = sc.nextDouble();
    double eraser;
    sc.close();
    for(double i = 1000000000 ; i>=1 ; i/=10){
      if(i==1000000000){                   //(
        System.out.print("(");
      }
      System.out.print((int)(num/i));
      eraser = (int)(num/i);      //Eraser is set to the leftmost digit of the current num
      eraser *= i;
      num-=eraser;                //Subtracting eraser from num will delete the leftmost digit

      if(i==10000000){                      //)
        System.out.print(")");
      }                       
      if(i==10000){                         //-
        System.out.print("-");
      }                          
      if(i==1){                            //End
        System.out.println("");
      }
    }

  }
}
