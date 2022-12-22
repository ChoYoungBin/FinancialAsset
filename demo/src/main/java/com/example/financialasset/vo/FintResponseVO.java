package com.example.financialasset.vo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class FintResponseVO {

    @JsonIgnore
    private String status;
    private int count;
    private List<Institution> institutionList;

}
