package Visualizacao;

import java.text.DecimalFormat;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;

import Modelo.Conta;

public class EntradaSaida {
	
	public static int solicitaOpcao() {
		String[] opcao = {"Abrir Conta", "Dados da Conta","Deposito", "Saque","Saldo","Extrato Completo",
							"Extrado de Deposito(s)", "Extrato de Saque(s)","sair"};
		JComboBox<String> menu = new JComboBox<String>(opcao);
		JOptionPane.showConfirmDialog(null, menu, "Selecione a opção desejada", JOptionPane.OK_CANCEL_OPTION);
		return menu.getSelectedIndex();
	}
	
	public static double solicitarInformacoesDeposito() {
		return  Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do seu Deposito"));
	}
	
	public static double solicitarInformacoesSaque() {
		return Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do Seu Saque"));
	}
	
	public static void exibirSaldo(double saldo) {
		DecimalFormat ajuste = new DecimalFormat ("#0.00");
		
		JOptionPane.showMessageDialog(null,"R$"+ajuste.format(saldo), "Saldo Atual da Conta", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public static void exibirDadosDaConta(String dadosDaConta) {
		JOptionPane.showMessageDialog(null, dadosDaConta,"Dados da Conta", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public static void exibirExtratoCompleto(String extratoCompleto) {
		JOptionPane.showMessageDialog(null, extratoCompleto, "Extrato Completo", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public static void exibirExtratoDeDepositos(String extratoDeDeposito) {
		JOptionPane.showMessageDialog(null, extratoDeDeposito, "Extrato de Deposito(s)", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public static void exibirExtratoDeSaques(String extratoDeSaques) {
		JOptionPane.showMessageDialog(null, extratoDeSaques, "Extrato de Saque(s)", JOptionPane.INFORMATION_MESSAGE);
	}

	public static String solicitaNomeDoTitular() {
		return JOptionPane.showInputDialog("Nome do titular");
	}

	public static String solicitaTipo() {
		String[] opcoes = { "conta poupança", "conta corrente" };

		int tipoDaConta = JOptionPane.showOptionDialog(null, "Informe o tipo da conta",
				"Tipo da conta", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes);
		if (tipoDaConta == 0) {
			return "conta poupança";
		} else {
			return "conta corrente";
		}
	}
}
