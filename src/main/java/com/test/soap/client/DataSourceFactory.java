package com.test.soap.client;

import com.test.soap.client.xls.XlsFileCreator;


/**
 * DataSourceFactory class used for get store source by data type
 *
 * @author vladRak
 */
public class DataSourceFactory {

    /**
     * This method return object what can store incoming type of data
     *
     * @param type an type of data to storing manipulations
     * @return DataSource of incoming type
     * @author vladRak
     * @see DataSource,ClientData,DataType
     */
    public static <T extends ClientData> DataSource<T> getDataSource(DataType type) {
        DataSource<T> dataSource;
        switch (type) {
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
