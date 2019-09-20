/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padraotemplatemethod;

/**
 *
 * @author ice
 */
public class PadraoTemplateMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        AlunoUniversidade alunoUniversidade = new AlunoUniversidade();
        alunoUniversidade.setNome("Raiza");
        alunoUniversidade.setInstituicaoOrigem("UFJF - Mestrado");
        
        AlunoColegio alunoColegio = new AlunoColegio();
        alunoColegio.setNome("Rodrigo");
        alunoColegio.setInstituicaoOrigem("UFJF");
        
        System.out.println(alunoUniversidade.getDadosAluno());
        System.out.println(alunoColegio.getDadosAluno());
    }
    
}
