package com.test.soap.client.xls.row;

import org.apache.poi.ss.usermodel.RichTextString;
import org.apache.poi.ss.usermodel.Row;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * DefaultRowValueSetter class used for simplification setting row values
 *
 * @author vladRak
 */
public class DefaultRowValueSetter {

    private final static String ERROR_MESSAGE = "Unknown type of the parameter is found. [param: %s]";

    /**
     * Method return an List of TCountryInfo
     *
     * @param row        an Row object for value setting
     * @param parameters an List of values
     * @return Row object with set values
     * @author vladRak
     */
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