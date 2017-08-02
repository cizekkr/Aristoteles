/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.uhk.aristoteles.app;

import java.util.List;

/**
 *
 * @author Adam Černohorský
 */
public class Session {
    private static Database database = new Database();
    
    public static Database getDatabase(){
            return database;
    }
}
