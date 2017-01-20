package at.htlwels.drei.bhit.eberl;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by eberl.mar on 12.12.2016.
 */
public class Timetable {
    public static void Timetable(String args[]) {

        Station Bahnhof;
        Train Zug;
        Stop[] Stopps;
    }

    public void Stopps() {
        HashSet<Stop> hset = new HashSet<Stop>();

        Stop stop1= new Stop(1, 13, 47, Station.arraylist().al.get(0)[1], Train.t);
        Stop stop2= new Stop(3, 14, 18, Station.arraylist().al.get(0)[2], Train.t);
        Stop stop3= new Stop(2, 15, 9, Station.arraylist().al.get(0)[3], Train.t);
        Stop stop4= new Stop(1, 16, 17, Station.arraylist().al.get(0)[4], Train.t));
        Stop stop5= new Stop(1, 17, 38, Station.arraylist().al.get(0)[5], Train.t);

        hset.add(stop1);
        hset.add(stop2);
        hset.add(stop3);
        hset.add(stop4);
        hset.add(stop5);

        Set<String> tset = new TreeSet<String>((Comparator<? super String>) hset);

    }
}

