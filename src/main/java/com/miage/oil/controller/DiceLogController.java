package com.miage.oil.controller;

import com.miage.oil.entity.DiceRollLog;
import com.miage.oil.repository.DiceRollLogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class DiceLogController {

    @Autowired
    private DiceRollLogRepository diceRollLogRepository;

    @GetMapping("/diceLogs")
    public List<DiceRollLog> getAllDiceLogs() {
        return diceRollLogRepository.findAll();
    }
}