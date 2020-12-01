package codeexercise;

import java.util.LinkedList;
import java.util.Queue;

public class recentCounter {
    // create a Queue
    private Queue<Integer> q;

    public recentCounter() {
        // initialise the Queue using a LinkedList
        q = new LinkedList<>();
    }

    public int ping(int t) {

        // add the item to the Queue
        q.add(t);

        // check if the front item is less than the item minus 3000 (our max)
        while(q.peek() < t - 3000) {
            // remove the item from the Queue
            q.poll();
        }

        // report the size back
        return q.size();

    }
}
