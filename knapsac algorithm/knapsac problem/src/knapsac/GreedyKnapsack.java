
import java.util.Arrays;
import java.util.Comparator;

class Item {
    int weight;
    int value;

    public Item(int weight, int value) {
        this.weight = weight;
        this.value = value;
    }

    // Method to calculate value-to-weight ratio
    public double getRatio() {
        return (double) value / weight;
    }
}

// Comparator to sort items based on value-to-weight ratio in descending order
class ItemComparator implements Comparator<Item> {
    @Override
    public int compare(Item a, Item b) {
        return Double.compare(b.getRatio(), a.getRatio()); // Sort by highest ratio
    }
}

class Knapsack {
    // Greedy approach to solve the fractional knapsack problem
    public static double getMaxValue(Item[] items, int capacity) {
        Arrays.sort(items, new ItemComparator()); // Sort items by value-to-weight ratio

        double totalValue = 0.0;
        int currentWeight = 0;

        for (Item item : items) {
            if (currentWeight + item.weight <= capacity) {
                // Take the whole item
                totalValue += item.value;
                currentWeight += item.weight;
            } else {
                // Take the fraction of the item
                int remainingWeight = capacity - currentWeight;
                totalValue += item.getRatio() * remainingWeight;
                break; // Knapsack is full
            }
        }

        return totalValue;
    }
}

public class GreedyKnapsack {
    public static void main(String[] args) {
        Item[] items = {
            new Item(10, 60),
            new Item(20, 100),
            new Item(30, 120)
        };
        int capacity = 50;

        double maxValue = Knapsack.getMaxValue(items, capacity);
        System.out.println("Maximum value in Knapsack: " + maxValue);
    }
}


