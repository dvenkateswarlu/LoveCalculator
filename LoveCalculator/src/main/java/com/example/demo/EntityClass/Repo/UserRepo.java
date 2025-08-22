package com.example.demo.EntityClass.Repo;

import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import com.example.demo.EntityClass.UserEntity;

public interface UserRepo extends CrudRepository<UserEntity, Integer> {

    Optional<UserEntity> findByEmailAndPassword(String email, String password);

    Optional<UserEntity> findByEmail(String email);
}
