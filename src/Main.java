import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        double num1,num2,result;
        String operator="";

        System.out.println("Choose an operation: Addition, Subtraction, Division, Multiplication");

        operator = input.next();

        System.out.println("Enter a value: ");
        num1=input.nextDouble();

        System.out.println("Enter another value: ");
        num2=input.nextDouble();

        switch (operator.toLowerCase()) {

            case "addition":
                result=num1+num2;
                System.out.println("the result is: ");
                System.out.println(result);
                break;

            case "substaction":
                result=num1-num2;
                System.out.println("the result is: ");
                System.out.println(result);
                break;

            case "multiplication":
                result=num1*num2;
                System.out.println("the result is: ");
                System.out.println(result);
                break;

            case "division":
                result=num1/num2;
                System.out.println("the result is: ");
                System.out.println(result);
                break;

            default:
                System.out.println("INVALID");
                break;

        }

        }
    }
