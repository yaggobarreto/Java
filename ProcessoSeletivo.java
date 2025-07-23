public class ProcessoSeletivo {
    public static void main(String[] args) {
            analisarCanditado(1900.0);
            analisarCanditado(2200.0);
            analisarCanditado(2000.0);


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


