public class WaitingForMoneyState implements StateOfVendingMachine{
    private final VendingMachine vendingMachine;

    public WaitingForMoneyState(VendingMachine vendingMachine){
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void selectSnack(String snackName){
        System.out.println("Finish current transaction.");
    }

    @Override
    public void insertMoney(double amount){
        Snack currentSnack = vendingMachine.getCurrentSnack();

        if(currentSnack != null && amount >= currentSnack.getPrice()){
            vendingMachine.setState(new DispensingSnackState(vendingMachine));
        }else{
            assert currentSnack != null;
            System.out.println("Not enough money for " + currentSnack.getName());
        }
    }

    @Override
    public void dispenseSnack(){
        System.out.println("Cannot dispense snack, not enough money has been inserted.");
    }
}
