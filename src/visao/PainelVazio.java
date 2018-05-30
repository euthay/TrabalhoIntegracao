package visao;

import javax.swing.JPanel;
import java.awt.SystemColor;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.Box;
import java.awt.Font;
import java.awt.Component;
import javax.swing.JSeparator;
import javax.swing.JInternalFrame;
import javax.swing.JList;
import javax.swing.SwingConstants;

public class PainelVazio extends JPanel {
	private JLabel labelResponsveis;
	private JLabel labelQuadrado;
	private JLabel labelGeneses;
	private JLabel labelTringulo;
	private JLabel labelReinaldo;
	private JLabel labelCirculo;
	private JLabel labelAnderson;
	private JLabel labelGabriel;
	private JLabel labelDaleth;
	private JLabel labelTaina;
	private JLabel labelTailane;
	
	public PainelVazio() {
		setBackground(SystemColor.inactiveCaptionBorder);
		this.setLayout(null);
		labelResponsveis = new JLabel("Responsáveis");
		labelResponsveis.setFont(new Font("Dialog", Font.BOLD, 16));
		labelResponsveis.setBounds(130, 25, 149, 29);
		add(labelResponsveis);
		
		labelQuadrado = new JLabel("Quadrado:");
		labelQuadrado.setFont(new Font("Dialog", Font.BOLD, 14));
		labelQuadrado.setBounds(25, 84, 92, 15);
		add(labelQuadrado);
		
		labelGeneses = new JLabel("Gêneses");
		labelGeneses.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 12));
		labelGeneses.setBounds(35, 111, 82, 15);
		add(labelGeneses);
		
		labelTringulo = new JLabel("Triângulo:");
		labelTringulo.setFont(new Font("Dialog", Font.BOLD, 14));
		labelTringulo.setBounds(162, 84, 92, 15);
		add(labelTringulo);
		
		labelReinaldo = new JLabel("Reinaldo");
		labelReinaldo.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 12));
		labelReinaldo.setBounds(35, 141, 82, 15);
		add(labelReinaldo);
		
		labelCirculo = new JLabel("Circulo:");
		labelCirculo.setFont(new Font("Dialog", Font.BOLD, 14));
		labelCirculo.setBounds(297, 84, 92, 15);
		add(labelCirculo);
		
		labelAnderson = new JLabel("Anderson");
		labelAnderson.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 12));
		labelAnderson.setBounds(162, 111, 82, 15);
		add(labelAnderson);
		
		labelGabriel = new JLabel("Gabriel");
		labelGabriel.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 12));
		labelGabriel.setBounds(172, 141, 51, 15);
		add(labelGabriel);
		
		labelDaleth = new JLabel("Daleth");
		labelDaleth.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 12));
		labelDaleth.setBounds(172, 168, 51, 15);
		add(labelDaleth);
		
		labelTaina = new JLabel("Tainá");
		labelTaina.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 12));
		labelTaina.setBounds(307, 111, 61, 15);
		add(labelTaina);
		
		labelTailane = new JLabel("Tailane");
		labelTailane.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 12));
		labelTailane.setBounds(307, 141, 61, 15);
		add(labelTailane);
	}
}
