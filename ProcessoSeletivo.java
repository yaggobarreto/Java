import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        selecaoCandidato();
        
    }

    static void imprimirSelecionados (){
         String [] candidatos = {"LUIZ", "MARIA", "JOAO", "JOSE", "PEDRO"};
         System.out.println("Imprimido a lita de candidatos infromando o indice do elemento");

         for(int indice=0; indice < candidatos.length;indice++){
        //Para cada posição no array de candidatos, imprima o nome e a posição
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

            System.out.println("O candidato" +  candidato  + "Solicitou este valor de salário" + salarioPretendido);
            if (salarioBase >= salarioPretendido){
                System.out.println("O candidato" + candidato + "foi selecionado para a vaga ");
                candidatoSelecionados++;
            }

            candidatosAtual ++;

        }

            
        }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800,2200);
    }
    


    static void analisarCanditado(double salarioPretendido) {
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


