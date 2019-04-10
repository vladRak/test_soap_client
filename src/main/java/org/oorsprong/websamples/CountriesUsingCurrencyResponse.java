
package org.oorsprong.websamples;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CountriesUsingCurrencyResult" type="{http://www.oorsprong.org/websamples.countryinfo}ArrayOftCountryCodeAndName"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "countriesUsingCurrencyResult"
})
@XmlRootElement(name = "CountriesUsingCurrencyResponse")
public class CountriesUsingCurrencyResponse {

    @XmlElement(name = "CountriesUsingCurrencyResult", required = true)
    protected ArrayOftCountryCodeAndName countriesUsingCurrencyResult;

    /**
     * Gets the value of the countriesUsingCurrencyResult property.
     *
     * @return possible object is
     * {@link ArrayOftCountryCodeAndName }
     */
    public ArrayOftCountryCodeAndName getCountriesUsingCurrencyResult() {
        return countriesUsingCurrencyResult;
    }

    /**
     * Sets the value of the countriesUsingCurrencyResult property.
     *
     * @param value allowed object is
     *              {@link ArrayOftCountryCodeAndName }
     */
    public void setCountriesUsingCurrencyResult(ArrayOftCountryCodeAndName value) {
        this.countriesUsingCurrencyResult = value;
    }

}