package QLTTD;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JTree;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultMutableTreeNode;

import sun.misc.ThreadGroupUtils;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Vector;



public class QuanLyTienDienUI extends JFrame{
		JTextField txtHoTen,txtsoDT,txtDiaChi,txtmaCt,txtmaHD,txtCSC,txtCSM,txtThang;
		JButton btnThem, btnXoa, btnSua, btnSXTen, btnSXTien, btnLuuFile, btnMoFile, btnDong,btnTongtien;
	
		
		
		DefaultTableModel dtm;
		JTable tbl;
		
		DefaultMutableTreeNode root=null;
		JTree tree;
		
		ArrayList<HoaDon> dsHoaDon= new ArrayList<HoaDon>();
	
	
		
		public QuanLyTienDienUI() throws HeadlessException {
			super();
			addControls();
			addEvents();
		}
		
		public void addControls(){
			Container con=getContentPane();
			JPanel pnMain=new JPanel();
			pnMain.setLayout(new BorderLayout());
			con.add(pnMain);
			
			JPanel pnTitle1=new JPanel();
			pnTitle1.setLayout(new FlowLayout());
			JLabel lblTieude=new JLabel("QUẢN LÝ THU TIỀN ĐIỆN");
			pnTitle1.add(lblTieude);
			pnMain.add(pnTitle1, BorderLayout.NORTH);
			lblTieude.setForeground(Color.blue);
			Font fontTieuDe=new Font("arial", Font.BOLD,20);
			lblTieude.setFont(fontTieuDe);
			
			JPanel pnLeft=new JPanel();
			//pnLeft.setPreferredSize(new Dimension(200,0));
			JPanel pnRight=new JPanel();
			JSplitPane sp=new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,pnLeft,pnRight);
			sp.setOneTouchExpandable(true);
			pnRight.setLayout(new BoxLayout(pnRight,BoxLayout.Y_AXIS));
			pnLeft.setLayout(new BorderLayout());
			pnMain.add(sp,BorderLayout.CENTER);
			
			
			
			
	
			JPanel pnTitle2=new JPanel();
			pnTitle2.setLayout(new FlowLayout(FlowLayout.LEFT));
			JLabel lblHoten=new JLabel("Họ và tên:");
			txtHoTen=new JTextField(15);
			JLabel lblsoDT=new JLabel("Số điện thoại:");
			txtsoDT=new JTextField(15);
			pnTitle2.add(lblHoten);
			pnTitle2.add(txtHoTen);
			pnTitle2.add(lblsoDT);
			pnTitle2.add(txtsoDT);
			pnRight.add(pnTitle2);
			
			JPanel pnTitle3=new JPanel();
			pnTitle3.setLayout(new FlowLayout(FlowLayout.LEFT));
			JLabel lblDiachi=new JLabel("Địa chỉ:");
			txtDiaChi=new JTextField(38);
			pnTitle3.add(lblDiachi);
			pnTitle3.add(txtDiaChi);
			pnRight.add(pnTitle3);
			
			JPanel pnTitle4=new JPanel();
			pnTitle4.setLayout(new FlowLayout(FlowLayout.LEFT));
			JLabel lblmact =new JLabel("Mã tông tơ");
			JLabel lblmahd=new JLabel("Mã hóa đơn");
			txtmaCt=new JTextField(15);
			txtmaHD=new JTextField(15);
			pnTitle4.add(lblmact);
			pnTitle4.add(txtmaCt);
			pnTitle4.add(lblmahd);
			pnTitle4.add(txtmaHD);
			pnRight.add(pnTitle4);
			
			
			JPanel pnTitle6=new JPanel();
			pnTitle6.setLayout(new FlowLayout(FlowLayout.LEFT));
			JLabel lblthang=new JLabel("Tháng");
			pnTitle6.add(lblthang);
			txtThang =new JTextField(10);
			pnTitle6.add(txtThang);
			pnRight.add(pnTitle6);
			
			JPanel pnTitle5=new JPanel();
			pnTitle5.setLayout(new FlowLayout(FlowLayout.LEFT));
			JLabel lblcsc=new JLabel("Chỉ số cũ:");
			JLabel lblcsm=new JLabel("Chỉ số mới");
			txtCSC =new JTextField(15);
			txtCSM=new  JTextField(15);
			pnTitle5.add(lblcsc);
			pnTitle5.add(txtCSC);
			pnTitle5.add(lblcsm);
			pnTitle5.add(txtCSM);
			pnRight.add(pnTitle5);
			
