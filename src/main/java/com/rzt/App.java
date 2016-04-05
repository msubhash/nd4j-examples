package com.rzt;
import org.nd4j.linalg.api.buffer.DataBuffer;
import org.nd4j.linalg.api.ndarray.INDArray;
import org.nd4j.linalg.factory.Nd4j;


public class App 
{

public static void multiplyMatrix(int size) {
        System.out.println("size = " + size);
        INDArray arr = Nd4j.ones(size, size).muli(1000);
        INDArray arr2 = Nd4j.ones(size, size).muli(5000);
        long start = System.nanoTime();
        arr.mmul(arr2);
        long end = System.nanoTime();
        System.out.println("runtime = " + (end-start) + " nano seconds");
}

public static void main(String[] args) {	
	multiplyMatrix(1000);	
    }

}
