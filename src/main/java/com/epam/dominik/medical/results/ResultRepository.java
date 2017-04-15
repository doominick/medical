package com.epam.dominik.medical.results;

import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

/**
 * Created by dominik on 4/15/17.
 */
public interface ResultRepository extends CrudRepository<Result, UUID> {
}
