/* 
File: App.java
Author: Sangare F. Felisha
Copyright: 2022, Sangare F. Felisha
Group: SZOFT II N
Date: 2022-10-25
Github: https://github.com/fe-ktch/J-namifesz
Licenc: GNU GPL
*/

import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Sangare F. Felisha, SZOFT II N, 2022-10-25");
        Nyilvantarto nyilvantarto = new Nyilvantarto();
        ArrayList<String> Names = nyilvantarto.getNames();
        for(String name : Names) {
            System.out.println(name);
        }
    }
}