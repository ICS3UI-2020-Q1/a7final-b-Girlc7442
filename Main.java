/**
 * Tells the user if a given number is harshad
 * @author Cole Girling
 */
public class Main {

  public static boolean isNiven(int number){
    //initializes the accumulator at 0
    int sumOfDigits = 0;
    
    //saves the original number
    int digits = number;
    
    //runs while there is more than one digit in the number
    while(digits >= 10){
      digits = digits % 10;

      sumOfDigits = sumOfDigits + digits;
    }
  
    //determines if the number is harshad and will return either true or false depending on if it is
    if(number % sumOfDigits >= 1){
      return false;
    }else{
      return true;
    }
  }

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //calls the method and inserts the number into the method
    boolean isHarshadNumber = isNiven(14);
    
    //prints true or false to the screen 
    System.out.println(isHarshadNumber);
    
  }
}
