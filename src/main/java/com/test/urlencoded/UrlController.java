package com.test.urlencoded;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Consumes;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Part;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.annotation.Produces;

@Controller("/api")
public class UrlController {

    @Consumes(value = MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(value = MediaType.TEXT_HTML)
    @Post("/urlenc")
    public String greet(@Part("name") String name) {
        
        return name;
    }
    
    
    @Post("/body")
    @Consumes(value = MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(value = MediaType.TEXT_HTML)
    public String greetBody(@Body String name) {
        
        return name;
    }
    
    
    @Get("/hello/{name}")
    public String greetGet(String name) {
        
        return name;
    }
}
