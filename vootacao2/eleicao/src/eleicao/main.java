package eleicao;
import javax.swing.JOptionPane;
public class main {
		    public static void main(String[] args) {
		    	
     int qtdCandidatos = Integer.parseInt(
	 JOptionPane.showInputDialog("Qual a quantidade de candidatos?")
		        );
		     String[] candidatos = new String[qtdCandidatos];
		        int[] votos = new int[qtdCandidatos];

		        for (int i = 0; i < qtdCandidatos; i++) {
		            candidatos[i] = JOptionPane.showInputDialog("Digite o nome do candidato " + (i + 1) + ":");
		        }

		        int qtdEleitores = Integer.parseInt(
		            JOptionPane.showInputDialog("Informe a quantidade de eleitores:")
		        );

		       
		        String menuVotacao = "ESCOLHA SEU CANDIDATO:\n";
		        for (int i = 0; i < qtdCandidatos; i++) {
		            menuVotacao += (i + 1) + " - " + candidatos[i] + "\n";
		        }

		        for (int i = 1; i <= qtdEleitores; i++) {
		            int voto = Integer.parseInt(
		                JOptionPane.showInputDialog("ELEITOR " + i + ", " + menuVotacao)
		            );

		            if (voto >= 1 && voto <= qtdCandidatos) {
		                votos[voto - 1]++;
		            } else {
		                JOptionPane.showMessageDialog(null, "Voto inválido! O voto não será contabilizado.");
		            }
		        }
		     String resultado = "RESULTADO DA ELEIÇÃO\n\n";
		        int maiorVotos = -1;
		        String vencedor = "";

		        for (int i = 0; i < qtdCandidatos; i++) {
		            resultado += candidatos[i] + ": " + votos[i] + " voto(s)\n";

		            if (votos[i] > maiorVotos) {
		                maiorVotos = votos[i];
		                vencedor = candidatos[i];
		            }
		        }

		        resultado += "\nVENCEDOR: " + vencedor + " com " + maiorVotos + " voto(s)!";


		        JOptionPane.showMessageDialog(null, resultado);
		    }
		

}