			/////////////////////////////////////
			
			lblDiachi.setPreferredSize(lblmact.getPreferredSize());
			lblHoten.setPreferredSize(lblmact.getPreferredSize());
			lblthang.setPreferredSize(lblmact.getPreferredSize());
			lblcsc.setPreferredSize(lblmact.getPreferredSize());
			lblcsm.setPreferredSize(lblsoDT.getPreferredSize());
			lblmahd.setPreferredSize(lblsoDT.getPreferredSize());
			
			///////////////////////////////////////////////////
			JPanel pnTitle7=new JPanel();
			pnTitle7.setLayout(new FlowLayout(FlowLayout.CENTER));
			btnThem =new JButton("Thêm");
			btnSua=new JButton("Sửa");
			btnXoa=new JButton("Xóa");
			pnTitle7.add(btnThem);
			pnTitle7.add(btnSua);
			pnTitle7.add(btnXoa);
			pnRight.add(pnTitle7);
			////////////////////////////////////////////////////
			dtm=new DefaultTableModel();
			dtm.addColumn("Họ Tên");
			dtm.addColumn("SDT");
			dtm.addColumn("Địa chỉ");
			dtm.addColumn("Mã công tơ");
			dtm.addColumn("Mã hóa đơn");
			dtm.addColumn("Tháng");
			dtm.addColumn("CSC");
			dtm.addColumn("CSM");
			dtm.addColumn("Tiền điện");
			
