package com.devops.backend;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/api/bookings")
@CrossOrigin(origins = "http://localhost:5173")
public class BookingController {

    private final List<Booking> bookings = new CopyOnWriteArrayList<>();
    private final AtomicLong counter = new AtomicLong(1);

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Booking create(@RequestBody Booking req) {
        Booking saved = new Booking(counter.getAndIncrement(), req.fullName(),
                req.phone(), req.city(), req.systemSize(), req.roofArea());
        bookings.add(saved);
        return saved;
    }

    @GetMapping
    public List<Booking> all() {
        return bookings;
    }
}