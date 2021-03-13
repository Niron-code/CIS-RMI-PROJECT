/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rmi.server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author HP
 */
public class TheImplementation extends UnicastRemoteObject implements TheInterface{

    
	protected TheImplementation() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}
	private static final long serialVersionUID = -3763231206310448L;
	@Override
	public String getGreeting() throws RemoteException {
		
		return "Hello, Welcome to Icy Desire";
	}
    
}

