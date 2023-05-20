package com.example.task18.repository;

import java.util.List;

import com.example.task18.entity.Cargo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CargoRepository extends JpaRepository<Cargo, Long> {
    @Query("SELECT p FROM Cargo p WHERE concat(p.cargo_name, '', p.content, '', p.dispatch_city, '', p.dispatch_city, '', p.dispatch_date, '', p.delivery_city, '', p.arrival_date) LIKE %?1%")
    List<Cargo> search(String keyword);
}
