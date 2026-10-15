package com.lastma.data.models;

import java.util.Date;

public class Ticket {
    private String id;
    private VehicleTypes type;
    private int violationFee;
    private Date issuedDate;

    public Date getDuedate() {
    return duedate;
    }

    public void setDuedate(Date duedate) {
    this.duedate = duedate;
    }

    public Date getIssuedDate() {
    return issuedDate;
    }

    public void setIssuedDate(Date issuedDate) {
    this.issuedDate = issuedDate;
    }

    public int getViolationFee() {
    return violationFee;
    }

    public void setViolationFee(int violationFee) {
    this.violationFee = violationFee;
    }

    public String getId() {
    return id;
    }

    public void setId(String id) {
    this.id = id;
    }

    public VehicleTypes getType() {
    return type;
    }

    public void setType(VehicleTypes type) {
    this.type = type;
    }

    private Date duedate;
}
