package com.miage.oil.controller;

import com.miage.oil.service.DiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api")
public class DiceController {

    @Autowired
    private DiceService diceService;

    @GetMapping("/rollDice")
    public int rollDice() {
        return diceService.rollDices(1).get(0);
    }

    @GetMapping("/rollDices/{X}")
    public List<Integer> rollDices(@PathVariable int X) {
        return diceService.rollDices(X);
    }

}