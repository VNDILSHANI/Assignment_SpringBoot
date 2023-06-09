package com.nilmi.Assignment_SpringBoot.dto;

import java.util.List;

public class BatchDto {

    private String batchId;

    private List<RecordDto> recordDtoList;


    public String getBatchId() {
        return batchId;
    }

    public void setBatchId(String batchId) {
        this.batchId = batchId;
    }

    public List<RecordDto> getRecordDtoList() {
        return recordDtoList;
    }

    public void setRecordDtoList(List<RecordDto> recordDtoList) {
        this.recordDtoList = recordDtoList;
    }
}
