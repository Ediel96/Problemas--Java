package ManiSoft;

public class problemaNumero2 {
    /*

    Tiene un arreglo (llamado myArray) con 10 elementos (enteros en el rango de 1 a 9).
    Escriba un programa en Java que imprima el numero que tiene mas ocurrencias seguidas
    en arreglo y también imprimir la cantidad de veces que aparece en la secuencia.

    El código que llena el arreglo ya esta escrito, pero puede editarlo para probar con otros
    valores. Con el botón de refrescar puede recuperar el valor original que sera utilizado para
    evaluar la pregunta como correcta o incorrecta durante la ejecución.

    Su programa debe analizar el arreglo de izquierda a derecha para que en caso de que dos números
    cumplan la condición, el que aparece por primera vez de izquierda a derecha será el que se imprimirá.
    La salida de los datos para el arreglo en el ejemplo (1,2,2,5,4,6,7,8,8,8) sería la siguiente:
    Longest: 3
    Number: 8

    En el ejemplo, la secuencia mas larga la tiene el numero 8 con una secuencia de tres ochos seguidos.
    Tenga en cuenta que el código que escriba debe imprimir los resultados exactamente como se muestra con el
    fin de que la pregunta sea considerada válida.

    El código para declarar y poblar myArray ya está ahí, puede editarlo para probar con otros valores y puede
    hacer clic en el botón de actualizar junto a él para volver al valor original que se utilizará para
    validar su código durante la prueba.

    Nota: Asumir que esta escribiendo el codigo dentro de una clase Main, por lo que no debe
    declarar la clase Main, pero si el metodo public static void main para ejecutar su código.
    Java util ya está importado, no requiere importar esta ni ninguna otra librería
     */

    static int[] myArray = {1,2,2,4,5,6,7,8,8,8};
    public static void main (String args[]) {

        //define le numero mayor
        int numeroMayor = 0;
        for (int i = 0; i < myArray.length; i++) {
            int posicionMas = i + 1;
            if ( posicionMas <= myArray.length  && myArray[i] >= numeroMayor){
                numeroMayor = myArray[i];
            }
        }

        int cantidad = 0;
        for(int i = 0 ; i < myArray.length; i++ ){
            int numeroActual = myArray[i];
            if( numeroActual == numeroMayor ){
                cantidad = cantidad + 1;
            }
        }

        System.out.println("Longest: "  + cantidad);
        System.out.println("Number: "  + numeroMayor);
    }


}
