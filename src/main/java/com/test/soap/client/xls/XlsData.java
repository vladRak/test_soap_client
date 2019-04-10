package com.test.soap.client.xls;

import com.test.soap.client.ClientData;
import com.test.soap.client.DataType;
import org.apache.poi.ss.usermodel.Workbook;

import java.util.Objects;
import java.util.function.Supplier;

public class XlsData implements ClientData {

    private final String path;
    private final Supplier<Workbook> supplier;

    public XlsData(String path, Supplier<Workbook> supplier) {
        this.path = path;
        this.supplier = supplier;
    }

    public String getPath() {
        return path;
    }

    public Supplier<Workbook> getSupplier() {
        return supplier;
    }

    @Override
    public DataType getDataType() {
        return DataType.XLS;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        XlsData xlsData = (XlsData) o;
        return Objects.equals(path, xlsData.path) &&
                Objects.equals(supplier, xlsData.supplier);
    }

    @Override
    public int hashCode() {
        return Objects.hash(path, supplier);
    }
}
