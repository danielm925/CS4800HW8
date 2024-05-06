public class IdleState implements StateOfVendingMachine{
    private final VendingMachine vendingMachine;

    public IdleState(VendingMachine vendingMachine){
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void selectSnack(String snackName){
        SnackDispenseHandler dispenser = vendingMachine.getSnackDispenser();

        dispenser.handleSnackRequest(snackName);
        vendingMachine.setState(new WaitingForMoneyState(vendingMachine));
    }

    @Override
    public void insertMoney(double amount){
        System.out.println("Choose snack before inserting money.");
    }

    @Override
    public void dispenseSnack(){
        System.out.println("Cannot dispense, snack has not been chosen.");
    }
}
