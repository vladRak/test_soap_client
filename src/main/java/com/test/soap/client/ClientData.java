package com.test.soap.client;

/**
 * ClientData interface used for separate data before saving in DataSource
 *
 * @author vladRak
 * @see DataSource
 */
public interface ClientData {

    /**
     * Returns an DataType object that can then be used for store data
     *
     * @return type of data
     * @author vladRak
     * @see DataType
     */
    DataType getDataType();
}
