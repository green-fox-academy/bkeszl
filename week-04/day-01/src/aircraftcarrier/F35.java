package aircraftcarrier;

public class F35 extends Aircraft {
  public F35() {
    super();
    super.setBaseDamage(50);
    super.setMaxAmmo(12);
    this.type = "F35";
    this.priority = false;
  }
}
