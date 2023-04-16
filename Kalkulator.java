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









}
}