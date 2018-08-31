package co.uk;

import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;


@Service
public class Authentication {

    public HttpHeaders setTheBasicHeaders(){
        String keyAuth = "233ae7f24f77df795f93afa54d6fc7941365a";
        String emailAuth = "PAT.Tool@autotrader.co.uk";

        String base64Creds = encodeAuthHeaders(keyAuth);
        String emailBase64 = encodeAuthHeaders(emailAuth);

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.add("X-Auth-Key", "Key " + base64Creds);
        headers.add("X-Auth-Email", "Email" + emailBase64);

        return headers;
    }

    private String encodeAuthHeaders(String plainCreds) {
        byte[] plainCredsBytes = plainCreds.getBytes();
        byte[] base64CredsBytes = Base64.encodeBase64(plainCredsBytes);
        return new String(base64CredsBytes);
    }
}
