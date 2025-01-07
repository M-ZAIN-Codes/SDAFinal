SDAFinal
 Code Description:

1. Purpose: Implements a bidding system where users can place bids, product owners can upload/select products, and bids can be managed.

2. Architecture: Follows a **layered architecture** with Application, Service, Data Access, and Domain layers for modularity.

3. Domain Layer: Contains entities (`User`, `ProductOwner`, `Bid`) with attributes and methods (e.g., `placeBid`, `viewBid`).

4. Application Layer: The `Main` class simulates actions like placing bids, updating profiles, and uploading products.

6. Service Layer: The `BidService` class contains business logic (e.g., validating, saving, or closing bids).

7.   Data Access Layer: The `BidRepository` class stores and retrieves bid data in an in-memory `HashMap`.

8. Key Features: Users can place and update bids, owners upload/select products, and bids can be validated or closed.

9. Modularity: Each layer is independent, ensuring easier maintenance and scalability.

10. Design Principles: Adheres to SOLID principles (single responsibility, abstraction via services).

11. Extensibility: The architecture allows for future enhancements, like integrating a database or adding new features.
12. Summary of What the Code Does:

1. Allows users to place bids and update their profiles.  
2. Enables product owners to upload products and select winning bids.  
3. Manages bids with features to view, update, validate, and close them.  
4. Implements business logic for handling bids through the BidService class.  
5. Stores and retrieves bid data using an in-memory BidRepository.  
6. Simulates real-world interactions in the Main class (application entry point).  
7. Ensures modular and maintainable code by using a layered architecture.  
