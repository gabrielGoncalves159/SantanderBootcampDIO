package Modelo;

import java.util.ArrayList;
import javax.swing.JOptionPane;

import java.util.Date;
import java.text.DateFormat;
import java.text.DecimalFormat;

public class Conta {

	private String titularDaConta;
	private String tipo;
	private double saldo;
	private static ArrayList<Movimentacao> listaDeMovimentacao = new ArrayList<Movimentacao>();

	public void depositar(double deposito) {
		this.saldo += deposito;
		System.out.println("Saldo: " + this.saldo + " Deposito: " + deposito);

		Movimentacao movimentacao = new Movimentacao();
		movimentacao.setTipo("Deposito");
		movimentacao.setValor(deposito);
		movimentacao.setData(data());
		listaDeMovimentacao.add(movimentacao);

	}

	public void sacar(double saque) {

		this.saldo -= saque;
		System.out.println("Saldo: " + this.saldo + " Saque: " + saque);

		Movimentacao movimentacao = new Movimentacao();
		movimentacao.setTipo("Saque");
		movimentacao.setValor(saque);
		movimentacao.setData(data());
		listaDeMovimentacao.add(movimentacao);

	}

	public Object data() {

		Date data = new Date();

		String dataAgora = DateFormat.getDateInstance(DateFormat.SHORT).format(data);
		System.out.println(dataAgora);

		return dataAgora;
	}

	public static double consultarSaldo(double saldo) {
		return saldo;
	}

	public static String gerarExtrato() {

		String informacoesExtrato = null;

		informacoesExtrato = "Extrato: \n ______________________ \n";

		for (Movimentacao movimentacao : listaDeMovimentacao) {
			
			DecimalFormat ajuste = new DecimalFormat ("#0.00");

			informacoesExtrato += movimentacao.getTipo() + ": " + movimentacao.getData() + "  Valor: R$"
					+ ajuste.format(movimentacao.getValor()) + "\n ______________________ \n";

			System.out.println(informacoesExtrato);
		}
		if(informacoesExtrato.equals("Extrato: \n ______________________ \n")) {
			informacoesExtrato = "Nenhuma informação a ser exibida";
		}
		return informacoesExtrato;
	}

	public static String gerarExtratoDepositos() {

		String informacoesExtratoDeposito = null;

		informacoesExtratoDeposito = "Extrato de Deposito(s) \n _______________________________________________ \n";

		for (Movimentacao movimentacao : listaDeMovimentacao) {
			if (movimentacao.getTipo() == "Deposito") {
				
				DecimalFormat ajuste = new DecimalFormat ("#0.00");

				informacoesExtratoDeposito += movimentacao.getData() + "\nValor: R$" + ajuste.format(movimentacao.getValor())
						+ "\n _______________________________________________ \n";

				System.out.println(informacoesExtratoDeposito);
			}
		}
		if(informacoesExtratoDeposito.equals("Extrato de Deposito(s) \n _______________________________________________ \n")) {
			informacoesExtratoDeposito = "Nenhuma informação a ser exibida";
		}
		return informacoesExtratoDeposito;
	}

	public static String gerarExtratoSaques() {
		String informacoesExtratoSaque = null;

		informacoesExtratoSaque = "Extrato de Saque(s) \n _______________________________________________ \n";

		for (Movimentacao movimentacao : listaDeMovimentacao) {
			if (movimentacao.getTipo() == "Saque") {
				
				DecimalFormat ajuste = new DecimalFormat ();
				ajuste.setMaximumFractionDigits(2);

				informacoesExtratoSaque += movimentacao.getData() + "\nValor: R$" + ajuste.format(movimentacao.getValor())
						+ "\n _______________________________________________ \n";

				System.out.println(informacoesExtratoSaque);
			}
		}
		if(informacoesExtratoSaque.equals("Extrato de Saque(s) \n _______________________________________________ \n")) {
			informacoesExtratoSaque = "Nenhuma informação a ser exibida";
		}
		return informacoesExtratoSaque;
	}

	public String getTitularDaConta() {
		return titularDaConta;
	}

	public void setTitularDaConta(String titularDaConta) {
		this.titularDaConta = titularDaConta;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public ArrayList<Movimentacao> getListaDeMovimentacao() {
		return listaDeMovimentacao;
	}

	public void setListaDeMovimentacao(ArrayList listaDeMovimentacao) {
		this.listaDeMovimentacao = listaDeMovimentacao;
	}

	public void abrirConta(String titular, String tipoDaConta, double saldoDaConta) {
		setTitularDaConta(titular);
		setTipo(tipoDaConta);
		setSaldo(saldoDaConta);

	}
}
