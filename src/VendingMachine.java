import java.util.*;

public class VendingMachine{
    private StateOfVendingMachine currentState;
    private final SnackDispenseHandler snackDispenser;
    private final List<Snack> snacks;
    private Snack currentSnack;

    public VendingMachine(List<Snack> snacks){
        this.snacks = snacks;
        this.currentState = new IdleState(this);
        this.snackDispenser = new SnackDispenseHandler(String.valueOf(snacks));
    }

    public void setState(StateOfVendingMachine state){
        this.currentState = state;
    }

    public void selectSnack(String snackName){
        currentSnack = findSnackByName(snackName);
        if(currentSnack != null){
            currentState.selectSnack(snackName);
        }else{
            System.out.println("Please choose available snack.");
        }
    }

    public void insertMoney(double amount){
        currentState.insertMoney(amount);
    }

    public void dispenseSnack(){
        currentState.dispenseSnack();
    }

    public Snack findSnackByName(String snackName){
        for (Snack snack : snacks){
            if(snack.getName().equalsIgnoreCase(snackName)){
                return snack;
            }
        }

        return null;
    }

    public SnackDispenseHandler getSnackDispenser(){
        return snackDispenser;
    }

    public Snack getCurrentSnack(){
        return currentSnack;
    }

    public void dispense(){
        if(currentSnack != null && currentSnack.getQuantity() > 0){
            currentSnack.decreaseQuantity();
            System.out.println(currentSnack.getName() + " dispensed.");
        }else{
            assert currentSnack != null;
            System.out.println(currentSnack.getName() + " is not in stock.");
        }
        currentSnack = null;
    }
}
