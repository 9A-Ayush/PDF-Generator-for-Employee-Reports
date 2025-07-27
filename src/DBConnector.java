import java.sql.*;
import java.util.*;

public class DBConnector {
    public static List<Employee> fetchEmployees() {
        List<Employee> employees = new ArrayList<>();
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employees", "root", "password");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM employee");

            while (rs.next()) {
                employees.add(new Employee(
                    rs.getString("id"),
                    rs.getString("name"),
                    rs.getString("department"),
                    rs.getDouble("salary")
                ));
            }
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return employees;
    }
}