package zewnetrznePrzyklady;

import java.util.Scanner;

//Stwórz nowy projekt w środowisku programistycznym, takim jak IntelliJ IDEA, Eclipse lub NetBeans.
//Utwórz klasę "Kalkulator" w projekcie.
//W klasie "Kalkulator" utwórz metody dla każdej z podstawowych operacji arytmetycznych (dodawanie, odejmowanie, mnożenie, dzielenie).
//Użyj klasy Scanner, aby pobrać od użytkownika liczby do wykonania operacji arytmetycznych.
//Napisz kod, który wyświetla menu z wyborem operacji arytmetycznych, a następnie pobiera liczby od użytkownika i wykonuje odpowiednią operację arytmetyczną.
//Wyświetl wynik operacji na ekranie.
public class Kalkulator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double liczba1, liczba2, wynik;
        int wybor;

        System.out.println("KALKULATOR");
        System.out.println("1. Dodawanie");
        System.out.println("2. Odejmowanie");
        System.out.println("3. Dzielenie");
        System.out.println("4. Mnozenie");
        System.out.println("Podaj wybor!");
        wybor = scanner.nextInt();

        System.out.println("Podaj pierwsza liczbę!: ");
        liczba1 = scanner.nextInt();

        System.out.println("Podaj druga liczbe!: ");
        liczba2 = scanner.nextInt();

        switch (wybor) {
            case 1:
                wynik = liczba1 + liczba2;
                System.out.println("Wynik dodawania: " + wynik);
                break;
            case 2:
                wynik = liczba1 - liczba2;
                System.out.println("Wynik odejmowania: " + wynik);
                break;
            case 3:
                wynik = liczba1 / liczba2;
                if (liczba1 == 0 || liczba2 == 0) {
                    System.out.println("Nie mozna dzielic przez zero!");
                } else {
                    System.out.println("Wynik dzielenia: " + wynik);
                }
                break;
            case 4:
                wynik = liczba1 * liczba2;
                System.out.println("Wynik mnozenia: " + wynik);
                break;
            default:
                System.out.println("Błędny wybor!");
                break;
        }
    }
}