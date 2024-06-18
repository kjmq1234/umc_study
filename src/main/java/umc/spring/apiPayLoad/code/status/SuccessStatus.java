package umc.spring.apiPayLoad.code.status;

public enum SuccessStatus {

    _OK("200", "OK");

    private final String code;
    private final String message;

    SuccessStatus(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}