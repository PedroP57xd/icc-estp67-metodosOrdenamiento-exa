package controllers;

import models.Brand;

public class BrandController {

  public Brand[] sortInsertionDesc(Brand[] brands) {

    for (int i = 1; i < brands.length; i++) {
      int aux = brands[i].getTotalValidYears();
      Brand auxB = brands[i];
      int j = i - 1;
      while (j >= 0 && brands[j].getTotalValidYears() < aux) {
        brands[j + 1] = brands[j];
        j--;

      }
      brands[j + 1] = auxB;

    }
    return brands;
  }

  public Brand binarySearchByValidYears(Brand[] brands, int validYears, boolean isAscending) {
    
    int inicio=0;
    int fin=brands.length-1;

    for (int i = 0; i < brands.length; i++) {
      int medio=(inicio);
      if (brands[medio].getTotalValidYears()==validYears) {
        return brands[medio];
      }else if (brands[medio].getTotalValidYears()<validYears) {
        inicio=medio+1;
      }else{
        fin=medio-1;
      }
    }
    
    
    return null;
  }

}
