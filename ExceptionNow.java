import java.util.*;

public class ExceptionNow {

    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
      while(true){
        try{

            int num1, num2;
            double result;

            num1 =0;
            num2 = 0;
            result=0;

            System.out.print("\nEnter num1:");
            num1=input.nextInt();

            System.out.print("Enter num2:");
            num2=input.nextInt();

            if (num2==0)
            throw new DivisionZeroException("Zero division is not allowed!");

            result = (double) num1/num2;

            System.out.print("Result is: " + result);
            System.exit(0);
            

        } catch (InputMismatchException e) {
            System.out.println("Only integers are allowed for input:");
        }

        catch(DivisionZeroException e){
            System.out.println(e.getMessage());
        }
        /*finally{ //lumalabas pag merong error , balewala ang while(true), may system exit na kasi
            //input.close();
            System.out.println("\nProgram is terminated.");
            //System.exit(0);
        }*/
    }
  }
}