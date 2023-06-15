package calculadoraprofessor;
import java.util.*;

public class CalculadoraPrograma {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);

        System.out.println("Qual seu nome?");
        String nomeProfessor = teclado.nextLine();
        System.out.println("Qual seu regime de Pagamento? \nPor favor digite: \nCLT \nPJ \nHorista");
        String Regime = teclado.nextLine();

        CalcularSalario(Regime, nomeProfessor);
        teclado.close();
    }

    public static void CalcularSalario(String x, String y){

        if(x.equals("CLT")){

            System.out.println("Qual seu salário mensal?");
            Scanner teclado = new Scanner (System.in);
            int salario = teclado.nextInt();
            teclado.close();

            System.out.println("Professor: " + y + "\nSalário a receber: " + salario + " Reais");

        }

        else if(x.equals("PJ")){

            System.out.println("Qual o valor do seu contrato?");
            Scanner teclado = new Scanner (System.in);
            int salario = teclado.nextInt();
            teclado.close();

            System.out.println("Professor: " + y + "\nValor a receber: " + salario + " Reais");

        }

        else if(x.equals("Horista")){

            System.out.println("Qual o seu numero de horas trabalhados");
            Scanner teclado = new Scanner (System.in);
            int horastrab = teclado.nextInt();
            System.out.println("Qual o seu valor/hora?");
            int valorhora = teclado.nextInt();
            int salario = valorhora * horastrab;

            System.out.println("Professor: " + y + "\nValor a receber: " + salario + " Reais");

            teclado.close();

        }
    }

}
