package com.qualizeal.task;


import java.util.Scanner;

public class FootballTeams {
    public String[] arr;
    public String[] bench;
    public String coach;
    public String manager;
    public String teamName; // New field to store team name

    // Getter method for teamName
    public String getTeamName() {
        return teamName;
    }

    void getTeamDetails(Scanner sc) {
        arr = new String[11];
        bench = new String[9];
        System.out.println("Enter team name:"); // Prompt user to enter team name
        teamName = sc.nextLine(); // Store team name provided by the user
        System.out.println("Enter coach:");
        coach = sc.nextLine();
        System.out.println("Enter manager:");
        manager = sc.nextLine();
        System.out.println("Enter the players");
        for (int i = 0; i < 11; i++) {
            System.out.print("Enter player no " + (i + 1) + " name: ");
            arr[i] = sc.nextLine();
        }
        System.out.println("Enter the bench players");
        for (int i = 0; i < 9; i++) {
            System.out.print("Enter bench player no " + (i + 1) + " name: ");
            bench[i] = sc.nextLine();
        }
    }

    void displayTeamDetails() {
        System.out.println("\n" + teamName + " Details:");
        System.out.println("Team Details:");System.out.println("Players:");
        for (int i = 0; i < 11; i++) {
            System.out.println("Player " + (i + 1) + ": " + arr[i]);
        }
        System.out.println("Bench Players:");
        for (int i = 0; i < 9; i++) {
            System.out.println("Bench Player " + (i + 1) + ": " + bench[i]);
        }
        System.out.println("Coach: " + coach);
        System.out.println("Manager: " + manager);
    }

    }









