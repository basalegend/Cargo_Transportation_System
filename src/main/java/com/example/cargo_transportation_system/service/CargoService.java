package com.example.cargo_transportation_system.service;

import java.util.List;

import com.example.cargo_transportation_system.entity.Cargo;
import com.example.cargo_transportation_system.repository.CargoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Сервисный класс для выполнения операций с грузами.
 *
 * CargoService предоставляет методы для работы с грузами, используя
 * репозиторий CargoRepository. Он предназначен для выполнения операций
 * создания, чтения, обновления и удаления грузов.
 */
@Service
public class CargoService {

    /**
     * Репозиторий для доступа к данным грузов
     */
    @Autowired
    private CargoRepository repo;

    /**
     * Получает список всех грузов или грузов, соответствующих ключевому слову.
     *
     * @param keyword ключевое слово для поиска грузов
     * @return список грузов
     */
    public List<Cargo> listAll(String keyword){
        if (keyword != null){
            return repo.search(keyword);
        }
        return repo.findAll();
    }

    /**
     * Сохраняет новый груз.
     *
     * @param cargo объект груза для сохранения
     */
    public void save(Cargo cargo){
        repo.save(cargo);
    }

    /**
     * Получает груз по его идентификатору.
     *
     * @param id идентификатор груза
     * @return объект груза, соответствующий заданному идентификатору
     */
    public Cargo get(Long id){
        return repo.findById(id).get();
    }

    /**
     * Удаляет груз по его идентификатору.
     *
     * @param id идентификатор груза для удаления
     */
    public void delete(Long id){
        repo.deleteById(id);
    }
}
