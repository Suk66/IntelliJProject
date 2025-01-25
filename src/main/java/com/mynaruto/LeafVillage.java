package com.mynaruto;

import java.util.ArrayList;
import java.util.List;

public class LeafVillage {

    private String name;
    private List<Ninja> ninjas;
    private List<Ninja> uchihaClan;

    // 기본생성자
    public LeafVillage() {
        // 기본 값 초기화
        this.name = "Hidden Leaf Village";
        this.ninjas = new ArrayList<>();
        this.uchihaClan = new ArrayList<>();

    }

    // 인자생성자.


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Ninja> getNinjas() {
        return ninjas;
    }

    public void setNinjas(List<Ninja> ninjas) {
        this.ninjas = ninjas;
    }

    public List<Ninja> getUchihaClan() {
        return uchihaClan;
    }

    public void setUchihaClan(List<Ninja> uchihaClan) {
        this.uchihaClan = uchihaClan;
    }

    // 닌자마을 추가 메서드
    public void addNinja(Ninja ninja) {
        if("Uchiha".equalsIgnoreCase(ninja.getClan())) {
            uchihaClan.add(ninja);
        } else {
            ninjas.add(ninja);
        }

    }

}
