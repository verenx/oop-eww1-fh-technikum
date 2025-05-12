package week7.coronatest;

import java.time.LocalDate;
import java.util.ArrayList;

public class Person {
    private String name;
    private LocalDate birthday;
    private ArrayList<CoronaTest> coronaTests;

    public Person(String name, LocalDate birthday, ArrayList<CoronaTest> coronaTests) {
        this.name = name;
        this.birthday = birthday;
        this.coronaTests = coronaTests;
    }

    public String getName() {
        return this.name;
    }

    public LocalDate getBirthDate(){
        return this.birthday;
    }

    public ArrayList<CoronaTest> getTests() {
        return this.coronaTests; //das ist die ganze Array
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public void setTests(ArrayList<CoronaTest> coronaTest) {
        this.coronaTests = coronaTest;
    }

    public void lastTestBeforeDate() {
        //sortiere die arraylist nach datum
        //auf den test des letzten Datums zugreifen
        //list.sort(Comparator.comparing(Klasse::getDatum))
//        for (CoronaTest coronaTest : coronaTests) {
//            if(coronaTest.getTestDate() == )
//        }

        



    }

}
