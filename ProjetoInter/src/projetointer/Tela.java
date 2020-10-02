/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetointer;


import javax.swing.JOptionPane;

public class Tela {

	static Motorista motorista[] = null;
	static Veiculo veiculos[] = null;
        static Multa multas[] = null;
	static String lista;
	static int confirma = -1;
	static int j = 0;

	public static void main(String[] args) {
            Login();
        }
            
            public static void Login(){
                String op = "";
		int opcao = -1;

		do {

			op = JOptionPane.showInputDialog("PROJETO INTERDISCIPLINAR: LOGIN \n\n"
					+ "1 ~> Gerente.\n"
					+ "2 ~> Agente.\n"
					+ "3 ~> Motorista.\n\n"
					
                                        + "4 ~> Sair.\n\n");

			if (op == null) {

				op = "0";

			}

			opcao = Integer.parseInt(op);

			if (opcao == 1) {

				Gerente();

			} else if (opcao == 2) {

				Agente();

			} else if (opcao == 3) {

				Motorista();

                        } else if (opcao == 4 || opcao == 0) {

				Sair();

			} else {

				JOptionPane.showMessageDialog(null, "Opção Inválida!!!");

			}

		} while (confirma != 0);
            
        }
                
            public static void Gerente(){
                
                String op1 = "";
		int opcao1 = -1;

		do {

			op1 = JOptionPane.showInputDialog("PROJETO INTERDISCIPLINAR: GERENTE \n\n"
					+ "1 ~> Cadastrar Motorista.\n"
					+ "2 ~> Consultar Motorista.\n"
					+ "3 ~> Cadastrar Veiculos.\n"
					+ "4 ~> Consultar Veiculos.\n" 
                                        + "5 ~> Cadastrar Multas.\n"
                                        + "6 ~> Consultar Multas.\n\n"
                                        + "7 ~> Voltar.\n\n");

			if (op1 == null) {

				op1 = "0";

			}

			opcao1 = Integer.parseInt(op1);

			if (opcao1 == 1) {

				CadastrarMotorista();

			} else if (opcao1 == 2) {

				ConsultarMotorista();

			} else if (opcao1 == 3) {

				CadastrarVeiculos();

			} else if (opcao1 == 4) {

				ConsultarVeiculos();
                                
                        } else if (opcao1 == 5) {

				CadastrarMultas();
                                
                        } else if (opcao1 == 6) {

				ConsultarMultas();

                        } else if (opcao1 == 7 || opcao1 == 0) {

				Voltar();

			} else {

				JOptionPane.showMessageDialog(null, "Opção Inválida!!!");

			}

		} while (confirma != 0);
            }
                
