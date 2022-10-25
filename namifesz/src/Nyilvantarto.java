/* 
File: Nyilvantarto.java
Author: Sangare F. Felisha
Copyright: 2022, Sangare F. Felisha
Group: SZOFT II N
Date: 2022-10-25
Github: https://github.com/fe-ktch/J-namifesz
Licenc: GNU GPL
*/

import java.util.ArrayList;
import java.util.Arrays;

public class Nyilvantarto implements Nev {
 
    @Override
    public ArrayList<String> getNames() {
        String[] names = {"Béla", "Géza"};
        ArrayList<String> nameList = 
        new ArrayList<>(Arrays.asList(names));  
        return nameList;
    }
}