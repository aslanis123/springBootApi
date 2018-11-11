package com.language.tandem.backend.service;

import com.language.tandem.backend.model.Exercise;
import com.language.tandem.backend.repository.ExersiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExerciseService {

    @Autowired
    private ExersiceRepository exersiceRepository;

    public List<Exercise> getListOfExercises(){
        return exersiceRepository.getExercises();
    }

    public Exercise getExerciseByName(String name){
        return exersiceRepository.getExerciseByName(name);
    }
}
