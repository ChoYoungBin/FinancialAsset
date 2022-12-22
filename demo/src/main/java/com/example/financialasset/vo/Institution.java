package com.example.financialasset.vo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
@Builder
public class Institution {
    private String institutionCode;
    @JsonIgnore
    private String withdrawDate;
}
