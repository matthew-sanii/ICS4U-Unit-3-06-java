final class FlyTest {

  /**
  * The start speed of airplane.
  */
  final static int startSpeed = 212;

  /**
  * The start speed of jet.
  */
  final static int jetSpeed = 422;

  /**
  * The number of times while loop triggers.
  */
  final static int times = 4;

  /**
  * Value for check in code.
  */
  final static int max = 5000;

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
    biplane.setSpeed(startSpeed);
    System.out.println(biplane.getSpeed());
    Jet boeing = new Jet();
    boeing.setSpeed(jetSpeed);
    System.out.println(boeing.getSpeed());
    int x = 0;
    while (x < times) {
      boeing.accelerate();
      System.out.println(boeing.getSpeed());
      if (boeing.getSpeed() > max) {
        biplane.setSpeed(biplane.getSpeed() * 2);
      } else {
        boeing.accelerate();
      }
      x++;
    }
    System.out.println(biplane.getSpeed());
  }
}
