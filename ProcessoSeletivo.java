import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        String [] candidatos = {"LUIZ", "MARIA", "JOAO", "JOSE", "PEDRO"};
        for(String candidato: candidatos) {
            System.out.println("Candidato: " + candidato);
        }
    }

    static void entrandoEmContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if(continuarTentando)
                tentativasRealizadas++;
                else
                System.out.println("CONTATO REALIZADO COM SUCESSO");
        }while(continuarTentando && tentativasRealizadas<3);

        if(atendeu)
        System.out.println("CONSEGUIMOS ");

    }
    //Metodo auxiliar 
    static boolean atender() {
        return new Random().nextInt(3) == 1;
    }

    static void imprimirSelecionados (){
         String [] candidatos = {"LUIZ", "MARIA", "JOAO", "JOSE", "PEDRO"};
        System.out.println("Imprimindo a lista de candidatos informando o índice do elemento:");


         for(int indice=0; indice < candidatos.length;indice++){
            System.out.println("O candidato de n" + indice + "é" + candidatos[indice]);
        
         }

         System.out.println("Forma abrevida de interação for each ");

         for(String candidato: candidatos) {
            System.out.println("O candidato selecionado foi" + candidato);
         }
    }

    static void selecaoCandidato() {
        String [] candidatos = {"LUIZ", "MARIA", "JOAO", "JOSE", "PEDRO", "LIVIA", "MARCIA", "CALLERI", "VITORIA", "MARIANA"};
        
        int candidatoSelecionados = 0;
        int candidatosAtual=0;
        double salarioBase=2000.0;
        while (candidatoSelecionados <5 && candidatosAtual < candidatos.length) { 
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " solicitou este valor de salário: " + salarioPretendido);
            if (salarioBase >= salarioPretendido){
                System.out.println("O candidato "  + candidato  +  " foi selecionado para a vaga.");
                candidatoSelecionados++;
            }

            candidatosAtual ++;

        }

            
        }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800,2200);
    }
    


    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("Ligar para o candidato");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("Ligar para o candidato com contra proposta");
        } else {
            System.out.println("Aguardando o resultado dos demais candidatos");
        }
    }
    
}


