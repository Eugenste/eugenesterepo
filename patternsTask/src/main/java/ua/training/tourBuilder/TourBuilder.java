package ua.training.tourBuilder;


public class TourBuilder {
    private boolean includeTransfer = true;
    private TicketType ticketType = TicketType.TWO_WAYS;
    private boolean includeBooking = true;
    private long amountForInsurance = 0;

    TourBuilder setTransfer(boolean includeTransfer){
        this.includeTransfer = includeTransfer;
        return this;
    }

    TourBuilder setTicketType(TicketType ticketType){
        this.ticketType = ticketType;
        return this;
    }

    TourBuilder setBooking(boolean includeBooking){
        this.includeBooking = includeBooking;
        return this;
    }

    TourBuilder setAmountForInsurance(long amountForInsurance){
        this.amountForInsurance = amountForInsurance;
        return this;
    }

    Tour build(){
        Tour tour = new Tour();
        tour.setIncludeTransfer(includeTransfer);
        tour.setTicketType(ticketType);
        tour.setIncludeBooking(includeBooking);
        tour.setAmountForInsurance(amountForInsurance);
        return tour;
    }
}
