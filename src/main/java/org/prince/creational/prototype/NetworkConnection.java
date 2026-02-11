package org.prince.creational.prototype;

public class NetworkConnection implements Cloneable{
    private String ipAddress;
    private String importantData;

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public void connect() {
        System.out.println("Connecting to " + ipAddress + ":" + importantData);
    }


    public String getImportantData() {
        return importantData;
    }

    public void setImportantData(String importantData) {
        this.importantData = importantData;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    @Override
    public String toString() {
        return "NetworkConnection{" +
                "ipAddress='" + ipAddress + '\'' +
                ", importantData='" + importantData + '\'' +
                '}';
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    public void loadVeryImportantData() throws InterruptedException {
        // Simulate loading important data from a database or external source
        this.importantData = "This is some very important data that takes time to load.";
        Thread.sleep(2000);
    }
}
