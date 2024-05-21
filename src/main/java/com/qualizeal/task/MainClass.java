package com.qualizeal.task;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<FootballTeams> teamsList = new ArrayList<>();

        while (true) {
            if (teamsList.isEmpty()) {
                System.out.println("\nNo teams available");
            } else {
                System.out.println("\nTeams Available:");
                for (int i = 0; i < teamsList.size(); i++) {
                    FootballTeams team = teamsList.get(i);
                    System.out.println((i + 1) + ". " + team.getTeamName());
                }


            }
            System.out.println("Please choose an option:");
            System.out.println("1. Add a new team");
            System.out.println("2. View team details");
            System.out.println("3. Exit");

            System.out.print("Enter your choice: ");
            String choice = sc.nextLine();

            switch (choice) {
                case "1":
                    System.out.println("\nAdding a new team...");
                    FootballTeams newTeam = new FootballTeams();
                    System.out.print("Enter the team name: ");
                    String teamName = sc.nextLine();
                    newTeam.getTeamDetails(sc);
                    teamsList.add(newTeam);
                    break;

                case "2":
                    if (!teamsList.isEmpty()) {
                        System.out.println("\nViewing team details...");
                        if (teamsList.size() == 1) {
                            System.out.println("Team is available.");
                            System.out.print("Do you want to view details for Team ? (yes/no): ");
                            String viewTeam1Choice = sc.nextLine();
                            if (viewTeam1Choice.equalsIgnoreCase("yes")) {
                                System.out.println("\nTeam  Details:");
                                teamsList.get(0).displayTeamDetails();
                            }
                        } else {
                            System.out.println("Available teams:");
                            for (int i = 0; i < teamsList.size(); i++) {
                                FootballTeams team = teamsList.get(i);
                                System.out.println((i + 1) + ". " + team.getTeamName());
                            }
                            System.out.print("Enter the team number to view details: ");
                            int teamNumber = sc.nextInt();
                            sc.nextLine();

                            if (teamNumber >= 1 && teamNumber <= teamsList.size()) {
                                System.out.println("\nTeam " + teamNumber + " Details:");
                                teamsList.get(teamNumber - 1).displayTeamDetails();
                            } else {
                                System.out.println("\nInvalid team number. Please try again.");
                            }
                        }
                    } else {
                        System.out.println("\nNo teams available to view.");
                    }
                    break;

                /*case "2":
                    if (!teamsList.isEmpty()) {
                        System.out.println("\nViewing team details...");
                        System.out.println("Available teams:");
                        for (int i = 0; i < teamsList.size(); i++) {
                            FootballTeams team = teamsList.get(i);
                            System.out.println((i + 1) + ". " + team.getTeamName());
                        }
                        System.out.print("Enter the team number to view details: ");
                        int teamNumber = sc.nextInt();
                        sc.nextLine();
                        if (teamNumber >= 1 && teamNumber <= teamsList.size()) {
                            FootballTeams selectedTeam = teamsList.get(teamNumber - 1);
                            System.out.println("\nTeam " + selectedTeam.getTeamName() + " Details:");
                            selectedTeam.displayTeamDetails();
                        } else {
                            System.out.println("\nInvalid team number. Please try again.");
                        }
                    } else {
                        System.out.println("\nNo teams available to view.");
                    }
                    break;*/



                case "3":
                    System.out.println("Exiting...\n");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}













