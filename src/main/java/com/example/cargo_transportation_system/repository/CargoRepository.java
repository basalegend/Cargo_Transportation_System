package com.example.cargo_transportation_system.repository;

import java.util.List;

import com.example.cargo_transportation_system.entity.Cargo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 * Интерфейс репозитория для работы с грузами в базе данных.
 * Интерфейс наследует JpaRepository, предоставляющий базовые операции CRUD.
 */
public interface CargoRepository extends JpaRepository<Cargo, Long> {
    /**
     * Метод для поиска грузов в базе данных по заданному ключевому слову.
     * Поиск осуществляется по всем полям таблицы Cargo.
     *
     * @param keyword ключевое слово для поиска
     * @return список найденных грузов
     */
    @Query("SELECT p FROM Cargo p " +
            "WHERE concat(p.type, ' ', p.content, ' ', p.dispatch_address, ' ', p.delivery_address, ' '," +
            " p.weight, ' ', p.driver_name, ' ', p.model, ' '," +
            " p.car_number, ' ', p.dispatch_date, ' ', p.delivery_date, ' ') LIKE %?1%")
    List<Cargo> search(String keyword);
}