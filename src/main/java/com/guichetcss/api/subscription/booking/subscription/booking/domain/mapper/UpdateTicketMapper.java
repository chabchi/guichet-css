package com.guichetcss.api.subscription.booking.subscription.booking.domain.mapper;

import com.guichetcss.api.subscription.booking.subscription.booking.infra.entities.TicketEntity;
import com.guichetcss.api.subscription.booking.subscription.booking.domain.UpdateTicket;

import java.util.Objects;

public class UpdateTicketMapper {
    public static UpdateTicket from(TicketEntity bookTicket) {
        return Objects.requireNonNull(new UpdateTicket(bookTicket.getTicketNumber(), bookTicket.getSupporter(), bookTicket.getPurchased()));
    }
}
