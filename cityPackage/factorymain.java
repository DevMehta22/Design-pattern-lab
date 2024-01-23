package cityPackage;

import cityInfo.State;
import cityInfo.cityFactory;

public class factorymain {
    public static void main(String[] args) {
        cityFactory cf = new cityFactory();
        State st = cf.getInstance("Ahmedabad");
        st.state();
    }
}
