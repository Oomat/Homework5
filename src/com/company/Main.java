package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(1000);
        boss.setDamage(90);
        boss.setShield("Барьер");
        System.out.println("boss " + boss.getHealth() + " hp " + boss.getDamage() + " DD " + boss.getShield() + " PP");

        Hero[] marvel = creatHeroes();

        for (int i = 0; i < marvel.length; i++) {

            System.out.println(marvel[i].getName() + " " + marvel[i].getDamage() + " " + marvel[i].getHealth() + " " + marvel[i].getPower());


        }
    }


    public static Hero[] creatHeroes() {

        Hero aquaman = new Hero(300, 25, "electric trident", "aquaman");
        Hero spiderman = new Hero(250, 30, "web", "superman");
        Hero captainAmerica = new Hero(350, 35, "invulnerability", "captainAmerica");
        Hero[] marvel = {aquaman, spiderman, captainAmerica};

        return marvel;
    }
}
