# Design patterns - Birthday

Zadanie na podstawie http://www-home.fh-konstanz.de/~haase/lehre/patterns/exercises/exercise4.pdf

## Zadanie

W projekcie znajdują się:
* interfejs `Birthday` zawiera metody do pobierania daty urodzenia oraz metody pomocnicze,
* interfejs `BirthdayFactory` to fabryka służąca do tworzenia obiektów `Birthday`,
* klasa `BirthdayClient` wykorzystuje `BirthdayFactory` do utworzenia kilku obiektów `Birthday` oraz porównania ich.

Należy wykorzystać Javową klasę `GregorianCalendar` i utworzyć z niej implementację interfejsu `Birthday`. Konieczna będzie klasa adaptera.

* Zaimplementować `DateObjectAdapter`, który dostosowuje klasę `GregorianCalendar` do interfejsu `Birthday`,
* Zaimplementować `DateObjectAdapterFactory`, który implementuje `BirthdayFactory`,
* Uruchomić `BirthdayClient`.