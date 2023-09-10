import org.junit.Assert;
import org.junit.Test;

public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        return checkLengthMoreThanThree() && checkNoSpacesAtStartOrEnd() ? true : false;
    }
    public boolean checkLengthMoreThanThree() {
        return name.length()>3 ? true : false;
    }
    public boolean checkNoSpacesAtStartOrEnd () {
        return name.startsWith(" ") || name.endsWith(" ") ? false : true;
    }






}