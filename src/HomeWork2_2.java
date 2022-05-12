import java.time.Year;

public class HomeWork2_2 {
    public static void main(String[] args) {
        Popugai popugai1 = new Popugai();
        popugai1.setName("Кеша");
        popugai1.setColor("Красный");
        popugai1.setYear(20);
        popugai1.setCanSay(true);
        popugai1.SpeakPopugai();
        Popugai popugai2 = new Popugai();
        popugai2.setName("Паша");
        popugai2.setColor("Красно-Жёлтый");
        popugai2.setYear(2);
        popugai2.setCanSay(false);
        popugai2.SpeakPopugai();
    }
}

class Popugai {
    private String name;
    private String color;
    private int year;
    private boolean canSay;

    public void SpeakPopugai() {
        System.out.println("-------------------------------------");
        System.out.println("Попугай " + getName() + "\nЦвет:" + getColor() + "\nВозраст:" + getYear() + "\nУмение разговаривать:"+booleanCanSay());

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year>0 && year<50) {
            this.year = year;
        }
    }

    public boolean isCanSay() {
        return canSay;
    }

    public void setCanSay(boolean canSay) {
        this.canSay = canSay;
    }

    public String booleanCanSay() {
        String booleancansay;
        this.canSay = isCanSay();
        if (canSay) {
            booleancansay = "есть";
        } else {
            booleancansay = "нету";
        }
        return booleancansay;
    }
}
class Dog{
    String breed;
    String name;


}

