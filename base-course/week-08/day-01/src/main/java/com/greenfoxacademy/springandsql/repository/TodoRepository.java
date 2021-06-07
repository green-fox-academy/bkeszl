package com.greenfoxacademy.springandsql.repository;


import com.greenfoxacademy.springandsql.model.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends CrudRepository<Todo, Long> {

}
