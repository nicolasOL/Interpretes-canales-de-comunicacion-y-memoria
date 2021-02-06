/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arem.icm.arep;

import edu.escuelaing.arem.icm.arep.LinkedList.*;

/**
 *
 * @author Nicolas Ortega
 */
public class Calculator {
    /**
     * @param in
     * @param mean
     * @return el valor calculado de la desviacion estandar
     */
    public static double standardDeviation(LinkedList<Double> in, double mean){
        double res=0;
        int size = in.size();
        if (size>1){
            res = in.stream().map(d -> Math.pow(d-mean, 2)).reduce(res, (accumulator, _item) -> accumulator + _item);
            res=res /(size-1);
            res=Math.sqrt(res);
        }
        return res;
    }
    /**
     * @param in
     * @return el valor calculado de la media
     */
    public static double mean (LinkedList<Double> in){
        double res=0;
        int size=in.size();
        //System.out.println(in.getClass().getSimpleName());
        for(Double d: in) {
            //System.out.println(d);
            res += d;
        }
        res=res/size;
        return res;
    }
}
