package com.company.vector_length;

import com.company.vectors.AbstractVector;
import com.company.vectors.Vector;

public class ConvertVectorLength implements VectorLength {

    @Override
    public AbstractVector vectorLength(AbstractVector coordinate, AbstractVector coordinate1) {
        double length = Math.sqrt(Math.pow((coordinate.getCoordinateX() - coordinate1.getCoordinateX()), 2) + Math.pow((coordinate.getCoordinateY() - coordinate1.getCoordinateY()), 2) + Math.pow((coordinate.getCoordinateZ() - coordinate1.getCoordinateZ()), 2));
        Vector vector = new Vector();
        vector.setVectorLength(length);
        return vector;
    }
}
