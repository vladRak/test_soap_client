package com.test.soap.client.xls.util;

import com.test.soap.client.xls.column.ColumnName;
import com.test.soap.client.xls.row.DefaultRowValueSetter;
import org.apache.poi.ss.usermodel.*;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * SheetHelper class used for simplification creating sheet
 *
 * @author vladRak
 */
public class SheetHelper {

    private final static int HEADER_ROW_INDEX = 0;

    private SheetHelper() {
    }

    public static Row fillRow(final Supplier<List<Object>> rowData, final Row row) {
        return DefaultRowValueSetter
                .setValues(
                        row,
                        rowData.get());
    }

    public static CellStyle defaultHeaderStyle(final Workbook workbook) {
        Font headerFont = workbook.createFont();
        headerFont.setBold(true);
        headerFont.setFontHeightInPoints((short) 14);
        headerFont.setColor(IndexedColors.RED.getIndex());

        CellStyle headerCellStyle = workbook.createCellStyle();
        headerCellStyle.setFont(headerFont);

        return headerCellStyle;
    }

    public static Sheet resizeColumns(final ColumnName[] columns, final Sheet sheet) {
        short cellNumber = sheet.getRow(HEADER_ROW_INDEX).getLastCellNum();

        IntStream.range(0, cellNumber)
                .forEach(idx -> {
                    int finalIdx = idx;
                    Stream.of(columns).forEach((columnName) -> {
                        if (sheet
                                .getRow(HEADER_ROW_INDEX)
                                .getCell(finalIdx)
                                .getStringCellValue()
                                .equals(columnName.getName()))
                            sheet.autoSizeColumn(finalIdx);
                    });
                });

        return sheet;
    }

    public static Row createHeaderRow(final ColumnName[] columns, final Sheet sheet, final CellStyle cellStyle) {
        Row headerRow = sheet.createRow(HEADER_ROW_INDEX);

        for (int i = 0; i < columns.length; i++) {
            Cell cell = headerRow.createCell(i);
            cell.setCellValue(columns[i].getName());
            cell.setCellStyle(cellStyle);
        }
        return headerRow;
    }
}
