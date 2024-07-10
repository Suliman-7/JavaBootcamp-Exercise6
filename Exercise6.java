package P;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.InputMismatchException;



import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

// Q1


//           	   System.out.println("Quastion 1");

//           	   try {
//
//
//           	   System.out.println("Please enter number 1 ");
//               int num1 = input.nextInt() ;
//
//
//               System.out.println("Please enter number 2 ");
//               int num2 = input.nextInt() ;
//
//               int sum = num1 + num2 ;
//               int sub = num1 - num2 ;
//               int mul = num1 * num2 ;
//               int div = num1 / num2 ;
//               int mod = num1 % num2 ;
//
//
//
//               System.out.println( num1 + " + " + num2 + " = " + sum);
//               System.out.println( num1 + " - " + num2 + " = " + sub);
//               System.out.println( num1 + " * " + num2 + " = " + mul);
//               System.out.println( num1 + " / " + num2 + " = " + div);
//               System.out.println( num1 + " mod " + num2 + " = " + mod);
//
//           	   }catch(InputMismatchException e) {
//                   System.out.println("Please enter numbers ! ");
//
//           	   }catch (ArithmeticException e) {
//                   System.out.println("can't devide by zero");
//
//           	   }




// Q2

//                System.out.println("Please enter number  ");
//
//                try {
//                int num1 = input.nextInt() ;
//                int count = 1 ;
//
//
//                while (count<=10) {
//                 System.out.println( num1 + " x " + count + " = " + (num1*count));
//                 count++ ;
//                }
//
//                }catch(InputMismatchException e) {
//                 System.out.println("please enter number !!");
//                }
//
        // Q3
//                System.out.println("Please enter Radius  ");
//
//                try {
//
//                double radius = input.nextDouble();
//
//                ParimeterCircle(radius);
//
//
//                }catch(InputMismatchException e) {
//                    System.out.println("please enter number !!");
//                }catch(ArithmeticException e) {
//                    System.out.println(e.getMessage());
//                }


        // Q4
//                System.out.println("Please enter count of numbers : ");
//
//                try {
//                int count = input.nextInt();
//                int count1 = count ;
//                double sum = 0 ;
//
//
//
//                while (count>=1) {
//                    System.out.println("Enter an integer : ");
//                    sum += input.nextInt();
//
//                    count--;
//                }
//                double avg = sum / count1 ;
//                System.out.println("The Average is : " + avg);
//
//                }catch(InputMismatchException e) {
//                System.out.println("please enter number !!");
//                }


        // Q5

//              System.out.println("Please enter number 1 ");
//
//              try {
//              int num1 = input.nextInt() ;
//
//              System.out.println("Please enter number 2 ");
//              int num2 = input.nextInt() ;
//
//              System.out.println("Please enter number 3 ");
//              int num3 = input.nextInt() ;
//
//
//              if ( num1+num2 == num3 ) {
//                  System.out.println(true);
//              }
//              else {
//                  System.out.println(false);
//              }
//
//              } catch (InputMismatchException e) {
//                  System.out.println("please enter number !!");
//              }

        // Q6


//                System.out.println("Please enter a word : ");
//
//	             String word = input.nextLine();
//
//	             StringBuilder rev = new StringBuilder(word);
//
//	             rev.reverse();
//
//	             System.out.println("Reverse word : " + rev);


        // Q7
//
//                System.out.println("Please enter a number :");
//
//                try {
//
//                    int num = input.nextInt() ;
//
//
//                	evenOdd(num);
//
//                }catch (InputMismatchException e) {
//                System.out.println("please enter number !!");
//                }catch(ArithmeticException e) {
//                  System.out.println(e.getMessage());
//              }

        // Q8

//              System.out.println("Please Enter a temperature in Centigrade :");
//              try {
//              int tempC = input.nextInt() ;
//
//              double tempF = (tempC * 1.8) + 32 ;
//
//	            System.out.println("Temperature in Fahrenheit : " + tempF);
//
//              } catch (InputMismatchException e) {
//                  System.out.println("please enter number !!");
//              }


        // Q9

//                 System.out.println("Please enter a sentence : ");
//
//                 try {
//
//	             String sentence = input.nextLine();
//
//                 System.out.println("Please enter a number :");
//                 int num = input.nextInt() ;
//
//                 System.out.println(sentence.charAt(num));
//
//                 }catch (StringIndexOutOfBoundsException e) {
//                     System.out.println(e.getMessage());
//                 }


        // Q10

//          System.out.println("Please enter Width  ");
//
//
//          try {
//
//          double w = input.nextDouble();
//
//          System.out.println("Please enter Height  ");
//
//          double h = input.nextDouble();
//
//          Parimeter(w,h);
//
//          } catch (InputMismatchException e) {
//              System.out.println("please enter number !!");
//          }catch (ArithmeticException e) {
//              System.out.println(e.getMessage());
//          }

    }


    public static void ParimeterCircle(double radius) throws ArithmeticException {

        if( radius<=0 ) {
            throw new ArithmeticException("radius should be more than zero !") ;
        }



        double pi = 3.14159265359 ;

        double parimeter  = 2 * pi * radius ;

        double area = pi * (radius * radius) ;

        System.out.println("Parimeter is = " + parimeter);
        System.out.println("Area is = " + area);


    }

    public static void evenOdd(int num) throws ArithmeticException {

        if(num<=0) {
            throw new ArithmeticException("Number should be positive");
        }

        if (num%2==0) {
            System.out.println("The Number is Even");
        }else {
            System.out.println("The Number is Odd");
        }
    }





    public static void Parimeter(double h, double w) throws ArithmeticException {

        if(h<=0 || w<=0) {
            throw new ArithmeticException("Height and wighet should be more than zero !") ;
        }

        double parimeter  = 2 * (h + w) ;

        double area = w * h ;

        System.out.println("Area is " + w + " * " + h + " = " + area);
        System.out.println("Parimeter is 2 * (" + w + " + " + h + ") = " + parimeter);
    }



}


















