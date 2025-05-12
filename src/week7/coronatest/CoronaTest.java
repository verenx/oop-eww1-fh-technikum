package week7.coronatest;

import java.time.LocalDate;

public class CoronaTest {
    private boolean isPositive;
    private LocalDate testDate;

    public CoronaTest(boolean isPositive, LocalDate testDate) {
        this.isPositive = isPositive;
        this.testDate = testDate;
    }

    public LocalDate getTestDate() {
        return this.testDate = testDate;
    }

    public boolean isPositive() {
        return isPositive;
    }

    public LocalDate validUntil() {
        return null;
    }

    public String outcome() {
        return null;
    }

}
