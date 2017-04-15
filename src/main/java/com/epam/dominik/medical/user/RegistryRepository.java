package com.epam.dominik.medical.user;

import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

/**
 * Created by dominik on 4/14/17.
 */
public interface RegistryRepository extends CrudRepository<Registry, Long> {

    Registry findByUuid(UUID uuid);
}
