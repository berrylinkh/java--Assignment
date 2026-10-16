package com.lastma.data.repository;

import com.lastma.data.models.Driver;
import com.lastma.data.models.Officer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OfficerRepositoryImplTest {
    private Officer officer;
    private OfficerRepositoryImpl officerRepository;

    @BeforeEach
    public void officer() {
        officerRepository = new OfficerRepositoryImpl();
        officer = new Officer();
    }

    @Test
    void testThatWhenISaveCountIncreaseByOne() {
        assertEquals(0L, officerRepository.count());
        officerRepository.save(officer);
        assertEquals(1L, officerRepository.count());
    }

    @Test
    void testThatSavesMultipleOfficers() {
        assertEquals(0L, officerRepository.count());
        officerRepository.save(officer);
        Officer secondOfficer = officerRepository.save(new Officer());
        Officer thirdOfficer = officerRepository.save(new Officer());
        assertEquals(3L, officerRepository.count());
    }

    @Test
    void testThatSavesAOfficerAndGetsTheId() {
        assertEquals(0L, officerRepository.count());
        officerRepository.save(officer);
        assertEquals(1, officer.getId());
    }


    @Test
    void testThatThrowsExceptionForSavingNull() {
        assertThrows(IllegalArgumentException.class, () -> officerRepository.save(null));
    }

    @Test
    void testThatFindsAOfficersById(){
        assertEquals(0L, officerRepository.count());
        officerRepository.save(officer);
        assertEquals(1L, officerRepository.count());
        List<Officer> found = officerRepository.findById(1);
        for (Officer foundOfficer: found){
            assertEquals(1, foundOfficer.getId());
        }
    }

    @Test
    void testThatFindMultipleOfficersById(){
        assertEquals(0L, officerRepository.count());
        officerRepository.save(officer);
        Officer secondOfficer =  officerRepository.save(new Officer());
        Officer thirdOfficer =  officerRepository.save(new Officer());
        assertEquals(3L, officerRepository.count());
        List<Officer> found = officerRepository.findById(2);
        for (Officer foundOfficer: found){
            assertEquals(2, foundOfficer.getId());
        }
    }

    @Test
    void testThatFindAllOfficersSaved(){
        assertEquals(0L, officerRepository.count());
        officerRepository.save(officer);
        Officer secondOfficer =  officerRepository.save(new Officer());
        Officer thirdOfficer =  officerRepository.save(new Officer());
        List<Officer> all= officerRepository.findAll();
        assertEquals(3, all.size());
    }

    @Test
    void testThatExistOficersById(){
        assertEquals(0L, officerRepository.count());
        officerRepository.save(officer);
        Officer secondOfficer =  officerRepository.save(new Officer());
        Officer thirdOfficer =  officerRepository.save(new Officer());
        assertEquals(3L, officerRepository.count());
        boolean exists = officerRepository.existsById(2);
        assertTrue(exists);
    }

    @Test
    void testThatDeleteOfficersById(){
        assertEquals(0L, officerRepository.count());
        officerRepository.save(officer);
        Officer secondOfficer =  officerRepository.save(new Officer());
        Officer thirdOfficer =  officerRepository.save(new Officer());
        officerRepository.deleteById(List.of(secondOfficer,thirdOfficer));
        assertEquals(1L, officerRepository.count());
    }

    @Test
    void testThatDeleteAll(){
        assertEquals(0L, officerRepository.count());
        officerRepository.save(officer);
        Officer secondOfficer =  officerRepository.save(new Officer());
        Officer thirdOfficer =  officerRepository.save(new Officer());
        officerRepository.deleteAll(List.of(officer,thirdOfficer));
        assertEquals(1L, officerRepository.count());
    }
}