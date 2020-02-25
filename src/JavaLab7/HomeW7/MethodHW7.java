package JavaLab7.HomeW7;

import java.util.InputMismatchException;
import java.util.Scanner;

// byte
public class MethodHW7 {
    public byte readbyte() {
        boolean repeat = true;
//   variabila declarata si initializata
        byte number = 0;
        while (repeat) {
            try {
                System.out.print("Please enter a number:");
                Scanner scanner = new Scanner(System.in);
//   variabila la care i-am asignat valoare
                number = scanner.nextByte();
                repeat = false;
            } catch (InputMismatchException e) {
                System.out.println("Invalid value, please enter a number:");
            } finally {
                System.out.println("Thank you for asking for help");
            }
        }
        return number;
    }

// short
    public short readshort() {
        boolean repeat = true;
//   variabila declarata si initializata
        short number = 0;
        while (repeat) {
            try {
                System.out.print("Please enter a number:");
                Scanner scanner = new Scanner(System.in);
//   variabila la care i-am asignat valoare
                number = scanner.nextShort();
                repeat = false;
            } catch (InputMismatchException e) {
                System.out.println("Invalid value, please enter a number:");
            } finally {
                System.out.println("Thank you for asking for help");
            }
        }
        return number;
    }

// long
    public long readlong() {
        boolean repeat = true;
//   variabila declarata si initializata
        long number = 0;
        while (repeat) {
            try {
                System.out.print("Please enter a number:");
                Scanner scanner = new Scanner(System.in);
//   variabila la care i-am asignat valoare
                number = scanner.nextLong();
                repeat = false;
            } catch (InputMismatchException e) {
                System.out.println("Invalid value, please enter a number:");
            } finally {
                System.out.println("Thank you for asking for help");
            }
        }
        return number;
    }

// float
    public float readfloat() {
        boolean repeat = true;
//   variabila declarata si initializata
        float number = 0;
        while (repeat) {
            try {
                System.out.print("Please enter a number:");
                Scanner scanner = new Scanner(System.in);
//   variabila la care i-am asignat valoare
                number = scanner.nextFloat();
                repeat = false;
            } catch (InputMismatchException e) {
                System.out.println("Invalid value, please enter a number:");
            } finally {
                System.out.println("Thank you for asking for help");
            }
        }
        return number;
    }

// double
    public double readdouble() {
        boolean repeat = true;
//   variabila declarata si initializata
        double number = 0;
        while (repeat) {
            try {
                System.out.print("Please enter a number:");
                Scanner scanner = new Scanner(System.in);
//   variabila la care i-am asignat valoare
                number = scanner.nextDouble();
                repeat = false;
            } catch (InputMismatchException e) {
                System.out.println("Invalid value, please enter a number:");
            } finally {
                System.out.println("Thank you for asking for help");
            }
        }
        return number;
    }

// boolean
    public boolean readboolean() {
        boolean repeat = true;
//   variabila declarata si initializata
        boolean confirmation = true;
        while (repeat) {
            try {
                System.out.print("Please enter a statement:");
                Scanner scanner = new Scanner(System.in);
//   variabila la care i-am asignat valoare
                confirmation = scanner.hasNext("boolean method");
                repeat = false;
            } catch (InputMismatchException e) {
                System.out.println("Invalid statement, please try again:");
            } finally {
                System.out.println("Thank you for asking for help");
            }
        }
        return confirmation;
    }
}