import java.io.*;
import java.util.*;

public class Time{
  public static void main(String [] args){
    int hour=7;
    int minute=53;
    int second=10;
    int totalSecond=hour*3600+minute*60+second;
    double percentage;
    percentage=totalSecond/(24.0*3600.0)*100.0;
    int hour2=8;
    int minute2=27;
    int second2=20;
    int totalSecond2=hour2*3600+minute2*60+second2;
    System.out.println("Starting time: "+(hour+":"+minute+":"+second));
    System.out.println("Seconds since midnight: " +totalSecond);
    System.out.println("Seconds remain: "+(24*3600-totalSecond));
    System.out.println("Percentage of the day is: "+percentage);
    System.out.println("Current time: "+(hour2+":"+minute2+":"+second2));
    System.out.println("Time passed in seconds: "+(totalSecond2-totalSecond));
  }
}