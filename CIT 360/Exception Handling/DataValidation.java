import java.util.*;

public class DataValidation {

    public static void main(String[] args) {

        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Input #1");
            try {
            int num1 = Integer.parseInt(scan.nextLine());

            System.out.println("Input #2");
            try {
            int num2 = Integer.parseInt(scan.nextLine());

            try{
                int result = num1/num2;
                System.out.println(result);        
                }catch (ArithmeticException i){
                    System.out.println("Error: Cannot divide by 0.");

                    System.out.println("Input #2");
                    try {
                    num2 = Integer.parseInt(scan.nextLine());
        
                    try{
                        int result = num1/num2;
                        System.out.println(result);        
                        }catch (ArithmeticException j){
                            System.out.println("Error: Cannot divide by 0.");
                        }
                    }catch (NumberFormatException f) {
                        System.out.println("Error: Failed to register valid number.");
                }                    
                }

            }catch (NumberFormatException e) {
                System.out.println("Error: Failed to register valid number.");
            
                System.out.println("Input #2");
                try {
                int num2 = Integer.parseInt(scan.nextLine());
    
                try{
                    int result = num1/num2;
                    System.out.println(result);        
                    }catch (ArithmeticException i){
                        System.out.println("Error: Cannot divide by 0.");
                    }
                }catch (NumberFormatException f) {
                    System.out.println("Error: Failed to register valid number.");
            }}

                }catch (NumberFormatException e) {
                    System.out.println("Error: Failed to register valid number.");

                    System.out.println("Input #1");
                    try {
                    int num1 = Integer.parseInt(scan.nextLine());
        
                    System.out.println("Input #2");
                    try {
                    int num2 = Integer.parseInt(scan.nextLine());
        
                    int result = num1/num2;
                    System.out.println(result);            
                    }catch (NumberFormatException f) {
                        System.out.println("Error: Failed to register valid number.");
                    
                        System.out.println("Input #2");
                        try {
                        int num2 = Integer.parseInt(scan.nextLine());
                        try{
                        int result = num1/num2;
                        System.out.println(result);        
                        }catch (ArithmeticException i){
                            System.out.println("Error: Cannot divide by 0.");
                        }
                        }catch (NumberFormatException g) {
                            System.out.println("Error: Failed to register valid number.");
                    }}catch (ArithmeticException f) {
                        System.out.println("Cannot divide by 0.");
                    
                        System.out.println("Input #2");
                        try {
                        int num2 = Integer.parseInt(scan.nextLine());
                        try{
                        int result = num1/num2;
                        System.out.println(result);        
                        }catch (ArithmeticException i){
                            System.out.println("Error: Cannot divide by 0.");
                        }
                        }catch (NumberFormatException g) {
                            System.out.println("Error: Failed to register valid number.");
                    }}
                        }catch (NumberFormatException f) {
                            System.out.println("Error: Failed to register valid number.");
                        }
                }
                
                    }catch (ArithmeticException e) {
                        System.out.println("Error: Cannot divide by 0.");
                    }
    }
}