package com.visionary.crud_libro.controller;

import com.visionary.crud_libro.model.Libro;
import com.visionary.crud_libro.service.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class LibroController {

    @Autowired
    private LibroService libroService;

    @PostMapping("/libro")
    public Libro createLibro(@RequestBody Libro libro){
        return libroService.save(libro);
    }

    @GetMapping("/libros")
    public List<Libro> getAllLibros(){
        return libroService.findAll();
    }

    @PutMapping("/libros/{id}")
    public Libro updateLibro(@PathVariable Integer id, @RequestBody Libro libro){
        Libro libroExistente = libroService.findById(id);

        if (libroExistente != null) {
            libroExistente.setAuthor(libro.getAuthor());
            libroExistente.setTitle(libro.getTitle());

            return libroService.save(libroExistente);
        }

        return null;
    }

    @DeleteMapping("/libros/{id}")
    public void deleteLibro(@PathVariable Integer id){
        libroService.delete(id);
    }
}
