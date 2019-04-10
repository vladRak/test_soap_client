package com.test.soap.client.xls.sheet;

import com.test.soap.client.xls.util.CountryInfoSoapHelper;
import com.test.soap.client.xls.util.SheetHelper;
import org.apache.poi.ss.usermodel.Sheet;
import org.oorsprong.websamples.TCountryInfo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.IntStream;

public class CountryInfoSheet {

    private CountryInfoSoapHelper countryClient;

    public CountryInfoSheet() {
        this.countryClient = new CountryInfoSoapHelper();
    }

    public CountryInfoSheet(CountryInfoSoapHelper countryClient) {
        this.countryClient = countryClient;
    }

    public CountryInfoSoapHelper getCountryClient() {
        return countryClient;
    }

    public Consumer<Sheet> fillRows() {
        return new Consumer<Sheet>() {
            @Override
            public void accept(Sheet sheet) {
                List<TCountryInfo> list = countryClient.getCountriesInfo();

                IntStream.range(1, list.size())
                        .forEach(idx -> {
                            final int finalIdx = idx;
                            SheetHelper.fillRow(() -> {
                                        TCountryInfo countryInfo = list.get(finalIdx);
                                        return getCountryInfo(countryInfo);
                                    },
                                    sheet.createRow(finalIdx));
                        });
            }
        };
    }

    private List<Object> getCountryInfo(TCountryInfo countryInfo) {
        return Arrays.asList(countryInfo.getSISOCode(),
                countryInfo.getSName(),
                countryInfo.getSCapitalCity(),
                countryInfo.getSCurrencyISOCode(),
                countryInfo.getSPhoneCode());
    }
}
