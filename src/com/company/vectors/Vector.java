package com.company.vectors;

public class Vector extends AbstractVector {

    public Vector(double coordinateX, double coordinateY, double coordinateZ) {
        super(coordinateX, coordinateY, coordinateZ);
    }

    public Vector() {
    }

    @Override
    public void printVectorLength() {
        System.out.println("Vector length = " + getVectorLength());
    }

    @Override
    public void printVectorScalarProduct() {
        System.out.println("Vector scalar product = " + getVectorScalarProduct());
    }

    @Override
    public void printVectorProductWithAnotherVector() {
        System.out.println("Vector product with another vector = " + getVectorProductWithAnotherVector());
    }

    @Override
    public void printAngleBetweenTheVectors() {
        System.out.println("Angle between the vectors = " + getAngleBetweenTheVectors());
    }
}
