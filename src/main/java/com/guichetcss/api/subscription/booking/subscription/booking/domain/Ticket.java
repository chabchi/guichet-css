package com.guichetcss.api.subscription.booking.subscription.booking.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Ticket {
    private String number;
    private String supporter;
    private String mail;
    private Boolean paied;

    @Override
    public String toString() {
        return "Ticket{" +
                "number='" + number + '\'' +
                ", supporter='" + supporter + '\'' +
                ", mail='" + mail + '\'' +
                ", paied=" + paied +
                '}';
    }
}
