package project02.arenaBattle.interfaces;

import project02.arenaBattle.enumsAndConstants.GearType;
import project02.arenaBattle.enumsAndConstants.WeaponType;

public class AbstractWeapon implements IWeapon {
  public final WeaponType weaponType;
  public final GearType gearType;
  public final int numAttacks;

  public AbstractWeapon(WeaponType weaponType, int numAttacks) {
    this.weaponType = weaponType;
    this.numAttacks = numAttacks;
    this.gearType = GearType.WEAPON;
  }

  public int getAttackDamage() {
    return 0;
  }
}
