package greedy;

import java.util.Comparator;
import java.util.List;

class Activity{
    int start,finish;
    Activity(int start,int finish){
        this.start=start;
        this.finish=finish;
    }
}
public class Activity_selection_prob {
    static class ActivityComparator implements Comparator<Activity>{
        public int compare(Activity a1,Activity a2){
            //sort according to finish time
            return a1.finish - a2.finish;//ascending order
        }
    }
    static void printMaxActivites(List<Activity> activities){
        activities.sort(new ActivityComparator());
        int lastSelected =0;
        System.out.println("("+activities.get(lastSelected).start+","+activities.get(lastSelected).finish+")");

    }
}
