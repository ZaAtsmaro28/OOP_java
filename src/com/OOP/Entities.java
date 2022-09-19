package com.OOP;

public class Entities {
  protected String Name;
  public int HealthPoint;
  protected int AttackPoint;
  protected int DefensePoint;
  protected int Speed;
  protected String Role;

  public Entities(String name, int hp, int ap, int dp, int speed, String role) {
    this.Name = name;
    this.HealthPoint = hp;
    this.AttackPoint = ap;
    this.DefensePoint = dp;
    this.Speed = speed;
    this.Role = role;
  }

  public void Attack(int Damage) {
    this.HealthPoint -= Damage;
  }

  public void Defense(int ArmorResist) {
    this.DefensePoint += ArmorResist;
  }

  public String IsAlive() {
    if (this.HealthPoint >= 500)
      return "Alive";
    else if (this.HealthPoint >= 1 && this.HealthPoint < 500)
      return "Danger - Dying";
    return "Death";
  }

  public void Info() {
    System.out.println("\nName : " + this.Name);
    System.out.println("HP : " + this.HealthPoint);
    System.out.println("AP : " + this.AttackPoint);
    System.out.println("DP : " + this.DefensePoint);
    System.out.println("Movement Speed : " + this.Speed);
    System.out.println("Role : " + this.Role);
    System.out.println("Status : " + this.IsAlive());
  }
}
