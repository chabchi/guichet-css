package com.guichetcss.api.subscription.booking.subscription.booking.port;


import com.guichetcss.api.subscription.booking.subscription.booking.domain.Ticket;

import java.util.concurrent.ExecutionException;

public interface GuichetApplication {
    boolean purchaseTicket(Ticket ticket) throws ExecutionException, InterruptedException;
}
