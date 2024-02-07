package org.example.Healing;

public class StarCraft {
    public static void main(String[] args) {
        Marine marine = new Marine("raynor", 80);
        Medic medic = new Medic("medic", 60);

        marine.stimpack();
        medic.heal(marine);
    }

}

class Marine extends Unit {

    public Marine(String name, int hp) {
        super.name = name;
        super.hp = hp;
    }

    public void stimpack() {
        System.out.printf("[%s]의 스팀팩! HP: %d->", name, hp);
        hp -= 10;
        System.out.printf("%d\n",hp);
    }
}
class Medic extends Unit{

    public Medic(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    public void heal(Marine hero) {
        System.out.printf("[%s]의 치유! => [%s] HP(%d ->", this.name, hero.name, hero.hp);
        hero.hp +=10;
        System.out.printf("%d)",hero.hp);
    }
}