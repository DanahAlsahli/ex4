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
        System.out.println("how many numbers do u want?");
        int p = input.nextInt();

        int[] pp = new int[p];

        for (int i = 0; i < pp.length; i++) {
            System.out.println("enter a number:");
            pp[i] = input.nextInt();
        }

        int[] result = new int[p];
        int ind = 0;

        for (int i = 0; i < pp.length; i++) {
            if (pp[i] % 2 != 0) {
                result[ind] = pp[i];
                ind++;
            }
        }

        for (int i = 0; i < pp.length; i++) {
            if (pp[i] % 2 == 0) {
                result[ind] = pp[i];
                ind++;
            }
        }

        System.out.println("new array: " + Arrays.toString(result));
    }
}
