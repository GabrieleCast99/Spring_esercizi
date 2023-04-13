package spring.esercizi.First.API4.CONTROLLER;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.net.http.HttpHeaders;

@RestController
public class HeaderController {

    @GetMapping("/headers")
    public String getHeaders(@RequestHeader("Host") String host){
        String hostName= host.split(":")[0];
        String hostPort= host.split(":")[1];
        return "The host is: "+hostName+" and the port is: "+hostPort;
    }

}
