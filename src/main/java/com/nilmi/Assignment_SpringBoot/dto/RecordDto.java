package com.nilmi.Assignment_SpringBoot.dto;

import java.util.List;

public class RecordDto {
    private String transId;
    private String transTms;
    private String rcNum;
    private String clientId;
    private List<EventDataDto> event;

    // Getters and Setters


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

    public List<EventDataDto> getEvent() {
        return event;
    }

    public void setEvent(List<EventDataDto> event) {
        this.event = event;
    }
}

