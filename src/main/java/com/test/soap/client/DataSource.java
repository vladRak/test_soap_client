package com.test.soap.client;

import com.test.soap.client.exception.DataAccessException;

/**
 * DataSource interface used for saving incoming data
 *
 * @author vladRak
 * @see ClientData
 */
public interface DataSource<T extends ClientData> {

    /**
     * This method store data
     *
     * @throws DataAccessException If storing finish with out success exception occurred
     * @author vladRak
     * @see ClientData,DataAccessException
     */
    void save(T data) throws DataAccessException;
}
