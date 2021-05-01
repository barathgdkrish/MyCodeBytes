package collectionschallenge2;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class StockList {
    private final Map<String, StockItem> list;

    public StockList() {
        this.list = new LinkedHashMap<>();
    }

    public int addStock(StockItem item) {
        if(item != null) {
            // check if already have quantities of this item
            StockItem inStock = list.getOrDefault(item.getName(), item);
            // If there are already stocks on this item, adjust the quantity
            if(inStock != item) {
                item.adjustStock(inStock.quantityInStock());
            }

            list.put(item.getName(), item);
            return item.quantityInStock();
        }
        return 0;
    }

    public int sellStock(String item) {
        StockItem inStock = list.getOrDefault(item, null);
        int QIS = inStock.quantityInStock(), QIR = inStock.getQuantityReserved();
        if((inStock != null) && (QIS-QIR >=0)) {
            inStock.adjustStock(-QIR);
            return QIS;
        }
        return -1;
    }
    
    public int reserveStock(String item, int quantity) {
        StockItem inStock = list.getOrDefault(item, null);
       if(quantity<0 && inStock.getQuantityReserved()>-quantity) {
    	   inStock.adjustReservation(quantity);
           return inStock.getQuantityReserved();
       }
        if((inStock != null) && (inStock.quantityInStock() - inStock.getQuantityReserved()>= quantity) && (quantity >0)) {
            inStock.adjustReservation(quantity);
            return inStock.getQuantityReserved();
        }
        return 0;
    }

    public StockItem get(String key) {
        return list.get(key);
    }

    public Map<String, Double> PriceList() {
        Map<String, Double> prices = new LinkedHashMap<>();
        for(Map.Entry<String, StockItem> item : list.entrySet()) {
            prices.put(item.getKey(), item.getValue().getPrice());
        }
        return Collections.unmodifiableMap(prices);
    }

    public Map<String, StockItem> Items() {
        return Collections.unmodifiableMap(list);
    }

    @Override
    public String toString() {
        String s = "\nStock List\n";
        double totalCost = 0.0;
        for (Map.Entry<String, StockItem> item : list.entrySet()) {
            StockItem stockItem = item.getValue();

            double itemValue = stockItem.getPrice() * stockItem.quantityInStock();

            s = s + stockItem + ". There are " + stockItem.quantityInStock() + " in stock";
            s+= "\nReserved count: "+stockItem.getQuantityReserved()+" Total value of items: ";
            s = s + String.format("%.2f",itemValue) + "\n";
            totalCost += itemValue;
        }

        return s + "Total stock value " + String.format("%.2f",totalCost);
    }
}
