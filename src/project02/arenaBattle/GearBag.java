package project02.arenaBattle;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import project02.arenaBattle.enumsAndConstants.GearType;
import project02.arenaBattle.enumsAndConstants.PlayerAbility;
import project02.arenaBattle.enumsAndConstants.WearLocation;
import project02.arenaBattle.interfaces.IGear;

/**
 * This class is responsible for creating and aggregating
 * player gear to be distributed to combatants prior to battle.
 */
public class GearBag {
  private int numHeadgear = 5;
  private int numFootwear = 5;
  private int numBelts = 15;
  private int numPotions = 15;
  private int cursedItems;

  private List<IGear> items = new ArrayList<IGear>();
  private int numItems = 50; // TODO:  This is config
  // I don't think there are any issues doing it like this
  // just trying to avoid instantiating a new random
  // each time.
  private static Random rng = new Random();

  /**
   * Create a gearbag with n random items.
   */
  public GearBag(int headgear, int footwear, int belts, int potions) {
    numHeadgear = headgear;
    numFootwear = footwear;
    numBelts = belts;
    numPotions = potions;
    cursedItems = (int) (.25 * (headgear + footwear + belts + potions));
    items = getNRandomItems(numItems);
  }

  private void createBagItems() {
    List<IGear> createdItems = new ArrayList<IGear>();

    for(int x = 0; x <= cursedItems; x++) {
     IGear cursedItem = getRandomCursedItem();
    }

  }
  /**
   * Initialize the bag with a prepared list of IGear items.
   *
   * @param items the list of items to be in the bag
   */
  public GearBag(List<IGear> items) {
    this.items = items;
  }

  public List<IGear> dispenseEquipmentForOnePlayer() {
    // just a dummy implementation right now
    return getNRandomItems(25);
  }

  private IGear getItem() {
    return createRandomItem();
  }

  private IGear getRandomCursedItem() {
    return new Gear(getRandomGearType(), getRandomWearLocation(), getRandomPlayerAbility(), getRandomNumber(-15, -1));
  }
  private IGear createRandomItem() {
    return new Gear(getRandomGearType(), getRandomWearLocation(), getRandomPlayerAbility(), getRandomNumber(-10, 10));
  }

  private IGear createRandomFootwear() {
    return new Gear(GearType.FOOTWEAR, WearLocation.FEET, PlayerAbility.DEXTERITY, getRandomNumber(-10, 10));
  }

  private IGear createRandomHeadgear() {
    return new Gear(GearType.HEADGEAR, WearLocation.HEAD, PlayerAbility.CHARISMA, getRandomNumber(-10, 10));
  }

  private List<IGear> getNItemsOfType(GearType type) {

  }
  private List<IGear> getNRandomItems(int n) {
    ArrayList<IGear> gear = new ArrayList<IGear>();
    for(int x = 0; x <=n; x++) {
      gear.add(createRandomItem());
    }

    return gear;
  }
  private GearType getRandomGearType() {
   return GearType.BELT;
  }

  private WearLocation getRandomWearLocation() {
   return WearLocation.FEET;
  }

  private PlayerAbility getRandomPlayerAbility() {
   return PlayerAbility.STRENGTH;
  }

  private int getRandomNumber(int min, int max) {
    int absMin = Math.abs(min);
    int absMax = Math.abs(max);

    // This needs to not be instantiated each time
    // waiting to figure out where I centralize utils
    //Random rng = new Random();

    // This should help with negative ranges like -10 to 10
    return rng.nextInt(absMin + absMax) - absMin;
  }
}
