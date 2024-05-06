import java.util.*;

public class Driver{
    public static void main(String[] args){
        List<Snack> snacks = Arrays.asList(
                new Snack("Coke", 1.00, 2),
                new Snack("Pepsi", 1.00, 3),
                new Snack("Cheetos", 2.25, 3),
                new Snack("Doritos", 2.25, 2),
                new Snack("KitKat", 1.50, 3),
                new Snack("Snickers", 1.50, 2)
        );

        VendingMachine vendingMachine = new VendingMachine(snacks);

        String[] order = {"Coke", "Pepsi", "Cheetos", "Doritos", "KitKat"};

        for(String snackName : order){
            vendingMachine.selectSnack(snackName);
            vendingMachine.insertMoney(2.25);
            vendingMachine.dispenseSnack();

            System.out.println();
        }

        for(int i =0; i < 3; i++){
            vendingMachine.selectSnack("Snickers");
            vendingMachine.insertMoney(1.50);
            vendingMachine.dispenseSnack();
            System.out.println();
        }
    }
}