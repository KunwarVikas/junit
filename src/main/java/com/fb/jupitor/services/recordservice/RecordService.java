package com.fb.jupitor.services.recordservice;

/**
 * @author Kunwar V.
 */
public class RecordService{
    private DatabaseDAO database;
    private NetworkDAO network;

    public DatabaseDAO getDatabase() {
        return database;
    }

    public void setDatabase(DatabaseDAO database) {
        this.database = database;
    }

    public NetworkDAO getNetwork() {
        return network;
    }

    public void setNetwork(NetworkDAO network) {
        this.network = network;
    }

    public boolean save(String fileName)
    {
        database.saveFile(fileName);
        System.out.println("Saved in database in Main class");
         
        network.saveFile(fileName);
        System.out.println("Saved in network in Main class");
         
        return true;
    }
}