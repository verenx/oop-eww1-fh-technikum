package week6.w3schools.gymmembership;

public enum MembershipDuration {
    SHORT(3),
    MIDDLE(6),
    LONG(12);

   private final int months;

   MembershipDuration(int months){
       this.months = months;
   }

   public int getMembershipDuration(){
       return this.months;
   }
}
