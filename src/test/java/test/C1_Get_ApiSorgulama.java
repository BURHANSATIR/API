package test;

import io.restassured.internal.common.assertion.Assertion;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class C1_Get_ApiSorgulama {
   /*
C1_Get_ApiSorgulama
https://restful-booker.herokuapp.com/booking/83 url'ine bir GET request
gonderdigimizde donen Response'un,
status code'unun 200,
ve content type'inin application/json; charset=utf-8, ve Server isimli Header'in degerinin Cowboy,
ve status Line'in HTTP/1.1 200 OK
ve response suresinin 5 sn'den kisa oldugunu manuel olarak test ediniz.
 */
    // 1-url belirleyip url adresine gideceğiz
    // 2-expected data verilmişse expected data hazırlanır
    // 3-Actual data alınacak
    // 4-assertion işlemi
    @Test
    public void get01(){
        // 1-url belirleyip url adresine gideceğiz. (Endpoint Hazırlama)
        String url="https://restful-booker.herokuapp.com/booking/1453";
        // 2-expected data verilmişse expected data hazırlanır
        // 3-Actual data alınacak
        Response response=given().when().get(url);
        //response.prettyPrint();
        // 4-assertion işlemi
        System.out.println("Status Code: "+response.getStatusCode()); //200
        // System.out.println("Status Code: "+response.statusCode()); //200
        System.out.println("Content Type: "+response.getContentType()); //application//json; charset=utf-8
        System.out.println("Server Header Değeri: "+response.getHeader("Server")); //Cowboy
        System.out.println("Status Line: "+response.getStatusLine()); // HTTP/1.1 200 OK
        System.out.println("Get Time: "+response.getTime()); // leats than 5

    }
}
