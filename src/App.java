import controllers.BrandController;
import models.Brand;

public class App {
    public static void main(String[] args) throws Exception {
        BrandController controller = new BrandController();
        Brand[] brands = null;
        System.out.println("Original:");
        System.out.println(brands);
        System.out.println("Ordenado Por Insertion Descendente:");
        controller.sortInsertionDesc(brands);
        System.out.println(brands);
        System.out.println("\n Buscar Marca con 6 años validos que se ordenaron de mayor a menor:");
        Brand resultado=controller.binarySearchByValidYears(brands, 6, false);
        System.out.println("Encontrada: " + resultado);
        System.out.println("Buscar marca con 9 años válidos que se ordenaron de mayor a menor:");
        Brand resultado2=controller.binarySearchByValidYears(brands, 9, false);
        System.out.println("Encontrada: " + resultado2);

    }

}
