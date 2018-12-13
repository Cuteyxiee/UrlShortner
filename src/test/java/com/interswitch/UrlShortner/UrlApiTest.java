package com.interswitch.UrlShortner;

import com.interswitch.UrlShortner.Api.Model.Url;
import com.interswitch.UrlShortner.Api.UrlApi;
import com.interswitch.UrlShortner.Utility.UrlUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class UrlApiTest {

    @Autowired
    UrlApi urlApi;
    UrlUtil urlutil;

    @Test
    public void TestCreate(){
        Url url = new Url();
        url.setUrl("https://dzone.com");
        System.out.println(urlApi.createUrl(url));
    }

    @Test
    public void TestGenerateShortUrl(){
        String LongUrl  = "https://github.com/TechPrimers/url-shortener-example/tree/master/src/main/java/com/techprimers/urlshortenerexample";
        System.out.println(UrlUtil.generateShortUrl(LongUrl));
    }
}
