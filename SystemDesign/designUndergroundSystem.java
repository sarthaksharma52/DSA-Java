package SystemDesign;
import java.util.*;

class checkIn{
    String stationName;
    int t;

    checkIn(String stationName,int t){
        this.stationName = stationName;
        this.t = t;
    }
}

class UndergroundSystem {
    Map<Integer,checkIn> mapData;
    Map<String,int[]> checkData;
    public UndergroundSystem() {
        mapData = new HashMap<>();
        checkData = new HashMap<>();
    }
    
    public void checkIn(int id, String stationName, int t) {
        checkIn data = new checkIn(stationName,t);
        mapData.put(id,data);
    }
    
    public void checkOut(int id, String stationName, int t) {
        checkIn data = mapData.get(id);
        mapData.remove(id);

        String station = data.stationName + "_" + stationName;
        int timeTaken = t-data.t;

        int[] data1 = new int[2];
        
        checkData.putIfAbsent(station,data1);

        checkData.get(station)[0] += timeTaken;
        checkData.get(station)[1] += 1;
    }
    
    public double getAverageTime(String startStation, String endStation) {
        String name = startStation + "_" + endStation;

        int[] stats = checkData.get(name);
        double ans = (double)stats[0]/stats[1];
        return ans;
    }
}

/**
 * Your UndergroundSystem object will be instantiated and called as such:
 * UndergroundSystem obj = new UndergroundSystem();
 * obj.checkIn(id,stationName,t);
 * obj.checkOut(id,stationName,t);
 * double param_3 = obj.getAverageTime(startStation,endStation);
 */