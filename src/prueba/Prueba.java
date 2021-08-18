package prueba;
import java.util.Scanner;

public class Prueba {

    public static void main(String[] args) {
        mostrar(combinar());
    }
    
    public static double pedir(){
        Scanner leer = new Scanner(System.in);
        
        double apuesta = 1;
        //Hacemos varios bucles para pedir el dinero sin que haya errores por
        //Lo que hacemos un tratamiento de excepciones
        do{
            boolean continua;
            //El tratamiento de excepciones empieza aquí
            do{
                try{
                    continua = false;
                    System.out.print("+------------------------------------+");
                    System.out.println("\n+Apuesta Mínima de 1€ y Máxima de 50€+");
                    System.out.print("+------------------------------------+\n");
                    apuesta = leer.nextInt();
                }catch(java.util.InputMismatchException e){
                        System.out.println("Se ha introducido un carácter");
                        leer.next();
                        continua = true;
                }
            //El tratamiento de excepciones acaba aquí y empezamos a ver si
            }while(continua == true);
            
            //El valor que nos ha dado nos sirve o hay que pedirlo de nuevo
            if(apuesta < 1 || apuesta > 50)
            {
                System.out.print("Cantidad Incorrecta\n");
            }
            else
            {
                System.out.print("COMIENZA EL JUEGO\n");
            }
        }while(apuesta < 1 || apuesta > 50);
        
        return apuesta;
    }
    
    public static String[] combinar(){
        //Creamos un array con las combinaciones posibles
        String[] maquina;
            maquina = new String[6];
            maquina[0] = "Manzana";
            maquina[1] = "Naranja";
            maquina[2] = "Fresa";
            maquina[3] = "Cereza";
            maquina[4] = "Limon";
            maquina[5] = "Sandía";
            
        return maquina;
    }
    
    public static int aleatorio()
    {
        //Aquí solo creamos los números aleatorios entre 0 y 6
        int num = (int) (Math.random()*6);
        return num;
    }
    
    public static void mostrar(String[] maquina){
        //Declaramos el Scanner para leer las variables por teclado
        Scanner leer = new Scanner(System.in);
        
        //Variables
        double apuesta = pedir();
        double aux = apuesta;
        char seguir;
        
        //Metemos el array y los núemeros aleatorio para que se vayan
        //Cambiando cada vez que se repita el programa
        do{ 
            //Calculamos 3 Numeros Aleatorios
            int num1=aleatorio(), num2=aleatorio(), num3=aleatorio();
            
            //Vamos Restando 0.50€ a la apuesta cada vez que juega
            apuesta = apuesta - 0.50;

            //Mostramos la combinación
            System.out.print("\nLa Combinación es: ");
            System.out.print(maquina[num1]+" ");
            System.out.print(maquina[num2]+" ");
            System.out.print(maquina[num3]+" ");
            //Comprobamos si es el numero y le sumamos los € correspondientes
            if(num1 == 3 && num2 == 3 && num3 == 3)
            {
                System.out.print("\n---------------------------");
                System.out.println("\nHas ganado un premio de 30€");
                System.out.print("+-------------------------");
                apuesta = apuesta + 30;
            }
            else if(num1 == 5 && num2 == 5 && num3 == 5)
            {
                System.out.print("\n---------------------------");
                System.out.println("\nHas ganado un premio de 20€");
                System.out.print("---------------------------");
                apuesta = apuesta + 20;
            }
            else if(num1 == 2 && num2 == 2 && num3 == 2)
            {
                System.out.print("\n---------------------------");
                System.out.println("\nHas ganado un premio de 10€");
                System.out.print("---------------------------");
                apuesta = apuesta + 10;
            }
            else if(num1 == 0 && num2 == 0 && num3 == 0)
            {
                System.out.print("\n---------------------------");
                System.out.println("\nHas ganado un premio de 5€");
                System.out.print("---------------------------");
                apuesta = apuesta + 5;
            }
            else if(num1 == 1 && num2 == 1 && num3 == 1)
            {
                System.out.print("\n---------------------------");
                System.out.println("\nHas ganado un premio de 5€");
                System.out.print("---------------------------");
                apuesta = apuesta + 5;
            }
            else if(num1 == 4 && num2 == 4 && num3 == 4)
            {
                System.out.print("\n---------------------------");
                System.out.println("\nHas ganado un premio de 5€");
                System.out.print("---------------------------");
                apuesta = apuesta + 5;
            }
            else if(num1 == 3 && num2 == 3 || num2 == 3 && num3 == 3 || num1 == 3 && num3 == 3)
            {
                System.out.print("\n---------------------------");
                System.out.println("\nHas ganado un premio de 3€");
                System.out.print("---------------------------");
                apuesta = apuesta + 3;
            }
            else if(num1 == 5 && num2 == 5 || num2 == 5 && num3 == 5 || num1 == 5 && num3 == 5)
            {
                System.out.print("\n---------------------------");
                System.out.println("\nHas ganado un premio de 2€");
                System.out.print("---------------------------");
                apuesta = apuesta + 2;
            }
            else if(num1 == 0 && num2 == 0 || num2 == 0 && num3 == 0 || num1 == 0 && num3 == 0)
            {
                System.out.print("\n---------------------------");
                System.out.println("\nHas ganado un premio de 1€");
                System.out.print("---------------------------");
                apuesta = apuesta + 1;
            }
            else if(num1 == 1 && num2 == 1 || num2 == 1 && num3 == 1 || num1 == 1 && num3 == 1)
            {
                System.out.print("\n---------------------------");
                System.out.println("\nHas ganado un premio de 1€");
                System.out.print("---------------------------");
                apuesta = apuesta + 1;
            }
            else if(num1 == 2 && num2 == 2 || num2 == 2 && num3 == 2 || num1 == 2 && num3 == 2)
            {
                System.out.print("\n---------------------------");
                System.out.println("\nHas ganado un premio de 1€");
                System.out.print("---------------------------");
                apuesta = apuesta + 1;
            }
            else if(num1 == 4 && num2 == 4 || num2 == 4 && num3 == 4 || num1 == 4 && num3 == 4)
            {
                System.out.print("\n---------------------------");
                System.out.println("\nHas ganado un premio de 1€");
                System.out.print("---------------------------");
                apuesta = apuesta + 1;
            }

            //Mostramos el dinero que le queda
            System.out.print("\n\nTe quedan: "+apuesta+"€"+" de los "+aux+"€ que has metido");
            
            //Preguntamos si quiere seguir jugando
            //Comprobamos si el dinero que nos queda es mayor de 0.50 y si no
            //Cerramos el programa
            if(apuesta >= 0.50)
            {
                System.out.print("\n¿Quieres Seguir? (S/N)");
                seguir = leer.next().charAt(0);
                System.out.println("\n\n\n\n\n");
            }
            else
            {
                System.out.print("\nNo te quedan Créditos para seguir jugando");
                seguir = 'n';
            }
        //Si la variable es 'S' o 's' el programa sigue, sino, se cierra
        }while(seguir == 's' || seguir == 'S');
        
        //Cerramos el Programa
        System.out.println("\nHASTA LA PRÓXIMA");
    }
}