package com.test.soap.client;

import com.test.soap.client.exception.DataAccessException;

public interface DataSource<T extends ClientData> {
    void save(T data) throws DataAccessException;
}
