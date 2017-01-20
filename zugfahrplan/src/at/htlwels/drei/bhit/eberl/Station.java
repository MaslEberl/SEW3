package at.htlwels.drei.bhit.eberl;

/**
 * Created by eberl.mar on 12.12.2016.
 */

import java.util.*;
import java.util.ArrayList;

public class Station {

    private String Bahnhof;

    Station(String bahnhof) {

        this.Bahnhof = bahnhof;
    }

    public String getBahnhof() {
        return Bahnhof;
    }

    public void setBahnhof(String bahnhof) {
        Bahnhof = bahnhof;
    }


    public void arraylist(String Bahnhof) {
        ArrayList<String> al = new ArrayList<String>();

        al.add("Salzburg");
        al.add("Attnang");
        al.add("Wels");
        al.add("Amstaetten");
        al.add("St Poelten");
        al.add("Wien");

    }
}
