package com.example.cargo_transportation_system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Класс, представляющий точку входа в приложение системы грузоперевозок.
 */
@SpringBootApplication
public class CargoTransportationSystemApplication {

    /**
     * Метод, запускающий приложение.
     *
     * @param args Аргументы командной строки.
     */
    public static void main(String[] args) {
        SpringApplication.run(CargoTransportationSystemApplication.class, args);
    }

}
