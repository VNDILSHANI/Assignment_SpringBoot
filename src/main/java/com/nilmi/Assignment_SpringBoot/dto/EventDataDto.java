package com.nilmi.Assignment_SpringBoot.dto;

public class EventDataDto {

    private Integer eventCnt;
    private String locationCd;
    private String locationId1;
    private String locationId2;
    private String addrNbr;

    // Getters and Setters


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

    public String getAddrNbr() {
        return addrNbr;
    }

    public void setAddrNbr(String addrNbr) {
        this.addrNbr = addrNbr;
    }
}
