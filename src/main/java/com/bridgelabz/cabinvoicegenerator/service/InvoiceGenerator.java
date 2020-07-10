package com.bridgelabz.cabinvoicegenerator.service;

import com.bridgelabz.cabinvoicegenerator.utility.Ride;

public class InvoiceGenerator
{
    private static final double COST_PER_KM = 10.0;
    private static final int COST_PER_MINUTE = 1;
    private static final double MINIMUM_FARE = 5.0;

    public double calculateFare(Ride... rides)
    {
        double totalFare = 0;
        for (Ride ride : rides) {
            totalFare += ride.distance * COST_PER_KM + ride.time * COST_PER_MINUTE;
        }
        return Math.max(totalFare, MINIMUM_FARE);
    }
}