package com.bridgelabz.cabinvoicegeneratortest;

import com.bridgelabz.cabinvoicegenerator.service.InvoiceGenerator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class InvoiceGeneratorTest
{
    InvoiceGenerator invoiceGenerator;

    @Before
    public void setUp()
    {
        invoiceGenerator = new InvoiceGenerator();
    }

    @Test
    public void givenDistanceAndTime_ShouldReturnTotalFare()
    {
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        double distance = 3.0;
        int time = 7;
        double fare = invoiceGenerator.calculateFare(distance, time);
        Assert.assertEquals(37, fare, 0.0);
    }
}
