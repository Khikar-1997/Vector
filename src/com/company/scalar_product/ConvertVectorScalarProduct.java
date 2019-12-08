package com.company.scalar_product;

import com.company.vectors.AbstractVector;
import com.company.vectors.Vector;

public class ConvertVectorScalarProduct implements VectorScalarProduct {
    @Override
    public AbstractVector vectorScalarProduct(AbstractVector coordinate1, AbstractVector coordinate2 , AbstractVector coordinate3) {
        double vectorScalarProduct = (coordinate2.getCoordinateX() - coordinate1.getCoordinateX()) * (coordinate3.getCoordinateX() - coordinate1.getCoordinateX()) + (coordinate2.getCoordinateY() - coordinate1.getCoordinateY()) * (coordinate3.getCoordinateY() - coordinate1.getCoordinateY()) + (coordinate2.getCoordinateZ() - coordinate1.getCoordinateZ()) * (coordinate3.getCoordinateZ() - coordinate1.getCoordinateZ());
        Vector vector = new Vector();
        vector.setVectorScalarProduct(vectorScalarProduct);
        return vector;
    }
}
