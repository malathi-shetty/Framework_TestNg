package com.framework.testng.testCases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TC_005_BookTicket {

	@Test(dataProvider = "dataProvider_bookTicketTest")
	public void bookTicketTest(String src, String dest) {
		System.out.println("Book ticket from " + src + " to " + dest);
	}

	@DataProvider
	public Object[][] dataProvider_bookTicketTest() {
		
		 return new Object[][] {
	            {"Mumbai", "Goa"},
	            {"Mumbai", "Mangalore"},
	            {"Mumbai", "Bangalore"},
	            {"Mumbai", "Kerala"},
	            {"Mumbai", "Pune"}
	        };

		/*Object[][] objArr = new Object[5][2];

		objArr[0][0] = "Mumbai";
		objArr[0][1] = "Goa";

		objArr[1][0] = "Mumbai";
		objArr[1][1] = "Mangalore";

		objArr[2][0] = "Mumbai";
		objArr[2][1] = "Bangalore";

		objArr[3][0] = "Mumbai";
		objArr[3][1] = "Kerala";

		objArr[4][0] = "Mumbai";
		objArr[4][1] = "Pune";

		return objArr;
*/
	}

	@Test(dataProvider = "dataProvider_bookTicket")
	public void bookTicket(String src1, String dest1, String fare) {
		System.out.println(
				"Source ticket from ==> " + src1 + " , Destination ticket to ==>  " + dest1 + " Ticket Fare: " + fare);
	}

	@DataProvider
	public Object[][] dataProvider_bookTicket() {

		Object[][] objArr1 = new Object[5][3];

		objArr1[0][0] = "Mumbai";
		objArr1[0][1] = "Goa";
		objArr1[0][2] = "5000";

		objArr1[1][0] = "Mumbai";
		objArr1[1][1] = "Mangalore";
		objArr1[1][2] = "8000";

		objArr1[2][0] = "Mumbai";
		objArr1[2][1] = "Bangalore";
		objArr1[2][2] = "10000";

		objArr1[3][0] = "Mumbai";
		objArr1[3][1] = "Kerala";
		objArr1[3][2] = "12000";

		objArr1[4][0] = "Mumbai";
		objArr1[4][1] = "Pune";
		objArr1[4][2] = "3000";

		return objArr1;

	}

}
