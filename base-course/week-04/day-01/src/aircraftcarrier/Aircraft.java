package aircraftcarrier;

public class Aircraft {
  int maxAmmo;
  int baseDamage;
  int ammo;
  String type;
  boolean priority;

  public Aircraft() {
    this.ammo = 0;
  }

  public int fight() {
    int damage = this.ammo * this.baseDamage;
    this.ammo = 0;
    return damage;
  }

  public int refill(int refillNumber) {
    int remainingFill = 0;
    if (refillNumber + this.ammo <= this.maxAmmo) {
      this.ammo += refillNumber;
      return remainingFill;
    } else {
      remainingFill = refillNumber - this.ammo;
      this.ammo = this.maxAmmo;
      return remainingFill;
    }
  }

  public String getType() {
    return this.type;
  }

  public String getStatus() {
    return "Type: " + this.type + ", Ammo: " + this.ammo + ", Base Damage: "
        + this.baseDamage + ", All Damage" + this.ammo * this.baseDamage;
  }

  public boolean isPriority() {
    return this.priority;
  }

  public int getMaxAmmo() {
    return maxAmmo;
  }

  public void setMaxAmmo(int maxAmmo) {
    this.maxAmmo = maxAmmo;
  }

  public int getBaseDamage() {
    return baseDamage;
  }

  public void setBaseDamage(int baseDamage) {
    this.baseDamage = baseDamage;
  }
}
