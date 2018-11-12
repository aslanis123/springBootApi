package com.language.tandem.backend.repository;

import com.language.tandem.backend.model.Exercise;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ExersiceRepository extends JpaRepository<Exercise, Long> {

    List<Exercise> findAll();

    Exercise getExerciseByName(String name);
}
