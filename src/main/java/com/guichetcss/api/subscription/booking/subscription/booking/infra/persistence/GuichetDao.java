package com.guichetcss.api.subscription.booking.subscription.booking.infra.persistence;

import com.guichetcss.api.subscription.booking.subscription.booking.infra.entities.TicketEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GuichetDao extends JpaRepository<TicketEntity, String> {
}
