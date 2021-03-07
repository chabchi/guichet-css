package com.guichetcss.api.subscription.booking.subscription.booking.infra;


import com.guichetcss.api.subscription.booking.subscription.booking.domain.UpdateTicket;
import com.guichetcss.api.subscription.booking.subscription.booking.domain.mapper.UpdateTicketMapper;
import com.guichetcss.api.subscription.booking.subscription.booking.infra.entities.TicketEntity;
import com.guichetcss.api.subscription.booking.subscription.booking.port.GuichetRepository;
import com.guichetcss.api.subscription.booking.subscription.booking.infra.persistence.GuichetDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GuichetRepositoryImpl implements GuichetRepository {

    @Autowired
    public GuichetDao dao;

    @Override
    public UpdateTicket book(String ticketNumber, String mail) {
        TicketEntity ticket =  dao.findById(ticketNumber).orElse(null);
        if(ticket!= null){
           return UpdateTicketMapper.from(bookTicket(ticket, mail));
        }
        return null;
    }

    private TicketEntity bookTicket(TicketEntity ticket, String mail) {
        ticket.setSupporter(mail);
        ticket.setPurchased(true);
        return dao.save(ticket);
    }
}
