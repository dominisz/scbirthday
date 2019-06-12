package pl.dominisz.scbirthday;

public interface BirthdayFactory {
  Birthday getBirthday(int year, Month month, int day);
}
