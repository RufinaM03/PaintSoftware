
package com.TeamADDA.paintsoftware;
// DataController Class extending DialogBox
class DataController extends DialogBox {

    // Constructor for DataController
    public DataController() {
        System.out.println("DataController created");
    }

    // Override the open method to customize behavior for DataController
    @Override
    public void open() {
        System.out.println("Opening Data Controller");
        loadData();  // Automatically load data when opening
    }

    @Override
    public void close() {
        System.out.println("Closing Data Controller");
        saveData();  // Automatically save data when closing
    }

    // Method to manage data specifically in the DataController
    public void manageData() {
        System.out.println("Managing data in Data Controller");
    }

    // Method to load data (e.g., from a database or file)
    public void loadData() {
        System.out.println("Loading data in Data Controller");
    }

    // Method to save data (e.g., to a database or file)
    public void saveData() {
        System.out.println("Saving data in Data Controller");
    }

    // Method to validate data before processing
    public void validateData() {
        System.out.println("Validating data in Data Controller");
    }

    // Method to clear data, useful for resetting the state
    public void clearData() {
        System.out.println("Clearing data in Data Controller");
    }
}