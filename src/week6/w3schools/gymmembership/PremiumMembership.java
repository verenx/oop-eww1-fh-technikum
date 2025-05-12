package week6.w3schools.gymmembership;

import java.time.LocalDate;

public class PremiumMembership extends GymMembership {
    private boolean personalTrainerAvailability;
    private boolean spaAccess;

    public PremiumMembership(String name, String type, MembershipDuration duration, LocalDate subscriptionDate, boolean personalTrainerAvailability, boolean spaAccess) {
        super(name, type, duration, subscriptionDate);
        this.personalTrainerAvailability = personalTrainerAvailability;
        this.spaAccess = spaAccess;
    }

    public double withTrainer(double basicPrice){
        if (personalTrainerAvailability == true) {
            return basicPrice * 1.5;
        }
        return -1;
    }

//    public double withSpa(double basicPrice){
//        return basicPrice * 1.2;
//    }
//
//    public double withBoth(double basicPrice) {
//        return basicPrice * 1.8;
//    }


}
