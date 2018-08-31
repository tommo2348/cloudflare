package co.uk;

import java.util.List;

public class ZoneResultsResponse {
    private String id;
    private String name;
    private long development_mode;
    private List<String> original_name_servers;
    private String original_registrar;
    private String original_dnshost;
    private String created_on;
    private String modified_on;
    private OwnerZoneResponse owner;
    private AccountZoneReponse account;
    private List<String> permissions;
    private PlanZoneResponse plan;
    private String status;
    private boolean paused;
    private String type;
    private List<String> name_servers;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public long getDevelopment_mode() {
        return development_mode;
    }

    public List<String> getOriginal_name_servers() {
        return original_name_servers;
    }

    public String getOriginal_registrar() {
        return original_registrar;
    }

    public String getOriginal_dnshost() {
        return original_dnshost;
    }

    public String getCreated_on() {
        return created_on;
    }

    public String getModified_on() {
        return modified_on;
    }

    public OwnerZoneResponse getOwner() {
        return owner;
    }

    public AccountZoneReponse getAccount() {
        return account;
    }

    public List<String> getPermissions() {
        return permissions;
    }

    public PlanZoneResponse getPlan() {
        return plan;
    }

    public String getStatus() {
        return status;
    }

    public boolean isPaused() {
        return paused;
    }

    public String getType() {
        return type;
    }

    public List<String> getName_servers() {
        return name_servers;
    }
}
