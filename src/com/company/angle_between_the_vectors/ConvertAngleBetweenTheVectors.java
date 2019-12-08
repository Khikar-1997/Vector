package com.company.angle_between_the_vectors;

import com.company.vectors.AbstractVector;
import com.company.vectors.Vector;

public class ConvertAngleBetweenTheVectors implements AngleBetweenTheVectors {


    @Override
    public AbstractVector angleBetweenTheVectors(AbstractVector coordinate1, AbstractVector coordinate2, AbstractVector coordinate3) {
        double vectorScalarProduct = (coordinate2.getCoordinateX() - coordinate1.getCoordinateX()) * (coordinate3.getCoordinateX() - coordinate1.getCoordinateX()) + (coordinate2.getCoordinateY() - coordinate1.getCoordinateY()) * (coordinate3.getCoordinateY() - coordinate1.getCoordinateY()) + (coordinate2.getCoordinateZ() - coordinate1.getCoordinateZ()) * (coordinate3.getCoordinateZ() - coordinate1.getCoordinateZ());
        double vectorLength1 = Math.sqrt(Math.pow((coordinate2.getCoordinateX() - coordinate1.getCoordinateX()), 2) + Math.pow((coordinate2.getCoordinateY() - coordinate1.getCoordinateY()), 2) + Math.pow((coordinate2.getCoordinateZ() - coordinate1.getCoordinateZ()), 2));
        double vectorlength2 = Math.sqrt(Math.pow((coordinate3.getCoordinateX() - coordinate1.getCoordinateX()), 2) + Math.pow((coordinate3.getCoordinateY() - coordinate1.getCoordinateY()), 2) + Math.pow((coordinate3.getCoordinateZ() - coordinate1.getCoordinateZ()), 2));
        double angleBetweenTheVectors = vectorScalarProduct / (Math.abs(vectorLength1) * Math.abs(vectorlength2));
        Vector vector = new Vector();
        vector.setAngleBetweenTheVectors(angleBetweenTheVectors);
        return vector;
    }
}
