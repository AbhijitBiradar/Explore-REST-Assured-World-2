package restfullbooker;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

// PlayList : https://www.youtube.com/playlist?list=PL-a9eJ2NZlbT0Hoo_Hj43utwgq2VusPyN
public class CreateBooking {

	public static void main(String[] args) {
		RestAssured.
			given().
				log().
					all().
				baseUri("https://restful-booker.herokuapp.com/").
				basePath("booking").
				body("{\r\n"
						+ "    \"firstname\" : \"Abhijit\",\r\n"
						+ "    \"lastname\" : \"Biradar\",\r\n"
						+ "    \"totalprice\" : 333,\r\n"
						+ "    \"depositpaid\" : true,\r\n"
						+ "    \"bookingdates\" : {\r\n"
						+ "        \"checkin\" : \"2012-01-01\",\r\n"
						+ "        \"checkout\" : \"2012-01-01\"\r\n"
						+ "    },\r\n"
						+ "    \"additionalneeds\" : \"Breakfast\"\r\n"
						+ "}").
				contentType(ContentType.JSON).
			when()
				.post().
				
			then()
				.log().
					all().
				statusCode(200);
		
	}
}
