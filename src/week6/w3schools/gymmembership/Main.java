package week6.w3schools.gymmembership;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        GymMembership m1 = new GymMembership("Dimcho", "basic", MembershipDuration.MIDDLE, LocalDate.of(2025, 4, 25));
        PremiumMembership p1 = new PremiumMembership("Luisa", "withTrainer", MembershipDuration.LONG, LocalDate.of(2024,12,23), true, false);
        System.out.println("Your monthly basic fare: " + m1.gymFare());


        double p1Fare= p1.withTrainer(p1.gymFare());
        System.out.println("Your monthly premium fare: " + p1Fare);

        System.out.println(m1.getSubscriptionEnd());

        System.out.println(p1.checkSpecialOffers());

    }

}