			tbl=new JTable(dtm);
			JScrollPane scTable=new JScrollPane(tbl,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			pnRight.add(scTable);
			//////////////////////////////////////////////////////
			
			JPanel pnTitle8=new JPanel();
			pnTitle8.setLayout(new BoxLayout(pnTitle8, BoxLayout.X_AXIS));
			
			JPanel pnTitle8_1=new JPanel();
			pnTitle8_1.setLayout(new FlowLayout(FlowLayout.LEFT));
			btnTongtien=new JButton("Tổng tiền điện");
			pnTitle8_1.add(btnTongtien);
			
			JPanel pnTitle8_2=new JPanel();
			pnTitle8_2.setLayout(new FlowLayout(FlowLayout.RIGHT));
			btnSXTen=new JButton("Sắp xếp theo tên");
			btnSXTien=new JButton("SX tiền điện tăng dần");
			btnLuuFile=new JButton("Lưu File");
			btnMoFile=new JButton("Đọc File");
			pnTitle8_2.add(btnSXTen);
			pnTitle8_2.add(btnSXTien);
			pnTitle8_2.add(btnLuuFile);
			pnTitle8_2.add(btnMoFile);
			
			pnTitle8.add(pnTitle8_1);
			pnTitle8.add(pnTitle8_2);
			pnRight.add(pnTitle8);
			
			
			
			////////////////////////////////////////////////////
			
			
//			root=new DefaultMutableTreeNode("Danh sách hóa đơn tháng 1");
//			tree=new JTree(root);
//			JScrollPane scTree =new JScrollPane(tree,
//					JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
//					JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
//			pnLeft.add(scTree, BorderLayout.CENTER);
//			
			////////////////////////////////////////////////////
			
			
		}
		
		
		public void addEvents(){
			tbl.addMouseListener(new MouseListener() {
				
				@Override
				public void mouseReleased(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mousePressed(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mouseExited(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mouseEntered(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mouseClicked(MouseEvent e) {
					// TODO Auto-generated method stub
					int rowSelected =tbl.getSelectedRow();
					if(rowSelected==-1)return;
					String hoten=tbl.getValueAt(rowSelected,0)+"";
					String sdt=tbl.getValueAt(rowSelected, 1)+"";
					String diachi=tbl.getValueAt(rowSelected,2)+"";
					String macongto=tbl.getValueAt(rowSelected,3)+"";
					String mahoadon=tbl.getValueAt(rowSelected, 4)+"";
					String thang=tbl.getValueAt(rowSelected,5)+"";
					String csc=tbl.getValueAt(rowSelected,6)+"";
					String csm=tbl.getValueAt(rowSelected, 7)+"";
					
					txtHoTen.setText(hoten);
					txtDiaChi.setText(diachi);
					txtsoDT.setText(sdt);
					txtmaCt.setText(macongto);
					txtmaHD.setText(mahoadon);
				    txtThang.setText(thang);
				    txtCSC.setText(csc);
				    txtCSM.setText(csm);
				    
				}
			});
			
			btnThem.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					 String a= txtCSC.getText();
					 String b= txtCSM.getText();
					 float csc=Float.parseFloat(a);
					 float csm=Float.parseFloat(b);
					 HoaDon hd0=new HoaDon();
					 float td= hd0.sotien(csc, csm);
					 String tdd=Float.toString(td);
					HoaDon hd=new HoaDon(
							txtHoTen.getText(),
							txtsoDT.getText(),
							txtDiaChi.getText(),
							txtmaCt.getText(),
							txtmaHD.getText(),
						    txtThang.getText(),
						    csc,csm,td
						);
					dsHoaDon.add(hd);
					dtm.setRowCount(0);// Xoa du lieu tren table
					for(HoaDon hdd:dsHoaDon ){
						Vector<String> Arr=new Vector<String>();
						Arr.add(hdd.getHoten());
						Arr.add(hdd.getSoDT());
						Arr.add(hdd.getDiaChi());
						Arr.add(hdd.getMaCT());
						Arr.add(hdd.getMaHD());
						Arr.add(hdd.getDate());
						Arr.add(a);
						Arr.add(b);
						Arr.add(tdd);
						dtm.addRow(Arr);
					}
					
				}

				
			});
				
		btnXoa.addActionListener(
				new ActionListener(){

					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						int sttrow= tbl.getSelectedRow();
						dtm.removeRow(sttrow);
						dsHoaDon.remove(sttrow);
					}
					
					
		});
		btnSua.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int stt=tbl.getSelectedRow();
				dtm.removeRow(stt);
				 String a= txtCSC.getText();
				 String b= txtCSM.getText();
				 float csc=Float.parseFloat(a);
				 float csm=Float.parseFloat(b);
				 HoaDon hd1=new HoaDon();
				 float td=hd1.sotien(csc, csm);
				 String tdd=Float.toString(td);
				 
				HoaDon hd=new HoaDon(
						txtHoTen.getText(),
						txtsoDT.getText(),
						txtDiaChi.getText(),
						txtmaCt.getText(),
						txtmaHD.getText(),
					    txtThang.getText(),
					    csc,csm,td
					);
				
				dsHoaDon.remove(stt);
				dsHoaDon.add(stt,hd);
				dtm.setRowCount(0);
				for(int i=0; i<dsHoaDon.size();i++){
					float a1 =dsHoaDon.get(i).getCSC();
					float b1=dsHoaDon.get(i).getCSM();
					String csc1=Float.toString(a1);
					String csm1=Float.toString(b1);
					float c=dsHoaDon.get(i).sotien(a1, b1);
					String td1=Float.toString(c);
					
					Vector<String> vt=new Vector<String>();
					vt.add(dsHoaDon.get(i).getHoten());
					vt.add(dsHoaDon.get(i).getSoDT());
					vt.add(dsHoaDon.get(i).getDiaChi());
					vt.add(dsHoaDon.get(i).getMaCT());
					vt.add(dsHoaDon.get(i).getMaHD());
					vt.add(dsHoaDon.get(i).getDate());
					vt.add(csc1);
					vt.add(csm1);
					vt.add(td1);
					dtm.addRow(vt);
				}
				
				
			}
		});
		
		btnLuuFile.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				try{
					FileOutputStream fos=new FileOutputStream("E:\\Dulieujava.txt");
					ObjectOutputStream oos=new ObjectOutputStream(fos);
					oos.writeObject(dsHoaDon);
					fos.close();
					oos.close();
				}
				catch(Exception ex){
					ex.printStackTrace();
				}
			}
		});
		
		btnMoFile.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				try{
					FileInputStream fis=new FileInputStream("E:\\Dulieujava.txt");
					ObjectInputStream ois=new ObjectInputStream(fis);
					Object data=ois.readObject();
					dsHoaDon=(ArrayList<HoaDon>) data;
					ois.close();
					fis.close();
					for(HoaDon hd2:dsHoaDon){
						Float a=hd2.getCSC();
						Float b=hd2.getCSM();
						String csc=Float.toString(a);
						String csm=Float.toString(b);
						 float td=hd2.sotien(a, b);
						 String tdd=Float.toString(td);
						Vector<String> vt=new Vector<String>();
						vt.add(hd2.getHoten());
						vt.add(hd2.getSoDT());
						vt.add(hd2.getDiaChi());
						vt.add(hd2.getMaCT());
						vt.add(hd2.getMaHD());
						vt.add(hd2.getDate());
						vt.add(csc);
						vt.add(csm);
						vt.add(tdd);
						dtm.addRow(vt);
					
						
					}
				}
				catch(Exception ex){
					ex.printStackTrace();
				}
				
			}
		});
		
		
		btnSXTien.addActionListener(new ActionListener() {
		
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				HoaDon tg=new HoaDon();
				
				for(int i=0; i<dsHoaDon.size(); i++){
					float a =dsHoaDon.get(i).getCSC();
					float b=dsHoaDon.get(i).getCSM();
					float td1=dsHoaDon.get(i).sotien(a,b);
					for(int j=i+1;j<dsHoaDon.size();j++){
						float c=dsHoaDon.get(j).getCSC();
						float d=dsHoaDon.get(j).getCSM();
						float td2=dsHoaDon.get(j).sotien(c,d);
						if(td1>td2){
						tg=dsHoaDon.get(i);
						dsHoaDon.set(i,dsHoaDon.get(j));
						dsHoaDon.set(j,tg);}
					}
				}
				dtm.setRowCount(0);
				for(int i=0; i<dsHoaDon.size(); i++){
					float a =dsHoaDon.get(i).getCSC();
					float b=dsHoaDon.get(i).getCSM();
					String csc=Float.toString(a);
					String csm=Float.toString(b);
					float c=dsHoaDon.get(i).sotien(a, b);
					String td=Float.toString(c);
					Vector<String> vt=new Vector<String>();
					
					vt.add(dsHoaDon.get(i).getHoten());
					vt.add(dsHoaDon.get(i).getSoDT());
					vt.add(dsHoaDon.get(i).getDiaChi());
					vt.add(dsHoaDon.get(i).getMaCT());
					vt.add(dsHoaDon.get(i).getMaHD());
					vt.add(dsHoaDon.get(i).getDate());
					vt.add(csc);
					vt.add(csm);
					vt.add(td);
					dtm.addRow(vt);
				}
				
				
			}
		});
		btnSXTen.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				HoaDon ab=new HoaDon();
				for(int i=0; i<dsHoaDon.size(); i++){
					for(int j=i+1; j<dsHoaDon.size();j++){
						if(dsHoaDon.get(i).getHoten().compareTo(dsHoaDon.get(j).getHoten())>0)
						{
						ab=dsHoaDon.get(i);
						dsHoaDon.set(i, dsHoaDon.get(j));
						dsHoaDon.set(j,ab);
						}
					}
				}
				dtm.setRowCount(0);
				for(int i=0; i<dsHoaDon.size(); i++){
					float a =dsHoaDon.get(i).getCSC();
					float b=dsHoaDon.get(i).getCSM();
					String csc=Float.toString(a);
					String csm=Float.toString(b);
					float c=dsHoaDon.get(i).sotien(a, b);
					String td=Float.toString(c);
					Vector<String> vt=new Vector<String>();
					
					vt.add(dsHoaDon.get(i).getHoten());
					vt.add(dsHoaDon.get(i).getSoDT());
					vt.add(dsHoaDon.get(i).getDiaChi());
					vt.add(dsHoaDon.get(i).getMaCT());
					vt.add(dsHoaDon.get(i).getMaHD());
					vt.add(dsHoaDon.get(i).getDate());
					vt.add(csc);
					vt.add(csm);
					vt.add(td);
					dtm.addRow(vt);
					
				}
			}
		});
		 
		
				
	}
		
		public void showWindow(){
			this.setSize(1366, 735);
			this.setDefaultCloseOperation(EXIT_ON_CLOSE);
			this.setState(MAXIMIZED_BOTH);
			this.setLocationRelativeTo(null);
			this.setVisible(true);
		}
}
