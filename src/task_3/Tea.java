package task_3;

// Superclass for preparing tea
public class Tea {
    // Method for preparing tea
    public void prepareTea() {
        System.out.println("The Water gets boiled");
        System.out.println("Tea leaves are added to boiled water");
    }

    // Method to add milk
    public void addMilk() {
        System.out.println("Milk is added");
    }

    // Method to add sugar
    public void addSugar() {
        System.out.println("Sugar is added");
    }

    // Method to indicate basic tea preparation
    public void tea() {
        System.out.println("Basic Tea is Prepared");
    }
}

// Subclass for preparing green tea
class GreenTea extends Tea {
    @Override
    public void prepareTea() {
        System.out.println("Preparing Green Tea...");
        System.out.println("1. Heat water to around 80°C (not boiling).");
        System.out.println("2. Add green tea leaves to a teapot.");
        System.out.println("3. Pour the hot water into the teapot.");
        System.out.println("4. Steep for 2-3 minutes.");
        System.out.println("5. Strain the tea into a cup.");
        System.out.println("Green Tea is ready!");
    }
}

// Subclass for preparing herbal tea
class HerbalTea extends Tea {
    @Override
    public void prepareTea() {
        System.out.println("Preparing Herbal Tea...");
        System.out.println("1. Boil water.");
        System.out.println("2. Add herbal tea blend (such as chamomile, mint, etc.) to a teapot.");
        System.out.println("3. Pour boiling water into the teapot.");
        System.out.println("4. Steep for 5-7 minutes.");
        System.out.println("5. Strain the tea into a cup.");
        System.out.println("Herbal Tea is ready!");
    }
}

// Subclass for preparing black tea
class BlackTea extends Tea {
    @Override
    public void prepareTea() {
        System.out.println("Preparing Black Tea...");
        System.out.println("1. Boil water.");
        System.out.println("2. Add black tea leaves to a teapot.");
        System.out.println("3. Pour boiling water into the teapot.");
        System.out.println("4. Steep for 3-5 minutes.");
        System.out.println("5. Strain the tea into a cup.");
        System.out.println("6. Optionally, add milk and sugar to taste.");
        System.out.println("Black Tea is ready!");
    }
}

// Main class in seperate class

