package knapsac;

import java.util.Comparator;

public class FKPcomparator implements Comparator<iteamvalue> {

    @Override
    public int compare(iteamvalue a, iteamvalue b) {
        double r1 = (double) a.getProfit() / a.getWeight();
        double r2 = (double) b.getProfit() / b.getWeight();
        return Double.compare(r2, r1); // Sort by highest profit/weight
    }

}
