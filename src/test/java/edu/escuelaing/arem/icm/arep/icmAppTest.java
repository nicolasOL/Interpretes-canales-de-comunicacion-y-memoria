/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arem.icm.arep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Nicolas Ortega
 */
public class icmAppTest {
    
    /**
     * Test of mean method for dataset 1, of class icmApp.
     */
    @Test
    public void testMeanDataset1() {
        try{
           System.out.println("mean");
            String data = "160%20591%20114%20229%20230%20270%20128%201657%20624%201503";
            URL url = new URL("https://icm-arep.herokuapp.com/calcMean?list=" + data);
            URLConnection urlConnection = url.openConnection();
            BufferedReader read = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
            String inputLine = read.readLine();
            System.out.println(inputLine);
            assertTrue(inputLine.equals("550.6"));
            read.close();  
        }catch (Exception e){
            System.out.println("ERROR");
        }
         
    }

    /**
     * Test of std method for dataset 1, of class icmApp.
     */
    @Test
    public void testStdDataset1(){
        try{
            System.out.println("std");
            String data = "160%20591%20114%20229%20230%20270%20128%201657%20624%201503";
            URL url = new URL("https://icm-arep.herokuapp.com/calcStdDev?list=" + data);
            URLConnection urlConnection = url.openConnection();
            BufferedReader read = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
            String inputLine = read.readLine();
            System.out.println(inputLine);
            assertTrue(inputLine.equals("572.026844746915"));
            read.close();
        }catch (Exception e){
            System.out.println("ERROR");
        }
         
    }
    
    /**
     * Test of mean method for dataset 2, of class icmApp.
     */
    @Test
    public void testMeanDataset2(){
        try{
           System.out.println("mean");
            String data = "15.0%2069.9%206.5%2022.4%2028.4%2065.9%2019.4%20198.7%2038.8%20138.2";
            URL url = new URL("https://icm-arep.herokuapp.com/calcMean?list=" + data);
            URLConnection urlConnection = url.openConnection();
            BufferedReader read = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
            String inputLine = read.readLine();
            System.out.println(inputLine);
            assertTrue(inputLine.equals("60.32000000000001"));
            read.close();  
        }catch (Exception e){
            System.out.println("ERROR");
        }
        
    }

    /**
     * Test of std method for dataset 2, of class icmApp.
     */
    @Test
    public void testStdDataset2(){
        try{
            System.out.println("std");
            String data = "15.0%2069.9%206.5%2022.4%2028.4%2065.9%2019.4%20198.7%2038.8%20138.2";
            URL url = new URL("https://icm-arep.herokuapp.com/calcStdDev?list=" + data);
            URLConnection urlConnection = url.openConnection();
            BufferedReader read = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
            String inputLine = read.readLine();
            System.out.println(inputLine);
            assertTrue(inputLine.equals("62.25583060601187"));
            read.close();
        }catch (Exception e){
            System.out.println("ERROR");
        }
        
    }
    
    /**
     * Test of mean method for dataset 3, of class icmApp.
     */
    @Test
    public void testMeanDataset3(){
        try{
           System.out.println("mean");
            String data = "186%20699%20132%20272%20291%20331%20199%201890%20788%201601";
            URL url = new URL("https://icm-arep.herokuapp.com/calcMean?list=" + data);
            URLConnection urlConnection = url.openConnection();
            BufferedReader read = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
            String inputLine = read.readLine();
            System.out.println(inputLine);
            assertTrue(inputLine.equals("638.9"));
            read.close();  
        }catch (Exception e){
            System.out.println("ERROR");
        }
        
    }

    /**
     * Test of std method for dataset 3, of class icmApp.
     */
    @Test
    public void testStdDataset3(){
        try{
            System.out.println("std");
            String data = "186%20699%20132%20272%20291%20331%20199%201890%20788%201601";
            URL url = new URL("https://icm-arep.herokuapp.com/calcStdDev?list=" + data);
            URLConnection urlConnection = url.openConnection();
            BufferedReader read = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
            String inputLine = read.readLine();
            System.out.println(inputLine);
            assertTrue(inputLine.equals("625.6339806770231"));
            read.close();
        }catch (Exception e){
            System.out.println("ERROR");
        }
        
    }
    
}
