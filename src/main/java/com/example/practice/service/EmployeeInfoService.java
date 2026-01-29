package com.example.practice.service;

import com.example.practice.dto.EmployeeInfoDTO;
import com.example.practice.entity.EmployeeInfoEntity;
import com.example.practice.repository.EmployeeInfoRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeInfoService {
    private final EmployeeInfoRepository repo;

    public EmployeeInfoService(EmployeeInfoRepository repo) {
        this.repo = repo;
    }

    public List<EmployeeInfoEntity> getAllViewList() {

        return repo.findAll();
    }

}
