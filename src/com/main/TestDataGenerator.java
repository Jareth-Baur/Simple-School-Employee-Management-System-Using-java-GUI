import com.main.Employee;
import com.main.EmployeeDAO;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.Random;

public class TestDataGenerator {

    public static void main(String[] args) {
        try {
            // Generate and insert 20 different employee records
            for (int i = 0; i < 20; i++) {
                Employee employee = generateRandomEmployee();
                EmployeeDAO.insertEmployee(employee);
                System.out.println("Inserted employee: " + employee);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Method to generate a random Employee object
    private static Employee generateRandomEmployee() {
        Random random = new Random();
        String[] genders = {"Male", "Female"};
        String[] jobTitles = {"Manager", "Developer", "Designer", "HR", "Accountant"};

        // Generate random values for each field
        String firstName = "FirstName" + random.nextInt(1000);
        String lastName = "LastName" + random.nextInt(1000);
        String gender = genders[random.nextInt(genders.length)];
        Date dateOfBirth = generateRandomDate(1970, 2000);
        Date hireDate = generateRandomDate(2000, 2022);
        String jobTitle = jobTitles[random.nextInt(jobTitles.length)];
        BigDecimal salary = BigDecimal.valueOf(30000 + random.nextInt(70000)); // Range: 30,000 to 100,000
        String email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@example.com";
        String phoneNumber = "+1" + String.format("%09d", random.nextInt(1000000000)); // Format: +1 followed by 9 random digits

        return new Employee(firstName, lastName, gender, dateOfBirth, hireDate, jobTitle, salary, email, phoneNumber);
    }

    // Method to generate a random date between two years
    private static Date generateRandomDate(int startYear, int endYear) {
        Random random = new Random();
        int year = startYear + random.nextInt(endYear - startYear + 1);
        int month = 1 + random.nextInt(12);
        int day = 1 + random.nextInt(28); // Assuming all months have 28 days
        return Date.valueOf(year + "-" + month + "-" + day);
    }
}
