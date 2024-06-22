package task_3;

public class Main {
	
    public static void main(String[] args) {
        Tea myTea = new Tea();
        myTea.prepareTea();
        myTea.addMilk();
        myTea.addSugar();
        myTea.tea();

        System.out.println();

        // Prepare Green Tea
        GreenTea greenTea = new GreenTea();
        greenTea.prepareTea();

        System.out.println();

        // Prepare Herbal Tea
        HerbalTea herbalTea = new HerbalTea();
        herbalTea.prepareTea();

        System.out.println();

        // Prepare Black Tea
        BlackTea blackTea = new BlackTea();
        blackTea.prepareTea();
    }
}


