public class Car implements Vehicle {

    // METODI INTERFACCIA VEHICLE
    public int nRuote;

    public void setNRuote(int numero) {

        nRuote = numero;
    }

    public int getNRuote() {

        return nRuote;
    }

    public void clacson() {
        System.out.println("Beep beep");
    }

    // METODI E PROPRIETA' CAR
    public Car(String primoColore) {
        setColore(primoColore);
    }

    private String colore;

    public void setColore(String nuovoColore) {

        colore = nuovoColore;
    }

    public String getColore() {
        return colore;
    }


}
