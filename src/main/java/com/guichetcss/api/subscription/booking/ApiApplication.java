package com.guichetcss.api.subscription.booking;

import com.guichetcss.api.subscription.booking.subscription.booking.domain.StadeStatus;
import com.guichetcss.api.subscription.booking.subscription.booking.port.GuichetApplication;
import com.guichetcss.api.subscription.booking.subscription.booking.domain.PurchasedTicket;
import com.guichetcss.api.subscription.booking.subscription.booking.domain.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.ExecutionException;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
@RestController
public class ApiApplication {

    @Autowired
    GuichetApplication guichet;

    public static void main(String[] args) {
        SpringApplication.run(ApiApplication.class, args);
    }

    @GetMapping("/STM")
    public ResponseEntity getState(){
        return ResponseEntity.status(HttpStatus.OK).body(StadeStatus.stadeNow());
    }

    @GetMapping("/hello")
    public String sayHello(@RequestParam(value = "myName", defaultValue = "World") String name) {

        return String.format("Hello %s!", name);
    }

    @PostMapping("/STM")
    public ResponseEntity bookTicket(@RequestBody PurchasedTicket infos) throws ExecutionException, InterruptedException {
        Ticket ticket = new Ticket(infos.getTicketNumber(), infos.getUser(), infos.getMail(), false);
        boolean response = guichet.purchaseTicket(ticket);
        return ResponseEntity.status(HttpStatus.OK).body("response: "+response);
    }

}
