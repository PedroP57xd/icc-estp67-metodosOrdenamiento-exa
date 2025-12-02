package models;

import java.util.Arrays;

public class brand {
  private String brandName;
  private CarModel[] carModel;

  public brand() {
  }

  public brand(String brandName, CarModel[] carModel) {
    this.brandName = brandName;
    this.carModel = carModel;
  }

  public int getTotalVAlidYear(CarYear[] caryear) {
    int count=0;
    CarYear carYear2=new CarYear();
    for (int i = 0; i < caryear.length; i++) {
      if (carYear2.isValid()) {
        count++;
      } 
    }
    return count;
  }

  public String getbrandName() {
    return brandName;
  }

  public void setbrandName(String brandName) {
    this.brandName = brandName;
  }

  public CarModel[] getCarModel() {
    return carModel;
  }

  public void setCarModel(CarModel[] carModel) {
    this.carModel = carModel;
  }

  @Override
  public String toString() {
    return "brand [brandName=" + brandName + ", carModel=" + Arrays.toString(carModel) + "]";
  }

}
