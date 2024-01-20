package defaultpackage;

import com.phone.os;
import com.phone.OperatingSystemFactory;

public class factoryMain{
    public static void main(String args[]){
        OperatingSystemFactory osf = new OperatingSystemFactory();
        os obj = osf.getInstance("Closed");
        obj.spec();
    }
}