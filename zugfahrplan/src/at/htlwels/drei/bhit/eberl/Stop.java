package at.htlwels.drei.bhit.eberl;

import java.util.*;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.HashSet;

/**
 * Created by eberl.mar on 12.12.2016.
 */
public class Stop {
    private int Bahnsteig;
    private int Stunden;
    private int Minuten;
    private Station Bahnhof;
    private Stop stopps;
    private Train Zug;

    Stop(int bahnsteig, int stunden, int minuten, Station bahnhof, Train zug) {
        this.Bahnhof = bahnhof;
        this.Bahnsteig = bahnsteig;
        this.Stunden = stunden;
        this.Minuten = minuten;
        this.Zug = zug;

    }


    public Station getBahnhof() {return Bahnhof;}
    public void setBahnhof(Station bahnhof) {Bahnhof = bahnhof;}
    public int getBahnsteig() {
        return Bahnsteig;
    }
    public void setBahnsteig(int bahnsteig) {
        Bahnsteig = bahnsteig;
    }
    public Stop getStopps() {return stopps;}
    public void setStopps(Stop stopps) {this.stopps = stopps;}
    public int getStunden() {
        return Stunden;
    }
    public void setStunden(int stunden) {
        Stunden = stunden;
    }
    public int getMinuten() {
        return Minuten;
    }
    public void setMinuten(int minuten) {
        Minuten = minuten;
    }
    public Train getZug() {return Zug;}
    public void setZug(Train zug) {Zug = zug;}

    @Override
    public int hashCode(){
        return getBahnsteig().hashCode() + getMinuten() + getStunden();
    }

    @Override
    public boolean equals(Object o) {
        if (((o == null)) || (o.getClass() != this.getClass()))
        return false;

        else{
            Stop obj = (Stop)o;
            return ((obj.getBahnhof().equals(getBahnhof())))
                    && (obj.getStunden()==(getStunden()))
                    && (obj.getMinuten()==(getMinuten()));
        }
    }
}
