package com.bridgelabz.cabinvoicegenerator.utility;

public class Ride
{
    public final double distance;
    public final int time;
    public String rideType;

    public Ride(double distance, int time, String rideType)
    {
        this.distance = distance;
        this.time = time;
        this.rideType = rideType;
    }
}