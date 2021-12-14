public class Jet extends Airplane {

  /**
  * The multiplier on speed.
  */
  private static final int MULTIPLIER = 2;

  /**
  * Uses airplane class initializer.
  */
  public Jet() {
    super();
  }

  /**
  * The setSpeed method.
  *
  * @param speed the speed parameter.
  */
  public void setSpeed(final int speed) {
    super.setSpeed(speed * MULTIPLIER);
  }

  /**
  * The accelerate method.
  */
  public void accelerate() {
    super.setSpeed(getSpeed() * 2);
  }
}
