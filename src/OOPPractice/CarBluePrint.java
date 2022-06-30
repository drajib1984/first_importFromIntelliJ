package OOPPractice;

public class CarBluePrint {

    private String carModel;
    private String carMake;
    private String carColor;

    public CarBluePrint(String carModel, String carMake, String carColor) {
        this.carModel = carModel;
        this.carMake = carMake;
        this.carColor = carColor;
    }

    public CarBluePrint() {
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getCarMake() {
        return carMake;
    }

    public void setCarMake(String carMake) {
        this.carMake = carMake;
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }
}
