package com.interswitch.UrlShortner.Utility;

import com.google.common.hash.Hashing;

import java.nio.charset.StandardCharsets;


public class UrlUtil {

        public static String generateShortUrl(String LongUrl){
            String ShortUrl = Hashing.murmur3_32().hashString(LongUrl, StandardCharsets.UTF_8).toString();
            return ShortUrl;
        }
}
