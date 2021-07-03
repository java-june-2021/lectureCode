package com.matthew.albums.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.matthew.albums.models.Label;

@Repository
public interface LabelRepository extends CrudRepository<Label, Long>{

}
