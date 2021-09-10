/*
 *  UCF COP3330 Fall 2021 Store Class file
 *  Copyright 2021 Celina Alzenor
 */

package org.example;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Store
{
    private final int orderAmt;
    private final String state;

    //gets the order amount and the state location from user
    public Store()
    {
        Scanner input = new Scanner(System.in);

        System.out.print("What is the order amount? ");
        this.orderAmt = input.nextInt();

        System.out.print("What is the state? ");
        this.state = input.next();
    }

    public void TaxCalc()
    {
        //if user is in wisconsin, calculate the amount of tax and add it to the total
        if(this.state.matches("WI") || this.state.matches("wi") || this.state.matches("Wi") || this.state.matches("wI"))
        {
            DecimalFormat round = new DecimalFormat("###.##");
            float tax = (float) (5.5/100);
            float total = (this.orderAmt*tax)+this.orderAmt;

            System.out.println("The subtotal is $"+this.orderAmt+".");
            System.out.println("The tax is $"+(round.format(this.orderAmt*tax))+".");
            System.out.println("The total is $"+round.format(total)+".");

            return;
        }

        //if they are in another state, there is no tax added so the total is printed.
        System.out.println("The total is $"+this.orderAmt+".");
    }


}
