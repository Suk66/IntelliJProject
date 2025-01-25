package com.mynaruto;

public class Ninja {
    private String name;
    private int level;
    private String clan;

    public Ninja() {
    }

    public Ninja(String name, int level, String clan){
        this.name = name;
        this.level = level;
        this.clan = clan;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getClan() {
        return clan;
    }

    public void setClan(String clan) {
        this.clan = clan;
    }

    public String getLevelName(){
        switch (level) {
            case 1: return "하급닌자";
            case 2: return "중급닌자";
            case 3: return "상급닌자";
            case 4: return "아카츠키";
            case 5: return "호카케";
            default: return "미등록";
        }

    }


}
