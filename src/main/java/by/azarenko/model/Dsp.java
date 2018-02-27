package by.azarenko.model;

import com.sun.javafx.beans.IDProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "dsp")
public class Dsp {
    @Id
    @Column(name = "number")
    private int numder;
    @Column(name = "name")
    private String name;
    @Column(name = "x")
    private int x;
    @Column(name = "y")
    private int y;
    @Column(name = "count")
    private double count;
    @Column(name = "edgeX")
    private int edgeX;
    @Column(name = "edgeY")
    private int edgeY;
    @Column(name = "countEdge")
    private double countEdge;
    @Column(name = "countSM")
    private double countSM;

    @Override
    public String toString() {
        return "Dsp{" +
                "numder=" + numder +
                ", name='" + name + '\'' +
                ", x=" + x +
                ", y=" + y +
                ", count=" + count +
                ", edgeX=" + edgeX +
                ", edgeY=" + edgeY +
                ", countEdge=" + countEdge +
                ", countSM=" + countSM +
                '}';
    }

    public int getNumder() {
        return numder;
    }

    public void setNumder(int numder) {
        this.numder = numder;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getEdgeX() {
        return edgeX;
    }

    public void setEdgeX(int edgeX) {
        this.edgeX = edgeX;
    }

    public int getEdgeY() {
        return edgeY;
    }

    public void setEdgeY(int edgeY) {
        this.edgeY = edgeY;
    }

    public double getCountEdge() {
        return countEdge;
    }

    public void setCountEdge(int countEdge) {
        this.countEdge = countEdge;
    }

    public double getCountSM() {
        return countSM;
    }

    public void setCountSM(int countSM) {
        this.countSM = countSM;
    }
}
