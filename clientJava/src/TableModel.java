import java.util.List;

import javax.swing.table.AbstractTableModel;

import webservices.Livre;

public class TableModel extends AbstractTableModel {

	private List<Livre> list;
	private final String[] entetes = { "Id", "Titre", "Prix" };

	public TableModel(List<Livre> list) {
		super();
		this.list = list;
	}

	public List<Livre> getList() {
		return list;
	}

	public void setList(List<Livre> list) {
		this.list = list;
	}

	@Override
	public int getColumnCount() {
		return 3;
	}

	@Override
	public int getRowCount() {
		return list.size();
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		switch (columnIndex) {

		case 0:
			// Id
			return list.get(rowIndex).getId();

		case 1:
			// Titre
			return list.get(rowIndex).getTitre();

		case 2:
			// Prix
			return list.get(rowIndex).getPrix();

		default:
			throw new IllegalArgumentException();
		}
	}

	@Override
	public String getColumnName(int columnIndex) {
		return entetes[columnIndex];
	}

}
