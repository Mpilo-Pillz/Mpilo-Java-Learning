package StrategyPaternCharacters;

public class BowAndArrowWeapon implements WeaponBehavior{
    @Override
    public void useWeapon() {
        System.out.println("Effective strategy for attacking enemies from a distance");
    }
}
