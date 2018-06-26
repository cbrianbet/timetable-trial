package timetable;

import java.util.*;

public class Test{

    public static void main(String [] args){
        ArrayList<ClassRoom> classroom = new ArrayList<>();
        ArrayList<Lecture> lectures = new ArrayList<>();

        RoomChart tt = new RoomChart();
        tt.feedData();
    }
}