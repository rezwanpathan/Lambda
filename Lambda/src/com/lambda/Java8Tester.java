package com.lambda;
public class Java8Tester {

   public static void main(String args[]) {
		
      //with type declaration
      MathOperation addition = (int a, int b) -> a + b;
		
      //with out type declaration
      MathOperation subtraction = (a, b) -> a - b;
		
      //with return statement along with curly braces
      MathOperation multiplication = (int a, int b) -> { return a * b; };
		
      //without return statement and without curly braces
      MathOperation division = (int a, int b) -> a / b;
		
      System.out.println("10 + 5 = " +addition.operation(10, 5));
      System.out.println("10 - 5 = " +subtraction.operation(10, 5));
      System.out.println("10 x 5 = " +multiplication.operation(10, 5));
      System.out.println("10 / 5 = " +division.operation(10, 5));
		
      //without parenthesis
      GreetingService greetService1 = message -> System.out.println("Hello " + message);
		
      //with parenthesis
      GreetingService greetService2 = (message) -> System.out.println("Hello " + message);
		
      greetService1.sayMessage("Mahesh");
      greetService2.sayMessage("Suresh");
   }

}

interface MathOperation {
    int operation(int a, int b);
 }


interface GreetingService {
   void sayMessage(String message);
}
	