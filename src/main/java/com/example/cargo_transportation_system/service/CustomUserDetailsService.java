package com.example.cargo_transportation_system.service;

import com.example.cargo_transportation_system.entity.Role;
import com.example.cargo_transportation_system.entity.User;
import com.example.cargo_transportation_system.repository.UserRepository;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.stream.Collectors;

/**
 * Сервис, реализующий интерфейс UserDetailsService.
 * Используется для аутентификации и авторизации пользователей.
 */
@Service
public class CustomUserDetailsService implements UserDetailsService {

    private UserRepository userRepository;

    public CustomUserDetailsService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    /**
     * Загружает пользователя по адресу электронной почты.
     *
     * @param email Адрес электронной почты пользователя.
     * @return Объект UserDetails, представляющий пользователя.
     * @throws UsernameNotFoundException Если пользователя не найдено.
     */
    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        User user = userRepository.findByEmail(email);

        if (user != null) {
            return new org.springframework.security.core.userdetails.User(user.getEmail(),
                    user.getPassword(),
                    mapRolesToAuthorities(user.getRoles()));
        } else {
            throw new UsernameNotFoundException("Неверное имя пользователя или пароль.");
        }
    }

    /**
     * Преобразует роли пользователя в коллекцию GrantedAuthority.
     *
     * @param roles Роли пользователя.
     * @return Коллекция GrantedAuthority, представляющая роли пользователя.
     */
    private Collection<? extends GrantedAuthority> mapRolesToAuthorities(Collection<Role> roles) {
        return roles.stream()
                .map(role -> new SimpleGrantedAuthority(role.getName()))
                .collect(Collectors.toList());
    }
}
