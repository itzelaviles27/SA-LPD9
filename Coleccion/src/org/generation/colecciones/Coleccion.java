package org.generation.colecciones;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Coleccion {
	public static void main(String[] args) {
		//String String porque son dos strings, palabra en español e ingles
        Map<String, String> diccionario = new HashMap<>();
        //Agregan palabras
        diccionario.put("casa", "house");
        diccionario.put("perro", "dog");
        diccionario.put("gato", "cat");
        diccionario.put("árbol", "tree");
        diccionario.put("sol", "sun");
        diccionario.put("luna", "moon");
        diccionario.put("amor", "love");
        diccionario.put("agua", "water");
        diccionario.put("fuego", "fire");
        diccionario.put("libro", "book");
        diccionario.put("computadora", "computer");
        diccionario.put("manzana", "apple");
        diccionario.put("naranja", "orange");
        diccionario.put("amarillo", "yellow");
        diccionario.put("rojo", "red");
        diccionario.put("verde", "green");
        diccionario.put("azul", "blue");
        diccionario.put("blanco", "white");
        diccionario.put("negro", "black");
        diccionario.put("gris", "gray");
        //Se le pregunta al usuario por la palabra y se pasa a minusculas
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa una palabra en español:");
        String palabra = scanner.nextLine().toLowerCase();
        //Se checa que la palabra este en el diccionario
        if (diccionario.containsKey(palabra)) {
            System.out.println("La palabra en inglés es: " + diccionario.get(palabra));
        } else {
            System.out.println("La palabra no se encuentra en el diccionario.");
            scanner.close();
        }
    }
	
}
