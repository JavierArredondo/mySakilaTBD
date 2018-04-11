package com.example.mysakila.Repositories;

import com.example.mysakila.models.Actor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActorRepository extends JpaRepository<Actor, Long> {
    Actor findActorById(Long id);
    Actor findActorByFirstNameAndAndLastName(String firstname, String lastname);
}
