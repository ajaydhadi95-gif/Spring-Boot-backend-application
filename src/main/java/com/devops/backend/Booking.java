package com.devops.backend;

public record Booking(
        Long id,
        String fullName,
        String phone,
        String city,
        String systemSize,
        Integer roofArea
) {}