package OOPPractice;

public class CarDemo {

    public static void main(String[] args) {
        CarBluePrint c1 = new CarBluePrint("Ertiga","Maruti","red");
        CarBluePrint c2 = new CarBluePrint("XUV 500","Mahindra","black");
        CarBluePrint c3 = new CarBluePrint();
        c3.setCarModel("Swift");
        c3.setCarMake("Maruti");
        c3.setCarColor("white");
        System.out.println(" Model: "+c1.getCarModel()+"\n Car Make: "+c1.getCarMake()+"\n Car Color: "+c1.getCarColor());
        System.out.println();
        System.out.println(" Model: "+c2.getCarModel()+"\n Car Make: "+c2.getCarMake()+"\n Car Color: "+c2.getCarColor());
        System.out.println();
        System.out.println(" Model: "+c3.getCarModel()+"\n Car Make: "+c3.getCarMake()+"\n Car Color: "+c3.getCarColor());
    }
}
