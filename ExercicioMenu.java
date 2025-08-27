import java.util.Scanner;
public class ExercicioMenu{
    public static Scanner input = new Scanner( System.in);
    public static void main(String []argas){
        int opcao;
        do {
            System.out.println("1- Imprimir todos os numeros entre 1 e 100");
            System.out.println("2- Imprimir todos os numemeros pares entre 1 e 100");
            System.out.println("3- Impromir todos os numeros impares entre 1 e 100");
            System.out.println( "4- Sair");

            System.out.println( "Digite a sua opção");
            opcao = input.nextInt();

            switch (opcao){
                case 1:
                for (int c = 1; c <= 100; c++){
                    break;

                    case 2:
                    for ( int c = 2; c <= 100; c += 2 ){
                    break;

                    case 3:
                    for ( int c = 1; c <= 100; c += 2);
                    break;

                    case 4:
                    System.out.println("Saindo");
                    break;


                }


            }
            
        } 
        
    }
}
  
  
