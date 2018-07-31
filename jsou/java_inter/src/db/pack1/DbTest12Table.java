package db.pack1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class DbTest12Table extends JFrame {
	String[][] datas = new String[0][5];
	String[] title = {"코드","품명","수량","단가","금액"};
	DefaultTableModel model;
	JTable table;
	JLabel lblCount;
	
	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;

	public DbTest12Table() {
		layInit();
		accDb();
		
		setBounds(200, 100, 300, 250);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	private void layInit() {
		model = new DefaultTableModel(datas, title);
		table = new JTable(model);
		JScrollPane pane = new JScrollPane(table);
		
		add("Center", pane);
		
		lblCount = new JLabel("건수 : 0");
		add("South", lblCount);
	}
	
	private void accDb( ) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");
			
			pstmt = conn.prepareStatement("select * from sangdata order by code");
			rs = pstmt.executeQuery();
			
			int cou = 0;
			while(rs.next()) {
				String code = rs.getString("code");
				String sang = rs.getString("sang");
				String su = rs.getString("su");
				String dan = rs.getString("dan");
				int kum = rs.getInt("su") * rs.getInt("dan");
				String []imsi = {code, sang, su, dan, Integer.toString(kum)};
				model.addRow(imsi);
				
				cou++;
			}
			lblCount.setText("건수:" + cou);
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				if (rs != null) rs.close();
				if (pstmt != null) pstmt.close();
				if (conn != null) conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
	}
	
	public static void main(String[] args) {
		new DbTest12Table();
	}

}
