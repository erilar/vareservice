
package no.andsim.service;

import javax.jws.WebService;

@WebService(endpointInterface = "no.andsim.service.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

    public String sayHi(String text) {
    	System.out.println("Saying hello to caller");
        return "Hello: " + text;
    }
}

