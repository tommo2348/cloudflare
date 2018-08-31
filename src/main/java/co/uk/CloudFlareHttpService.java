package co.uk;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

@RestController
@RequestMapping("/")
public class CloudFlareHttpService {

    private String testRazsorAccount = "https://dash.cloudflare.com/9e6037c188a23d1a2465b0ed5c5c418d";
    private String liveRazorAccount = "https://dash.cloudflare.com/6367fc7fd5fc55eb79ca6938accec45d";
    private HttpURLConnection connection;

    ////the id is for test razor, instead possibly should be a get like the one in dws report.

    @GetMapping(value = "/")
    public ResponseEntity<String> getCloudfareSpring() {
        return ResponseEntity.ok(testRazsorAccount);
    }

//    public void getCloudfare() throws Exception {
//        URL site = new URL(testRazsorAccount);
//        connection = (HttpURLConnection) site.openConnection();
//        connection.setRequestMethod("GET");
//
//        BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
//        String line;
//        StringBuffer response = new StringBuffer();
//
//        while((line = in.readLine()) !=null){
//            response.append(line);
//        }
//        in.close();
//
//    }
}
