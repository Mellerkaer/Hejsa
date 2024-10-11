import java.util.ArrayList;
import java.util.List;

public class System {

    static private List<Sang> sangList = new ArrayList<>();

    public static List<Sang> getSangList() {
        return sangList;
    }

    public static void setSangList(List<Sang> sangList) {
        System.sangList = sangList;
    }
}
