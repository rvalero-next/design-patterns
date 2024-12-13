package domain;

import domain.behaviours.jump.JumpBehaviour;
import domain.behaviours.meow.MeowBehaviour;

public class Kitty {

    private final String name;
    private JumpBehaviour jumpBehavior;
    private MeowBehaviour meowBehaviour;

    public Kitty(String name) {
        this.name = name;
    }

    protected String display() {
        throw new UnsupportedOperationException("Not implemented");
    }

    public String performMeow() {
        return meowBehaviour.meow();
    }

    public String performJump() {
        return jumpBehavior.jump();
    }

    protected void setMeowBehaviour(MeowBehaviour meowBehaviour) {
        this.meowBehaviour = meowBehaviour;
    }


    protected void setJumpBehavior(JumpBehaviour jumpBehavior) {
        this.jumpBehavior = jumpBehavior;
    }

    @Override
    public String toString() {
        return "{" +
                "\nname='" + name + '\'' +
                "\n, jump!=" + jumpBehavior.jump() +
                "\n, meow!=" + meowBehaviour.meow() +
                "\n}";
    }
}
