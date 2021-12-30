package com.ashu.Company;

import java.util.Locale;
import java.util.Scanner;

public class Inverters_app {
    public static void main(String[] args) {
        Inverters I=new Inverters();
        Solar_Inverter_With_Battery a=new Solar_Inverter_With_Battery();
        I.Company_Name="PCU";
        if(I.Company_Name=="PCU")
        {
            Solar_Inverter_With_Battery.store(100,25);
        }
        if(I.Company_Name=="GTI")
        {
            Solar_Inverter_With_GRID_On.extra_energy_backup(10,20,500);
        }
        if(I.Company_Name=="Regalia")
        {
            Solar_Inverter_Without_Battery.Without_Battery(23,22);
        }
        if(I.Company_Name=="Zelio" || I.Company_Name=="iCruze")
        {
            Non_Solar_Inverter.Non_Solar(25,25);
        }
        if(I.Company_Name == "PCU" ||I.Company_Name=="Regalia")
        {
            Solar_Inverter.Solar_Energy();
        }
    }
}
