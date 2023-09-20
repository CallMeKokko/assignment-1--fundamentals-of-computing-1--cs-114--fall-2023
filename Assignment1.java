// Import libraries here

import java.util.Scanner;
public class Assignment1 {
  public static void main(String[] args) {

// initialize print initials
    System.out.println("     CCCCCCCC    KKKK   KKKK");
    System.out.println("  CCCC      CCC  KKKK  KKKK");
    System.out.println(" CCCC            KKKK KKKK");
    System.out.println(" CCCC            KKKKKKKKK");
    System.out.println(" CCCC            KKKK KKKK");
    System.out.println("   CCCC     CCC  KKKK  KKKK");
    System.out.println("     CCCCCCCC    KKKK   KKKK");

  // Ask user to input five character string
    try (Scanner scan = new Scanner(System.in)) {
      System.out.println("Enter a five character string.");
      String fivecharacterstring = scan.nextLine();
      fivecharacterstring minlength = 5;
      fivecharacterstring maxlength = 5;

  // Ask user to input number in Fahrenheit
    System.out.print("Enter a number in Fahrenheit.");

      final int BASE = 32;
      final double CONVERSION_FACTOR = 5.0/9.0;

      int fahrenheitTemp =   scan.nextInt();
      double celsciusTemp;

      celsciusTemp = (fahrenheitTemp - BASE)* CONVERSION_FACTOR;

  // Reverse string and trim off ends
    String str = fivecharacterstring;
      String result = "";

      for(int i = str.length()-1; i>=0; i--)
        result+=str.charAt(i);
      String output = result.substring(1, result.length()-1);

  // Generate random number
      int min = 32;
      int max = 16384;
      int number = (int)(Math.random() * ((max-min)+1)) + min;

  // Combine all previous steps

    System.out.println("Random number generated. Continuing...");

      System.out.println ("Your new string: " + celsciusTemp + output + number);

  }
}
}
