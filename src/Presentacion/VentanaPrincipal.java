package Presentacion;


import javax.swing.JPanel;
import javax.swing.JFrame;


import javax.swing.JLabel;

import java.awt.Rectangle;
import java.awt.Font;

import javax.swing.JButton;

public class VentanaPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;

	private JPanel jContentPane = null;

	private JLabel jLabel = null;

	private JButton jButtonInfoClientes = null;

	private JButton jButtonInfoRamales = null;

	private JButton jButtonInfoMateriaPrima = null;

	private JButton jButtonInfoProductoManufacturado = null;

	private JButton jButtonSalir = null;
	
	private ControlPrincipal control;

	/**
	 * This is the default constructor
	 */
	public VentanaPrincipal(ControlPrincipal ctrl) {
		super();
		initialize();
		setLocationRelativeTo(null);
		control = ctrl;
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(445, 274);
		this.setContentPane(getJContentPane());
		this.setTitle("JFrame");
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jLabel = new JLabel();
			jLabel.setBounds(new Rectangle(121, 26, 231, 49));
			jLabel.setFont(new Font("Arial Black", Font.BOLD, 24));
			jLabel.setText("  SunSystem");
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.add(jLabel, null);
			jContentPane.add(getJButtonInfoClientes(), null);
			jContentPane.add(getJButtonInfoRamales(), null);
			jContentPane.add(getJButtonInfoMateriaPrima(), null);
			jContentPane.add(getJButtonInfoProductoManufacturado(), null);
			jContentPane.add(getJButtonSalir(), null);
		}
		return jContentPane;
	}

	/**
	 * This method initializes jButtonInfoClientes
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonInfoClientes() {
		if (jButtonInfoClientes == null) {
			jButtonInfoClientes = new JButton();
			jButtonInfoClientes.setBounds(new Rectangle(30, 91, 180, 31));
			jButtonInfoClientes.setText("Refistro clientes");
			jButtonInfoClientes.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					 control.registroC_Cliente();
				}
			});
		}
		return jButtonInfoClientes;
	}

	/**
	 * This method initializes jButtonInfoClientes	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonInfoRamales() {
		if (jButtonInfoRamales == null) {
			jButtonInfoRamales = new JButton();
			jButtonInfoRamales.setBounds(new Rectangle(30, 135, 181, 30));
			jButtonInfoRamales.setText("Registro Ramales");
			jButtonInfoRamales.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					 control.registroRamales();
				}
			});
		}
		return jButtonInfoRamales;
	}

	/**
	 * This method initializes jButtonInfoRamales	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonInfoMateriaPrima() {
		if (jButtonInfoMateriaPrima == null) {
			jButtonInfoMateriaPrima = new JButton();
			jButtonInfoMateriaPrima.setBounds(new Rectangle(240, 90, 166, 31));
			jButtonInfoMateriaPrima.setText("Regitro Materia Prima");
			jButtonInfoMateriaPrima.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					// Invoca al control principal
					control.registroMprima();
				}
			});
		}
		return jButtonInfoMateriaPrima;
	}

	/**
	 * This method initializes jButtonInfoMateriaPrima	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonInfoProductoManufacturado() {
		if (jButtonInfoProductoManufacturado == null) {
			jButtonInfoProductoManufacturado = new JButton();
			jButtonInfoProductoManufacturado.setBounds(new Rectangle(240, 135, 166, 31));
			jButtonInfoProductoManufacturado.setText("Registro P-Manufacturado");
			jButtonInfoProductoManufacturado.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					// Invoca al control principal
					control.registroPmanufacturado();
				}
			});
		}
		return jButtonInfoProductoManufacturado;
	}

	/**
	 * This method initializes jButtonInfoProductoManufacturado	
	 * 	
	 * @return javax.swing.JButton	
	 */

	private JButton getJButtonSalir() {
		if (jButtonSalir == null) {
			jButtonSalir = new JButton();
			jButtonSalir.setBounds(new Rectangle(135, 180, 167, 32));
			jButtonSalir.setText("Salir");
			jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					control.termina();
				}
			});
		}
		return jButtonSalir;
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"
