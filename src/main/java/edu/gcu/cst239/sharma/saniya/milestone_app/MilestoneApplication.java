package edu.gcu.cst239.sharma.saniya.milestone_app;
import edu.gcu.cst239.sharma.saniya.milestone_app.services.StoreFront;
import edu.gcu.cst239.sharma.saniya.milestone_app.actions.StartingActions;

    public class MilestoneApplication {

    public static void main(String[] args) {
        
        System.out.println("Milestone application starting..."); 

        StoreFront store = new StoreFront();
        StartingActions startingActions = new StartingActions(store);
        startingActions.start();
    }
}


