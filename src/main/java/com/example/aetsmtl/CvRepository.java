package com.example.aetsmtl;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
//import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//@RepositoryRestResource
public interface CvRepository extends CrudRepository<Cv, Long> {
    List<Cv> findByName(String name);
    List<Cv> findAll();
}
