package com.guichetcss.api.subscription.booking.subscription.booking.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UpdateTicket {
    String ticketNumber;
    String mail;
    boolean status;
}
