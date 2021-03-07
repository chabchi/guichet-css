package com.guichetcss.api;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class StadeStatus {
    Integer ratio;
    Integer ticketsNumber;
    Double money;
    String nextMatch;

    public static Object stadeNow() {
        return new StadeStatus(33, 4355, 321.034, "CSS / CA");
    }
}
