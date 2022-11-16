/*
Student:   Ching Chun Hung 210020835 2B
Last Edit  13/11/2022
*/
package Building;
public class Room{
    private double length;
    private double width;

    public Room(double length, double width){
        this.length = length;
        this.width = width;
    }
    public void setLength(double length){
        this.length = length;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public double getLength(){
        return length;
    }
    public double getWidth(){
        return width;
    }
    public String toString(){
        return ", Length: " + getLength() + ", Width: " + getWidth();
    }

}