/**
 * file: phone.java
 * author: Michael Cummins
 * course: CMPT 220
 * assignment: lab 2
 * due date: September 14,2016
 * version: 1.0
 */
import java.util.Scanner;

public class phone {
  public static void main(String[] args) {
    System.out.println("Enter a letter: ");
    Scanner input = new Scanner(System.in);
    String s = input.next();
    
    char character = s.toLowerCase().charAt(0);
    int n;
    
    switch(character){
        case 'a':
        case 'b':
        case 'c':
          n=2;
        break;
        
        case 'd':
        case 'e':
        case 'f':
          n=3;
        break;
        
        case 'g':
        case 'h':
        case 'i':
          n=4;
        break;
            
        case 'j':
        case 'k':
        case 'l':
          n=5;
        break;
        
        case 'm':
        case 'n':
        case 'o':
          n=6;
        break;
            
        
        case 'p':
        case 'q':
        case 'r':
        case 's':
          n=7;
        break;
            
        
        case 't':
        case 'u':
        case 'v':
          n=8;
        break;
        
        case 'w':
        case 'x':
        case 'y':
        case 'z':
          n=9;
        break;
        
        default:
          n=0;
    }
    if (n != 0) {
   System.out.print("The corresponding number is " + n);
   System.exit(0);
  }
  System.out.print(s + " is an invalid input");
  }
}