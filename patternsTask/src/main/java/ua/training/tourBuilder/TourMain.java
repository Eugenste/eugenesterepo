package ua.training.tourBuilder;

public class TourMain {
    public static void main(String[] args) {
        Tour tour = new TourBuilder()
                .setTransfer(true)
                .setTicketType(TicketType.ONE_WAY)
                .setBooking(false)
                .setAmountForInsurance(2500)
                .build();

        System.out.println(tour);
    }
}
