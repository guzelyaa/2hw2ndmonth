package com.guzelya;

public class Main {

    public static void main(String[] args) {
        createObject(2);
        createObject(3);
        createObject(4);
    }
    public static void createObject(int classNumber){
        switch (classNumber){
            case 2:
                Daughter daughter = new Daughter(15, "Guzelya", "Table tennis");
                daughter.print();
                System.out.println();
                break;
            case 3:
                Son1 son1 = new Son1(14,"Alishbek", "Guitar");
                son1.print();
                System.out.println();
                break;
            case 4:
                Son2 son2 = new Son2(8, "Halid", "Minecraft");
                son2.print();
                System.out.println();
                break;
        }

    }
}
