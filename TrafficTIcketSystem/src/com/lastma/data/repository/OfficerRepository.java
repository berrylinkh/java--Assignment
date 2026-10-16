package com.lastma.data.repository;

import com.lastma.data.models.Officer;

import java.util.List;

public interface OfficerRepository {

    Officer save (Officer officer);

    long count();

    List<Officer> findById(int id);

    List<Officer> findAll();

    boolean existsById(int id);

    void deleteAll(List<Officer> OfficerToDelete);

    void deleteById(List<Officer> OfficerToDelete);
}
