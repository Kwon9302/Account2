package com.cos.account.repository;

import com.cos.account.dto.MoneyDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MoneyRepository extends JpaRepository<MoneyDTO, Long> {

}
