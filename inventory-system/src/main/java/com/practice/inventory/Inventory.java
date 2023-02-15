package com.practice.inventory;

import com.practice.inventory.enums.Builder;
import com.practice.inventory.enums.Type;
import com.practice.inventory.enums.Wood;

import java.util.LinkedList;
import java.util.List;

public class Inventory {
    private final List<Guitar> guitars;

    public Inventory() {
        guitars = new LinkedList<Guitar>();
    }

    public void addGuitars(String serialNumber, double price, Builder builder, String model, Type type, Wood backWood, Wood topWood) {
        Guitar guitar = new Guitar(serialNumber, price, builder, model, type, backWood, topWood);
        guitars.add(guitar);
    }

    public Guitar getGuitar(String serialNumber) {
        for (Guitar guitar : guitars) {
            if (guitar.getSerialNumber().equals(serialNumber)) {
                return guitar;
            }
        }
        return null;
    }

    public Guitar searchGuitar(Guitar searchGuitar) {
        for (Guitar guitar : guitars) {
            // Ignore serial number since it's unique
            // Ignore price since it's unique
            Builder builder = searchGuitar.getBuilder();
            if ((builder != null) && !builder.equals(guitar.getBuilder())) {
                continue;
            }

            String model = searchGuitar.getModel();
            if ((model != null) && (!model.equals("")) && !model.equals(guitar.getModel())) {
                continue;
            }

            Wood backwood = searchGuitar.getBackwood();
            if ((backwood != null) && !backwood.equals(guitar.getBackwood())) {
                continue;
            }

            Wood topwood = searchGuitar.getTopWood();
            if ((topwood != null) && !topwood.equals(guitar.getTopWood())) {
                continue;
            }
            return guitar;
        }
        return null;
    }

}
