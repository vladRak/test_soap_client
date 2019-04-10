# SOAP client test task

Достаньте из  http://webservices.oorsprong.org/websamples.countryinfo/CountryInfoService.wso?WSDL информацию о коде страны и названии страны и сохраните в Эксель файл. Если сможете расширить эту информацию столицей, кодом страны, кодом валюты - только плюс.

        Get from http://webservices.oorsprong.org/websamples.countryinfo/CountryInfoService.wso?WSDL 
        information about the country code and country name and save in the Excel file. 
        If you can expand this information with the capital, country code, currency code - only a plus.

### Links
   - **Client code example** [here](https://github.com/vladRak/test_soap_client/blob/master/src/main/java/com/test/soap/client/ClientCodeExample.java "Client implementation").
   - Country info service SOAP interface (generated) [here](https://github.com/vladRak/test_soap_client/blob/master/src/main/java/org/oorsprong/websamples/CountryInfoServiceSoapType.java "Country info service SOAP interface").
   - Web service client (generated) [here](https://github.com/vladRak/test_soap_client/blob/master/src/main/java/org/oorsprong/websamples/CountryInfoService.java "WebServiceClient").

# SQL test task

Сделать таблицу с информацией о сотрудниках, таблицу о полученной зарплате за каждый месяц
Наполнить тестовыми данными
Сделать запрос, который покажет превысил ли доход сотрудника за год отметку в 100.000
Сделать запрос, который выведет сотрудников старше 50 лет у которых зарплата за какой либо месяц прошлого года была меньше 5.000

        Create tables:
            *   employees information,
            *   salary for each month;
        Fill tables with test data.
        Create queries:
            *   query that will show whether the employee’s salary exceeded 100.000 in a year.
            *   query that will return employees older than 50 years whose salary was less than 5,000 
                for any month of last year. 

### Links
- EER Diagram [here](https://github.com/vladRak/test_soap_client/blob/master/src/main/resources/file/eer_test_db.png "EER Diagram").
- DB script [here](https://github.com/vladRak/test_soap_client/blob/master/src/main/resources/file/test_db.sql "DB script").
- Queries [here](https://github.com/vladRak/test_soap_client/blob/master/src/main/resources/file/queries.sql "Queries").
