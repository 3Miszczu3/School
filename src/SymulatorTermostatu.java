import java.util.Scanner;

public class SymulatorTermostatu {
    public static void main(String[] args) {
        Termostat termostat = new Termostat();
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Podaj aktualną temperaturę pomieszczenia: ");
            double aktualnaTemperatura = scanner.nextDouble();
            termostat.ustawAktualnaTemperatura(aktualnaTemperatura);

            System.out.print("Podaj docelową temperaturę: ");
            double ustawionaTemperatura = scanner.nextDouble();
            termostat.ustawUstawionaTemperatura(ustawionaTemperatura);

            termostat.sprawdzTemperature();

            System.out.print("Czy chcesz kontynuować (T/N)? ");
        } while (scanner.next().equalsIgnoreCase("T"));
    }
}