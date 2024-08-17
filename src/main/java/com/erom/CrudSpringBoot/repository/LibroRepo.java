package com.erom.CrudSpringBoot.repository;

import com.erom.CrudSpringBoot.model.Libro;
import org.springframework.data.repository.CrudRepository;

public interface LibroRepo extends CrudRepository<Libro,Integer> {
}
