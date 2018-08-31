package co.uk;

public class DnsResultResponse {
    private String id;
    private String type;
    private String name;
    private String content;
    private boolean proxiable;
    private boolean proxied;
    private int ttl;
    private boolean locked;
    private String zone_id;
    private String zone_name;
    private String created_on;
    private String modified_on;
    private String data;

    public String getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public String getContent() {
        return content;
    }

    public boolean isProxiable() {
        return proxiable;
    }

    public boolean isProxied() {
        return proxied;
    }

    public int getTtl() {
        return ttl;
    }

    public boolean isLocked() {
        return locked;
    }

    public String getZone_id() {
        return zone_id;
    }

    public String getZone_name() {
        return zone_name;
    }

    public String getCreated_on() {
        return created_on;
    }

    public String getModified_on() {
        return modified_on;
    }

    public String getData() {
        return data;
    }
}
