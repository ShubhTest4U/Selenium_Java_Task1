package testNG_Program;

import org.testng.annotations.DataProvider;

public class GoogleSearch1Data {

	// 1. India Qutub minar
	// 2. Agra Taj mahal
	// 3. Hyderabad charminar

	@DataProvider(name = "searchDataSet")
	public Object[][] searchData() {
		Object[][] searchKeyword = new Object[3][2];
		searchKeyword[0][0] = "India";
		searchKeyword[0][1] = "Qutub minar";

		searchKeyword[1][0] = "Agara";
		searchKeyword[1][1] = "Taj Mahal";

		searchKeyword[2][0] = "Hyderabad";
		searchKeyword[2][1] = "Charminar";

		return searchKeyword;
	}

}
