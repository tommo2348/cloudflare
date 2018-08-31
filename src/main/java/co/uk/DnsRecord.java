package co.uk;

public class DnsRecord {

    private String type;
    private String name;
    private String content;
    private int ttl;
    private int priority;
    private boolean proxied;

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public String getContent() {
        return content;
    }

    public int getTtl() {
        return ttl;
    }

    public int getPriority() {
        return priority;
    }

    public boolean isProxied() {
        return proxied;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setTtl(int ttl) {
        this.ttl = ttl;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public void setProxied(boolean proxied) {
        this.proxied = proxied;
    }
}
