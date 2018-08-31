package co.uk;

import java.util.List;

public class DnsRecordResponse {


    private boolean success;
    List<String> errors;
    List<String> messages;
    private DnsResultResponse result;

    public boolean isSuccess() {
        return success;
    }

    public List<String> getErrors() {
        return errors;
    }

    public List<String> getMessages() {
        return messages;
    }

    public DnsResultResponse getResult() {
        return result;
    }
}
