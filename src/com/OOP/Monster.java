package com.OOP;

public class Monster extends Entities {
  public Monster(String name, int hp, int ap, int dp, int speed) {
    super(name, hp, ap, dp, speed, "Monster");
  }

  public void Effect(String MonsterClass) {
    if (MonsterClass.equals("Cramer")) {
      this.HealthPoint += 150;
      System.out.println("You Got +150 HP!");
    } else if (MonsterClass.equals("Red")) {
      this.AttackPoint += 100;
      this.DefensePoint += 200;
      System.out.println("You Got +100AP and +200DP!");
    } else if (MonsterClass.equals("Blue")) {
      this.AttackPoint += 400;
      this.Speed *= 2;
      System.out.println("You Got +400AP and x2 Speed!");
    }
  }

}
