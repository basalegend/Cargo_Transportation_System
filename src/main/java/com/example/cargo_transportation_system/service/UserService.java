package com.example.cargo_transportation_system.service;

import com.example.cargo_transportation_system.dto.UserDto;
import com.example.cargo_transportation_system.entity.Role;
import com.example.cargo_transportation_system.entity.User;
import com.example.cargo_transportation_system.repository.RoleRepository;
import com.example.cargo_transportation_system.repository.UserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Сервис пользователя, предоставляющий функциональность связанную с пользователями.
 */
@Service
public class UserService {

    private UserRepository userRepository;
    private RoleRepository roleRepository;
    private PasswordEncoder passwordEncoder;

    public UserService(UserRepository userRepository,
                       RoleRepository roleRepository,
                       PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
        this.passwordEncoder = passwordEncoder;
    }

    /**
     * Сохраняет пользователя.
     *
     * @param userDto Объект UserDto, содержащий данные пользователя.
     */
    public void saveUser(UserDto userDto) {
        User user = new User();
        user.setName(userDto.getFirstName() + " " + userDto.getLastName());
        user.setEmail(userDto.getEmail());

        user.setPassword(passwordEncoder.encode(userDto.getPassword()));
        Role role = roleRepository.findByName("ROLE_USER");
        if (role == null) {
            role = checkRoleExist();
        }
        user.setRoles(Arrays.asList(role));
        userRepository.save(user);
    }

    /**
     * Находит пользователя по адресу электронной почты.
     *
     * @param email Адрес электронной почты пользователя.
     * @return Объект User, представляющий пользователя.
     */
    public User findByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    /**
     * Возвращает список всех пользователей в виде списка объектов UserDto.
     *
     * @return Список объектов UserDto, представляющих пользователей.
     */
    public List<UserDto> findAllUsers() {
        List<User> users = userRepository.findAll();
        return users.stream().map((user) -> convertEntityToDto(user))
                .collect(Collectors.toList());
    }

    /**
     * Конвертирует объект User в объект UserDto.
     *
     * @param user Объект User, который необходимо сконвертировать.
     * @return Объект UserDto, представляющий пользователя.
     */
    private UserDto convertEntityToDto(User user) {
        UserDto userDto = new UserDto();
        String[] name = user.getName().split(" ");
        userDto.setFirstName(name[0]);
        userDto.setLastName(name[1]);
        userDto.setEmail(user.getEmail());
        return userDto;
    }

    /**
     * Проверяет наличие роли "ROLE_USER" в базе данных.
     * Если роль отсутствует, создает и сохраняет новую роль "ROLE_USER".
     *
     * @return Объект Role, представляющий роль "ROLE_USER".
     */
    private Role checkRoleExist() {
        Role role = new Role();
        role.setName("ROLE_USER");
        return roleRepository.save(role);
    }
}
