import java.util.Arrays;
import java.util.List;

public class SnackDispenseHandler{
    private final List<String> snackNames;
    private int currentIndex;

    public SnackDispenseHandler(String... snackNames){
        this.snackNames = Arrays.asList(snackNames);
        this.currentIndex = 0;
    }

    public void handleSnackRequest(String snackName){
        int index = snackNames.indexOf(snackName);

        if(index != -1){
            currentIndex = index;
        }
    }
}
