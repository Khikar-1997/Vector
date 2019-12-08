package com.company;

import com.company.angle_between_the_vectors.AngleBetweenTheVectors;
import com.company.angle_between_the_vectors.ConvertAngleBetweenTheVectors;
import com.company.scalar_product.ConvertVectorScalarProduct;
import com.company.scalar_product.VectorScalarProduct;
import com.company.vector_length.ConvertVectorLength;
import com.company.vector_length.VectorLength;
import com.company.vector_product_with_another_vector.ConvertVectorProductWithAnotherVector;
import com.company.vector_product_with_another_vector.VectorProductWithAnotherVector;
import com.company.vectors.AbstractVector;
import com.company.vectors.Vector;

public class Main {

    public static void main(String[] args) {
        Vector vectorCoordinate1 = new Vector(5,8,9);
        Vector vectorCoordinate2 = new Vector(6,8,15);
        Vector vectorCoordinate3 = new Vector(9,15,14);

        VectorLength convertVectorLength = new ConvertVectorLength();
        AbstractVector vectorLength = convertVectorLength.vectorLength(vectorCoordinate1,vectorCoordinate2);
        vectorLength.printVectorLength();

        VectorScalarProduct convertVectorScalarProduct = new ConvertVectorScalarProduct();
        AbstractVector vectorScalarProduct = convertVectorScalarProduct.vectorScalarProduct(vectorCoordinate1,vectorCoordinate2,vectorCoordinate3);
        vectorScalarProduct.printVectorScalarProduct();

        VectorProductWithAnotherVector convertVectorProductWithAnotherVector = new ConvertVectorProductWithAnotherVector();
        AbstractVector vectorProductWithAnotherVector = convertVectorProductWithAnotherVector.vectorProductWithAnotherVector(vectorCoordinate1,vectorCoordinate2,vectorCoordinate3);
        vectorProductWithAnotherVector.printVectorProductWithAnotherVector();

        AngleBetweenTheVectors convertAngleBetweenTheVectors = new ConvertAngleBetweenTheVectors();
        AbstractVector angleBetweenTheVectors = convertAngleBetweenTheVectors.angleBetweenTheVectors(vectorCoordinate1,vectorCoordinate2,vectorCoordinate3);
        angleBetweenTheVectors.printAngleBetweenTheVectors();

        
    }
}
