package test;

import baseUrl.CollectAPIBaseUrl;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Response;
import org.junit.Before;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class C27_CollectAPI_Nob_Ecz extends CollectAPIBaseUrl {

    @Test
    public void NobetciEcz(){
        specCollectApi.pathParams("pp1","health","pp2","dutyPharmacy")
                .when()
                .queryParams("ilce","Üsküdar","il","İstanbul");

        String token="apikey 7tvQNqthbXi8SO1Y6bubVd:0iO1wMZ9nmgHdDlGGUiC7u";
        Response response=given()
                .spec(specCollectApi)
                .headers("authorization","apikey "+token)
                .when()
                .get("/{pp1}/{pp2}");
        System.out.println("response = " + response.statusCode());
        response.prettyPrint();


    }

}
