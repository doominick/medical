package com.epam.dominik.medical.user;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.annotations.Type;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.UUID;

/**
 * Created by dominik on 4/11/17.
 */
@Entity
public class Registry implements Serializable{
    @JsonProperty("hospital_name")
    private String hospitalName;
    @JsonProperty("hospital_address")
    private String hospitalAddress;
    @JsonProperty("hospital_city")
    private String hospitalCity;
    @JsonProperty("hospital_unit")
    private String hospitalUnit;
    @JsonProperty("hospital_room_no")
    private int hospitalRoomNo;
    @JsonProperty("hospital_bed_no")
    private int hospitalBedNo;
    @JsonProperty("registred_at")
    private String registeredAt;
    @JsonProperty("dismissed_at")
    private String dismissedAt;
    @Type(type = "uuid-char")
    private @Id UUID uuid;

    private Registry(){};

    public Registry(String hospitalName, String hospitalAddress, String hospitalCity, String hospitalUnit, int hospitalRoomNo, int hospitalBedNo, String registeredAt, String dismissedAt, UUID uuid) {
        this.hospitalName = hospitalName;
        this.hospitalAddress = hospitalAddress;
        this.hospitalCity = hospitalCity;
        this.hospitalUnit = hospitalUnit;
        this.hospitalRoomNo = hospitalRoomNo;
        this.hospitalBedNo = hospitalBedNo;
        this.registeredAt = registeredAt;
        this.dismissedAt = dismissedAt;
        this.uuid = uuid;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getHospitalAddress() {
        return hospitalAddress;
    }

    public void setHospitalAddress(String hospitalAddress) {
        this.hospitalAddress = hospitalAddress;
    }

    public String getHospitalCity() {
        return hospitalCity;
    }

    public void setHospitalCity(String hospitalCity) {
        this.hospitalCity = hospitalCity;
    }

    public String getHospitalUnit() {
        return hospitalUnit;
    }

    public void setHospitalUnit(String hospitalUnit) {
        this.hospitalUnit = hospitalUnit;
    }

    public int getHospitalRoomNo() {
        return hospitalRoomNo;
    }

    public void setHospitalRoomNo(int hospitalRoomNo) {
        this.hospitalRoomNo = hospitalRoomNo;
    }

    public int getHospitalBedNo() {
        return hospitalBedNo;
    }

    public void setHospitalBedNo(int hospitalBedNo) {
        this.hospitalBedNo = hospitalBedNo;
    }

    public String getRegisteredAt() {
        return registeredAt;
    }

    public void setRegisteredAt(String registeredAt) {
        this.registeredAt = registeredAt;
    }

    public String getDismissedAt() {
        return dismissedAt;
    }

    public void setDismissedAt(String dismissedAt) {
        this.dismissedAt = dismissedAt;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

}
