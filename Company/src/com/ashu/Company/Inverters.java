package com.ashu.Company;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Inverters extends Power_Rating {
    String Company_Name;
    String[] arr = {"PCU","GTI","Regalia","Zelio","iCruze"};
    Set<String> names = new HashSet<String>(Arrays.asList(arr));
}
