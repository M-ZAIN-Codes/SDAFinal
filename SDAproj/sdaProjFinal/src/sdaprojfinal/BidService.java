/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sdaprojfinal;

public class BidService {
    private BidRepository bidRepository;

    public BidService(BidRepository bidRepository) {
        this.bidRepository = bidRepository;
    }

    public void viewBid(String bidId) {
        Bid bid = bidRepository.getBid(bidId);
        if (bid != null) {
            bid.viewBid();
        } else {
            System.out.println("Bid not found.");
        }
    }

    public void updateBid(String bidId) {
        Bid bid = bidRepository.getBid(bidId);
        if (bid != null) {
            bid.update();
        } else {
            System.out.println("Bid not found.");
        }
    }

    public void validateAndSaveBid(String bidId, Bid bid) {
        if (bid.isValid()) {
            bidRepository.saveBid(bidId, bid);
        } else {
            System.out.println("Bid is invalid.");
        }
    }

    public void closeBid(String bidId) {
        Bid bid = bidRepository.getBid(bidId);
        if (bid != null) {
            bid.closeBid();
        } else {
            System.out.println("Bid not found.");
        }
    }
}
