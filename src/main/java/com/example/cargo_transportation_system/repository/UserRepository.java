package com.example.cargo_transportation_system.repository;

import com.example.cargo_transportation_system.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Репозиторий для работы с сущностью "Пользователь".
 * Интерфейс наследует JpaRepository, предоставляющий базовые операции CRUD.
 */
public interface UserRepository extends JpaRepository<User, Long> {

    /**
     * Находит пользователя по адресу электронной почты.
     *
     * @param email Адрес электронной почты пользователя.
     * @return Найденный пользователь или null, если пользователь не найден.
     */
    User findByEmail(String email);
}
