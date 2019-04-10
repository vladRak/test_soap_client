package com.test.soap.client.xls.row;

import org.apache.poi.ss.usermodel.RichTextString;
import org.apache.poi.ss.usermodel.Row;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class DefaultRowValueSetter {

    private final static String ERROR_MESSAGE = "Unknown type of the parameter is found. [param: %s]";

    public static Row setValues(final Row row, final List<Object> parameters)
            throws IllegalArgumentException {
        for (int i = 0; i < parameters.size(); i++) {

            final Object parameter = parameters.get(i);

            if (parameter instanceof String) {
                row.createCell(i).setCellValue((String) parameter);
            } else if (parameter instanceof Double) {
                row.createCell(i).setCellValue((Double) parameter);
            } else if (parameter instanceof Boolean) {
                row.createCell(i).setCellValue((Boolean) parameter);
            } else if (parameter instanceof Date) {
                row.createCell(i).setCellValue((Date) parameter);
            } else if (parameter instanceof Calendar) {
                row.createCell(i).setCellValue((Calendar) parameter);
            } else if (parameter instanceof RichTextString) {
                row.createCell(i).setCellValue((RichTextString) parameter);
            } else {
                throw new IllegalArgumentException(
                        String.format(ERROR_MESSAGE, parameter));
            }
        }
        return row;
    }
}