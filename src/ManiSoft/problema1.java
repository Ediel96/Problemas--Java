package ManiSoft;

public class problema1 {

    static int[] myArray = {1,2,1,3,3,1,2,1,5,1};

    public static void main (String args[]) {

        int numeroMayor = 0;

        //define le numero mayor
        for (int i = 0; i < myArray.length; i++) {
            int posicionMas = i + 1;
            if ( posicionMas <= myArray.length  && myArray[i] >= numeroMayor){
                numeroMayor = myArray[i];
            }
        }

        //Cuenta cuanto numero repetidos hay de rango que tiene
        for(int i = 1 ; i <= numeroMayor; i++ ){
            System.out.print(i+":");
            for (int i2 = 0 ; i2 < myArray.length; i2++){
                int numeroActual = myArray[i2];
                if (i == numeroActual){
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
    }

}
