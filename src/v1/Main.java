package v1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        new Main();
    }

    public Main(){
        // Version Imperativa

        // 1- Crear lista de enteros.
        List<Integer> numeros = crearLista();
        System.out.println(numeros);
        // 2- Quedarme solo con los pares.
        List<Integer> pares = filtrarPares(numeros);
        System.out.println(pares);
        // 3- Pasar los numero al cuadrado.
        List<Integer> cuadrados = elevarCuadrado(pares);
        System.out.println(cuadrados);
        // 4- Mostrar cada cuadrado por pantalla.
        List<Integer> mostrar = mostrarLista(cuadrados);
        // 5- Obtener la suma de los cuadrados.
        int total = sumarLista(mostrar);
        System.out.println("Suma Total: " + total);
    }

    private int sumarLista(List<Integer> numeros) {
        int total = 0;
        for (Integer numero : numeros){
            total += numero;
        }
        return total;
    }

    private List<Integer> mostrarLista(List<Integer> numeros) {
        for(Integer numero : numeros){
            System.out.println(numero);
        }
        return numeros;
    }

    private List<Integer> elevarCuadrado(List<Integer> numeros) {
        List<Integer> resultado = new ArrayList<>();

        for(Integer numero : numeros){
            resultado.add(numero * numero);
        }
        return resultado;
    }

    private List<Integer> filtrarPares(List<Integer> numeros) {
        List<Integer> resultado = new ArrayList<>();
        // Se recoree la lista y se agrega a la lista resultado solo los pares
        for(Integer numero : numeros){
            if(numero % 2 == 0){
                resultado.add(numero);
            }
        }
        return resultado;
    }


    private List<Integer> crearLista() {
        return List.of(0,1,2,3,5,8,13,21,34,55,89,144);
    }

}
