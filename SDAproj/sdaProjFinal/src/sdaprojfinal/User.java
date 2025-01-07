/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sdaprojfinal;

public class User {
    private String userId;
    private String userName;
    private int userPh;

    public User(String userId, String userName, int userPh) {
        this.userId = userId;
        this.userName = userName;
        this.userPh = userPh;
    }

    public void placeBid() {
        System.out.println("User " + userName + " is placing a bid.");
    }

    public void updateProfile() {
        System.out.println("User " + userName + " updated their profile.");
    }
}
