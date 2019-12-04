package org.acme;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/hello")
// Replacing Spring Web with JAX-RS fixes the issue
//@Path("/hello")
public class ExampleResource {

    @GetMapping(produces = MediaType.APPLICATION_XML_VALUE)
//    @GET
//    @Produces(MediaType.APPLICATION_XML_VALUE)
    public Greeting hello() {
        return new Greeting("hello");
    }
}