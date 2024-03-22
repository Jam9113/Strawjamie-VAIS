package com.virtualassistant;

public class Service {
    private int id;
    private String name;
    private double hourlyRate;
    private double totalHoursBilled;

    public Service(int id, String name, double hourlyRate, double totalHoursBilled) {
        this.id = id;
        this.name = name;
        this.hourlyRate = hourlyRate;
        this.totalHoursBilled = totalHoursBilled;
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public double getTotalHoursBilled() {
        return totalHoursBilled;
    }

    public void setTotalHoursBilled(double totalHoursBilled) {
        this.totalHoursBilled = totalHoursBilled;
    }

    @Override
    public String toString() {
        return "Service{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", hourlyRate=" + hourlyRate +
                ", totalHoursBilled=" + totalHoursBilled +
                '}';
    }
}
