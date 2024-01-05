package StrategyPaternCharacters;

public class Knight extends Character{

    public Knight() {
        this.weaponBehavior = new AxeBehavior();
    }
    @Override
    public void fight() {
        System.out.println("The Knight is a warrior, uses all weapons but prefers the Axe");
//        weaponBehavior.useWeapon();
    }
}
