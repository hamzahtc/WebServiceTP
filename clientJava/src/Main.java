import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import webservices.Livre;
import webservices.LivreService;
import webservices.LivreWS;

public class Main extends JFrame {

	public JTextField idField;
	public JTextField titreField;
	public JTextField prixField;
	public List<Livre> livres;
	public LivreService proxy;

	public Main() throws Exception {
		ex01();
	}

	private void ex01() throws Exception {
		proxy = new LivreWS().getLivreServicePort();
		livres = proxy.getLivres();
		if (livres == null) {
			livres = new ArrayList<Livre>();
		}

		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		JPanel panelCenter = new JPanel();
		panelCenter.setLayout(new BorderLayout());

		JTable table = new JTable();
		TableModel modele = new TableModel(livres);
		table.setModel(modele);
		JScrollPane scrollPane = new JScrollPane(table);
		panelCenter.add(scrollPane, BorderLayout.CENTER);

		// Delete
		JButton button = new JButton("Delete");
		button.setBounds(50, 100, 95, 30);
		panel.add(button, BorderLayout.NORTH);
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int row = table.getSelectedRow();
				if (row != -1) {
					int column = 0;
					String value = (String) table.getModel().getValueAt(row, column);

					try {
						proxy.deleteLivre(value);
						livres = proxy.getLivres();
						if (livres == null) {
							livres = new ArrayList<Livre>();
						}
						TableModel modele = new TableModel(livres);
						table.setModel(modele);
					} catch (Exception e1) {
						e1.printStackTrace();
					}
				} else {
					JOptionPane.showMessageDialog(table, "Voyez selectionner une ligne", "Ligne vide",
							JOptionPane.WARNING_MESSAGE);
				}

			}
		});

		JPanel panelForInputs = new JPanel();
		panelForInputs.setLayout(new FlowLayout());

		JPanel idInput = new JPanel();
		idInput.add(new JLabel("id"));
		idField = new JTextField(10);
		idInput.add(idField);

		JPanel titreInput = new JPanel();
		titreInput.add(new JLabel("titre"));
		titreField = new JTextField(10);
		titreInput.add(titreField);

		JPanel prixInput = new JPanel();
		prixInput.add(new JLabel("prix"));
		prixField = new JTextField(10);
		prixInput.add(prixField);

		panelForInputs.add(idInput);
		panelForInputs.add(titreInput);
		panelForInputs.add(prixInput);
		panelCenter.add(panelForInputs, BorderLayout.SOUTH);

		panel.add(panelCenter, BorderLayout.CENTER);

		// Add
		JButton button1 = new JButton("Add");
		button.setBounds(50, 100, 95, 30);
		panel.add(button1, BorderLayout.SOUTH);
		button1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				try {
					if (idField.getText().isEmpty() || titreField.getText().isEmpty()
							|| prixField.getText().isEmpty()) {
						JOptionPane.showMessageDialog(table, "Voyez Remplisser Les Champs", "Champs Vides",
								JOptionPane.WARNING_MESSAGE);
					} else {
						Livre newLivre = new Livre();
						newLivre.setId(idField.getText());
						newLivre.setTitre(titreField.getText());
						newLivre.setPrix(Double.parseDouble(prixField.getText()));
						proxy.addLivre(newLivre);
						livres = proxy.getLivres();
						if (livres == null) {
							livres = new ArrayList<Livre>();
						}
						TableModel modele = new TableModel(livres);
						table.setModel(modele);
						clearFileds();
					}
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});

		add(panel);

		setSize(700, 400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);

	}

	private void clearFileds() {
		idField.setText("");
		titreField.setText("");
		prixField.setText("");
	}

	public static void main(String[] args) throws Exception {
		new Main();
	}
}
