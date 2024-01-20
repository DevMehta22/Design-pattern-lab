package builderDesign;

public class phone_builder {
    private String os;
    private int ram;
    private String processor;
    private int battery;

    public phone_builder setOs(String os) {
        this.os = os;
        return this;
    }


    public phone_builder setRam(int ram) {
        this.ram = ram;
        return this;
    }

   

    public phone_builder setProcessor(String processor) {
        this.processor = processor;
        return this;
    }


    public phone_builder setBattery(int battery) {
        this.battery = battery;
        return this;
    }

    public phone getPhone(){
        return new phone(os,ram,processor,battery);
    }

}
