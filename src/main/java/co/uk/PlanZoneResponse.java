package co.uk;

public class PlanZoneResponse {
    private String id;
    private String name;
    private int price;
    private String currency;
    private String frequency;
    private String legacy_id;
    private boolean is_subscribed;
    private boolean can_subscribe;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getCurrency() {
        return currency;
    }

    public String getFrequency() {
        return frequency;
    }

    public String getLegacy_id() {
        return legacy_id;
    }

    public boolean isIs_subscribed() {
        return is_subscribed;
    }

    public boolean isCan_subscribe() {
        return can_subscribe;
    }
}
