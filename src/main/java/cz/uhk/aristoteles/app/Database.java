/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.uhk.aristoteles.app;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Adam Černohorský
 */
public class Database {
    
    private List<Room> allRooms;
    
    public Database(){
        Room room1 = new Room(true, true, true, true, "1", "101");
        Room room2 = new Room(true, true, true, true, "2", "102");
        Room room3 = new Room(true, true, true, true, "4", "103");
        Room room4 = new Room(true, true, true, true, "2", "104");
        Room room5 = new Room(true, true, true, true, "1", "101");
        Room room6 = new Room(true, true, true, true, "2", "102");
        Room room7 = new Room(true, true, true, true, "4", "103");
        Room room8 = new Room(true, true, true, true, "2", "104");
        Room room9 = new Room(true, true, true, true, "2", "104");
        Room room10 = new Room(true, true, true, true, "2", "102");
        Room room11 = new Room(true, true, true, true, "4", "103");
        Room room12 = new Room(true, true, true, true, "2", "104");
        Room room13 = new Room(true, true, true, true, "2", "104");
        allRooms = new ArrayList<>();
        allRooms.add(room1);
        allRooms.add(room2);
        allRooms.add(room3);
        allRooms.add(room4);
        allRooms.add(room5);
        allRooms.add(room6);
        allRooms.add(room7);
        allRooms.add(room8);
        allRooms.add(room9);
        allRooms.add(room10);
        allRooms.add(room11);
        allRooms.add(room12);
        allRooms.add(room13);
    }

    public List<Room> getAllRooms() {
        return allRooms;
    }
    
    
}
