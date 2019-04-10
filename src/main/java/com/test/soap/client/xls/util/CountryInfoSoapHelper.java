package com.test.soap.client.xls.util;

import org.oorsprong.websamples.CountryInfoService;
import org.oorsprong.websamples.CountryInfoServiceSoapType;
import org.oorsprong.websamples.TCountryInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.xml.ws.WebServiceException;
import java.util.Collections;
import java.util.List;

public class CountryInfoSoapHelper {

    private static final Logger logger = LoggerFactory.getLogger(CountryInfoSoapHelper.class);

    private CountryInfoService countryInfoService;

    public CountryInfoSoapHelper() {
        this.countryInfoService = new CountryInfoService();
    }

    public CountryInfoSoapHelper(CountryInfoService countryInfoService) {
        this.countryInfoService = countryInfoService;
    }

    public CountryInfoService getCountryInfoService() {
        return countryInfoService;
    }

    public List<TCountryInfo> getCountriesInfo() {
        try {

            CountryInfoServiceSoapType countryInfoSoup =
                    countryInfoService.getCountryInfoServiceSoap();

            return countryInfoSoup
                    .fullCountryInfoAllCountries()
                    .getTCountryInfo();

        } catch (WebServiceException e) {
            logger.error("Error with connect to web service", e);
        } catch (Exception e) {
            logger.error("Some error with getCountriesInfo()", e);
        }
        return Collections.emptyList();

    }
}
