import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = DBConnector.fetchEmployees();
        PDFGenerator.generateReport(employees);
    }
}