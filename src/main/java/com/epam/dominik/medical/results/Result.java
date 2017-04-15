package com.epam.dominik.medical.results;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.annotations.Type;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.UUID;

/**
 * Created by dominik on 4/15/17.
 */
@Entity
public class Result {
    @JsonProperty("UID")
    @Type(type = "uuid-char")
    private UUID UID;

    private @Id @GeneratedValue long id;

    private String registred_at;

    private String registred_timestamp;

    private String registred_temp;

    private String registred_heartbeat;

    private String registred_bpressure_high;

    private String registred_bpressure_low;

    private String registred_status;

    private Result(){}

    public Result(UUID UID, String registred_at, String registred_timestamp, String registred_temp, String registred_heartbeat, String registred_bpressure_high, String registred_bpressure_low, String registred_status) {
        this.UID = UID;
        this.registred_at = registred_at;
        this.registred_timestamp = registred_timestamp;
        this.registred_temp = registred_temp;
        this.registred_heartbeat = registred_heartbeat;
        this.registred_bpressure_high = registred_bpressure_high;
        this.registred_bpressure_low = registred_bpressure_low;
        this.registred_status = registred_status;
    }

    public UUID getUID() {
        return UID;
    }

    public void setUID(UUID UID) {
        this.UID = UID;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getRegistred_at() {
        return registred_at;
    }

    public void setRegistred_at(String registred_at) {
        this.registred_at = registred_at;
    }

    public String getRegistred_timestamp() {
        return registred_timestamp;
    }

    public void setRegistred_timestamp(String registred_timestamp) {
        this.registred_timestamp = registred_timestamp;
    }

    public String getRegistred_temp() {
        return registred_temp;
    }

    public void setRegistred_temp(String registred_temp) {
        this.registred_temp = registred_temp;
    }

    public String getRegistred_heartbeat() {
        return registred_heartbeat;
    }

    public void setRegistred_heartbeat(String registred_heartbeat) {
        this.registred_heartbeat = registred_heartbeat;
    }

    public String getRegistred_bpressure_high() {
        return registred_bpressure_high;
    }

    public void setRegistred_bpressure_high(String registred_bpressure_high) {
        this.registred_bpressure_high = registred_bpressure_high;
    }

    public String getRegistred_bpressure_low() {
        return registred_bpressure_low;
    }

    public void setRegistred_bpressure_low(String registred_bpressure_low) {
        this.registred_bpressure_low = registred_bpressure_low;
    }

    public String getRegistred_status() {
        return registred_status;
    }

    public void setRegistred_status(String registred_status) {
        this.registred_status = registred_status;
    }
}
