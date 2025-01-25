package com.mynaruto;

public class NarutoApplication {
    public static void main(String[] args) {
        // 1. 마을 생성.
        LeafVillage leafVillage = new LeafVillage();

        // 2) 닌자들 생성 (기본생성자 + setter or 오버로딩 생성)
        // === LowLvNinja (level == 1) ===
        Ninja naruto = new Ninja("Naruto", 1, "Uzumaki");
        Ninja sasuke = new Ninja("Sasuke", 1, "Uchiha");
        Ninja sakura = new Ninja("Sakura", 1, "Haruno");

        Ninja kakasi = new Ninja("Kakasi", 2, "Hatake");

        Ninja orochimaru = new Ninja("Orochimaru", 4, "Akatsuki");

        Ninja tsunade = new Ninja("Tsunade", 5, "Hokake");

        leafVillage.addNinja(naruto);
        leafVillage.addNinja(sasuke);
        leafVillage.addNinja(sakura);
        leafVillage.addNinja(kakasi);
        leafVillage.addNinja(orochimaru);
        leafVillage.addNinja(tsunade);

        System.out.println("=== LeafVillage Info ===");
        System.out.println("Village Name: " + leafVillage.getName());
        System.out.println("\n[일반 닌자 목록]");
        for (Ninja n : leafVillage.getNinjas()) {
            System.out.println("-" + n.getName() + " (Level: " + n.getLevel()
                                + ", Clan: " + n.getClan() + ")");
        }

        System.out.println("\n[우치하 일족 목록]");
        for (Ninja n : leafVillage.getUchihaClan()) {
            System.out.println("-" + n.getName() + " (Level: " + n.getLevel() + ")");
        }


    }
}
