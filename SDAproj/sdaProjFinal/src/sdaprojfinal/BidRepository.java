/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sdaprojfinal;

import java.util.HashMap;
import java.util.Map;

public class BidRepository {
    private Map<String, Bid> bids = new HashMap<>();

    public void saveBid(String bidId, Bid bid) {
        bids.put(bidId, bid);
        System.out.println("Bid " + bidId + " saved.");
    }

    public Bid getBid(String bidId) {
        return bids.get(bidId);
    }
}

