import java.util.Scanner;

public class PartC {

    static String convertToBinaryString(int number) {

        int n = number;
        String binaryString = "";

        if (n == 0) {
            return "0";
        }

        while (n > 0) {
            binaryString = (n % 2) + binaryString;
            n = n / 2;
        }

        return binaryString;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        int number = input.nextInt();

        String result = convertToBinaryString(number);

        System.out.println("Binary of " + number + " is: " + result);

        input.close();
    }
}
