package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Roaster {

   public static void main(String[] args) {
     Scanner keyboard = new Scanner(System.in);
   
   
    System.out.println("Need to talk $#!+ but don't know what to say? ");
    System.out.println("Choose a category and let us help you!");
    System.out.println("[1] YoMama \n>-Classic yet can be corny-<\n");
    System.out.println("[2] Fat insults    \n>-Over-used yet still effective-<\n");
    System.out.println("[3] Shut-up (explicit) \n>-Mean ways to say stop talking-<\n");
    System.out.println("[4] Ugly insults \n>-Really good for destroying self-esteem-<\n");
    System.out.println("[5] General insuts \n>-An array of mean things to say-<\n");
    String category = keyboard.nextLine();
    
    
    if("1".equals(category)) {
    	File inputFile = new File("yourMom.txt");
    		try (Scanner itemFile = new Scanner(inputFile)){
    			while (itemFile.hasNextLine()) {
    				String thisLine = itemFile.nextLine();
    				System.out.println("\n============================");
    				System.out.println("\nPress enter to continue.\n");
    				System.out.println("============================");
    				String next = keyboard.nextLine();
    				if("".equals(next)) {
    					System.out.println(thisLine);
    					if(!(itemFile.hasNextLine())) {
    						System.out.println("Exiting...");
    						System.exit(0);
    						
    					}	
    				} 
    				}	
    			} catch(FileNotFoundException fnfe) {
    				System.out.println("Coming soon...");
    			}
     }
    if("2".equals(category)) {
    	File inputFile = new File("fat.txt");
    	try (Scanner itemFile = new Scanner(inputFile)){
			while (itemFile.hasNextLine()) {
				String thisLine = itemFile.nextLine();
				System.out.println("\n============================");
				System.out.println("\nPress enter to continue.\n");
				System.out.println("============================");
				String next = keyboard.nextLine();
				if("".equals(next)) {
					System.out.println(thisLine);
					if(!(itemFile.hasNextLine())) {
						System.out.println("Exiting...");
						System.exit(0);
					}
				}
				}	
			} catch(FileNotFoundException fnfe) {
				System.out.println("Coming soon...");
			}
    }
    if("3".equals(category)) {
    	File inputFile = new File("shut_up.txt");
    	try (Scanner itemFile = new Scanner(inputFile)){
			while (itemFile.hasNextLine()) {
				String thisLine = itemFile.nextLine();
				System.out.println("\n============================");
				System.out.println("\nPress enter to continue.\n");
				System.out.println("============================");
				String next = keyboard.nextLine();
				if("".equals(next)) {
					System.out.println(thisLine);
					if(!(itemFile.hasNextLine())) {
						System.out.println("Exiting...");
						System.exit(0);
					}
				}
				}	
			} catch(FileNotFoundException fnfe) {
				System.out.println("Coming soon...");
			}
    }
    if("4".equals(category)) {
    	File inputFile = new File("ugly.txt");
    	try (Scanner itemFile = new Scanner(inputFile)){
			while (itemFile.hasNextLine()) {
				String thisLine = itemFile.nextLine();
				System.out.println("\n============================");
				System.out.println("\nPress enter to continue.\n");
				System.out.println("============================");
				String next = keyboard.nextLine();
				if("".equals(next)) {
					System.out.println(thisLine);
					if(!(itemFile.hasNextLine())) {
						System.out.println("Exiting...");
						System.exit(0);
					}
				}
				}	
			} catch(FileNotFoundException fnfe) {
				System.out.println("Coming soon...");
			}
    }
    if("5".equals(category)) {
    	File inputFile = new File("general.txt");
    	try (Scanner itemFile = new Scanner(inputFile)){
			while (itemFile.hasNextLine()) {
				String thisLine = itemFile.nextLine();
				System.out.println("\n============================");
				System.out.println("\nPress enter to continue.\n");
				System.out.println("============================");
				String next = keyboard.nextLine();
				if("".equals(next)) {
					System.out.println(thisLine);
					if(!(itemFile.hasNextLine())) {
						System.out.println("Exiting...");
						System.exit(0);
					}
				}
				}	
			} catch(FileNotFoundException fnfe) {
				System.out.println("Coming soon...");
			}
    }
      
    
    	
    	
    
    
    
 //don't move these	
   }

	
}		
  




    
