package app;

import javax.swing.JOptionPane;
import app.cadastros.Cadastro;
import app.relatorios.Relatorio;
import app.excecoes.*;

public class Main {
    public static void main(String[] args)  {
        Cadastro cadastro = new Cadastro();
        Relatorio relatorio = new Relatorio();
        int operacao;
		operacao = 0;
		
        while (operacao != 6) {
            operacao=Integer.parseInt(JOptionPane.showInputDialog("Escolha o n�mero da op��o desejada: \n"
            	+ "1 - Cadastrar uma pessoa\n"
            	+ "2 - Cadastrar uma despesa\n"
            	+ "3 - Calcular valor a ser pago igualitariamente\n"
            	+ "4 - Calcular valor a ser pago proporcionalmente\n"
            	+ "5 - Para informar todas as pessoas cadastradas e as despesas\n"
            	+ "6 - Sair\n**************************************************************"));

            if (operacao == 1) {
				try {
					cadastro.cadastraPessoa();
				} catch (RendimentoInvalidoException e) {
					String msg= "exce��o capturada, cadastre esse morador(a) novamente digitando 1 no menu\n";
					msg+=e.getMessage()+"\n";
					JOptionPane.showMessageDialog(null,msg);
					e.printStackTrace();
				}
				catch(DadosPessoaisIncompletosException e) {
					String msg= "exce��o capturada!\nNome, email ou rendimento n�o informados, cadastre esse morador(a) novamente digitando 1 no menu\n";
					msg+=e.getMessage()+"\n";
					JOptionPane.showMessageDialog(null,msg);
					e.printStackTrace();
				}

            } else if (operacao == 2) {      	
            	try {
					try {
						cadastro.cadastraDespesa();
					} catch (ValorNaoInformadoException e) {
						String msg= "exce��o capturada!\nValor n�o informado, cadastre essa despesa novamente digitando 2 no menu\n";
						msg+=e.getMessage()+"\n";
						JOptionPane.showMessageDialog(null,msg);
						e.printStackTrace();
						e.printStackTrace();
					}
					} catch (CategoriaNaoInformadaException e) {
						String msg= "exce��o capturada!\nCategoria n�o informada, cadastre essa despesa novamente digitando 2 no menu\n";
						msg+=e.getMessage()+"\n";
						JOptionPane.showMessageDialog(null,msg);
						e.printStackTrace();
						} catch (DescricaoNaoInformadaException e) {
						String msg= "exce��o capturada!\nDescri��o de despesa n�o informada, cadastre essa despesa novamente digitando 2 no menu\n";
						msg+=e.getMessage()+"\n";
						JOptionPane.showMessageDialog(null,msg);
						e.printStackTrace();
						
						e.printStackTrace();
					}

            } else if (operacao == 3) {
                relatorio.calculoIgualitario();
                
            } else if (operacao == 4) {
                relatorio.calculoProporcional();
				
			} else if(operacao==5) {
            	cadastro.imprimirPessoa();
            	cadastro.imprimirCadastro();            	
            }
        }
    } 
}



