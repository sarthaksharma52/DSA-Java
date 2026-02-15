package SystemDesign;
import java.util.*;

class RideSharingSystem {
    Queue<Integer> r;
    Queue<Integer> d;
    public RideSharingSystem() {
        r = new LinkedList<>();
        d = new LinkedList<>();
    }
    
    public void addRider(int riderId) {
        r.add(riderId);
    }
    
    public void addDriver(int driverId) {
        d.add(driverId);
    }
    
    public int[] matchDriverWithRider() {
        int[] match = new int[2];
        if(!r.isEmpty() && !d.isEmpty()){
            match[0] = d.poll();
            match[1] = r.poll();
        }
        else{
            match[0] = -1;
            match[1] = -1;
            return match;
        }

        return match;
    }
    
    public void cancelRider(int riderId) {
        if(r.contains(riderId)){
            r.remove(riderId);
        }
    }
}

/**
 * Your RideSharingSystem object will be instantiated and called as such:
 * RideSharingSystem obj = new RideSharingSystem();
 * obj.addRider(riderId);
 * obj.addDriver(driverId);
 * int[] param_3 = obj.matchDriverWithRider();
 * obj.cancelRider(riderId);
 */