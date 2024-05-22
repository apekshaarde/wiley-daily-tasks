package com.traineesapp.repository;

import com.traineesapp.exception.RecordNotFoundException;
import com.traineesapp.model.Laptop;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public interface LaptopRepository {

    public Laptop saveLaptop(Laptop laptop) throws SQLException;

    public Optional<Laptop> getLaptopById(int id) throws SQLException;

    public Optional<Laptop> getLaptopByName(String traineeName) throws RecordNotFoundException;

    public List<Laptop> getAllTrainees();

    public void deleteTrainee(int id) throws RecordNotFoundException;

    public Laptop updateTrainee(int id, Laptop newTrainee) throws RecordNotFoundException;
}
