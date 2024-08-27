package com.visionary.crud_libro.service;

import com.visionary.crud_libro.model.Libro;

import java.util.List;

public interface LibroService {
    public List<Libro> findAll();
    public Libro save(Libro libro);
    public Libro findById(Integer id);
    public void delete(Integer id);
}
