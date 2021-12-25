package ManiSoft;

public class problema3 {
    /*

    Escribir un programa utilizando Java que encuentre los dos elementos del arreglo que sumados dan 10.
    Se deben imprimir ambos números como resultado separados por un espacio (en el orden en que aparecen en el arreglo).
    Por ejemplo, para el arreglo (1,3,4,2,7,0) el resultado seria: 3 7

    Nota: Asumir que esta escribiendo el codigo dentro de una clase Main, por lo que no debe declarar la clase Main,
    pero si el metodo public static void main para ejecutar su código. Java util ya está importado, no requiere importar esta ni ninguna otra librería.
     */
    static int[] myArray = {1,3,4,2,7,0};

    public static void main (String args[]) {
        for (int i = 1 ; i < myArray.length; i++ ){
            for (int i2 = 0 ; i2 < myArray.length; i2++){
                int numero10 = myArray[i] + myArray[i2];
              if(numero10 == 10){
                  System.out.println( myArray[i] + " " + myArray[i2]);
                  i2 = myArray.length - 1;
                  i = myArray.length - 1;
              }
            }
        }
    }
}
