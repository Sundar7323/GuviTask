package jattask8;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

public class Writeexcel {

    public static void main(String[] args) {
        Workbook workbook = new XSSFWorkbook();

        Sheet sheet = workbook.createSheet("Sheet2");

        Row headerRow = sheet.createRow(0);

        headerRow.createCell(0).setCellValue("Name");
        headerRow.createCell(1).setCellValue("Age");
        headerRow.createCell(2).setCellValue("Email");

        Row row1 = sheet.createRow(1);
        row1.createCell(0).setCellValue("John Doe");
        row1.createCell(1).setCellValue(30);
        row1.createCell(2).setCellValue("john@test.com");

        Row row2 = sheet.createRow(2);
        row2.createCell(0).setCellValue("Jane Doe");
        row2.createCell(1).setCellValue(28);
        row2.createCell(2).setCellValue("john@test.com");

        Row row3 = sheet.createRow(3);
        row3.createCell(0).setCellValue("Bob Smith");
        row3.createCell(1).setCellValue(35);
        row3.createCell(2).setCellValue("jacky@example.com");

        Row row4 = sheet.createRow(4);
        row4.createCell(0).setCellValue("Swapnil");
        row4.createCell(1).setCellValue(37);
        row4.createCell(2).setCellValue("swapnil@example.com");

        // Write the output to an Excel file
        try (FileOutputStream fileOut = new FileOutputStream("EmployeeData.xlsx")) {
            workbook.write(fileOut);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            workbook.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

