
public class Main {
    public static void main(String[] args) {
//#1 Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
//Pista: Los números inferiores a 0 son negativos y los superiores, positivos.


        System.out.println(" Condicional:");


        Integer numeroIf = 0;
        if (numeroIf < 0) {
            System.out.println(" es negativo.");
        } else if (numeroIf > 0) {
            System.out.println(" es posiivo.");

        } else {
            System.out.println(" es 0.");
        }

//#2 Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile sea inferior a 3, el bloque de código que tendrá el bucle deberá:
//
//Incrementar el valor de la variable en uno cada vez que se ejecute.
//
//Mostrarlo por pantalla cada vez que se ejecute

        System.out.println(" While:");

        Integer numeroWhile = 0;

        while (numeroWhile < 3) {
            numeroWhile++;
            System.out.println(numeroWhile);
        }




        /* Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo se debe ejecutar una vez.*/

        System.out.println(" Do While:");

        Integer numeroDoWhile = 0;

        do {
            numeroDoWhile++;
            System.out.println(numeroDoWhile);
            numeroDoWhile = 3; // para que se rompa el bucle
        } while (numeroDoWhile < 3);


        /*Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0 y su condición será que la variable sea igual o menor que 3, se irá incrementando en 1 su valor cada vez que se ejecute y deberá mostrarse por pantalla.

         */
        System.out.println(" For:");

        for (int numeroFor = 0; numeroFor < 3; numeroFor++) {
            System.out.println(numeroFor);
        }

        /*Por último, para el Switch, deberás crear la variable estacion, y distintos case para las cuatro estaciones del año. Dependiendo del valor de la variable estacion se deberá mandar un mensaje por consola informando de la estación en la que está. También habrá que poner un default para cuando el valor de la variable no sea una estación */

        System.out.println(" Switch:");


        String estacion = "verano";
        switch (estacion) {
            case "verano":
                System.out.println("es verano");
                break;
            case "invierno":
                System.out.println("es invierno");
                break;
            case "primavera":
                System.out.println("es primavera");
                break;
            case "otoño":
                System.out.println("es otoño");
                break;
            default:
                System.out.println("no es una estacion");

        }

    }
}