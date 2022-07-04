package Homework.oop_homework;

import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;

public class Customer {
    private String premium;
    private String gold;
    private String silver;

    @Getter
    public String getPremium(){
        return premium;
    }

    @Setter

    public void setPremium(String premium) {
        this.premium = premium;
    }
    @Getter
    public String getGold(){
        return gold;
    }

    @Setter

    public void setGold(String gold) {
        this.gold = gold;
    }
    @Getter
    public String getSilver(){
        return silver;
    }

    @Setter

    public void setSilver(String silver) {
        this.silver = silver;
    }
}
