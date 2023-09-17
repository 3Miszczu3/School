import java.util.Scanner;

class Termostat {
    private double aktualnaTemperatura;
    private double ustawionaTemperatura;
    private boolean ogrzewanieWlaczone;
    private boolean chlodzenieWlaczone;

    public Termostat() {
        this.aktualnaTemperatura = 20.0; // Początkowa temperatura
        this.ustawionaTemperatura = 20.0; // Początkowa ustawiona temperatura
        this.ogrzewanieWlaczone = false;
        this.chlodzenieWlaczone = false;
    }

    public void ustawAktualnaTemperatura(double temperatura) {
        this.aktualnaTemperatura = temperatura;
    }

    public void ustawUstawionaTemperatura(double temperatura) {
        this.ustawionaTemperatura = temperatura;
    }

    public void wlaczOgrzewanie() {
        ogrzewanieWlaczone = true;
    }

    public void wlaczChlodzenie() {
        chlodzenieWlaczone = true;
    }

    public void wylaczOgrzewanie() {
        ogrzewanieWlaczone = false;
    }

    public void wylaczChlodzenie() {
        chlodzenieWlaczone = false;
    }

    public void sprawdzTemperature() {
        System.out.println("Aktualna temperatura: " + aktualnaTemperatura + "°C");
        System.out.println("Ustawiona temperatura: " + ustawionaTemperatura + "°C");

        while (aktualnaTemperatura != ustawionaTemperatura) {
            if (aktualnaTemperatura < ustawionaTemperatura) {
                System.out.println("Włączanie ogrzewania.");
                wlaczOgrzewanie();
                wylaczChlodzenie();
                aktualnaTemperatura += 0.5;
            } else {
                System.out.println("Włączanie chłodzenia.");
                wlaczChlodzenie();
                wylaczOgrzewanie();
                aktualnaTemperatura -= 0.5;
            }
            System.out.println("Aktualna temperatura: " + aktualnaTemperatura + "°C");
        }

        System.out.println("Temperatury są już zrównane. Wyłącz ogrzewanie i chłodzenie.");
        wylaczOgrzewanie();
        wylaczChlodzenie();
    }
}


