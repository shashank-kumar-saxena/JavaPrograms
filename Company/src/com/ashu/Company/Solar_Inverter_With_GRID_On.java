package com.ashu.Company;

public class Solar_Inverter_With_GRID_On extends Solar_Inverter_With_Battery{
    public static void extra_energy_backup(int i,int V,int Charge)
    {
        System.out.println("Solar Inverter extra energy is ");
        Power_Rating.power(i,V);
        System.out.println("Solar Inverter extra Energy charges="+Charge);
    }
}
