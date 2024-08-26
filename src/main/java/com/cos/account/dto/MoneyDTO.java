package com.cos.account.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.sql.Date;
import java.time.LocalDateTime;

@Data
@Entity
@AllArgsConstructor
public class MoneyDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private BigDecimal deposit;
    private BigDecimal withdraw;
    private String category;
    private String memo;
    private LocalDateTime time;

    public MoneyDTO() {
        this.time = LocalDateTime.now();
    }
}
