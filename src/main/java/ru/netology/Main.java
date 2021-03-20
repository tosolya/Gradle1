package ru.netology;

import lombok.val;
import ru.netology.model.PurchaseItem;
import ru.netology.service.CartService;
import ru.netology.util.PriceAscComparator;

public class Main {
    public static void main(String[] args) {

        CartService service = new CartService();
        service.add(new PurchaseItem(1, 1_000, 1));
        service.add(new PurchaseItem(2, 4_000, 4));
        service.add(new PurchaseItem(3, 6_000, 1));
        service.add(new PurchaseItem(4, 7_000, 9));
        service.add(new PurchaseItem(5, 9_000, 1));
        service.add(new PurchaseItem(6, 8_000, 10));

        System.out.println(service.sortedBy((o1, o2) -> o1.getItemPrice() - o2.getItemPrice()));
    }

//  1-й вариант     System.out.println(service.sortedBy(new PriceAscComparator()));
        // }
//2-й локальные классы - т.е внутри определенных методов мы можем объявлять классы
        //     class LocalPriceAscComparator implements Comparator<PuchaseItem>{
        //       @Override
        //     public int compare(PurchaseItem o1, PurchaseItem o2) {
        //       return o1.getItemPrice() - o2.getItemPrice();
        // }
        //}

        //       System.out.println(service.sortedBy(new LocalPriceAscComparator()));
        //  }
        // 3-й анонимные классы
        //       Comparator<PuchaseItem> comparator = new Comparator<PuchaseItem>() {
        //           @Override
        //           public int compare(PurchaseItem o1, PurchaseItem o2) {
        //      return o1.getItemPrice() - o2.getItemPrice();
        //           }
        //       };
        //      System.out.println(service.sortedBy(comparator);
        //  }

//4-й  System.out.println(service.sortedBy(;
//      new Comparator<PuchaseItem>() {
//            @Override
        //           public int compare(PurchaseItem o1, PurchaseItem o2) {
        //               return o1.getItemPrice() - o2.getItemPrice();
        //           }
        //       };
        //       ));
//    }

        // Лямбда выражение
        //    System.out.println(service.sortedBy((PurchaseItem o1, PurchaseItem o2) -> {
        //                   return o1.getItemPrice() - o2.getItemPrice();
        //                 }));

//храним лямбду в переменной
//       Comparator<PurchaseItem> purchaseItemComparator= (PurchaseItem o1, PurchaseItem o2) -> {
        //          return o1.getItemPrice() - o2.getItemPrice();
        //    };

// упрощаем выражение, убираем типы, т.к. компилятор уже знает про них
        //       System.out.println(service.sortedBy(( o1, o2) -> {
        //           return o1.getItemPrice() - o2.getItemPrice();
        //       }));

        // итоговая лямбда функция


// еще один варинат написания выражения и после него с помощью идеии вернуться к лямбде
//       System.out.println(service.sortedBy(new Comparator<PurchaseItem>() {
//           @Override
//           public int compare(PurchaseItem o1, PurchaseItem o2) {
        //              return o1.getItemPrice() - o2.getItemPrice();
        //          }
//       })); //дальше из этого можно перейти в выражение итоговой лямбды


// усложненный вариант в Java уже можно использовать ссылки на некоторые методы,это вызов статического метода Comparator,
// а в скобочках передается ссылка на метод getItemPrice
        //  System.out.println(service.sortedBy(Comparator.comparingInt(PurchaseItem::getItemPrice)));
//}

