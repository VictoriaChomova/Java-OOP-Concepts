package Ex1;

import java.util.ArrayList;
import java.util.List;

public class Math<T extends Number> {
    public List<T> list;

    public Math() {
        list = new ArrayList<> ();
    }

    public void add (T element) {
        list.add(element);
    }


    public double sum() {
        double sum = 0.0;
        for (int i = 0; i < this.list.size (); i++) {
            sum += this.list.get (i).doubleValue ();
        }

        return sum;
    }

    public double average() {
        double sum = 0;
        for (int i = 0; i < this.list.size (); i++) {
            sum += list.get (i).doubleValue ();
        }

        double average = sum / this.list.size ();
        return average;

    }


    public double maxNum () {
        double max = this.list.get (0).doubleValue ();
        for (int i = 1; i < this.list.size (); i++) {
            if (this.list.get (i).doubleValue () > max) {
                max = this.list.get (i).doubleValue ();
            }
        }

        return max;
    }

    public double minNum () {
        double minNum = this.list.get (0).doubleValue ();
        for (int i = 0; i < this.list.size (); i++) {
            if (this.list.get (i).doubleValue () < minNum) {
                minNum = this.list.get (i).doubleValue ();
            }
        }

        return minNum;
    }




}
