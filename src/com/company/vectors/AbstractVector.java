package com.company.vectors;

public abstract class AbstractVector implements PrintVectorLength, PrintVectorScalarProduct, PrintVectorProductWithAnotherVector, PrintAngleBetweenTheVectors {
    private double coordinateX;
    private double coordinateY;
    private double coordinateZ;
    private double vectorLength;
    private double vectorScalarProduct;
    private double vectorProductWithAnotherVector;
    private double angleBetweenTheVectors;

    public AbstractVector(double coordinateX, double coordinateY, double coordinateZ) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
        this.coordinateZ = coordinateZ;
    }

    public AbstractVector() {
    }

    //region Getter and setter
    public double getVectorLength() {
        return vectorLength;
    }

    public void setVectorLength(double vectorLength) {
        this.vectorLength = vectorLength;
    }

    public double getCoordinateX() {
        return coordinateX;
    }

    public void setCoordinateX(double coordinateX) {
        this.coordinateX = coordinateX;
    }

    public double getCoordinateY() {
        return coordinateY;
    }

    public void setCoordinateY(double coordinateY) {
        this.coordinateY = coordinateY;
    }

    public double getCoordinateZ() {
        return coordinateZ;
    }

    public void setCoordinateZ(double coordinateZ) {
        this.coordinateZ = coordinateZ;
    }

    public double getVectorScalarProduct() {
        return vectorScalarProduct;
    }

    public void setVectorScalarProduct(double vectorScalarProduct) {
        this.vectorScalarProduct = vectorScalarProduct;
    }

    public double getVectorProductWithAnotherVector() {
        return vectorProductWithAnotherVector;
    }

    public void setVectorProductWithAnotherVector(double vectorProductWithAnotherVector) {
        this.vectorProductWithAnotherVector = vectorProductWithAnotherVector;
    }

    public double getAngleBetweenTheVectors() {
        return angleBetweenTheVectors;
    }

    public void setAngleBetweenTheVectors(double angleBetweenTheVectors) {
        this.angleBetweenTheVectors = angleBetweenTheVectors;
    }
    //endregion
}
