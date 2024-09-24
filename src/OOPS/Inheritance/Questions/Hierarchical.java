package OOPS.Inheritance.Questions;

class Electronic{
    protected String name;
    protected int year;

    public Electronic(String name, int year){
        this.name = name;
        this.year = year;
    }

    public void startMachine()
    {
        System.out.println("Vehicle starts engine");
    }

    public void stopMachine()
    {
        System.out.println("Vehicle stops engine");
    }

    public void machineDetails()
    {
        System.out.println("Machine Name : " + name+"\n" + "Year : " + year);
    }
}

class WashingMachine extends Electronic{

    private String companyName;

    public WashingMachine(String name, int year , String companyName){
        super(name, year);
        this.companyName = companyName;
    }

    public void WashingMachineDetails()
    {
        System.out.println("Company Name : " + companyName+"\n" + "Year : " + year);
    }
}

class Speaker extends Electronic{
    private String speakerName;
    public Speaker(String name, int year , String speakerName){
        super(name, year);
        this.speakerName = speakerName;
    }

    public void speakerDetails()
    {
        System.out.println("Company Name : " + speakerName+"\n" + "Year : " + year);
    }
}

public class Hierarchical {
    public static void main(String[] args) {
        WashingMachine obj = new WashingMachine("Washing Machine", 2015, "LG");
        obj.machineDetails();
        obj.startMachine();
        obj.stopMachine();


        Speaker obj2 = new Speaker("Speaker", 2015, "Boat");
        obj2.speakerDetails();
        obj2.startMachine();
        obj2.stopMachine();

    }
}
