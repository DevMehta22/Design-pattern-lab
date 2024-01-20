package builderDesign;
public class phone{
    private String os;
    private int ram;
    private String processor;
    private int battery;
    //constructor
    public phone(String os,int ram,String processor,int battery){
        super();
        this.os = os;
        this.ram=ram;
        this.processor=processor;
        this.battery=battery;
    }
    @Override
    public String toString(){
        return "Phone [OS=" + os + ", RAM=" + ram + ", Processor="+ processor + ", Battery=" + battery+"]";
    }
        
}