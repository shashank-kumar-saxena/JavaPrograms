package com.ashu.Company;

public class Solar_Inverter_With_Battery extends Inverters {
    public static void store(int i,int V) {
        System.out.println("Energy that is produced is stored in battery of solar Inverter");
        Power_Rating.power(i,V);
    }
}
