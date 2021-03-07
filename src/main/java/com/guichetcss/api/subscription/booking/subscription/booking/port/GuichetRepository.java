package com.guichetcss.api.subscription.booking.subscription.booking.port;

import com.guichetcss.api.subscription.booking.subscription.booking.domain.UpdateTicket;

public interface GuichetRepository {

    UpdateTicket book(String ticketNumber, String mail);

}
