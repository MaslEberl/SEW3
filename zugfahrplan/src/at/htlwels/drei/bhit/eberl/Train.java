package at.htlwels.drei.bhit.eberl;

/**
 * Created by eberl.mar on 12.12.2016.
 */

import java.util.*;
import java.lang.Comparable;

public class Train {

    private String Name;
    private Stop stopps;

    Train(String name, Stop stopp){
        this.Name = name;
        this.stopps = stopp;
    }

    Train(String name){
        this.Name = name;
    }

    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public Stop getStopps() {
        return stopps;
    }
    public void setStopps(Stop stopps) {
        this.stopps = stopps;
    }

    Train t= new Train("Westbahn");

    public void addStop(Stop stopps){
        Stop stop6= new Stop(1, 18, 47, Station.arraylist().al.get(0)[6], t);
       Timetable.Stopps().hset.add(stop6);
    }

    public void stoppAusgabe(){                //Sortiert nach Zeit!

        System.out.println(Timetable.Stopps().tset);
    }

    public void stoppAbBahnhof(){            //Sortiert nach Zeit und ab bestimmten Bahnhof


    }

    @Override
    public String toString() {
        return super.toString();
    }


}
