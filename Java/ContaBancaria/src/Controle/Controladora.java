package Controle;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import Modelo.Conta;
import Modelo.Movimentacao;
import Visualizacao.EntradaSaida;

public class Controladora {
	Conta conta = null;

	public void exibeMenu() {

		int opcao;
		int cont = 0;

		do {

			opcao = EntradaSaida.solicitaOpcao();

			switch (opcao) {

			case 0:
				this.conta = new Conta();
				String titular = EntradaSaida.solicitaNomeDoTitular();
				String tipoDaConta = EntradaSaida.solicitaTipo();

				System.out.println("Titular: " + titular + "\nTipo: " + tipoDaConta + "\nSaldo: "
						+ conta.getTitularDaConta() + "\n____________________\nMOVIMENTAÇÃO");

				conta.abrirConta(titular, tipoDaConta, 0);

				cont += 1;
				break;

			case 1:
				if (cont == 0) {
					JOptionPane.showMessageDialog(null, "Conta não encontrada!", "ERRO", JOptionPane.WARNING_MESSAGE);

				} else {

					// Dedos da conta
					String informacoesConta = "Titular da Conta: " + conta.getTitularDaConta() + "\nTipo da conta: "
							+ conta.getTipo();
					EntradaSaida.exibirDadosDaConta(informacoesConta);
				}
				break;

			case 2:
				if (cont == 0) {
					JOptionPane.showMessageDialog(null, "Conta não encontrada!", "ERRO", JOptionPane.WARNING_MESSAGE);

				} else {
					// solicitando Deposito
					double deposito = EntradaSaida.solicitarInformacoesDeposito();

					// verificando Valor
					while (deposito <= 0) {
						JOptionPane.showMessageDialog(null,
								"O valor do Deposito não pode ser menor ou igual a 0 (ZERO)", "ERRO",
								JOptionPane.WARNING_MESSAGE);

						deposito = EntradaSaida.solicitarInformacoesDeposito();
					}

					// Deposito do Valor (entrada)
					this.conta.depositar(deposito);
				}
				break;

			case 3:
				if (cont == 0) {
					JOptionPane.showMessageDialog(null, "Conta não encontrada!", "ERRO", JOptionPane.WARNING_MESSAGE);

				} else {
					// solicitando o valor do saque
					double saque = EntradaSaida.solicitarInformacoesSaque();

					// verificando Valor
					while (saque <= 0) {
						JOptionPane.showMessageDialog(null,
								"O valor do Saque não pode ser menor ou igual a 0 (ZERO)", "ERRO",
								JOptionPane.WARNING_MESSAGE);

						saque = EntradaSaida.solicitarInformacoesSaque();
					}
					while ((conta.getSaldo() - saque) < -1000) {

						JOptionPane.showMessageDialog(null,
								"O valor do seu Saldo não pode ficar menor que R$-1000,00", "ERRO",
								JOptionPane.WARNING_MESSAGE);

						saque = EntradaSaida.solicitarInformacoesSaque();

					}

					// Valor do saque (saida)
					this.conta.sacar(saque);
				}

				break;

			case 4:
				if (cont == 0) {
					JOptionPane.showMessageDialog(null, "Conta não encontrada!", "ERRO", JOptionPane.WARNING_MESSAGE);

				} else {
					// saldo
					double saldoAtual = Conta.consultarSaldo(conta.getSaldo());
					EntradaSaida.exibirSaldo(saldoAtual);
				}

				break;

			case 5:
				if (cont == 0) {
					JOptionPane.showMessageDialog(null, "Conta não encontrada!", "ERRO", JOptionPane.WARNING_MESSAGE);

				} else {
					// gerar Extrato
					String informacoesExtrato = Conta.gerarExtrato();
					EntradaSaida.exibirExtratoCompleto(informacoesExtrato);
				}

				break;

			case 6:
				if (cont == 0) {
					JOptionPane.showMessageDialog(null, "Conta não encontrada!", "ERRO", JOptionPane.WARNING_MESSAGE);

				} else {
					// gerar Extrato Depositos
					String informacoesExtratoDeposito = Conta.gerarExtratoDepositos();
					EntradaSaida.exibirExtratoCompleto(informacoesExtratoDeposito);
				}

				break;

			case 7:
				if (cont == 0) {
					JOptionPane.showMessageDialog(null, "Conta não encontrada!", "ERRO", JOptionPane.WARNING_MESSAGE);

				} else {
					// gerar Extrato Saques
					String informacoesExtratoSaque = Conta.gerarExtratoSaques();
					EntradaSaida.exibirExtratoCompleto(informacoesExtratoSaque);
				}

				break;

			}

		} while (opcao != 8);

		JOptionPane.showMessageDialog(null, "Saindo da sua Conta");
		System.exit(0);
	}

}
