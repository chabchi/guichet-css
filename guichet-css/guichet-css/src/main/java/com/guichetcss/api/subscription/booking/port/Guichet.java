package com.guichetcss.api.subscription.booking.port;


import com.guichetcss.api.subscription.booking.domain.Ticket;

import java.util.concurrent.ExecutionException;

public interface Guichet {
    void send() throws ExecutionException, InterruptedException;
    boolean purchaseTicket(Ticket ticket) throws ExecutionException, InterruptedException;
}
