package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JOptionPane;

import Modelo.Quadrado;
import visao.PainelQuadrado;


public class ControleQuadrado implements ActionListener {
	
	PainelQuadrado painelQuadrado;
	Quadrado quadrado;
	
	public ControleQuadrado(PainelQuadrado painelQuadrado) {
		this.painelQuadrado = painelQuadrado;
		addEventos();
	}	
	
	public void addEventos() {
		painelQuadrado.getBotaoCalcular().addActionListener(this);
		painelQuadrado.getBotaoLimpar().addActionListener(this);
	
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		//Ação no botão Calcular
		if(e.getSource() == painelQuadrado.getBotaoCalcular()) {
			try {
				if(Double.valueOf(painelQuadrado.getValorLado()) < 0) {
					JOptionPane.showMessageDialog(painelQuadrado, "Valor Não permitido");
					painelQuadrado.setLabelValorArea("");
					painelQuadrado.setLabelVolume("");
					painelQuadrado.setValorLado("");
					
				}else {
					quadrado = new Quadrado();
					
					quadrado.setLado(Double.valueOf(painelQuadrado.getValorLado()));
					//Formato de numero
					DecimalFormat formato = new DecimalFormat("0.##");
					/* Formula de Área: A = L²
					 * Formula de Volume V = L³
					 * */
					//Area
					quadrado.setArea(Double.valueOf(formato.format(Math.pow(quadrado.getLado(), 2))));
					//Volume
					quadrado.setVolume(Double.valueOf(formato.format(Math.pow(quadrado.getLado(), 3))));
					//setando no painel
					painelQuadrado.setLabelValorArea(String.valueOf(quadrado.getArea()));
					painelQuadrado.setLabelVolume(String.valueOf(quadrado.getVolume()));
					
				}
			}catch(NumberFormatException ex ) {
				if(quadrado == null)
					quadrado = new Quadrado();
				JOptionPane.showMessageDialog(painelQuadrado, "Não é permitido a entrada de caracteres ");
				painelQuadrado.setLabelValorArea("");
				painelQuadrado.setLabelVolume("");
				painelQuadrado.setValorLado("");
				quadrado.setLado(0.0);
				quadrado.setArea(0.0);
				quadrado.setVolume(0.0);
			}
		}
		//Ação no botão Limpar
		if(e.getSource() == painelQuadrado.getBotaoLimpar()) {
			painelQuadrado.setLabelValorArea("");
			painelQuadrado.setLabelVolume("");
			painelQuadrado.setValorLado("");
		}
		
	}

}
