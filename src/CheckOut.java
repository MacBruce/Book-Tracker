import java.util.ArrayList;
import java.util.HashMap;

public class CheckOut {
    // see if currently checkedout
    private static boolean isCheckedOut;
    // dynamic arr with dict, when & who checked out
    private static ArrayList<HashMap<String, String>> CheckOutHistory = new ArrayList<>();
    private static String dateCheckedOutLast;
    private static String whoCheckedOutLast;

    public static void checkBookOut(HashMap<String, String> item) {
        //if hashmap is not empty
        if (item.size() > 0) {
            isCheckedOut = true;
            CheckOutHistory.add(item);
        }
        // else show error


    }

    public static void setDateCheckedOutLast(){
        int lengthOfHistory = CheckOutHistory.size();
        dateCheckedOutLast = CheckOutHistory.get(lengthOfHistory - 1).toString();
    }

    public static String getDateCheckedOutLast() {
        return "";
    }





}
