import java.util.Scanner;
import java.io.File;

class ProductSumNoHashMap {

    public static void main(String[] args) {

        File f1 = new File("please input file path here");
        Scanner inp;
        String dl;

        String[] productNames = {"Product A", "Product B", "Product C", "Product D"};
        double[] totals = {0, 0, 0, 0};

        try {
            inp = new Scanner(f1);
            dl = inp.nextLine();

            while (inp.hasNextLine()) {
                dl = inp.nextLine();
                if (dl.trim().length() == 0) continue;

                String[] parts = dl.split("\t");
                String prodName = parts[1];
                double qty = Double.parseDouble(parts[3]);
                double uPrice = Double.parseDouble(parts[2]);
                double amt = qty * uPrice;

                for (int i = 0; i < productNames.length; i++) {
                    if (productNames[i].equals(prodName)) {
                        totals[i] += amt;
                        break;
                    }
                }
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Product wise Total Sale (No HashMap)");
        for (int i = 0; i < productNames.length; i++) {
            System.out.println(productNames[i] + " --- " + totals[i]);
        }
    }
}
