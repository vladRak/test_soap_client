package com.test.soap.client;

import com.test.soap.client.exception.DataAccessException;
import com.test.soap.client.xls.XlsData;
import com.test.soap.client.xls.column.CountryInfoColumn;
import com.test.soap.client.xls.sheet.CountryInfoSheet;
import com.test.soap.client.xls.sheet.SheetView;
import com.test.soap.client.xls.util.ConfigManager;
import com.test.soap.client.xls.util.SheetHelper;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ClientCodeExample {

    private static final String BASE_DIR_PATH = "base.file.path";
    private static final String FILE_NAME = "country_info.xlsx";
    private static final String SHEET_NAME = "Country_Info";
    private static final Logger logger = LoggerFactory.getLogger(ClientCodeExample.class);

    public static void main(String[] args) {
        try {

            //Creating Excel document
            XlsData clientData = new XlsData(
                    ConfigManager.getConfig(BASE_DIR_PATH) + FILE_NAME,
                    () -> {
                        Workbook workbook = new XSSFWorkbook();

                        SheetView.builder(workbook)
                                .name(SHEET_NAME)
                                .columns(CountryInfoColumn.values())
                                .headerStyle(SheetHelper.defaultHeaderStyle(workbook))
                                .rows(new CountryInfoSheet().fillRows())
                                .columnsSize((sheet) -> SheetHelper
                                        .resizeColumns(CountryInfoColumn.values(), sheet))
                                .build();

                        return workbook;
                    }
            );

            //Storing Excel document
            DataSourceFactory
                    .getDataSource(clientData.getDataType())
                    .save(clientData);

            logger.info("Excel file " + FILE_NAME + " has been generated");

        } catch (DataAccessException e) {
            logger.error(e.getCode().getMsg(), e);
        }
    }
}