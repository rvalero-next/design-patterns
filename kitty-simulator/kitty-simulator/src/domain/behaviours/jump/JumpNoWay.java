package domain.behaviours.jump;

public class JumpNoWay implements JumpBehaviour{
    @Override
    public String jump() {
        return "I can't jump!";
    }
}
