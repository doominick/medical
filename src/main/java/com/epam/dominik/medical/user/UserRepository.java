package com.epam.dominik.medical.user;

import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.UUID;

/**
 * Created by dominik on 4/12/17.
 */
public interface UserRepository extends CrudRepository<User, UUID>{

    User findByFirstName(String firstName);

    List<User> findBySecondName(String secondName);

    User findByPeselAndFirstNameAndSecondName(long pesel, String firstName, String secondName);
}
