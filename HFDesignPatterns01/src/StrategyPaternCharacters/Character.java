package StrategyPaternCharacters;
/**
 * Thee staratagey pattern says
 * defines a family of algorithms (behaviors)
 * encapsulates each algorithm/ behavior
 * makes the behaviors interchangeable
 * lets the algorithm/behavior vary depending on the clients/classes/Objects/Characters/Ducks that use it
 */

public abstract class Character {
    WeaponBehavior weaponBehavior;

    public abstract void fight();

    public void performUseWeapon() {
       weaponBehavior.useWeapon();
    }

    public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }
}
