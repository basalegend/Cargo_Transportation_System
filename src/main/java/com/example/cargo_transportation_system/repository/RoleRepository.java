package com.example.cargo_transportation_system.repository;

import com.example.cargo_transportation_system.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Репозиторий для работы с сущностью "Роль".
 * Интерфейс наследует JpaRepository, предоставляющий базовые операции CRUD.
 */
public interface RoleRepository extends JpaRepository<Role, Long> {

    /**
     * Находит роль по имени.
     *
     * @param name имя роли
     * @return найденная роль или null, если роль не найдена
     */
    Role findByName(String name);
}
