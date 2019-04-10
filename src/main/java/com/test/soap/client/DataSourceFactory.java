package com.test.soap.client;

import com.test.soap.client.xls.XlsFileCreator;

public class DataSourceFactory {

    public static <T extends ClientData> DataSource<T> getDataSource(DataType dataType) {
        DataSource<T> dataSource;
        switch (dataType) {
            case XLS:
                dataSource = (DataSource<T>) new XlsFileCreator();
                break;
            case CSV: //Sample. Does not implemented
                dataSource = null;
                break;
            case TXT: //Sample. Does not implemented
                dataSource = null;
                break;
            case SQL: //Sample. Does not implemented
                dataSource = null;
                break;
            default:
                return null;
        }
        return dataSource;
    }
}
