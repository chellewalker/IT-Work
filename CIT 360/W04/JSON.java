import java.util.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;

class Employee {

    private String firstName;
    private String lastName;
    private String age;
    private String email;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setEmail(String firstName, String lastName, String age) {
        email = firstName + lastName + age + "@gmail.com";
    }

    public String toString() {
        return "First Name: " + firstName + 
        " Last Name: " + lastName + 
        " Age: " + age + 
        " Email: " + email;
    }
}

public class JSON {

    public static String employeeToJSON(Employee employee) {
 
        int check = 1;
        
        while (check != 0) {
        ObjectMapper mapper = new ObjectMapper();
        String s = "";

        try {
            s = mapper.writeValueAsString(employee);
        check = 0;            
        } catch (JsonProcessingException e) {
            System.err.println(e.toString());
        }

        return s;
    }}

    public static Employee JSONToEmployee(String s) {

        int check = 1;
        
        while (check != 0) {
        ObjectMapper mapper = new ObjectMapper();
        Employee employee = null;

        try {
          employee = mapper.readValue(s, Employee.class);
            check = 0;          
        } catch (JsonProcessingException e) {
            System.err.println(e.toString());
        }

        return employee;
    }}

    public static void main(String[] args) {

        int check = 1;

        while (check != 0) {
        try (Scanner scan = new Scanner(System.in)) {
            Employee emp = new Employee();
            System.out.println("Employee Registration:");

            System.out.println("Enter First Name:");
            emp.setFirstName(scan.nextLine());

            System.out.println("Enter Last Name:");
            emp.setLastName(scan.nextLine());

            System.out.println("Enter Current Age:");
            emp.setAge(scan.nextLine());
            emp.setEmail(emp.getFirstName(), emp.getLastName(), emp.getAge());

            String json = JSON.employeeToJSON(emp);
            System.out.println(json);

            Employee emp2 = JSON.JSONToEmployee(json);
            System.out.println(emp2);

            check = 0;
        }
        catch (Exception e) {
            System.out.println("Error: Something went wrong.");
        }
    }
    }

}