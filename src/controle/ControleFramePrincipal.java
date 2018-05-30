package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import visao.FramePrincipal;
import visao.PainelQuadrado;
import visao.PainelTriangulo;
import visao.PainelVazio;

public class ControleFramePrincipal implements ActionListener {
	FramePrincipal telaPrincipal;
	PainelVazio telaUm;
	PainelTriangulo telaDois;
	PainelQuadrado telaTres;
	ControleQuadrado controleQuadrado;
	
	public ControleFramePrincipal() {
		super();
		telaPrincipal= new FramePrincipal();
		telaPrincipal.setTitle("Integração");
		addEventos();
	}

	private void addEventos() {
		// TODO Auto-generated method stub
		telaPrincipal.getMenuItemInicio().addActionListener(this);
		telaPrincipal.getMenuItemTriangulo().addActionListener(this);
		telaPrincipal.getMenuItemQuadrado().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		//Tela inicial
		if(e.getSource() == telaPrincipal.getMenuItemInicio()) {
			telaUm = new PainelVazio();
			
			telaPrincipal.setContentPane(telaUm);
			telaPrincipal.setTitle("Integração");
			telaPrincipal.repaint();
			telaPrincipal.validate();
		}
		//Painel Triângulo
		else if(e.getSource() == telaPrincipal.getMenuItemTriangulo()) {
			telaDois = new PainelTriangulo();
			ControleTriangulo cont = new ControleTriangulo(telaDois);
			
			telaPrincipal.setContentPane(telaDois);
			telaPrincipal.setTitle("Triângulo");
			telaPrincipal.repaint();
			telaPrincipal.validate();
		}
		//Painel Quadrado
		else if(e.getSource() == telaPrincipal.getMenuItemQuadrado()) {
			telaTres = new PainelQuadrado();
			controleQuadrado = new ControleQuadrado(telaTres);
			telaPrincipal.setContentPane(telaTres);
			telaPrincipal.setTitle("Quadrado");
			telaPrincipal.repaint();
			telaPrincipal.validate();
		}
	}
	
	public static void main(String[] args) {
		new ControleFramePrincipal();
	}
}
