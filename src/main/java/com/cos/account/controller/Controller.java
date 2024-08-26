package com.cos.account.controller;

import com.cos.account.dto.MoneyDTO;
import com.cos.account.repository.MoneyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@CrossOrigin(value = "*")
public class Controller {
    public final MoneyRepository moneyRepository;

    @GetMapping("/homepage")
    public ResponseEntity<List<MoneyDTO>> homepage() {
        return ResponseEntity.ok(moneyRepository.findAll());
    }

    @PostMapping("/save")
    public ResponseEntity<MoneyDTO> save(@RequestBody MoneyDTO moneyDTO) {
        return ResponseEntity.ok(moneyRepository.save(moneyDTO));
    }

    @GetMapping("/chart")
    public ResponseEntity<List<MoneyDTO>> chart() {
        return ResponseEntity.ok(moneyRepository.findAll());
    }
}
