package com.matoosfe.ecommerce.form;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;

public class IFrmCliente extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IFrmCliente frame = new IFrmCliente();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public IFrmCliente() {
		setBounds(100, 100, 450, 300);

	}

}
