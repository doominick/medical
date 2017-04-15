package com.epam.dominik.medical.user;

/**
 * Created by dominik on 4/15/17.
 */
public class RegisterResponse {

    private String status_code;

    private String status_description;

    public RegisterResponse(String status_code, String status_description) {
        this.status_code = status_code;
        this.status_description = status_description;
    }

    public String getStatus_code() {
        return status_code;
    }

    public void setStatus_code(String status_code) {
        this.status_code = status_code;
    }

    public String getStatus_description() {
        return status_description;
    }

    public void setStatus_description(String status_description) {
        this.status_description = status_description;
    }
}
