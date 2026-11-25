/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package pm_prova2;
import pm_prova2.Plano;

import java.util.List;
import java.util.Scanner;

import pm_prova2.Atividade;
import pm_prova2.StatusAtividade;
import pm_prova2.StatusPlano;
import pm_prova2.PlanoFunções;
/**
 *
 * @author 1635579
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    private static final Scanner SC = new Scanner(System.in);
    private static final PlanoFunções plano = new PlanoFunções();

    public static void main(String[] args) {
        plano.cadastrarAtividade(new Musculacao());
        plano.cadastrarAtividade(new Natacao());
        plano.cadastrarAtividade(new Spinning());
        plano.cadastrarPlano(new PlanoBasico());
        plano.cadastrarPlano(new PlanoPremium());
    
    int opcao;
        do {
            System.out.println("""

                    - ACADEMIA -
                    1 - Associar atividades a um plano
                    2 - Exibir todas as atividades cadastradas
                    3 - Exibir todos os planos cadastrados
                    4 - Exibir apenas planos ativos
                    5 - Emitir certificado para objetos que implementam a interface Certificavel
                    6 - Registrar presença em atividades que implementam a interface ControladorPresenca
                    7 - Remover atividades inativas do sistema
                    0 - Sair
                        
           """);
            opcao = lerInt("Opcao: ");
            try {
                executar(opcao);
            } catch (RuntimeException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        } while (opcao != 0);
       }



       private static void executar(int opcao) {

       }

       private static int lerInt(String mensagem) {
            System.out.print(mensagem);
            try {
                return Integer.parseInt(SC.nextLine().trim());
            } catch (NumberFormatException e) {
                return -1;
            }
        }

}
