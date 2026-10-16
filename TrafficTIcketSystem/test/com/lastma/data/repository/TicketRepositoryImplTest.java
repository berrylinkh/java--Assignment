package com.lastma.data.repository;

import com.lastma.data.models.Ticket;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TicketRepositoryImplTest {
    private Ticket Ticket;
    private TicketRepositoryImpl TicketRepository;

    @BeforeEach
    public void Ticket() {
        TicketRepository = new TicketRepositoryImpl();
        Ticket = new Ticket();
    }

    @Test
    void testThatWhenISaveCountIncreaseByOne() {
        assertEquals(0L, TicketRepository.count());
        TicketRepository.save(Ticket);
        assertEquals(1L, TicketRepository.count());
    }

    @Test
    void testThatSavesMultipleTickets() {
        assertEquals(0L, TicketRepository.count());
        TicketRepository.save(Ticket);
        Ticket secondTicket = TicketRepository.save(new Ticket());
        Ticket thirdTicket = TicketRepository.save(new Ticket());
        assertEquals(3L, TicketRepository.count());
    }

    @Test
    void testThatSavesATicketAndGetsTheId() {
        assertEquals(0L, TicketRepository.count());
        TicketRepository.save(Ticket);
        assertEquals(1, Ticket.getId());
    }


    @Test
    void testThatThrowsExceptionForSavingNull() {
        assertThrows(IllegalArgumentException.class, () -> TicketRepository.save(null));
    }

    @Test
    void testThatFindsATicketsById(){
        assertEquals(0L, TicketRepository.count());
        TicketRepository.save(Ticket);
        assertEquals(1L, TicketRepository.count());
        List<Ticket> found = TicketRepository.findById(1);
        for (Ticket foundTicket: found){
            assertEquals(1, foundTicket.getId());
        }
    }

    @Test
    void testThatFindMultipleTicketsById(){
        assertEquals(0L, TicketRepository.count());
        TicketRepository.save(Ticket);
        Ticket secondTicket =  TicketRepository.save(new Ticket());
        Ticket thirdTicket =  TicketRepository.save(new Ticket());
        assertEquals(3L, TicketRepository.count());
        List<Ticket> found = TicketRepository.findById(2);
        for (Ticket foundTicket: found){
            assertEquals(2, foundTicket.getId());
        }
    }

    @Test
    void testThatFindAllTicketsSaved(){
        assertEquals(0L, TicketRepository.count());
        TicketRepository.save(Ticket);
        Ticket secondTicket =  TicketRepository.save(new Ticket());
        Ticket thirdTicket =  TicketRepository.save(new Ticket());
        List<Ticket> all= TicketRepository.findAll();
        assertEquals(3, all.size());
    }

    @Test
    void testThatExistOficersById(){
        assertEquals(0L, TicketRepository.count());
        TicketRepository.save(Ticket);
        Ticket secondTicket =  TicketRepository.save(new Ticket());
        Ticket thirdTicket =  TicketRepository.save(new Ticket());
        assertEquals(3L, TicketRepository.count());
        boolean exists = TicketRepository.existsById(2);
        assertTrue(exists);
    }

    @Test
    void testThatDeleteTicketsById(){
        assertEquals(0L, TicketRepository.count());
        TicketRepository.save(Ticket);
        Ticket secondTicket =  TicketRepository.save(new Ticket());
        Ticket thirdTicket =  TicketRepository.save(new Ticket());
        TicketRepository.deleteById(List.of(secondTicket,thirdTicket));
        assertEquals(1L, TicketRepository.count());
    }

    @Test
    void testThatDeleteAll(){
        assertEquals(0L, TicketRepository.count());
        TicketRepository.save(Ticket);
        Ticket secondTicket =  TicketRepository.save(new Ticket());
        Ticket thirdTicket =  TicketRepository.save(new Ticket());
        TicketRepository.deleteAll(List.of(Ticket,thirdTicket));
        assertEquals(1L, TicketRepository.count());
    }

}