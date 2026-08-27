package model;

public class Book {
    int id = 1;
    String airline = "2";
    String flightType = "DOMESTIC";
    int distanse = 50;
    int duration = 30;
    double ticketPrice = 1;
    int capacity = 1;
    int departureYear = 2026;
    boolean available = false;
    String flightNumber;
    double rating;
    int pages;
    int publishet;

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getPublishet() {
        return publishet;
    }

    public void setPublishet(int publishet) {
        this.publishet = publishet;
    }

    public int getId() {
        return id;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public void setId(int id) {
        if(id > 0){
            this.id = id;
        }
    }

    public int getCapacity() {
        return capacity;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public void setCapacity(int capacity) {
        if(capacity >= 1 && capacity <= 850){
            this.capacity = capacity;
        }
    }

    public int getDepartureYear() {
        return departureYear;
    }

    public void setDepartureYear(int departureYear) {
        if(departureYear >= 2026 && departureYear <= 2030){
            this.departureYear = departureYear;
        }
    }

    public int getDuration() {
        return duration;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(double ticketPrice) {
        if(ticketPrice > 0){
            this.ticketPrice = ticketPrice;
        }
    }

    public void setDuration(int duration) {
        if(duration >= 30 && duration <= 1500){
            this.duration = duration;
        }
    }

    public String getFlightType() {
        return flightType;
    }

    public int getDistanse() {
        return distanse;
    }

    public void setDistanse(int distanse) {
        if (distanse >= 50 && distanse <= 20000){
            this.distanse = distanse;
        }
    }

    public void setFlightType(String flightType) {
        switch (flightType) {
            case "DOMESTIC":
            case "INTERNATIONAL":
            case "CHARTER":
                this.flightType = flightType;
                break;
        }
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        if(airline.length() >= 2 && airline.length() <= 200){
            this.airline = airline;
        }
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        if (flightNumber.length() >= 2 && flightNumber.length() <= 10) {
            this.flightNumber = flightNumber;
        }
    }
}
