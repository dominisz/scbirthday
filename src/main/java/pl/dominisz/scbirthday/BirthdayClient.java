package pl.dominisz.scbirthday;

public class BirthdayClient {

  private final BirthdayFactory factory;

  BirthdayClient(BirthdayFactory factory) {
    this.factory = factory;
  }

  public void run() {
    Birthday myBirthday = factory.getBirthday(1965, Month.December, 28);
    Birthday otherBirthday = factory.getBirthday(2001, Month.December, 28);
    Birthday thirdBirthday = factory.getBirthday(1987, Month.April, 1);

    System.out.println("myBirthday: " + myBirthday);
    System.out.println("otherBirthday: " + otherBirthday);
    System.out.println("thirdBirthday: " + thirdBirthday);

    System.out.println(
        "myBirthday.isLaterThan(otherBirthday): " + myBirthday.isLaterThan(otherBirthday));
    System.out.println(
        "myBirthday.isLaterThan(thirdBirthday): " + myBirthday.isLaterThan(thirdBirthday));
    System.out.println(
        "otherBirthday.isLaterThan(thirdBirthday): " + otherBirthday.isLaterThan(thirdBirthday));

    System.out.println("myBirthday.isSame(otherBirthday): " + myBirthday.isSame(otherBirthday));
    System.out.println("myBirthday.isSame(thirdBirthday): " + myBirthday.isSame(thirdBirthday));
    System.out.println(
        "otherBirthday.isSame(thirdBirthday): " + otherBirthday.isSame(thirdBirthday));
  }

  public static final void main(String[] args) {
    new BirthdayClient(DateObjectAdapterFactory.INSTANCE).run();
  }
}
