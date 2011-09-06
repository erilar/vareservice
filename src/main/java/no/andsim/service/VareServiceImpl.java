
package no.andsim.service;

import javax.jws.WebService;

@WebService(endpointInterface = "no.andsim.service.VareService")
public class VareServiceImpl implements VareService {

    public String sayHi(String text) {
        return "Hello from the VareService Mr " + text;
    }
}

