package Practice;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){

        double num1 = getNum();
        double num2 = getNum();
        char operation = getOperation();
        double result = cal(num1, num2, operation);
        System.out.println("Result: " + result);

    }


    public static double getNum(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");

        if(scanner.hasNextDouble()){
            return scanner.nextDouble();
        }else {
            System.out.println("Error. Enter number again please!");
            return scanner.nextDouble();
        }
    }

    public static char getOperation(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select operation number: \n1 - add\n2 - subtract\n3 - multiply\n4 - divide");
        int operationNumber = 0;
        if (scanner.hasNext()){
            operationNumber = scanner.nextInt();
        }else {
            System.out.println("You didn't write number. Enter again");
            return getOperation();
        }

        switch (operationNumber){
             case 1:
                return '+';
             case 2:
                return '-';
             case 3:
                return '*';
             case 4:
                return '/';
            default:
                System.out.println("Error operation");
                return getOperation();
        }


    }

    public static double add(double num1, double num2){
        return num1 + num2;
    }

    public static double subtract(double num1, double num2){
        return num1 - num2;
    }

    public static double multiply(double num1, double num2){
        return num1 * num2;
    }
    public static double divide(double num1, double num2){
        return num1 / num2;

    }

    public static double cal(double num1, double num2, char operation){
        switch (operation){
            case '+':
                return add(num1, num2);
            case '-':
                return subtract(num1, num2);
            case '*':
                return multiply(num1, num2);
            case '/':
                return divide(num1, num2);
            default:
                return Double.NaN;
        }
    }

}
