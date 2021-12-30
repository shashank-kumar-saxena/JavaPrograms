package com.ashu.Company;

public class Solar_Inverter_Without_Battery extends Solar_Inverter_With_GRID_On {
    public static void Without_Battery(int i,int V)
    {
        System.out.println("Solar Inverter without Battery rating is ");
        Power_Rating.power(i,V);
    }
}
