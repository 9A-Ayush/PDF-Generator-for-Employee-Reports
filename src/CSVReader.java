import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class CSVReader {
    public static List<Employee> readFromCSV(String filePath) {
        List<Employee> employees = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                if (values.length == 4) {
                    employees.add(new Employee(values[0], values[1], values[2], Double.parseDouble(values[3])));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return employees;
    }
}