package co.uk;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.net.MalformedURLException;
import java.net.URL;

@RestController
@RequestMapping("/zone")
public class ZoneController {

    private ZoneCreationService service;
    private Authentication authentication;

    public ZoneController(ZoneCreationService service) {
        this.service = service;
    }


    //get for all the subdomains for a zone.
    @GetMapping(value = "/zones")
    public ResponseEntity<Zone> getZonesforAzone(){
        ///a replica of the domains coming from pat.
        String url = "https://dash.cloudflare.com/9e6037c188a23d1a2465b0ed5c5c418d/traderlink.co.uk";
        HttpEntity<String> entity = getHttpEntity();
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Zone> responseEntity = restTemplate.exchange(url, HttpMethod.GET,entity,Zone.class);
        Zone zone = responseEntity.getBody();
        return ResponseEntity.ok(zone);
    }

    @PostMapping
    public ResponseEntity<Zone> CreateZone(@RequestBody Zone zone ){
        ///id in the url is for the test account.
        String url = "https://dash.cloudflare.com/9e6037c188a23d1a2465b0ed5c5c418d";
        authentication = new Authentication();
        HttpEntity<String> entity = getHttpEntity();
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Zone> responseEntity = restTemplate.exchange(url, HttpMethod.POST,entity,Zone.class);
        zone = responseEntity.getBody();
        return ResponseEntity.ok(zone);
    }

    private HttpEntity<String> getHttpEntity() {
        HttpHeaders headers = authentication.setTheBasicHeaders();
        return new HttpEntity<>("parameters",headers);
    }

    @PostMapping
    public ResponseEntity<DnsRecord> createDnsRecord(@RequestBody DnsRecord dnsRecord){

        ///need to do. possibly create a pojo object that has both a zone and a dns record and then can just do one post
        return ResponseEntity.ok(dnsRecord);

    }
}
