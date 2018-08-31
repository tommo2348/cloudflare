package co.uk;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Zone {
    private String name;
    private Account account;
    private boolean jump_start;


//    @JsonCreator
//    public Zone(@JsonProperty("name") String name,
//                @JsonProperty("accountZoneReponse") AccountZoneReponse accountZoneReponse,
//                @JsonProperty("name_servers") List<String> nameServers) {
//        this.name = name;
//        this.accountZoneReponse = accountZoneReponse;
//
//    }


    public String getName() {
        return name;
    }

    public Account getAccount() {
        return account;
    }

    public boolean isJump_start() {
        return jump_start;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public void setJump_start(boolean jump_start) {
        this.jump_start = jump_start;
    }
}
