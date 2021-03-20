package ru.netology.service;

import ru.netology.model.PurchaseItem;
import ru.netology.util.PriceAscComparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class CartService {
    private final List<PurchaseItem> items = new ArrayList<>();

    public void add(PurchaseItem item){
        items.add(item);
    }

    public List<PurchaseItem> sortedBy(Comparator<PurchaseItem> comparator){
        List<PurchaseItem> result = new LinkedList<>(items);
        result.sort(comparator);
        return result;
    }

 //   public void removeByItem(int itemId) {
 //       @Override
 //       public boolean test(PurchaseItem) {
 //           return false;
 //       }
  //  });

    public void removeByItemId(int itemId){
        items.removeIf(o -> o.getItemId() == itemId);
    }

    public void changeCount(int itemId, int count) {
        trow new UnsupportedOperftionException();
    }
}


