import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Q1:
        System.out.println("how many numbers do u want?");
        int n = input.nextInt();

        int[] num = new int[n];

        for (int i = 0; i < num.length; i++) {
            System.out.println("enter a number:");
            num[i] = input.nextInt();
        }

        // Q2:
        int[] numbers = {1, 4, 17, 7, 25, 3, 100};

        int sum = 0;

        for (int number : numbers) {
            sum = sum + number;
        }

        double ave = (double) sum / numbers.length;

        System.out.println("the average is: " + ave);
        System.out.println("numbers greater than average:");

        for (int number : numbers) {
            if (number > ave) {
                System.out.println(number);
            }
        }

        // Q3:
        System.out.println("how many numbers do u want?");
        int nu = input.nextInt();

        int[] numb = new int[nu];

        for (int i = 0; i < numb.length; i++) {
            System.out.println("please enter a number:");
            numb[i] = input.nextInt();
        }

        if (numb[0] > numb[numb.length - 1]) {
            System.out.println("the larger value is: " + numb[0]);
        } else {
            System.out.println("larger value: " + numb[numb.length - 1]);
        }

        // Q4:
        int[] x = {20, 30, 40};

        int t = x[0];
        x[0] = x[x.length - 1];
        x[x.length - 1] = t;

        System.out.println(Arrays.toString(x));

        // Q5:
        System.out.println("How many numbers?");
        int n5= input.nextInt();
        int[] num5= new int[n5];
        for (int i=0; i<num5.length; i++) {
            System.out.println("Enter number:");
            num5[i]= input.nextInt();
        }

        int[] result=new int[n5];
        int index= 0;
        for (int i=0; i<num5.length; i++) {
            if (num5[i] % 2 !=0) {
                result[index]= num5[i];
                index++;
            }
        }

        for (int i=0; i<num5.length; i++) {
            if (num5[i] % 2==0) {
                result[index]= num5[i];
                index++;
            }
        }
        System.out.println("New array: " + Arrays.toString(result));

        // Q6:
        System.out.println("How many numbers?");
        int n6=input.nextInt();

        int[] num1= new int[n6];
        int[] num2= new int[n6];

        System.out.println("Enter first array:");

        for (int i=0; i<num1.length; i++) {
            num1[i]= input.nextInt();
        }

        System.out.println("Enter second array:");

        for (int i=0; i<num2.length; i++) {
            num2[i]= input.nextInt();
        }

        if (Arrays.equals(num1, num2)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }
}
