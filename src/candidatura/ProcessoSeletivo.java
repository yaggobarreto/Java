package candidatura;

import java.util.concurrent.ThreadLocalRandom;


public class ProcessoSeletivo {
    public static void main(String[] args){
    }

    static void selecaoCandidatos (){
        String [] candidatos = {"FELIPE", "JULIA", "LARISSA", "MARIA","JOSE", "AUGUSTO", "CALLERI","CLARA", "LUIZ", "LIMA"};

        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados <5) {
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPredendido();

            System.out.println("O candidato" + candidato + "Solicitou este valor de salário " +salarioPretendido);
            
            if(salarioBase >= salarioPretendido)
                System.out.println("O candidato" + candidato + "O candidato foi selecionado para a vaga " );
                candidatosSelecionados++;
            }

            candidatosAtual++;
        
        }
    }

    static double valorPredendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO");
        
        }else if (salarioBase == salarioPretendido)
        System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA"); 
        else{
            System.out.println("AGURADANDO O RESULTADO DOS DEMAIS CANDIDATOS");
        }
        {
            
        }
    }
}
