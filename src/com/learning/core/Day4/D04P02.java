package com.learning.core.Day4;
import java.util.Scanner;


public class D04P02 {
	    private String playername;
	    private float critic1;
	    private float critic2;
	    private float critic3;
	    private float avgrating;
	    private String coins;

	    public D04P02(String playername, float critic1, float critic2, float critic3) {
	        this.playername = playername;
	        this.critic1 = critic1;
	        this.critic2 = critic2;
	        this.critic3 = critic3;
	        this.avgrating = (critic1 + critic2 + critic3) / 3;
	        this.coins = calculateCoins();
	    }

	    private String calculateCoins() {
	        if (avgrating < 2) {
	            throw new NotEligibleException("Not Eligible");
	        } else if (avgrating >= 7) {
	            return "Gold";
	        } else if (avgrating >= 5) {
	            return "Silver";
	        } else {
	            return "Bronze";
	        }
	    }

	    public String getPlayerName() 
	    {
	        return playername;
	    }

	    public float getAvgRating() 
	    {
	        return avgrating;
	    }

	    public String getCoins() 
	    {
	        return coins;
	    }

	    public static void main(String[] args) 
	    {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter player name:");
	        String playername = scanner.nextLine();
	        System.out.println("Enter critic 1 rating:");
	        float critic1 = scanner.nextFloat();
	        System.out.println("Enter critic 2 rating:");
	        float critic2 = scanner.nextFloat();
	        System.out.println("Enter critic 3 rating:");
	        float critic3 = scanner.nextFloat();

	        try 
	        {
	            D04P02 player = new D04P02(playername, critic1, critic2, critic3);
	            System.out.println("Player Name: " + player.getPlayerName());
	            System.out.println("Average Rating: " + player.getAvgRating());
	            System.out.println("Coins: " + player.getCoins());
	        } 
	        catch (NotEligibleException e) 
	        {
	            System.out.println("Error: " + e.getMessage());
	        }
	        
	        scanner.close();
	    
	}

	class NotEligibleException extends RuntimeException 
	{
	    public NotEligibleException(String message) 
	    {
	        super(message);
	    }
	}
}


