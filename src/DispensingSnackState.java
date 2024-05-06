public class DispensingSnackState implements StateOfVendingMachine{
    private final VendingMachine vendingMachine;

    public DispensingSnackState(VendingMachine vendingMachine){
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void selectSnack(String snackName){
        System.out.println("Please wait, currently dispensing " + vendingMachine.getCurrentSnack().getName());
    }

    @Override
    public void insertMoney(double amount){
        System.out.println("Please wait, currently dispensing");
    }

    @Override
    public void dispenseSnack(){
        vendingMachine.dispense();
        vendingMachine.setState(new IdleState(vendingMachine));
    }
}