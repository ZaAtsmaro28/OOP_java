package com.OOP;

public class Tank extends Hero {

  public Tank(String Name, int dp, int hp, int ap) {
    super(Name, ap, 100, 100, "Tank");
    this.HealthPoint += hp;
    this.DefensePoint += 20;
    this.AttackPoint -= 10;
  }
}
