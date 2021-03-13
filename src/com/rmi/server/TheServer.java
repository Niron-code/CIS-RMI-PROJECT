/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rmi.server;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author HP
 */
public class TheServer {
    
    public static void main(String[] args) {
		System.out.println("Attempting to start the Icy Desire Server..."); 
		try {
			TheInterface impl = new TheImplementation();
			Registry reg = LocateRegistry.createRegistry(1099);
			reg.rebind("HelloService2021",impl);

			System.out.println("Service started.");
                        System.out.println("Welcome to Icy Desire");

		} catch (RemoteException e) {
			System.out.println("An error occured: "+e.toString()); 
			e.printStackTrace();
		} 

	}
 
}
