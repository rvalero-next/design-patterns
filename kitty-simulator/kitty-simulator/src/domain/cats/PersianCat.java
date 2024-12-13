package domain.cats;

import domain.Kitty;
import domain.behaviours.jump.JumpRealAnimal;
import domain.behaviours.meow.MeowRealAnimal;

public class PersianCat extends Kitty {

    public PersianCat() {
        super("Persian Cat");
        this.setJumpBehavior(new JumpRealAnimal());
        this.setMeowBehaviour(new MeowRealAnimal());
    }

    @Override
    public String display() {
        return "I am a Persian Cat!";
    }

}
