import java.util.ArrayList;
//import java.util.Collection;
import java.util.Collections;

import knapsac.FKPcomparator;
import knapsac.iteamvalue;

public class Main {
    public static void main(String[] args) throws Exception {
        ArrayList<iteamvalue> iteamvalues = new ArrayList<>();

        iteamvalue iteamvalue1 = new iteamvalue();
        iteamvalue1.setObject(2);
        iteamvalue1.setProfit(5);
        iteamvalue1.setWeight(1);

        iteamvalue iteamvalue2 = new iteamvalue();
        iteamvalue2.setObject(1);
        iteamvalue2.setProfit(12);
        iteamvalue2.setWeight(3);

        iteamvalue iteamvalue3 = new iteamvalue();
        iteamvalue3.setObject(3);
        iteamvalue3.setProfit(16);
        iteamvalue3.setWeight(4);

        iteamvalue iteamvalue4 = new iteamvalue();
        iteamvalue4.setObject(4);
        iteamvalue4.setProfit(7);
        iteamvalue4.setWeight(2);

        iteamvalue iteamvalue5 = new iteamvalue();
        iteamvalue5.setObject(6);
        iteamvalue5.setProfit(11);
        iteamvalue5.setWeight(4);

        iteamvalue iteamvalue6 = new iteamvalue();
        iteamvalue6.setObject(7);
        iteamvalue6.setProfit(6);
        iteamvalue6.setWeight(3);

        iteamvalue iteamvalue7 = new iteamvalue();
        iteamvalue7.setObject(5);
        iteamvalue7.setProfit(9);
        iteamvalue7.setWeight(9);

        iteamvalues.add(iteamvalue1);
        iteamvalues.add(iteamvalue2);
        iteamvalues.add(iteamvalue3);
        iteamvalues.add(iteamvalue4);
        iteamvalues.add(iteamvalue5);
        iteamvalues.add(iteamvalue6);
        iteamvalues.add(iteamvalue7);

        Collections.sort(iteamvalues, new FKPcomparator());
        double totalvalue = 0;
        int capacity = 15;
        for (iteamvalue i : iteamvalues) {
            int value1 = (int) i.getWeight();
            int value2 = (int) i.getProfit();
            

            if (capacity>=value1) {
                capacity -= value1;
                totalvalue += value2;
                
            }

            else {
                // double remainingWeight = capacity;

                totalvalue += ((double) capacity / value1) * value2;


                break; // Knapsack is full
            }
        }
        System.out.println("maxvalue="+totalvalue);

    }
        

        
    }
