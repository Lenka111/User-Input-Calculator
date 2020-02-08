import java.util.Scanner;

public class InputCalculator {
    // Write your code here
    public static void inputThenPrintSumAndAverage(){
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int number = 0;
        int count = 0;
        long avg = 0;

        while (true){

            boolean isInt = sc.hasNextInt();
            if (isInt){
                number = sc.nextInt();
                sum += number;
                count++;
                
            }
            else{
                avg= Math.round((double)sum/(double)count);
                break;
            }

            sc.nextLine();

        }
        System.out.println("SUM = " + sum  + " AVG " + avg);
        sc.close();
    }

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }
}