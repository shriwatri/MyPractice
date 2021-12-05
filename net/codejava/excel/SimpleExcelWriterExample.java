package net.codejava.excel;
 
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.ClientAnchor;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.Drawing;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Picture;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.util.IOUtils;
 
/**
 * A very simple program that writes some data to an Excel file
 * using the Apache POI library.
 * @author www.codejava.net
 *
 */
public class SimpleExcelWriterExample {
 
    public static void main(String[] args) throws IOException {
    	System.out.println("Starting excel program....");
        HSSFWorkbook workbook = new HSSFWorkbook();
        HSSFSheet sheet = workbook.createSheet("Java Books");
         
        Object[][] bookData = {
                {"Head First Java", "Kathy Serria", 79},
                {"Effective Java", "Joshua Bloch", 36},
                {"Clean Code", "Robert martin", 42},
                {"Thinking in Java", "Bruce Eckel", 35},
        };
        
        ////
        //FileInputStream obtains input bytes from the image file
        InputStream inputStream = new FileInputStream(".\\src\\resources\\statestreetlogo.png");
        //Get the contents of an InputStream as a byte[].
        byte[] bytes = IOUtils.toByteArray(inputStream);
        //Adds a picture to the workbook
        int pictureIdx = workbook.addPicture(bytes, Workbook.PICTURE_TYPE_PNG);
        //close the input stream
        inputStream.close();
      
        //Returns an object that handles instantiating concrete classes
        CreationHelper helper = workbook.getCreationHelper();
      
        //Creates the top-level drawing patriarch.
        Drawing drawing = sheet.createDrawingPatriarch();
      
        //Create an anchor that is attached to the worksheet
        ClientAnchor anchor = helper.createClientAnchor();
        //set top-left corner for the image
        anchor.setCol1(0);
        anchor.setRow1(0);
      
        //Creates a picture
        Picture pict = drawing.createPicture(anchor, pictureIdx);
        //Reset the image to the original size
       // pict.resize();
        pict.resize(3, 6);;
        
        ////
 
        int rowCount = 8;
        int columnCount = 0;
        Row row = sheet.createRow(rowCount++);
        Cell cell = row.createCell(columnCount);
        System.out.println("Row column "+rowCount+" and " + columnCount );
        cell.setCellValue("Logo here");
        sheet.autoSizeColumn(rowCount);
        row = sheet.createRow(rowCount++);
       
        cell = row.createCell(columnCount);
        System.out.println("Row column "+rowCount+" and " + columnCount );
        cell.setCellValue("Logo here1");
        sheet.autoSizeColumn(rowCount);
        row = sheet.createRow(rowCount++);
        cell = row.createCell(columnCount);
        System.out.println("Row column "+rowCount+" and " + columnCount );
        cell.setCellValue("Logo here1 and our organization welcomes you you can unsubscribe our mail box");
        sheet.setDisplayGridlines(false);
        
        cell = row.createCell(8);
       // cell.setCellValue("SimpleSolution.dev");
        // Set up font
        Font font = workbook.createFont();
        font.setColor(IndexedColors.WHITE.getIndex());
        font.setBold(true);
        // set up background color
        CellStyle cellStyle = workbook.createCellStyle();
        cellStyle.setFont(font);
       cellStyle.setFillBackgroundColor(IndexedColors.WHITE.getIndex());
        cellStyle.setFillForegroundColor(IndexedColors.WHITE1.getIndex());
        cellStyle.setFillPattern(FillPatternType.NO_FILL);
        cellStyle.setBorderBottom(BorderStyle.NONE);  
        cellStyle.setBottomBorderColor(IndexedColors.WHITE.getIndex());  
        cellStyle.setBorderRight(BorderStyle.NONE);  
        cellStyle.setRightBorderColor(IndexedColors.WHITE.getIndex());  
        cellStyle.setBorderTop(BorderStyle.NONE);  
        cellStyle.setTopBorderColor(IndexedColors.WHITE.getIndex());  
        cell.setCellStyle(cellStyle);
        cell = row.createCell(9);
        cell.setCellStyle(cellStyle);

        
        for (Object[] aBook : bookData) {
            row = sheet.createRow(rowCount++);
             
            columnCount = 0;
             
            for (Object field : aBook) {
                cell = row.createCell(columnCount++);
                if (field instanceof String) {
                    cell.setCellValue((String) field);
                    
                } else if (field instanceof Integer) {
                    cell.setCellValue((Integer) field);
                }
            }
             
        }
         
         
        try (FileOutputStream outputStream = new FileOutputStream("JavaBooks.xlsx")) {
            workbook.write(outputStream);
        }
        System.out.println("Exit excel program....");
    }
    
 
}