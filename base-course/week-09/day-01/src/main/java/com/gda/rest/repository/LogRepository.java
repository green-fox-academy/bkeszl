package com.gda.rest.repository;

import com.gda.rest.model.Log;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LogRepository extends CrudRepository< Log ,Long> {
}
