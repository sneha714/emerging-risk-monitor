package com.example.demo.service;

import com.example.demo.entity.Risk;
import com.example.demo.repository.RiskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RiskService {

    @Autowired
    private RiskRepository riskRepository;

    public Risk saveRisk(Risk risk) {
        return riskRepository.save(risk); // ✅ THIS SAVES TO DB
    }
}