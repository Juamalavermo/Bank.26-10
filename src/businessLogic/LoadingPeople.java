/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businessLogic;

import data.Client;
import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Julián
 */
public class LoadingPeople {
    
        public static Client readManager(Scanner sc) {
		Client newManager = null;
		
		String name = sc.next().trim();
                String id = sc.next().trim();
                String manager = sc.next().trim();
                newManager= new Client(name);
		return newManager;
                
     public static Client readClients(Scanner sc) {
		Client newClients = null;
		
		String name = sc.next().trim();
                String id = sc.next().trim();
                String manager = sc.next().trim();
                newClients = new Client(name);
		return newClients;
	}
    
    public static Client readClient(Scanner sc) {
		String type = sc.next().trim();
		if (type.equals("Client")) 
                    return readClients(sc);
                else
                    return readManager(sc);
	}
    
    public static ArrayList<Client> readCustomer(String fileName) {
		ArrayList<Client> people = new ArrayList<Client>();
		Scanner sc;
		try {
			sc = new Scanner(new File(fileName));
			sc.useDelimiter(",");
			while (sc.hasNext()) {
				people.add(readClient(sc));
			}
		} catch (FileNotFoundException e) {
			System.out.println("File not found -- " + fileName);
			e.printStackTrace();
		}
		return people;
	}

   
}
