package ru.gb;

import java.util.ArrayList;
import java.util.Random;

public class Game {
    private int doorWithPrize;

    public static double countPlayerWin = 0;
    private ArrayList<Door> doors = new ArrayList<>();
    private int playerChoice;
    private int hostChoice;
    private Random rnd = new Random();

    public Game(int doorsNum) {
        doorWithPrize = rnd.nextInt(doorsNum);
        for (int i = 0; i < doorsNum; i++){
            if(doorWithPrize == i) doors.add(new Door(true));
            else doors.add(new Door());
        }
        playerChoice = rnd.nextInt(doorsNum);

        hostChoice = rnd.nextInt(doorsNum);
        while (hostChoice==playerChoice || doors.get(hostChoice) == doors.get(doorWithPrize)){
            hostChoice = rnd.nextInt(doorsNum);
        }

        int playerChoice2 = rnd.nextInt(doorsNum);
        while (playerChoice2 == playerChoice || playerChoice2 == hostChoice){
            playerChoice2 = rnd.nextInt(doorsNum);
        }

        countPlayerWins(playerChoice2);
    //    if (playerChoice2 == doorWithPrize) messageWin();
    //    else messageLoss();



    }

    public void countPlayerWins(int playerChoice){
        if (playerChoice == doorWithPrize) countPlayerWin++;
    }

    public void messageWin(){
        System.out.println("Игрок победил!");
    }

    public void messageLoss(){
        System.out.println("Игрок проиграл!");
    }
}
