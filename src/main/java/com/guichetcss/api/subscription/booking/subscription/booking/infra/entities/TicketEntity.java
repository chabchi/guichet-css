package com.guichetcss.api.subscription.booking.subscription.booking.infra.entities;


import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
public class TicketEntity {

    @Id
    String ticketNumber;

    String supporter;
    Boolean purchased;

}
