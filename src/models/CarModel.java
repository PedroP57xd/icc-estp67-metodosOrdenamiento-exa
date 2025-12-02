package models;

import java.util.Arrays;

public class CarModel  {
  private String model;
  private CarYear[] carYear;
  public CarModel() {
  }
  public CarModel(String model, CarYear[] carYear) {
    this.model = model;
    this.carYear = carYear;
  }
  public String getModel() {
    return model;
  }
  public void setModel(String model) {
    this.model = model;
  }
  public CarYear[] getCarYear() {
    return carYear;
  }
  public void setCarYear(CarYear[] carYear) {
    this.carYear = carYear;
  }
  @Override
  public String toString() {
    return "CarModel [model=" + model + ", carYear=" + Arrays.toString(carYear) + "]";
  } 

  
}