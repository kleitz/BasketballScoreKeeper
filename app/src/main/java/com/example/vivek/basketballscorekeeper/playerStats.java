package com.example.vivek.basketballscorekeeper;

import android.os.Parcelable;
import android.os.Parcel;
import android.util.Log;

/**
 * Created by vivek on 11/12/15.
 */
public class playerStats implements Parcelable {
    //*Stats*----------------------------
    String name;
    int points=0;
    int threes=0;
    int twoos=0;
    int freethrows=0;
    int fouls=0;
    int turnovers=0;

    playerStats(String nme){
        name = nme;
    }
    public void addStats (int pts, int thr, int twos, int fthrw, int foul, int tover){
        points += pts;
        threes += thr;
        twoos += twos;
        freethrows += fthrw;
        fouls += foul;
        turnovers += tover;
    }

    public void display(){
        Log.v("test", "Working");
    }

    public static final Parcelable.Creator<playerStats> CREATOR = new Creator<playerStats>() {
        public playerStats createFromParcel(Parcel source) {
            playerStats mplayerStats = new playerStats("Name");
            mplayerStats.name = source.readString();
            mplayerStats.points = source.readInt();
            mplayerStats.threes = source.readInt();
            mplayerStats.twoos = source.readInt();
            mplayerStats.freethrows = source.readInt();
            mplayerStats.fouls = source.readInt();
            mplayerStats.turnovers = source.readInt();

            return mplayerStats;
        }
        public playerStats[] newArray(int size) {
            return new playerStats[size];
        }
    };

    public int describeContents() {
        return 0;
    }
    public void writeToParcel(Parcel parcel, int flags) {
        parcel.writeString(name);
        parcel.writeInt(points);
        parcel.writeInt(threes);
        parcel.writeInt(twoos);
        parcel.writeInt(freethrows);
        parcel.writeInt(fouls);
        parcel.writeInt(turnovers);
    }
//*Stats*------------------------------
}
