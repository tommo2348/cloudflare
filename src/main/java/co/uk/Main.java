package co.uk;

public class Main {
    public static void main(String [] args) {

        ////replicating the pat tool for testing purposes.
        ZoneController controller = new ZoneController(new ZoneCreationService());
        Zone zone = new Zone();
        zone.setName("cloudflareservice.co.uk");
        controller.CreateZone(zone);
    }
}
