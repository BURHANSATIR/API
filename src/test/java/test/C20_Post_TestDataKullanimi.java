package test;

import baseUrl.HerOkuAppBaseURL;
import org.json.JSONObject;
import org.junit.Test;
import testDatas.TestDataHerOkuApp;

public class C20_Post_TestDataKullanimi extends HerOkuAppBaseURL {
    /*
   https://restful-booker.herokuapp.com/booking url'ine asagidaki body'ye sahip
   bir POST request gonderdigimizde donen response'un status kodunu ve id haric
   body'sinin asagidaki gibi oldugunu test edin.

Request body
      {
      "firstname" : "Ali",
      "lastname" : "Bak",
      "totalprice" : 500,
      "depositpaid" : false,
      "bookingdates" : {
                     "checkin" : "2021-06-01",
                     "checkout" : "2021-06-10"
                       },
      "additionalneeds" : "wi-fi"
       }

Expected Body
{
   "bookingid":24,
   "booking":{
           "firstname":"Ali",
           "lastname":"Bak",
           "totalprice":500,
           "depositpaid":false,
           "bookingdates":{
                           "checkin":"2021-06-01",
                           "checkout":"2021-06-10"
                           },
           "additionalneeds":"wi-fi"
              }
   }
    */
    @Test
    public void post(){
        specHerOkuApp.pathParam("pp1","booking");

        TestDataHerOkuApp testDataHerOkuApp=new TestDataHerOkuApp();
        JSONObject reqBody=testDataHerOkuApp.reqBodyOlusturJSON();
        JSONObject expBody=testDataHerOkuApp.expectedBodyOlusturJSON();

        assertEquals(testDataHerOkuApp.okStatusKodu,response.getStatusCode());
        assertEquals(expBody.getJSONObject("booking").get("firstname"),respJP.get("booking.firstname"));
        assertEquals(expBody.getJSONObject("booking").get("firstname"),respJP.get("booking.firstname"));
        assertEquals(expBody.getJSONObject("booking").get("firstname"),respJP.get("booking.firstname"));
        assertEquals(expBody.getJSONObject("booking").get("firstname"),respJP.get("booking.firstname"));
        assertEquals(expBody.getJSONObject("booking").get("firstname"),respJP.get("booking.firstname"));
    }

}
