package com.test.soap.client.xls.sheet;

import com.test.soap.client.xls.column.ColumnName;
import org.apache.poi.ss.usermodel.*;

import java.util.function.Consumer;

/**
 * SheetView class used for building sheet
 *
 * @author vladRak
 * @see ColumnName
 */
public class SheetView {

    private final Sheet sheet;

    private SheetView(Builder builder) {
        this.sheet = builder.sheet;
    }

    public Sheet getSheet() {
        return sheet;
    }

    public static Builder builder(Workbook workbook) {
        return new SheetView.Builder(workbook);
    }

    public static class Builder {
        private Sheet sheet;
        private Workbook workbook;
        private ColumnName[] columns;

        private Builder(Workbook workbook) {
            this.workbook = workbook;
            sheet = workbook.createSheet();
        }

        public Builder name(String name) {
            workbook.setSheetName(workbook.getSheetIndex(sheet), name);
            return this;
        }

        public Builder columns(ColumnName[] columns) {
            this.columns = columns;
            Row headerRow = sheet.createRow(0);

            for (int i = 0; i < columns.length; i++) {
                Cell cell = headerRow.createCell(i);
                cell.setCellValue(columns[i].getName());
            }
            return this;
        }

        public Builder headerStyle(CellStyle headerStyle) {
            Row headerRow = sheet.getRow(0);

            for (int i = 0; i < columns.length; i++) {
                Cell cell = headerRow.getCell(i);
                cell.setCellStyle(headerStyle);
            }
            return this;
        }

        public Builder rows(Consumer<Sheet> consumer) {
            consumer.accept(sheet);
            return this;
        }

        public Builder columnsSize(Consumer<Sheet> consumer) {
            consumer.accept(sheet);
            return this;
        }

        public SheetView build() {
            return new SheetView(this);
        }
    }
}
