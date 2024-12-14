package com.miage.oil.repository;

import com.miage.oil.entity.DiceRollLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiceRollLogRepository extends JpaRepository<DiceRollLog, Long> {

}
