package com.guichetcss.api.subscription.booking.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Purchase {
    String ticketNumber;
    String user;
    String mail;
}
