package com.erom.CrudSpringBoot.controller;

import com.erom.CrudSpringBoot.model.Libro;
import com.erom.CrudSpringBoot.service.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class LibroController {

    @Autowired
    private LibroService libroService;

    @PostMapping("/SaveLibro")
    public Libro createLibro(@RequestBody Libro libro )
    {
        return libroService.save(libro);
    }

    @GetMapping("/GetLibros")
    public List<Libro> getLibros()
    {
        return libroService.findAll();
    }

    @PutMapping("/{id}")
    public Libro updateLibro(@PathVariable Integer id , @RequestBody Libro libroActualizado)
    {
        Libro libroExistente = libroService.findById(id);
        if (libroExistente !=null){
            libroExistente.setAutor(libroActualizado.getAutor());
            libroExistente.setTitulo(libroActualizado.getTitulo());
            return  libroService.save(libroExistente);
        }
        return null;
    }

    @DeleteMapping("/libro/{id}")
    public void deleteLibro(@PathVariable Integer id)
    {
        libroService.delete(id);
    }

    @GetMapping("/GetLibro/{id}")
    public Libro getLibroById(@PathVariable Integer id)
    {
        return libroService.findById(id);
    }

}
