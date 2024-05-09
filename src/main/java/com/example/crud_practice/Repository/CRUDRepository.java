package com.example.crud_practice.Repository;

import com.example.crud_practice.Entity.CRUDEntitty;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CRUDRepository extends JpaRepository<CRUDEntitty, Long> {
}
