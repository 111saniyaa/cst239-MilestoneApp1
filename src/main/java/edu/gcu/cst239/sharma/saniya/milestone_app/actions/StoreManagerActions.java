package edu.gcu.cst239.sharma.saniya.milestone_app.actions;
import edu.gcu.cst239.sharma.saniya.milestone_app.services.StoreFront;
import edu.gcu.cst239.sharma.saniya.milestone_app.util.InputUtilities;  

public class StoreManagerActions {

    StoreFront store;

    public StoreManagerActions(StoreFront store) {
        this.store = store;
    }

    public void handleManagerActions() {

        InputUtilities input = new InputUtilities();
        boolean exitRequested = false;
        while (!exitRequested) {
            System.out.println();
            System.out.println("Store Manager Menu:");
            System.out.println("1. View products in inventory");
            System.out.println("2. Search for product by name or description");
            System.out.println("3. Add product to inventory");
            System.out.println("4. Remove product from inventory");
            System.out.println("5. Update product details");
            System.out.println("6. Save inventory to file");
                System.out.println("7. Load inventory from file");
            System.out.println("0. Exit");
            int choice = input.readInt("Enter 1, 2, 3, 4, 5, 6, 7 or 0: ", 0, 7);
            switch (choice) {
                case 1:
                    System.out.println("You choose to view products in inventory.");
                    System.out.println("This is milestone #1. No actual fuctionality has been implemented yet.");
                    break;              
                case 2:
                    System.out.println("You choose to search for a product in inventory.");
                    System.out.println("This is milestone #1. No actual fuctionality has been implemented yet.");
                    break;
                case 3:
                    System.out.println("You choose to add a product to inventory.");
                    System.out.println("This is milestone #1. No actual fuctionality has been implemented yet.");
                    break;
                case 4:
                    System.out.println("You choose to remove a product from inventory.");
                    System.out.println("This is milestone #1. No actual fuctionality has been implemented yet.");
                    break;
                case 5:
                    System.out.println("You choose to update product details in inventory.");
                    System.out.println("This is milestone #1. No actual fuctionality has been implemented yet.");
                    break;
                case 6:
                    System.out.println("You choose to save inventory to file.");
                    System.out.println("This is milestone #1. No actual fuctionality has been implemented yet.");
                    break;
                case 7:
                    System.out.println("You choose to load inventory from file.");
                    System.out.println("This is milestone #1. No actual fuctionality has been implemented yet.");
                    break;
                case 0:
                    exitRequested = true;

                    break;
                default:
                    // This case should never occur because readInt enforces range
                    System.out.println("Invalid selection. Please try again.");
                }
            }

    }
    
}
