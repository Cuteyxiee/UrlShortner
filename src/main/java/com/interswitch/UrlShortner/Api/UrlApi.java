package com.interswitch.UrlShortner.Api;
import com.interswitch.UrlShortner.Api.Model.Response;
import com.interswitch.UrlShortner.Api.Model.Url;
import com.interswitch.UrlShortner.Api.Model.UrlResponse;
import com.interswitch.UrlShortner.Utility.UrlUtil;
import org.apache.commons.validator.routines.UrlValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RequestMapping("/rest")
@RestController
public class UrlApi {

    @Autowired
    StringRedisTemplate redisTemplate;

    @GetMapping("/{id}")
    public String getLongUrl(@PathVariable String id, HttpServletResponse resp) throws IOException {

        String LongUrl = redisTemplate.opsForValue().get(id);
        if (LongUrl != null){
            resp.sendRedirect(LongUrl);
        }
        else{
            resp.sendError(HttpServletResponse.SC_FOUND);
        }

        return LongUrl;
    }



    @PostMapping("/create")
    public Response createUrl(@RequestBody Url url){

        UrlValidator urlValidator = new UrlValidator(
                new String[]{"http","https"}
        );

        if (urlValidator.isValid(url.getUrl())) {

            //Response response = null;
            Response response = new UrlResponse("00", "Successfully Created", null, url.getUrl(), "http://localhost:8080/rest/" + UrlUtil.generateShortUrl(url.getUrl()));
            String id = UrlUtil.generateShortUrl(url.getUrl());
            redisTemplate.opsForValue().set(id, url.getUrl());
            return response;
        }

        Response response = new Response("01", "Please enter a valid url", url.getUrl() + "is an inavlid url" );
        return response;
    }

}
