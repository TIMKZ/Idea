package HW2_1.animal;

import HW2_1.it.It;

public class Animal {
    protected String type;
    protected String name;
    protected int maxRun;
    protected int maxJump;

    public void run(int dist) {
        if (dist <= maxRun) {
            System.out.println(type + name + " пробежал " + dist + " м.");
        } else {
            System.out.println(type + name + " не может пробежать " + dist + "м."
                    + " максимально может бежать " + maxRun + " м.");
        }

    }

    public void jump(int height) {
        if (height <= maxJump) {
            System.out.println(type + name + " перепрыгнул стену высотой: " + height + " см.");
        } else {
            System.out.println(type + name + " не может перепрыгнуть стену высотой " + height +
                    "см." + " максимальная высота для него " + maxJump + " см.");
        }
    }

    public Animal(String type, String name, int maxRun, int maxJump) {
        this.type = type;
        this.name = name;
        this.maxRun = maxRun;
        this.maxJump = maxJump;
    }

}
