package aircraftcarrier;

public class F16 extends Aircraft {
  public F16() {
    super();
    super.setBaseDamage(30);
    super.setMaxAmmo(8);
    this.type = "F16";
    this.priority = true;
  }
}
