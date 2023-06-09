package com.nilmi.Assignment_SpringBoot.entity;

import javax.persistence.*;

@Entity
public class Event {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long eventId;

    private String transId;

    private String transTms;

    private String rcNum;

    private String clientId;

    private Integer eventCnt;

    private String locationCd;

    private String locationId1;

    private String locationId2;

    private String addressNbr;



// Getters and Setters

    public Long getEventId() {
        return eventId;
    }

    public void setEventId(Long eventId) {
        this.eventId = eventId;
    }

    public String getTransId() {
        return transId;
    }

    public void setTransId(String transId) {
        this.transId = transId;
    }

    public String getTransTms() {
        return transTms;
    }

    public void setTransTms(String transTms) {
        this.transTms = transTms;
    }

    public String getRcNum() {
        return rcNum;
    }

    public void setRcNum(String rcNum) {
        this.rcNum = rcNum;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public Integer getEventCnt() {
        return eventCnt;
    }

    public void setEventCnt(Integer eventCnt) {
        this.eventCnt = eventCnt;
    }

    public String getLocationCd() {
        return locationCd;
    }

    public void setLocationCd(String locationCd) {
        this.locationCd = locationCd;
    }

    public String getLocationId1() {
        return locationId1;
    }

    public void setLocationId1(String locationId1) {
        this.locationId1 = locationId1;
    }

    public String getLocationId2() {
        return locationId2;
    }

    public void setLocationId2(String locationId2) {
        this.locationId2 = locationId2;
    }

    public String getAddressNbr() {
        return addressNbr;
    }

    public void setAddressNbr(String addressNbr) {
        this.addressNbr = addressNbr;
    }



}
