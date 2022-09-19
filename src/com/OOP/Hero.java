package com.OOP;

public class Hero extends Entities {
  private String HeroType;
  private int ManaPoint;

  public Hero(String name, int ap, int mp, int speed, String type) {
    super(name, 1000, ap, 30, speed, "Hero");
    this.ManaPoint = mp;
    this.HeroType = type;
  }

  public Hero(String name, int ap, int speed, String type) {
    this(name, ap, 300, speed, type);
  }

  public void Walk(String DirectionHero, int currentX, int currentY) {
    if (DirectionHero.equals("Top")) {
      currentY += 50;
      System.out.println(" ---Move to top 50tiles");
    } else if (DirectionHero.equals("TopRight")) {
      currentY += 50;
      currentX += 50;
      System.out.println(" ---Move to top-right 50tiles");
    } else if (DirectionHero.equals("TopLeft")) {
      currentY += 50;
      currentX -= 50;
      System.out.println(" ---Move to top-left 50tiles");
    } else if (DirectionHero.equals("Bottom")) {
      currentY -= 50;
      System.out.println(" ---Move to bottom 50tiles");
    } else if (DirectionHero.equals("BottomRight")) {
      currentY -= 50;
      currentX += 50;
      System.out.println(" ---Move to bottom-right 50tiles");
    } else if (DirectionHero.equals("BottomLeft")) {
      currentY -= 50;
      currentX -= 50;
      System.out.println(" ---Move to bottom-left 50tiles");
    } else if (DirectionHero.equals("Right")) {
      currentX += 50;
      System.out.println(" ---Move to right 50tiles");
    } else if (DirectionHero.equals("Left")) {
      currentY -= 50;
      System.out.println(" ---Move to left 50tiles");

    }
  }

  public void UseSkill(int order) {
    switch (order) {
      case 1:
        this.ManaPoint -= 10;
        break;
      case 2:
        this.ManaPoint -= 55;
        break;
      case 3:
        this.ManaPoint -= 250;
        break;
    }
  }

  public void Info() {
    super.Info();
    System.out.println("MP : " + this.ManaPoint);
    System.out.println("Hero Type : " + this.HeroType);
  }
}
