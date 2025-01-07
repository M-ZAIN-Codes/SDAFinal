/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sdaprojfinal;

public class Bid {
    public void viewBid() {
        System.out.println("Viewing bid details.");
    }

    public void update() {
        System.out.println("Bid details updated.");
    }

    public boolean isValid() {
        System.out.println("Validating the bid.");
        return true;
    }

    public void closeBid() {
        System.out.println("Bid has been closed.");
    }
}
