final class FlyTest {

  /**
  * The start speed of airplane.
  */
  static final int STARTSPEED = 212;

  /**
  * The start speed of jet.
  */
  static final int JETSPEED = 422;

  /**
  * The number of times while loop triggers.
  */
  static final int TIMES = 4;

  /**
  * Value for check in code.
  */
  static final int MAX = 5000;

  /**
  * Prevent instantiation
  * Throw an exception IllegalStateException.
  * if this ever is called
  *
  * @throws IllegalStateException
  *
  */
  private FlyTest() {
    throw new IllegalStateException("Cannot be initated.");
  }

  /**
  * The starting main() function.
  *
  * @param args Name of file containing a
  string of numbers.
  */
  public static void main(final String[] args) {
    Airplane biplane = new Airplane();
    biplane.setSpeed(STARTSPEED);
    System.out.println(biplane.getSpeed());
    Jet boeing = new Jet();
    boeing.setSpeed(JETSPEED);
    System.out.println(boeing.getSpeed());
    int x = 0;
    while (x < TIMES) {
      boeing.accelerate();
      System.out.println(boeing.getSpeed());
      if (boeing.getSpeed() > MAX) {
        biplane.setSpeed(biplane.getSpeed() * 2);
      } else {
        boeing.accelerate();
      }
      x++;
    }
    System.out.println(biplane.getSpeed());
  }
}
