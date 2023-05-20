package com.example.cargo_transportation_system.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Data Transfer Object (DTO) для пользователя.
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {
    private Long id;
    @NotEmpty(message = "Имя не должно быть пустым")
    private String firstName;
    @NotEmpty(message = "Фамилия не должна быть пустой")
    private String lastName;
    @NotEmpty(message = "Email не должен быть пустым")
    @Email
    private String email;
    @NotEmpty(message = "Пароль не должен быть пустым")
    private String password;
}
