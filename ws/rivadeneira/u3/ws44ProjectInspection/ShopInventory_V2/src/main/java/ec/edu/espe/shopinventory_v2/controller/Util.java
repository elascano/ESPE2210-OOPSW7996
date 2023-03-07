
package ec.edu.espe.shopinventory_v2.controller;

import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

/**
 *
 * @author Francisco Quiroga, Search Engine Bandits , DCCO-ESPE
 */
public class Util {
    public void exportToExcel(JTable table) throws IOException {
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos de excel", "xls");
        chooser.setFileFilter(filter);
        chooser.setDialogTitle("Guardar archivo");
        chooser.setAcceptAllFileFilterUsed(false);
        if (chooser.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
            String ruta = chooser.getSelectedFile().toString().concat(".xls");
            try {
                File sheetXLS = new File(ruta);
                if (sheetXLS.exists()) {
                    sheetXLS.delete();
                }
                sheetXLS.createNewFile();
                Workbook book = new HSSFWorkbook();
                FileOutputStream file = new FileOutputStream(sheetXLS);
                Sheet sheet = book.createSheet("Mi hoja de trabajo 1");
                sheet.setDisplayGridlines(false);
                for (int f = 0; f < table.getRowCount(); f++) {
                    Row fila = sheet.createRow(f);
                    for (int c = 0; c < table.getColumnCount(); c++) {
                        Cell celda = fila.createCell(c);
                        if (f == 0) {
                            celda.setCellValue(table.getColumnName(c));
                        }
                    }
                }
                int startRow = 1;
                for (int f = 0; f < table.getRowCount(); f++) {
                    Row row = sheet.createRow(startRow);
                    startRow++;
                    for (int c = 0; c < table.getColumnCount(); c++) {
                        Cell celda = row.createCell(c);
                        if (table.getValueAt(f, c) instanceof Double) {
                            celda.setCellValue(Double.parseDouble(table.getValueAt(f, c).toString()));
                        } else if (table.getValueAt(f, c) instanceof Float) {
                            celda.setCellValue(Float.parseFloat((String) table.getValueAt(f, c)));
                        } else {
                            celda.setCellValue(String.valueOf(table.getValueAt(f, c)));
                        }
                    }
                }
                book.write(file);
                file.close();
                Desktop.getDesktop().open(sheetXLS);
            } catch (IOException | NumberFormatException e) {
                throw e;
            }
        }
    }
}
