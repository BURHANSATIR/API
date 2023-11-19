package test;

import baseUrl.CollectAPIBaseUrl;
import io.restassured.builder.RequestSpecBuilder;
import org.junit.Before;
import org.junit.Test;

public class C27_CollectAPI_Nob_Ecz extends CollectAPIBaseUrl {

    @Test
    public void NobetciEcz(){
        specCollectApi.pathParams("pp1","health","pp2","dutyPharmacy")
                .when()
                .queryParams("ilce","Üsküdar","il","İstanbul");

        String token=""


    }

}
