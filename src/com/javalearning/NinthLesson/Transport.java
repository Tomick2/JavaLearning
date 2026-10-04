package com.javalearning.NinthLesson;

public class Transport {
    public float maxSpeed;
    public int weight;
    public String color;
    public byte[] coordinate;

    public void setValues(float _maxSpeed, int _weight, String _color, byte[] _coordinate) {
        maxSpeed = _maxSpeed;
        weight = _weight;
        color = _color;
        coordinate = _coordinate;
    }

    public String getValues() {
        String info = "Max object's speed: " + maxSpeed + ".\nWeight: " + weight + ".\nColor: " + color + ".\n";
        String infoCoordinates = "Coordinates: ";

        for(int i = 0; i < coordinate.length; i++) {
            if(i + 1 == coordinate.length) {
                infoCoordinates += coordinate[i] + ".\n";
            } else {
                infoCoordinates += coordinate[i] + ", ";
            }
        }

        return info + infoCoordinates;
    }
}
