package com.erom.CrudSpringBoot.service;

import com.erom.CrudSpringBoot.model.Libro;

import java.util.List;

public interface LibroService {

    //metodo abstractos no tiene contenido
    public List<Libro> findAll();
    public Libro save(Libro libro);
    public Libro findById(Integer id);
    public  void delete(Integer id);
}
