/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sdaprojfinal;

public class ProductOwner {
    private String id;
    private String name;
    private int phone;

    public ProductOwner(String id, String name, int phone) {
        this.id = id;
        this.name = name;
        this.phone = phone;
    }

    public void uploadProduct() {
        System.out.println("Product uploaded by owner " + name + ".");
    }

    public void selectBid() {
        System.out.println("Owner " + name + " selected a bid.");
    }
}
