package com.example.financialasset.repository;

import com.example.financialasset.vo.Institution;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CommonDao {
    public List<Institution> selectIdByList(String myId) {
        List<Institution> list = new ArrayList<>();
        list.add(Institution.builder()
                .institutionCode("A1AAE")
                .withdrawDate("20221228")
                .build());
        list.add(Institution.builder()
                .institutionCode("B1BBE")
                .withdrawDate(null)
                .build());

        return list;
    }
}
