package com.visionary.crud_libro.service;

import com.visionary.crud_libro.model.Libro;
import com.visionary.crud_libro.repository.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LibroServiceImpl implements LibroService{

    @Autowired
    private LibroRepository libroRepo;

    @Override
    public List<Libro> findAll() {
        return (List<Libro>) libroRepo.findAll();
    }

    @Override
    public Libro save(Libro libro) {
        return libroRepo.save(libro);
    }

    @Override
    public Libro findById(Integer id) {
        return libroRepo.findById(id).orElse(null);
    }

    @Override
    public void delete(Integer id) {
        libroRepo.deleteById(id);
    }
}
