package tw.com.rex.test;

import net.webservicex.www.CountryStub;
import net.webservicex.www.CountryStub.GetCountries;
import net.webservicex.www.CountryStub.GetCountriesResponse;

public class MainTest {

	public static void main(String[] args) throws Exception {
		CountryStub factory = new CountryStub();
		GetCountries param = new GetCountries();
		GetCountriesResponse countriesResponse = factory.getCountries(param);
		String countriesResult = countriesResponse.getGetCountriesResult();
		System.out.println(countriesResult);
	}

}
