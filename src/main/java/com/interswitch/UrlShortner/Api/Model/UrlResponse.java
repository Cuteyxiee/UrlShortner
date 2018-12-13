package com.interswitch.UrlShortner.Api.Model;


public class UrlResponse extends Response {

    private final String ShortUrl;
    private final String LongUrl;

    public UrlResponse(String Code, String Description, String Errors, String LongUrl, String ShortUrl) {
        super(Code, Description, Errors);
        this.ShortUrl = ShortUrl;
        this.LongUrl = LongUrl;
    }

    public String getLongUrl() {
        return LongUrl;
    }

    public String getShortUrl() {

        return ShortUrl;
   }

    @Override
    public String toString() {
        return "UrlResponse{" +
                "ShortUrl='" + ShortUrl + '\'' +
                ", LongUrl='" + LongUrl + '\'' +
                '}';
    }
}
