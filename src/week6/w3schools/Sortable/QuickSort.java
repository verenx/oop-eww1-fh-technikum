package week6.w3schools.Sortable;

import java.sql.Array;
import java.util.Arrays;

public class QuickSort implements Sortable {
    //private int[] array = new int[8];
    private int[] array;

    public QuickSort(int... array) {
        this.array = array;
    }

    public int[] getArray() {
        return this.array;
    }

    public void sort(int[] array){
        //sorts an array of integers in ascending order.
        //die kleinste nummer zuerst
        //die größte als letzte
        Arrays.sort(this.array);
        for (int i = 0; i < this.array.length; i++) {
            System.out.println(this.array[i]);
            }
        }

    }

  /*  public void printArray(){
        for(int i = 0; i < this.array.length; i++) {
            System.out.println(this.array[i]);
        }
    }*/





   /* Diese Methode (oder dieser Konstruktor) akzeptiert eine beliebige Anzahl von int-Werten
    und speichert sie automatisch als int[]-Array.*/
/*
    @Override*/
   /* public void sort() {
        int max = 0;
        for (int i = 0; i < array.length; i++) {

            }
        }
    }*/

