package com.example.financialasset.service;

import com.example.financialasset.repository.CommonDao;
import com.example.financialasset.vo.FintResponseVO;
import com.example.financialasset.vo.Institution;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FinanceMergerServiceImpl implements FinanceMergerService {

    private final CommonDao commonDao;

    @Override
    public FintResponseVO getTRAgreedList(String MyId) {

        List<Institution> list = commonDao.selectIdByList(MyId);
        List<Institution> institutions = list
                .stream()
                .filter(s -> (s.getWithdrawDate() == null || s.getWithdrawDate().isEmpty()))
                .toList();

        return FintResponseVO.builder().count(institutions.size()).institutionList(institutions).build();
    }
}
