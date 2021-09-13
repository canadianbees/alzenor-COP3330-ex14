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
        String finalOut;
        if(this.state.matches("WI") || this.state.matches("wi") || this.state.matches("Wi") || this.state.matches("wI"))
        {
            DecimalFormat round = new DecimalFormat("##0.00");
            float tax = (float) (5.5/100);
            float total = (this.orderAmt*tax)+this.orderAmt;

            finalOut = "The subtotal is $"+this.orderAmt+".\nThe tax is $"+(round.format(this.orderAmt*tax))+".\nThe total is $"+round.format(total)+".";
        }

        else
        {
            finalOut = "The total is $"+this.orderAmt+".";
        }

        System.out.print(finalOut);
    }


}
