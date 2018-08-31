package co.uk;

import java.util.List;

public class CreatedZoneResponse {
    private boolean success;
    private List<String> errors;
    private List<String> messages;
    private ZoneResultsResponse results;


    public boolean isSuccess() {
        return success;
    }

    public List<String> getErrors() {
        return errors;
    }

    public List<String> getMessages() {
        return messages;
    }

    public ZoneResultsResponse getResults() {
        return results;
    }

}
