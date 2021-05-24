package modelo.dto;

import java.util.Objects;

public class Cuenta implements Comparable<Cuenta>{
    // id INTEGER PRIMARY KEY AUTOINCREMENT,
    //        first_name TEXT,
    //        last_name TEXT,
    //        iban TEXT,
    //        saldo REAL
    private int id;
    private String firstName;
    private String lastName;
    private String iban;
    private double saldo;

    public Cuenta(int id, String firstName, String lastName, String iban, double saldo) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.iban = iban;
        this.saldo = saldo;
    }

    public Cuenta(String firstName, String lastName, String iban, double saldo) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.iban = iban;
        this.saldo = saldo;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return String.format("%d,%S,%S,%s,%.2f", id, firstName, lastName, iban, saldo  );
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cuenta cuenta = (Cuenta) o;
        return iban.equals(cuenta.iban);
    }

    @Override
    public int hashCode() {
        return Objects.hash(iban);
    }


    @Override
    public int compareTo(Cuenta cuenta) {
        return (int) (this.saldo *100 - cuenta.saldo * 100);
    }
}
