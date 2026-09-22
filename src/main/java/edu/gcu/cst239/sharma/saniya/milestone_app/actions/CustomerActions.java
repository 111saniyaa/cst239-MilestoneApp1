package edu.gcu.cst239.sharma.saniya.milestone_app.actions;

import edu.gcu.cst239.sharma.saniya.milestone_app.util.InputUtilities;
import edu.gcu.cst239.sharma.saniya.milestone_app.services.StoreFront;

public class CustomerActions {

    StoreFront store;

    public CustomerActions(StoreFront store) {
        this.store = store;
    }

    public void handleCustomerActions() {
        // Implement customer actions here

        InputUtilities input = new InputUtilities();
        boolean exitRequested = false;
        while (!exitRequested) {
            System.out.println();
            System.out.println("Customer Menu:");
            System.out.println("1. View Products");
            System.out.println("2. Search for product by name or description");
            System.out.println("3. Add product to cart");
            System.out.println("4. Remove product from cart");
            System.out.println("5. View cart");
            System.out.println("6. Checkout");
            System.out.println("0. Exit");
            int choice = input.readInt("Enter 1, 2, 3, 4, 5, 6 or 0: ", 0, 6);
            switch (choice) {
                case 1:
                    System.out.println("You choose to view products.");
                    System.out.println("This is milestone #1. No actual fuctionality has been implemented yet.");
                    break;

                case 2:
                    System.out.println("You choose to search for a product  .");
                    System.out.println("This is milestone #1. No actual fuctionality has been implemented yet.");
                    break;

                case 3:
                    System.out.println("You choose to add a product to the cart.");
                    System.out.println("This is milestone #1. No actual fuctionality has been implemented yet.");
                    break;

                case 4: 
                    System.out.println("You choose to remove a product from the cart.");
                    System.out.println("This is milestone #1. No actual fuctionality has been implemented yet.");
                     break;

                case 5:
                    System.out.println("You choose to view the cart.");
                    System.out.println("This is milestone #1. No actual fuctionality has been implemented yet.");
                    break;

                case 6:
                    System.out.println("You choose to checkout.");
                    System.out.println("This is milestone #1. No actual fuctionality has been implemented yet.");   

                    break;

                case 0:
                    exitRequested = true;
                    break;

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }

    }
    
}
