/*Write a program to input a number of a month (1 - 12) and print its equivalent
name of the month.( e.g 1 to Jan, 2 to Feb. 12 to Dec.) Hint-use switch case*/

import java.util.Scanner;
class monthnum{
  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter input number: ");
    int n= sc.nextInt();
switch (n) {
  case 1:
    System.out.println("January");
    break;
  case 2:
    System.out.println("February");
    break;
  case 3:
    System.out.println("March");
    break;
  case 4:
    System.out.println("April");
    break;
  case 5:
    System.out.println("May");
    break;
  case 6:
    System.out.println("June");
    break;
  case 7:
    System.out.println("July");
    break;
    case 8:
    System.out.println("August");
    break;
  case 9:
    System.out.println("September");
    break;
  case 10:
    System.out.println("October");
    break;
    case 11:
    System.out.println("November");
    break;
  case 12:
    System.out.println("December");
    break;
  default:
    System.out.println("Invalid Input.");
    break;
}

  }
}