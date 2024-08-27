package com.visionary.crud_libro.repository;

import com.visionary.crud_libro.model.Libro;
import org.springframework.data.repository.CrudRepository;

public interface LibroRepository extends CrudRepository<Libro, Integer> {
}
