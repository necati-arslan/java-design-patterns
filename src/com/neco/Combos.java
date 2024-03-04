package com.neco;

import java.util.ArrayList;
import java.util.List;

public abstract class Combos {

    protected List<RegularOrders> regularOrders = new ArrayList<>();
    public  Combos(){
        comboDetails();
    }
    protected abstract void comboDetails();
    public void printOrder(){
        System.out.printf("%-15s %10s %n","Type", "Price");
        for(int i = 0; i < regularOrders.size(); i++){
            regularOrders.get(i).printOrder();
        }
        System.out.println("___________________________ \n");
    }

}

 class LiteCombo extends Combos {
    @Override
    protected void comboDetails() {
        regularOrders.add(new Meals());
        regularOrders.add(new Beverages());

    }
}
 class FamilyCombo extends Combos {
    @Override
    protected void comboDetails() {
        regularOrders.add(new Meals());
        regularOrders.add(new Beverages());
        regularOrders.add(new Desserts());
    }
}

 class MegaCombo extends Combos {
    @Override
    protected void comboDetails() {
        regularOrders.add(new Meals());
        regularOrders.add(new Beverages());
        regularOrders.add(new Desserts());
        regularOrders.add(new Salads());
    }
}