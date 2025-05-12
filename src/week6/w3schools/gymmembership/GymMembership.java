package week6.w3schools.gymmembership;

import java.time.LocalDate;
import java.time.Period;


public class GymMembership {
    private String name;
    private String type;
    private MembershipDuration duration;
    private LocalDate subscriptionDate;
    private double basicPrice = 42;

    public GymMembership(String name, String type, MembershipDuration duration, LocalDate subscriptionDate) {
        this.name = name;
        this.type = type;
        this.duration = duration;
        this.subscriptionDate = subscriptionDate;
    }

    public double gymFare() {
        if (this.duration.getMembershipDuration() == 3) {
            return this.basicPrice;
        } else if (this.duration.getMembershipDuration() == 6) {
            return this.basicPrice - 6;
        } else if (this.duration.getMembershipDuration() == 12) {
            return this.basicPrice - 10;
        }
        return -1;
    }

    public LocalDate getSubscriptionEnd(){
       LocalDate subscriptionEnd;
       subscriptionEnd = this.subscriptionDate.plusMonths(this.duration.getMembershipDuration());
       return subscriptionEnd;
    }

    public String checkSpecialOffers() {
        Period period = Period.between(this.subscriptionDate, LocalDate.now());
        if (period.getMonths() >= 3) {
            return "You will receive a chocolate";
        }
        return "-1";
    }


}
