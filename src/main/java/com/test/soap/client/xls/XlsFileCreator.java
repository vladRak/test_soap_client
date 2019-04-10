package com.test.soap.client.xls;

import com.test.soap.client.DataSource;
import com.test.soap.client.exception.DataAccessCode;
import com.test.soap.client.exception.DataAccessException;
import org.apache.poi.ss.usermodel.Workbook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.function.Supplier;

public class XlsFileCreator implements DataSource<XlsData> {

    private static final Logger logger = LoggerFactory.getLogger(XlsFileCreator.class);

    @Override
    public void save(XlsData xlsData) throws DataAccessException {
        try {

            createXlsFile(
                    xlsData.getPath(),
                    xlsData.getSupplier());

        } catch (IOException e) {
            throw new DataAccessException(e, DataAccessCode.IO_EXCEPTION);
        }
    }

    private void createXlsFile(final String path, final Supplier<Workbook> supplier) throws IOException {
        Workbook workbook = supplier.get();

        try (FileOutputStream fileOut = new FileOutputStream(path)) {

            workbook.write(fileOut);

            logger.info("Excel file has been generated with path " + path);
        } finally {
            workbook.close();
        }
    }
}
