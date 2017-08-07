/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.uhk.aristoteles.app;

/**
 *
 * @author Adam Černohorský
 */
public class Room {

    private Bill bill;
    private Person client;
    private boolean hasSeaView;
    private boolean hasFridge;
    private boolean hasClimatezation;
    private boolean hasBalcony;
    private boolean isOccupied;
    private String numberOfBeds;
    private String roomNumber;

    public Room(boolean hasSeaView, boolean hasFridge, boolean hasClimatezation, boolean hasBalcony, String numberOfBeds, String roomNumber) {
        this.hasSeaView = hasSeaView;
        this.hasFridge = hasFridge;
        this.hasClimatezation = hasClimatezation;
        this.hasBalcony = hasBalcony;
        this.numberOfBeds = numberOfBeds;
        this.roomNumber = roomNumber;
    }

    public Bill getBill() {
        return bill;
    }

    public boolean hasSeaView() {
        return hasSeaView;
    }

    public void setHasSeaView(boolean hasSeaView) {
        this.hasSeaView = hasSeaView;
    }

    public boolean hasFridge() {
        return hasFridge;
    }

    public void setHasFridge(boolean hasFridge) {
        this.hasFridge = hasFridge;
    }

    public boolean hasClimatezation() {
        return hasClimatezation;
    }

    public void setHasClimatezation(boolean hasClimatezation) {
        this.hasClimatezation = hasClimatezation;
    }

    public boolean hasBalcony() {
        return hasBalcony;
    }

    public void setHasBalcony(boolean hasBalcony) {
        this.hasBalcony = hasBalcony;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }

    public Person getClient() {
        return client;
    }

    public void setClient(Person client) {
        this.client = client;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setIsOccupied(boolean isOccupied) {
        this.isOccupied = isOccupied;
    }

    public String getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(String numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

}
