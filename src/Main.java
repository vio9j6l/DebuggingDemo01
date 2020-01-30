import java.util.Random;
import java.util.Scanner;

/*
 Course: IST 311
 Instructor: Phil O'Connell (pxo4)
 Student: JiaJia Liu
 Email: jpl5840@psu.edu
 Assignment: LB05
*/

public class Main
{
  static Scanner keyboard = new Scanner(System.in);

  public static void main(String[] args) {
    int age;
    String name;

    System.out.print("Enter your age: ");
    //String userInput = keyboard.nextLine();
    age = Integer.parseInt(keyboard.nextLine());
    //keyboard.nextLine();

    System.out.print("Enter your name: ");
    name = keyboard.nextLine();

    System.out.println("You are " + name + ", age " + age);

  }
}
