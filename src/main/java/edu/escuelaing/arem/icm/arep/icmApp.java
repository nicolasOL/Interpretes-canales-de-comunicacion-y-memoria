/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arem.icm.arep;

import static spark.Spark.*;
import edu.escuelaing.arem.icm.arep.LinkedList.*;
import spark.QueryParamsMap;
import edu.escuelaing.arem.icm.arep.Calculator;

/**
 *
 * @author Nicolas Ortega
 */
public class icmApp {
    public static void main(String[] args) {
		port(getPort());
		staticFileLocation("public");
		mean();
                std();
		
	}

	/**
	 * @return retorna el el puerto desde el entorno del sistema operativo
	 */
	public static int getPort() {
		if (System.getenv("PORT") != null) {
			return Integer.parseInt(System.getenv("PORT"));
		}
		return 4567; // returns default port if heroku-port isn't set
	}
        
        /**
         * Calcula la media de un str de con la lista de numeros
         */
        public static void mean(){
            get("/calcMean", (req, res) -> {
			QueryParamsMap map = req.queryMap();
			try {
				String lista = map.get("list").value();
				String[] listaNumerosArray = lista.split(" ");
				LinkedList<Double> listaLinked = new LinkedList<>();
				for (String number : listaNumerosArray) {
					listaLinked.add(Double.parseDouble(number));
				}
				return Calculator.mean(listaLinked);
			} catch (NumberFormatException e) {
				return "Error: " + e.getMessage();
			}
		});
        }
        /**
         * Calcula la desviacion de un str de con la lista de numeros
         */
        public static void std(){
            get("/calcStdDev", (req, res) -> {
			QueryParamsMap map = req.queryMap();
			try {
				String lista = map.get("list").value();
				String[] listaNumerosArray = lista.split(" ");
				LinkedList<Double> listaLinked = new LinkedList<Double>();
				for (String number : listaNumerosArray) {
					listaLinked.add(Double.parseDouble(number));
				}
                                double mean = Calculator.mean(listaLinked);
				return Calculator.standardDeviation(listaLinked, mean);
			} catch (Exception e) {
				return "Error: " + e.getMessage();
			}
		});
        }
        
}
