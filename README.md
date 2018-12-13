## Description
URL Shortening Service that shortens url 

## Stack
Redis in-memory server, 
Java Spring Framework,
IDE- Inteli-J

## Test Environment
Postman

## Example
Input long url as in JSON format as shown below
```
{
"url" : "https://www.javacodegeeks.com/2014/08/url-shortener-service-in-42-lines-of-code-in-java-spring-boot-redis.html"
}
```
## Response
```
{
    "code": "00",
    "description": "Successfully Created",
    "errors": null,
    "longUrl": "https://www.javacodegeeks.com/2014/08/url-shortener-service-in-42-lines-of-code-in-java-spring-boot-redis.html",
    "shortUrl": "http://localhost:8080/rest/45421c15"
}
```
## Redirect
```
GET  http://localhost:8080/rest/45421c15
```
