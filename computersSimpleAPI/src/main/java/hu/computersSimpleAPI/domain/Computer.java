package hu.computersSimpleAPI.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Computer {
    @Id
    @GeneratedValue
    private int serial;
    private String manufacturer;
    private int ram;
    private String madein;

    public Computer(int serial, String manufacturer, int ram, String madein) {
        this.serial = serial;
        this.manufacturer = manufacturer;
        this.ram = ram;
        this.madein = madein;
    }

    public Computer() {
    }

    public int getSerial() {
        return serial;
    }

    public void setSerial(int serial) {
        this.serial = serial;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getMadein() {
        return madein;
    }

    public void setMadein(String madein) {
        this.madein = madein;
    }
}
