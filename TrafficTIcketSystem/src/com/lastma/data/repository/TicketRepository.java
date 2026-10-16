package com.lastma.data.repository;

import com.lastma.data.models.Ticket;

import java.util.List;

public interface TicketRepository {
    Ticket save (Ticket Ticket);

    long count();

    List<Ticket> findById(int id);

    List<Ticket> findAll();

    boolean existsById(int id);

    void deleteAll(List<Ticket> TicketToDelete);

    void deleteById(List<Ticket> TicketToDelete);
}

