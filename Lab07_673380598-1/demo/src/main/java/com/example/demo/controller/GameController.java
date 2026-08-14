package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.service.GameService;

import ch.qos.logback.core.model.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping ("/games")
public class GameController {
    public final GameService gameser;
    public GameController(GameService gameser){
        this.gameser=gameser;
    }
    
    @GetMapping
    public String getMethodopen(Model model) {
        
        return "game/list";
    }
    
}
