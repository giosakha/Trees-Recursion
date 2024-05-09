package trees;
//recursion 
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("1. Display Fibonacci series");
      System.out.println("2. Print the series 3 2 1 1 2 3");
      System.out.println("3. Display from 9 to 0");
      System.out.println("4. Display the sum of the first 10 numbers");
      System.out.println("5. Add all numbers between 5 to 10");
      System.out.println("6. Check if the given string is a palindrome or not (recursion)");
      System.out.print("Enter your choice: ");
      int choice = scanner.nextInt();

      switch (choice) {
          case 1:
              displayFibonacciSeries(10);
              break;
          case 2:
              printSeries();
              break;
          case 3:
              displayReverse(9);
              break;
          case 4:
              displaySumFirstN(10);
              break;
          case 5:
              displaySumRange(5, 10);
              break;
          case 6:
              scanner.nextLine(); // Consume newline character
              System.out.print("Enter a string: ");
              String str = scanner.nextLine();
              if (isPalindrome(str))
                  System.out.println("The string is a palindrome.");
              else
                  System.out.println("The string is not a palindrome.");
              break;
          default:
              System.out.println("Invalid choice!");
      }
      scanner.close();
  }

  // 1. Display Fibonacci series
  private static void displayFibonacciSeries(int n) {
      int a = 0, b = 1;
      System.out.print("Fibonacci series: ");
      for (int i = 1; i <= n; i++) {
          System.out.print(a + " ");
          int sum = a + b;
          a = b;
          b = sum;
      }
      System.out.println();
  }

  // 2. Print the series 3 2 1 1 2 3
  private static void printSeries() {
      System.out.print("Series: ");
      for (int i = 3; i >= 1; i--) {
          System.out.print(i + " ");
      }
      for (int i = 1; i <= 3; i++) {
          System.out.print(i + " ");
      }
      System.out.println();
  }

  // 3. Display from 9 to 0
  private static void displayReverse(int n) {
      System.out.print("Reverse series: ");
      for (int i = n; i >= 0; i--) {
          System.out.print(i + " ");
      }
      System.out.println();
  }

  // 4. Display the sum of the first n numbers
  private static void displaySumFirstN(int n) {
      int sum = 0;
      for (int i = 1; i <= n; i++) {
          sum += i;
      }
      System.out.println("Sum of first " + n + " numbers: " + sum);
  }

  // 5. Add all numbers between 5 to 10
  private static void displaySumRange(int start, int end) {
      int sum = 0;
      for (int i = start; i <= end; i++) {
          sum += i;
      }
      System.out.println("Sum of numbers between " + start + " to " + end + ": " + sum);
  }

  // 6. Check if the given string is a palindrome or not (recursion)
  private static boolean isPalindrome(String str) {
      return isPalindromeRecursive(str, 0, str.length() - 1);
  }

  private static boolean isPalindromeRecursive(String str, int start, int end) {
      if (start >= end) {
          return true;
      }
      if (str.charAt(start) != str.charAt(end)) {
          return false;
      }
      return isPalindromeRecursive(str, start + 1, end - 1);
    }
}
