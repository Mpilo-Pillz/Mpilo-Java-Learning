package StrategyPaternCharacters;

public class AxeBehavior implements WeaponBehavior{
    @Override
    public void useWeapon() {
        System.out.println("Choops up the enemy but is really heavy");
    }
}
