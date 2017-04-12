package com.epam.dominik.medical.user;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by dominik on 4/11/17.
 */

public class Registry {

    private String hospitalName;

    private String hospitalAddress;

    private String hospitalCity;

    private String hospitalUnit;

    private String hospitalRoomNo;

    private String hospitalBedNo;

    private Date registeredAt;

    private Date dismissedAt;

    private Registry(){};

    public Registry(String hospitalName, String hospitalAddress, String hospitalCity, String hospitalUnit, String hospitalRoomNo, String hospitalBedNo, Date registeredAt, Date dismissedAt) {
        this.hospitalName = hospitalName;
        this.hospitalAddress = hospitalAddress;
        this.hospitalCity = hospitalCity;
        this.hospitalUnit = hospitalUnit;
        this.hospitalRoomNo = hospitalRoomNo;
        this.hospitalBedNo = hospitalBedNo;
        this.registeredAt = registeredAt;
        this.dismissedAt = dismissedAt;
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

    public String getHospitalRoomNo() {
        return hospitalRoomNo;
    }

    public void setHospitalRoomNo(String hospitalRoomNo) {
        this.hospitalRoomNo = hospitalRoomNo;
    }

    public String getHospitalBedNo() {
        return hospitalBedNo;
    }

    public void setHospitalBedNo(String hospitalBedNo) {
        this.hospitalBedNo = hospitalBedNo;
    }

    public Date getRegisteredAt() {
        return registeredAt;
    }

    public void setRegisteredAt(Date registeredAt) {
        this.registeredAt = registeredAt;
    }

    public Date getDismissedAt() {
        return dismissedAt;
    }

    public void setDismissedAt(Date dismissedAt) {
        this.dismissedAt = dismissedAt;
    }

}
