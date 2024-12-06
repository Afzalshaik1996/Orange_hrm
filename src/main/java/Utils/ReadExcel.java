package Utils;

import org.apache.poi.ss.usermodel.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
public class ReadExcel {
    private static final String FILE_PATH = "src/java/resources/TestDataFiles/LoginData.xlsx"; // Change this path

    public static String getCellValue(int rowNum, int cellNum) {
        String cellValue = "";
        try {
            // Load the Excel file
            FileInputStream fis = new FileInputStream(new File(FILE_PATH));
            Workbook workbook = WorkbookFactory.create(fis);
            Sheet sheet = workbook.getSheetAt(0); // Assuming data is in the first sheet
            Row row = sheet.getRow(rowNum); // Get the row based on the row number
            Cell cell = row.getCell(cellNum); // Get the cell based on the column number

            // Get the cell value
            if (cell.getCellType() == CellType.STRING) {
                cellValue = cell.getStringCellValue();
            } else if (cell.getCellType() == CellType.NUMERIC) {
                cellValue = String.valueOf(cell.getNumericCellValue());
            }

            workbook.close();
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return cellValue;
    }
}
