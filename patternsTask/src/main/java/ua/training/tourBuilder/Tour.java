package ua.training.tourBuilder;

public class Tour {
    private boolean includeTransfer;
    private TicketType ticketType;
    private boolean includeBooking;
    private long amountForInsurance;

    public void setIncludeTransfer(boolean includeTransfer) {
        this.includeTransfer = includeTransfer;
    }

    public void setTicketType(TicketType ticketType) {
        this.ticketType = ticketType;
    }

    public void setIncludeBooking(boolean includeBooking) {
        this.includeBooking = includeBooking;
    }

    public void setAmountForInsurance(long amountForInsurance) {
        this.amountForInsurance = amountForInsurance;
    }

    @Override
    public String toString() {
        return "Tour{" +
                "includeTransfer=" + includeTransfer +
                ", ticketType=" + ticketType +
                ", includeBooking=" + includeBooking +
                ", amountForInsurance=" + amountForInsurance +
                '}';
    }
}
