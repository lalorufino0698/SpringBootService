package com.erom.CrudSpringBoot.service;

import com.erom.CrudSpringBoot.model.Libro;
import com.erom.CrudSpringBoot.repository.LibroRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LibroServiceImp implements  LibroService{
    @Autowired
    private LibroRepo libroRepo;


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
