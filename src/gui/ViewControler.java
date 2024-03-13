package gui;

import javafx.scene.control.Label;


import Entidades.Clientes;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class ViewControler {
	
	Clientes clientes = new Clientes();

	// Tela de cadastro:

	@FXML
	private TextField txtNomeCliente;
	
	@FXML
	private TextField txtCpfCliente;
	
	@FXML
	private Button btCadastro;
	
	@FXML
	public void onbtCadastroAction(){
		clientes.adicionarDados(txtCpfCliente, txtNomeCliente);
		limparForms();
	}

	// Tela de pesquisa:

	@FXML
	private TextField txtCpfClienteBusca;
	
	@FXML
	private Button btPesquisa;
	
	@FXML
	private Label mostraCpf;
	
	@FXML
	private Label mostrarNome;

	@FXML
	public void onbtPesquisaAction() {
		 String cpfBusca = txtCpfClienteBusca.getText();
		    clientes.buscarCliente(txtCpfClienteBusca);

		    if (clientes.getClientes().containsKey(cpfBusca)) {
		        // Cliente encontrado, atualiza os labels
		        mostraCpf.setText(cpfBusca);
		        mostrarNome.setText(clientes.getClientes().get(cpfBusca));
		    } else {
		        // Cliente não encontrado, limpa os labels
		        mostraCpf.setText("");
		        mostrarNome.setText("");
		    }

		    limparForms();
	}

	@FXML
	public void limparForms() {
		txtNomeCliente.clear();
		txtCpfCliente.clear();
		txtCpfClienteBusca.clear();
	}

}