                public static void Agente(){
                    String op2 = "";
		int opcao2 = -1;

		do {

			op2 = JOptionPane.showInputDialog("PROJETO INTERDISCIPLINAR: AGENTE \n\n"
					+ "1 ~> Cadastrar Motorista.\n"
					+ "2 ~> Cadastrar Veiculos.\n"
                                        + "3 ~> Cadastrar Multas.\n\n"
                                        + "4 ~> Voltar.\n\n");

			if (op2 == null) {

				op2 = "0";

			}

			opcao2 = Integer.parseInt(op2);

			if (opcao2 == 1) {

				CadastrarMotorista();

			} else if (opcao2 == 2) {

				CadastrarVeiculos();
                                
                        } else if (opcao2 == 3) {

				CadastrarMultas();
                                

                        } else if (opcao2 == 4 || opcao2 == 0) {

				Voltar();

			} else {

				JOptionPane.showMessageDialog(null, "Opção Inválida!!!");

			}

		} while (confirma != 0);
                }
                public static void Motorista(){
                    String op3 = "";
		int opcao3 = -1;

		do {

			op3 = JOptionPane.showInputDialog("PROJETO INTERDISCIPLINAR: MOTORISTA \n\n"
					+ "1 ~> Consultar Multas.\n\n"
                                        + "2 ~> Voltar.\n\n");

			if (op3 == null) {

				op3 = "0";

			}

			opcao3 = Integer.parseInt(op3);

			if (opcao3 == 1) {

				ConsultarMultas();
                               
                        } else if (opcao3 == 2 || opcao3 == 0) {
                            
				Voltar();
                                
			} else {

				JOptionPane.showMessageDialog(null, "Opção Inválida!!!");

			}

		} while (confirma != 0);
                }
            public static void CadastrarMotorista() {

		int QuantMotoristas;

		String Quant = JOptionPane
				.showInputDialog("- CADASTRAR MOTORISTA:"
                                        + "\n\nQuantos motoristas deseja cadastrar? ");

		if (Quant == null) {

			Quant = "0";

		}

		QuantMotoristas = Integer.parseInt(Quant);

		motorista = new Motorista[QuantMotoristas];

		for (int i = 0; i < motorista.length; i++) {

			motorista[i] = new Motorista();

		}

		for (int i = 0; i < QuantMotoristas; i++) {

			motorista[i]
					.setNome(JOptionPane
							.showInputDialog("- CADASTRAR MOTORISTA:\n\nDigite o Nome do Motorista: ("
									+ (i + 1) + "/" + QuantMotoristas + ")"));

			motorista[i]
					.setCnh(JOptionPane
							.showInputDialog("- CADASTRAR MOTORISTA:\n\nDigite a CNH e Categoria do Motorista:"
									+ motorista[i].getNome()
									+ "\nOBS: Use o padrão Número - Categoria  \n\n"));

		}

		for (int i = 0; i < QuantMotoristas; i++) {

			JOptionPane.showMessageDialog(null, motorista[i].getNome());

		}

		JOptionPane.showMessageDialog(null, "Motoristas Cadastrados!");

	}

	public static void ConsultarMotorista() {

		if (motorista == null) {

			JOptionPane
					.showMessageDialog(null,
							"- CONSULTAR Motorista:\n\nVocê precisa cadastrar pelo menos 1 Motorista!\n\n");

		} else {

			int total = 1;
			lista = "";

			for (int i = 0; i < motorista.length; i++) {

				lista += "Motorista " + (i + 1) + "\n";
				lista += "Nome: " + motorista[i].getNome() + "\n";
				lista += "CNH: " + motorista[i].getCnh()
						+ "\n";
				lista += "\n\n";
				total++;

			}

			JOptionPane.showMessageDialog(null, "- CONSULTAR MOTORISTA:\n\n"
					+ "Total de " + (total - 1) + " Motorista Cadastrados:\n\n"
					+ lista);

		}

	}

	public static void CadastrarVeiculos() {
            
            int QuantV;
            String Tipo;

		String Quant = JOptionPane
				.showInputDialog("- CADASTRAR VEÍCULOS:"
                                        + "\n\nQuantos veiculos deseja cadastrar? ");

		if (Quant == null) {

			Quant = "0";

		}

		QuantV = Integer.parseInt(Quant);

		veiculos = new Veiculo[QuantV];

		for (int i = 0; i < veiculos.length; i++) {

			veiculos[i] = new Veiculo();

		}

		for (int i = 0; i < QuantV; i++) {

			veiculos[i]
					.setTipo(JOptionPane
							.showInputDialog("- CADASTRAR VEICULO:\n\nDigite o Tipo do Veículo (Caminhao/Moto/Automovel): ("
									+ (i + 1) + "/" + QuantV + ")"));

			veiculos[i]
					.setPlaca(JOptionPane
							.showInputDialog("- CADASTRAR VEICULO:\n\nDigite a Placa :"
									+ veiculos[i].getPlaca()
									+ "\nOBS: Use o padrão AAA-0A00 \n\n"));
                        veiculos[i]
					.setMarca(JOptionPane
							.showInputDialog("- CADASTRAR VEICULO:\n\nDigite a Marca :"
									+ veiculos[i].getMarca() + "\n\n"));
                        veiculos[i]
					.setModelo(JOptionPane
							.showInputDialog("- CADASTRAR VEICULO:\n\nDigite a Modelo : "
									+ veiculos[i].getModelo() + "\n\n"));
                            
                }

		for (int i = 0; i < QuantV; i++) {

			JOptionPane.showMessageDialog(null, "Veículo de Placa: \n" + veiculos[i].getPlaca());

		}

		JOptionPane.showMessageDialog(null, "Foram cadastrados!");

	
            }
        

