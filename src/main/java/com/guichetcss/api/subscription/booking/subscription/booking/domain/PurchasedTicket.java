package com.guichetcss.api.subscription.booking.subscription.booking.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PurchasedTicket {
    String ticketNumber;
    String user;
    String mail;
}
