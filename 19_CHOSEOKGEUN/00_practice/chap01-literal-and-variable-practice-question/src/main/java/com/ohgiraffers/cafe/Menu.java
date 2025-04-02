package com.ohgiraffers.cafe;

import java.util.ArrayList;

public class Menu {
    private ArrayList<MenuItem> items = new ArrayList<>();

    public Menu() {
        items.add(new MenuItem("아메리카노", 3000));
        items.add(new MenuItem("라떼", 3500));
        items.add(new MenuItem("카페 모카", 4000));
    }
    public void showMenu() {
        System.out.println("\n--- 메뉴 ---");
        for (int i = 0; i < items.size(); i++) {
            System.out.println((i + 1) + ". " + items.get(i).name + " - " + items.get(i).price + "원");
        }
    }
    public MenuItem getItem(int index) {
        if (index >= 0 && index < items.size()) {
            return items.get(index);
        }
        return null;
    }

    public int size() {
        return items.size();
    }
}
