package StrategyPaternCharacters;

public class SwordBehavior implements WeaponBehavior{
    @Override
    public void useWeapon() {
        System.out.println("Slashes and stabs enemies. Light weight weapon");
    }
}
