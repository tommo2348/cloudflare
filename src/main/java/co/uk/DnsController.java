package co.uk;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/records")
public class DnsController {

    ////need to get all dns records for a zone.
    @GetMapping(value = "/")
    public DnsRecord getRecords() {
        return new DnsRecord();
    }
}
