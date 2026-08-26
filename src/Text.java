import pacage.Car;
public class Text {
    public static void main(String[] args) {
        Car car = new Car();
        car.setId(8);
        car.setFlightNumber("Arman");
        car.setAirline("Arsen Gabrielyan");
        car.setFlightType("sdfghj");
        car.setDistanse(51);
        car.setDuration(3);
        car.setTicketPrice(0);
        car.setCapacity(10);
        car.setDepartureYear(2029);
        car.setAvailable(false);
        if(car.isAvailable()){
            System.out.println("Tickets can be booked");
        }

        System.out.println(car.getId());
        System.out.println(car.getFlightNumber());
        System.out.println(car.getAirline());
        System.out.println(car.getFlightType());
        System.out.println(car.getDistanse());
        System.out.println(car.getDuration());
        System.out.println(car.getTicketPrice());
        System.out.println(car.getCapacity());
        System.out.println(car.getDepartureYear());
        System.out.println(car.isAvailable());
    }
}
