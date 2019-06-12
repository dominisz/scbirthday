package pl.dominisz.scbirthday;

public interface Birthday {
  int getYear();

  Month getMonth();

  int getDay();

  boolean isLaterThan(Birthday other); // refers to year, month, and day

  boolean isSame(Birthday other); // refers to month and day only
}
