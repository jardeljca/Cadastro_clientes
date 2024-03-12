package gui;

import java.awt.Label;

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
	private Label mostraNome;

	@FXML
	public void onbtPesquisaAction() {
		clientes.buscarCliente(txtCpfClienteBusca);
		limparForms();
	}

	@FXML
	public void limparForms() {
		txtNomeCliente.clear();
		txtCpfCliente.clear();
		txtCpfClienteBusca.clear();
	}

}