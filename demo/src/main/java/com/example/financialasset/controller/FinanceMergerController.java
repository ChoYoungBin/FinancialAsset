package com.example.financialasset.controller;

import com.example.financialasset.service.FinanceMergerService;
import com.example.financialasset.vo.FintResponseVO;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class FinanceMergerController {

    private final FinanceMergerService financeMergerService;

    @GetMapping("/find")
    public FintResponseVO retrieveMergerAgencies(@RequestHeader String MyId) {

        if (MyId == null || MyId.isEmpty()) {
            return FintResponseVO.builder().count(0).build();
        } else {
            return financeMergerService.getTRAgreedList(MyId);
        }
    }
}
