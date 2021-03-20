package ru.netology.util;

import ru.netology.model.PurchaseItem;

import java.util.Comparator;

public class PriceAscComparator implements Comparator<PurchaseItem> {
    @Override
    public int compare(PurchaseItem o1, PurchaseItem o2) {
        return o1.getItemPrice() - o2.getItemPrice();
    }
}
