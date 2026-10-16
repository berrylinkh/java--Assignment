package com.lastma.data.repository;

import com.lastma.data.models.Driver;
import com.lastma.data.models.Officer;

import java.util.ArrayList;
import java.util.List;

public class OfficerRepositoryImpl implements OfficerRepository{

    private List<Officer> officers = new ArrayList<>();
    private int numberOfOfficers =0;

    private void validateOfficer(Officer officer) {
    if (officer == null) {
    throw new IllegalArgumentException("driver can not be null");
        }
    }

    private void validateOfficerId(int id) {
        if (id <= 0) {
            throw new IllegalArgumentException("driver can not be zero");
        }
    }

    @Override
    public Officer save(Officer officer) {
    validateOfficer(officer);
    if (officer.getId() == 0){
        officer.setId(++numberOfOfficers);
        officers.add(officer);
    }
    else {
        int index = officers.indexOf(officer);
        if (index != -1) {
            officers.set(index, officer);
        }
    }
        return officer;
    }

    @Override
    public long count() {
        return officers.size();
    }

    @Override
    public List<Officer> findById(int id) {
        validateOfficerId(id);
        for(Officer officer: officers){
            if(officer.getId()==id){
                return List.of(officer);
            }
        }
        return List.of();
    }

    @Override
    public List<Officer> findAll() {
        List<Officer> copy = new ArrayList<>(officers);
        return copy;
    }

    @Override
    public boolean existsById(int id) {
        validateOfficerId(id);
        for (Officer officer: officers){
            if(officer.getId()==id){
                return true;
            }
        }
        return false;
    }


    @Override
    public void deleteById(List<Officer> officerToDelete) {
            if (officerToDelete == null) {
                throw new IllegalArgumentException("Driver can not be null");
            }
            for (Officer officer: officerToDelete) {
                validateOfficer(officer);
                validateOfficerId(officer.getId());
                for (Officer toDelete : officers) {
                    if (toDelete.getId() == officer.getId()) {
                        officers.remove(toDelete);
                        break;
                    }
                }
            }
    }

    @Override
    public void deleteAll(List<Officer> officerToDelete) {
        if (officerToDelete == null) {
            throw new IllegalArgumentException("Driver can not be null");
        }
        for (Officer officer: officerToDelete){
            validateOfficer(officer);
            officers.remove(officer);
        }
    }
}
