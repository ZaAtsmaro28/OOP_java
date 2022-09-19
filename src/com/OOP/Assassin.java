package com.OOP;

public class Assassin extends Hero{
  public Assassin(String Name, int dp, int hp, int ap, int mp) {
    super(Name, ap, mp, 100, "Assassin");
    this.DefensePoint = this.DefensePoint - 10;
    this.AttackPoint = this.AttackPoint + 20;
  }
}
