package com.example.cargo_transportation_system.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Конфигурационный класс для Spring MVC, который настраивает контроллеры представлений.
 */
@Configuration
public class MvcConfig implements WebMvcConfigurer {

    /**
     * Метод добавляет контроллеры представлений в реестр контроллеров.
     *
     * @param registry - объект, который содержит реестр контроллеров
     */
    @Override
    public void addViewControllers(ViewControllerRegistry registry){

    }
}
