package com.test.soap.client.exception;

/**
 * DataAccessCode used for customise error code.
 *
 * @author vladRak
 * @see DataAccessException
 */
public enum DataAccessCode {

    TRANSACTION_EXCEPTION(1, "Transaction exception"),
    SQL_EXCEPTION(2, "Some SQL exception"),
    IO_EXCEPTION(3, "Some IO exception");

    private final int code;
    private final String msg;

    DataAccessCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
