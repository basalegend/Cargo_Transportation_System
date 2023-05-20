package com.example.cargo_transportation_system.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;

/**
 * Класс Cargo представляет собой груз, который будет перевозиться в системе транспортировки грузов.
 * Класс является сущностью для сохранения данных о грузах в базе данных.
 */
@Entity
@Table(name = "cargo")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Cargo {
    /**
     * Уникальный идентификатор груза.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * Тип груза, например "Хрупкий", "Опасный", "Негабаритный" или "Игрушки", "Бытовая техника" и т.д.
     */
    @Column(name = "type", nullable = false)
    private String type;

    /**
     * Описание содержимого груза.
     */
    @Column(name = "content", nullable = false)
    private String content;

    /**
     * Город отправки груза.
     */
    @Column(name = "dispatch_address", nullable = false)
    private String dispatch_address;

    /**
     * Город доставки груза.
     */
    @Column(name = "delivery_address", nullable = false)
    private String delivery_address;

    /**
     * Вес груза в килограммах.
     */
    @Column(name = "weight", nullable = false)
    private float weight;

    /**
     * Имя водителя, который будет перевозить груз.
     */
    @Column(name = "driver_name", nullable = false)
    private String driver_name;

    /**
     * Марка транспортного средства, на котором будет перевозиться груз.
     */
    @Column(name = "model", nullable = false)
    private String model;

    /**
     * Государственный номер транспортного средства.
     */
    @Column(name = "car_number", nullable = false)
    private String car_number;

    /**
     * Дата отправки груза.
     */
    @Column(name = "dispatch_date", nullable = false)
    private Date dispatch_date;

    /**
     * Дата прибытия груза.
     */
    @Column(name = "delivery_date", nullable = false)
    private Date delivery_date;
}

