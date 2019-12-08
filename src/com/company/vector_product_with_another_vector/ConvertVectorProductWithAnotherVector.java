package com.company.vector_product_with_another_vector;

import com.company.vectors.AbstractVector;
import com.company.vectors.Vector;

public class ConvertVectorProductWithAnotherVector implements VectorProductWithAnotherVector {

    @Override
    public AbstractVector vectorProductWithAnotherVector(AbstractVector coordinate1, AbstractVector coordinate2, AbstractVector coordinate3) {
        double result1 = (coordinate2.getCoordinateY() - coordinate1.getCoordinateY()) * (coordinate3.getCoordinateZ() - coordinate1.getCoordinateZ()) - (coordinate2.getCoordinateZ() - coordinate1.getCoordinateZ()) * (coordinate3.getCoordinateY() - coordinate1.getCoordinateY());
        double result2 = (coordinate2.getCoordinateZ() - coordinate1.getCoordinateZ()) * (coordinate3.getCoordinateX() - coordinate1.getCoordinateX()) - (coordinate2.getCoordinateX() - coordinate1.getCoordinateX()) * (coordinate3.getCoordinateZ() - coordinate1.getCoordinateZ());
        double result3 = (coordinate2.getCoordinateX() - coordinate1.getCoordinateX()) * (coordinate3.getCoordinateY() - coordinate1.getCoordinateY()) - (coordinate2.getCoordinateY() - coordinate1.getCoordinateY()) * (coordinate3.getCoordinateX() - coordinate1.getCoordinateX());
        double vectorProductWithAnotherVector = Math.abs(result1 + result2 + result3);
        Vector vector = new Vector();
        vector.setVectorProductWithAnotherVector(vectorProductWithAnotherVector);
        return vector;
    }
}
