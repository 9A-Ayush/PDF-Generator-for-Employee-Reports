import org.apache.pdfbox.pdmodel.*;
import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import java.io.IOException;
import java.util.List;

public class PDFGenerator {
    public static void generateReport(List<Employee> employees) {
        try (PDDocument document = new PDDocument()) {
            PDPage page = new PDPage(PDRectangle.A4);
            document.addPage(page);

            PDPageContentStream contentStream = new PDPageContentStream(document, page);
            contentStream.beginText();
            contentStream.setFont(PDType1Font.HELVETICA_BOLD, 16);
            contentStream.newLineAtOffset(50, 750);
            contentStream.showText("Employee Report");
            contentStream.newLineAtOffset(0, -20);

            contentStream.setFont(PDType1Font.HELVETICA, 12);
            for (Employee emp : employees) {
                contentStream.newLineAtOffset(0, -15);
                contentStream.showText(emp.getId() + " | " + emp.getName() + " | " + emp.getDepartment() + " | $" + emp.getSalary());
            }

            contentStream.endText();
            contentStream.close();

            String fileName = "Employee_Report_" + System.currentTimeMillis() + ".pdf";
            document.save(fileName);
            System.out.println("PDF generated: " + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}