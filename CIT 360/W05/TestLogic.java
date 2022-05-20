import java.util.*;
import java.lang.Math;

class TestLogic {

    public static void main(String[] args) {
        System.out.println("Find the length of a triangle.");
        System.out.println("A² + B² = C²");

        //get input
        while (true) {
        try (Scanner scan = new Scanner(System.in)) {
        double array[];
        array = new double[2];

            try {
            System.out.println("Enter A:");
            array[0] = scan.nextDouble();

            try {
            System.out.println("Enter B:");
            array[1] = scan.nextDouble();

            try {
            double c = Calculation(array);

        //release output
            System.out.println("The length of the third trinagle side is " + c);

            break;
            }
            catch (Exception c) {
                System.out.println("Error: Calculation Error.");
            }
            }
            catch (Exception b) {
                System.out.println("Error: Input B Error.");
            }
            }
            catch (Exception a) {
                System.out.println("Error: Input A Error.");
            }
        }
        catch (Exception d) {
            System.out.println("Error: Something Went Wrong.");
        }
    }
    }

    private static double Calculation(double array[]) {

            double c=0;
            for(int i=0;i<2;i++){
                    c+=Math.pow(array[i],2);
            }
            c=Math.sqrt(c);
    
            return c;
        }
    }