	public static void ConsultarVeiculos() {
		
		if (veiculos == null) {

			JOptionPane
					.showMessageDialog(null,
							"- CONSULTAR VEICULOS:\n\nVocê precisa cadastrar pelo menos 1 Veiculo!\n\n");

		} else {

			int total = 1;
			lista = "";
                        String Tipo = veiculos[0].toString(); 

			for (int i = 0; i < veiculos.length; i++) {

				lista += "Veículo " + (i + 1) + "\n";
				lista += "Tipo: " + veiculos[i].getTipo()+ "\n";
				lista += "Placa: " + veiculos[i].getPlaca()+ "\n";                              
                                lista += "Marca: " + veiculos[i].getMarca() + "\n";
                                lista += "Modelo: " + veiculos[i].getModelo()+ "\n";   
				lista += "\n\n";
				total++;
                        }
			

			JOptionPane.showMessageDialog(null, "- CONSULTAR MOTORISTA:\n\n"
					+ "Total de " + (total - 1) + " Motorista Cadastrados:\n\n"
					+ lista);

		}
        }

	
        
        public static void CadastrarMultas() {

		int QuantMu;

		String Quant = JOptionPane
				.showInputDialog("- CADASTRAR MULTAS:"
                                        + "\n\nQuantos multas deseja cadastrar? ");

		if (Quant == null) {

			Quant = "0";

		}

		QuantMu = Integer.parseInt(Quant);

		multas = new Multa[QuantMu];

		for (int i = 0; i < multas.length; i++) {

			multas[i] = new Multa();

		}

		for (int i = 0; i < QuantMu; i++) {

			multas[i]
					.setTipoMulta(JOptionPane
							.showInputDialog("- CADASTRAR MULTAS:\n\nDigite o tipo de Multa: ("
									+ (i + 1) + "/" + QuantMu + ")"));

			multas[i]
					.setValor(JOptionPane
							.showInputDialog("- CADASTRAR MULTAS:\n\nDigite o Valor da Multa:" 
                                                                + multas[i].getValor()
                                                                        + "\nOBS: Use o padrão R$000,00  \n\n"));
                        multas[i]
					.setVencimento(JOptionPane
							.showInputDialog("- CADASTRAR VEICULO:\n\nDigite a Data de Vencimento :"
									+ multas[i].getVencimento()
                                                                            + "\nOBS: Use o padrão dd/mm/aa  \n\n"));
                        multas[i]
					.setPlacam(JOptionPane
							.showInputDialog("- CADASTRAR VEICULO:\n\nDigite a Placa do Veículo que Recebeu a Multa :"
									+ multas[i].getPlacam()
                                                                            + "\n\n"));

		}

		for (int i = 0; i < QuantMu; i++) {

			JOptionPane.showMessageDialog(null, multas[i].getTipoMulta());

		}

		JOptionPane.showMessageDialog(null, "Multas Cadastradas!");

	}

	public static void ConsultarMultas() {
		
		if (multas == null) {

			JOptionPane
					.showMessageDialog(null,
							"- CONSULTAR MULTAS:\n\nVocê precisa cadastrar pelo menos 1 Multa!\n\n");

		} else {

			int total = 1;
			lista = "";

			for (int i = 0; i < multas.length; i++) {

				lista += "Multas: " + (i + 1) + "\n";
				lista += "Tipo: " + multas[i].getTipoMulta()+ "\n";
				lista += "Valor: " + multas[i].getValor()+ "\n";                              
                                lista += "Vencimento: " + multas[i].getVencimento()+ "\n";
                                lista += "Placa do Veículo que recebeu: " + multas[i].getPlacam()+ "\n";   
				lista += "\n\n";
				total++;
                        }
			

			JOptionPane.showMessageDialog(null, "- CONSULTAR MULTAS:\n\n"
					+ "Total de " + (total - 1) + " Multas Cadastrados:\n\n"
					+ lista);

		}

	}

	public static void Sair() {

		confirma = JOptionPane.showConfirmDialog(null,
				"Quer mesmo Sair do Programa?");

	}
        public static void Voltar() {

            Login();

	}

}

