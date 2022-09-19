package com.OOP;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("\n-Tank-");
        Tank Gatot = new Tank("Gatot", 500, 3500, 100);
        Gatot.Info();
        Gatot.Walk("Top", 24, 11);
        Gatot.UseSkill(1);
        Gatot.Info();
        System.out.println("\n\n-Monster-");
        Monster BuffJungle = new Monster("Reaper", 1000, 120, 30, 15);
        BuffJungle.Info();
        BuffJungle.Effect("Red");
        BuffJungle.Attack(200);
        BuffJungle.Info();
        System.out.println("\n-Asssassin-");
        Assassin Gossen = new Assassin("Gossen", 100, 1500, 300, 800);
        Gossen.Info();
        Gossen.Walk("TopRight", 24, 11);
        Gossen.UseSkill(3);
        Gossen.Info();
        Gossen.Attack(600);
        Gossen.Info();
    }
}
