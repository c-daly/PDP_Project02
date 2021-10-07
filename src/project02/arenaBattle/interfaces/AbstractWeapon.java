package project02.arenaBattle.interfaces;

import project02.arenaBattle.enumsAndConstants.GearType;
import project02.arenaBattle.enumsAndConstants.WeaponType;

public class AbstractWeapon implements IWeapon {
  public final WeaponType weaponType;
  public final GearType gearType;

  public AbstractWeapon(WeaponType weaponType) {
    this.weaponType = weaponType;
    this.gearType = GearType.WEAPON;
  }
}
