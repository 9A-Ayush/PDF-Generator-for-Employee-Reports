import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.List;

public class EmployeeReportApp extends Application {
    @Override
    public void start(Stage stage) {
        Label label = new Label("Click below to generate Employee PDF Report");
        Button generateBtn = new Button("Generate PDF Report");
        generateBtn.setOnAction(e -> {
            List<Employee> employees = DBConnector.fetchEmployees();
            PDFGenerator.generateReport(employees);
        });

        VBox layout = new VBox(10);
        layout.getChildren().addAll(label, generateBtn);
        Scene scene = new Scene(layout, 300, 150);
        stage.setScene(scene);
        stage.setTitle("Employee PDF Generator");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}