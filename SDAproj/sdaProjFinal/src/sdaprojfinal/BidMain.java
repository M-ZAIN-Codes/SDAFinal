/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sdaprojfinal;

public class BidMain {
    public static void main(String[] args) {
        // Create instances of entities
        User user = new User("U1", "zain", 1234567890);
        ProductOwner productOwner = new ProductOwner("P1", "hamza", 987654321);
        Bid bid = new Bid();

        // Simulate repository and service
        BidRepository bidRepository = new BidRepository();
        BidService bidService = new BidService(bidRepository);

        // Simulate user actions
        user.placeBid();
        user.updateProfile();

        // Simulate product owner actions
        productOwner.uploadProduct();
        productOwner.selectBid();

        // Simulate bid actions
        bidService.validateAndSaveBid("B1", bid);
        bidService.viewBid("B1");
        bidService.updateBid("B1");
        bidService.closeBid("B1");
    }
}

