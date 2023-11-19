package test;

import baseUrl.CollectAPIBaseUrl;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class C28_CollectApiNEWS extends CollectAPIBaseUrl {

    @Test
    public void haberler(){
        specCollectApi.queryParams("pp1","news","pp2","getNews")
                .pathParams("country","tr","tag","general");
        String token=
                Response response=given()
                .given()
                .spec(specCollectApi)
                .header("authorization","apikey")

    }

}
