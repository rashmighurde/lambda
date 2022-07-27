package testclasses;
import AllPojos.Pojo;
import AllPojos.location;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.*;

public class GoogleApi {
     @Test
    public static void pojoTest() {
        Pojo p=new Pojo();
        p.setAccuracy(50);
        p.setName("Frontline House");
        p.setPhoneNumbers("+91 98927384938");
        p.setAddress("abc street, Pune");
        p.setWebsite("http://google.com");
        p.setLanguage("French-IN");
        List<String> myList=new ArrayList<String>();
        myList.add("shoe park");
        myList.add("shop");
        p.setTypes(myList);

        location l=new location();
        l.setLat(-38.383494);
        l.setLng(33.427362);
        p.setLocation(l);


        RestAssured.baseURI = "https://rahulshettyacademy.com";
        Response res = given().queryParam("key", "qaclick123").body(p)
                .when().post("/maps/api/place/add/json")
                .then().assertThat().statusCode(200).extract().response();

        String responseString = res.asString();
        System.out.println(responseString);
    }
}
