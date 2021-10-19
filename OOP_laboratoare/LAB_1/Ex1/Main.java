package com.company;
public class Main {
    public static void main(String[] args) {
        MonObj firstMonitor = new MonObj();
        firstMonitor.color = "FFF200";
        firstMonitor.dimensions = 20.56f;
        firstMonitor.resolution = 360;
        MonObj secondMonitor = new MonObj();
        secondMonitor.color = "FFF200";
        secondMonitor.dimensions = 20.56f;
        secondMonitor.resolution = 480;
        if (firstMonitor.color == secondMonitor.color)
        {
            System.out.println("Same colors");
        } else {
            System.out.println("Different colors");
        }
        if (firstMonitor.dimensions > secondMonitor.dimensions) {
            System.out.println("First is bigger");
        } else if (firstMonitor.dimensions < secondMonitor.dimensions) {
            System.out.println("Second is bigger");
        } else {
            System.out.println("Same dimensions");
        }

        if (firstMonitor.resolution > secondMonitor.resolution) {
            System.out.println("1Res is bigger");
        } else if (firstMonitor.resolution < secondMonitor.resolution) {
            System.out.println("2Res is bigger");
        } else {
            System.out.println("REs is same");
        }
    }
}
