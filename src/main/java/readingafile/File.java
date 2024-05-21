package readingafile;


// File.java
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;

public class File {

    public static Map<String, String> helper(String rdInput) throws IOException, InvalidFormatException {
        FileInputStream fis = new FileInputStream("C:\\Users\\ksravya\\Desktop\\readafile.xlsx");

        Workbook wb = WorkbookFactory.create(fis);
        Sheet sheet = wb.getSheetAt(0);
        HashMap<String, String> data = new HashMap<>();

        for (int r = 1; r <= sheet.getLastRowNum(); r++) {
            Row row = sheet.getRow(r);
            String firstCell = String.valueOf((int) row.getCell(0).getNumericCellValue()); // Using type casting to convert float to int

            if (rdInput.equals(firstCell)) {
                for (int j = 0; j < row.getLastCellNum(); j++) {
                    Cell cell = row.getCell(j);
                    if (cell.getCellType() != CellType.STRING) {
                        data.put(sheet.getRow(0).getCell(j).getStringCellValue(), String.valueOf((int) cell.getNumericCellValue()));
                    } else {
                        data.put(sheet.getRow(0).getCell(j).getStringCellValue(), cell.getStringCellValue());
                    }
                }
                break;
            }
        }
        return data;
    }
}






















