package com.lastma.data.repository;

import com.lastma.data.models.Ticket;

import java.util.ArrayList;
import java.util.List;

public class TicketRepositoryImpl implements TicketRepository{
    private List<Ticket> Tickets = new ArrayList<>();
    private int numberOfTickets =0;

    private void validateTicket(Ticket Ticket) {
        if (Ticket == null) {
            throw new IllegalArgumentException("driver can not be null");
        }
    }

    private void validateTicketId(int id) {
        if (id <= 0) {
            throw new IllegalArgumentException("driver can not be zero");
        }
    }

    @Override
    public Ticket save(Ticket Ticket) {
        validateTicket(Ticket);
        if (Ticket.getId() == 0){
            Ticket.setId(++numberOfTickets);
            Tickets.add(Ticket);
        }
        else {
            int index = Tickets.indexOf(Ticket);
            if (index != -1) {
                Tickets.set(index, Ticket);
            }
        }
        return Ticket;
    }

    @Override
    public long count() {
        return Tickets.size();
    }

    @Override
    public List<Ticket> findById(int id) {
        validateTicketId(id);
        for(Ticket Ticket: Tickets){
            if(Ticket.getId()==id){
                return List.of(Ticket);
            }
        }
        return List.of();
    }

    @Override
    public List<Ticket> findAll() {
        List<Ticket> copy = new ArrayList<>(Tickets);
        return copy;
    }

    @Override
    public boolean existsById(int id) {
        validateTicketId(id);
        for (Ticket Ticket: Tickets){
            if(Ticket.getId()==id){
                return true;
            }
        }
        return false;
    }


    @Override
    public void deleteById(List<Ticket> TicketToDelete) {
        if (TicketToDelete == null) {
            throw new IllegalArgumentException("Driver can not be null");
        }
        for (Ticket Ticket: TicketToDelete) {
            validateTicket(Ticket);
            validateTicketId(Ticket.getId());
            for (Ticket toDelete : Tickets) {
                if (toDelete.getId() == Ticket.getId()) {
                    Tickets.remove(toDelete);
                    break;
                }
            }
        }
    }

    @Override
    public void deleteAll(List<Ticket> TicketToDelete) {
        if (TicketToDelete == null) {
            throw new IllegalArgumentException("Driver can not be null");
        }
        for (Ticket Ticket: TicketToDelete){
            validateTicket(Ticket);
            Tickets.remove(Ticket);
        }
    }
}
