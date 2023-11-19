package test;

import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.Test;

public class C8_JSONArrayKullanimi {
     /*
{
"firstName": "John",
"lastName": "doe",
"age": 26,
"address": {
    "streetAddress": "naist street",
    "city": "Nara",
    "postalCode": "630-0192"
            },
"phoneNumbers": [
                {
                    "type": "iPhone",
                    "number": "0123-4567-8888"
                },
                {
                    "type": "home",
                    "number": "0123-4567-8910"
                }
                ]
}
 */
    @Test
    public void jSonArray(){
        JSONObject ceptel=new JSONObject();
        ceptel.put("type", "iPhone");
        ceptel.put("number", "0123-4567-8888");

        JSONObject evtel=new JSONObject();
        evtel.put("type", "home");
        evtel.put("number", "0123-4567-8910");

        JSONArray phoneNumber=new JSONArray();
        phoneNumber.put(0, ceptel);
        phoneNumber.put(1, evtel);

        JSONObject adres=new JSONObject();
        adres.put("streetAddress", "naist street");
        adres.put("cty", "Nara");
        adres.put("postalCode", "630-0192");

        JSONObject personalInfo=new JSONObject();
        personalInfo.put("firstName", "John");
        personalInfo.put("lastName", "doe");
        personalInfo.put("age", 26);
        personalInfo.put("address", adres);
        personalInfo.put("phoneNumbers", phoneNumber);

        System.out.println("personalInfo = " + personalInfo);
        

    }
}
