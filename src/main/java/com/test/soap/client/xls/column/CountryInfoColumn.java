package com.test.soap.client.xls.column;

public enum CountryInfoColumn implements ColumnName {

    ISO_CODE("ISO Code"),
    NAME("Name"),
    CAPITAL_CITY("Capital city"),
    CURRENCY_ISO_CODE("Currency ISO Code"),
    PHONE_CODE("Phone Code");

    private final String name;

    CountryInfoColumn(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
