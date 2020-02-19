package Presentacion;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.Rectangle;
import java.awt.Font;

import javax.swing.JTextField;


import javax.swing.JButton;

public class VentanaAgregarMprima extends JFrame {
	private static final long serialVersionUID = 1L;

	private JPanel jContentPane = null;
	private JLabel jLabel = null;
	private JLabel jLabel1 = null;
	private JLabel jLabel4 = null;
	private JLabel jLabel5 = null;

	private JTextField jTextFieldNombre = null;

	private JTextField jTextFieldId = null;
	private JTextField jTextFieldPrecio = null;

	private JButton jButtonAgregar = null;

	private JButton jButtonCancelar = null;

	private ControlRegistroMprima control = null;
	/**
	 * This is the default constructor
	 */
	public VentanaAgregarMprima(ControlRegistroMprima control) {
		super();
		initialize();
		setLocationRelativeTo(null);
		this.control = control;
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(300, 300);
		this.setContentPane(getJContentPane());
		this.setTitle("Agregar Materia Prima");
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jLabel1 = new JLabel();
			jLabel1.setBounds(new Rectangle(20, 70, 60, 15));
			jLabel1.setText("Nombre:");
			
			jLabel4 = new JLabel();
			jLabel4.setText("Id:");
			jLabel4.setBounds(new Rectangle(20, 120, 60, 15));
			
			jLabel5 = new JLabel();
			jLabel5.setText("Precio:");
			jLabel5.setBounds(new Rectangle(20, 170, 60, 15));
			
			jLabel = new JLabel();
			jLabel.setBounds(new Rectangle(20, 20, 250, 30));
			jLabel.setFont(new Font("Arial Black", Font.BOLD, 18));
			jLabel.setText("Agregar Materia Prima");
			
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.add(jLabel, null);
			jContentPane.add(jLabel1, null);
			jContentPane.add(jLabel4, null);
			jContentPane.add(jLabel5, null);
			
			jContentPane.add(getJTextFieldNombre(), null);
			/*jContentPane.add(getJTextFieldTipo(), null);*/
			/*jContentPane.add(getJTextFieldDescripcion(), null);*/
			jContentPane.add(getJTextFieldId(), null);
			jContentPane.add(getJTextFieldPrecio(), null);			
			jContentPane.add(getJButtonAgregar(), null);
			jContentPane.add(getJButtonCancelar(), null);
		}
		return jContentPane;
	}

	/**
	 * This method initializes jTextFieldNombre	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldNombre() {
		if (jTextFieldNombre == null) {
			jTextFieldNombre = new JTextField();
			jTextFieldNombre.setBounds(new Rectangle(120, 70, 137, 20));
		}
		return jTextFieldNombre;
	}

	/**
	 * This method initializes jTextFieldDescripcion	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	/*private JTextField getJTextFieldDescripcion() {
		if (jTextFieldDescripcion == null) {
			jTextFieldDescripcion = new JTextField();
			jTextFieldDescripcion.setBounds(new Rectangle(120, 95, 138, 20));
		}
		return jTextFieldDescripcion;
	}
	
	/**
	 * This method initializes jTextFieldTipo	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	/*private JTextField getJTextFieldTipo() {
		if (jTextFieldTipo == null) {
			jTextFieldTipo = new JTextField();
			jTextFieldTipo.setBounds(new Rectangle(120, 120, 138, 20));
		}
		return jTextFieldTipo;
	}
	
	/**
	 * This method initializes jTextFieldId	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldId() {
		if (jTextFieldId == null) {
			jTextFieldId = new JTextField();
			jTextFieldId.setBounds(new Rectangle(120, 120, 138, 20));
		}
		return jTextFieldId;
	}
	
	/**
	 * This method initializes jTextFieldPrecio
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldPrecio() {
		if (jTextFieldPrecio == null) {
			jTextFieldPrecio = new JTextField();
			jTextFieldPrecio.setBounds(new Rectangle(120, 170, 138, 20));
		}
		return jTextFieldPrecio;
	}

	/**
	 * This method initializes jButtonAceptar	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonAgregar() {
		if (jButtonAgregar == null) {
			jButtonAgregar = new JButton();
			jButtonAgregar.setBounds(new Rectangle(20, 200, 106, 31));
			jButtonAgregar.setText("Agregar");
			jButtonAgregar.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					String nombre = jTextFieldNombre.getText();
					Integer id = Integer.parseInt(jTextFieldId.getText());
					Double precio = Double.parseDouble(jTextFieldPrecio.getText());
						control.AgregaNuevo(nombre, id, precio);
				}
			});
		}
		return jButtonAgregar;
	}

	/**
	 * This method initializes jButtonCancelar	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonCancelar() {
		if (jButtonCancelar == null) {
			jButtonCancelar = new JButton();
			jButtonCancelar.setBounds(new Rectangle(149, 200, 107, 31));
			jButtonCancelar.setText("Cancelar");
			jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					cierra();
				}
			});
		}
		return jButtonCancelar;
	}

	public void abre() {
		setVisible(true);
	}
	
	public void cierra() {
		setVisible(false);
	}

	
	public void muestraMensaje(String mensaje){
		JOptionPane.showMessageDialog(this, mensaje);
	}
}
