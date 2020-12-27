package mysql;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.List;
import java.util.Iterator;
import java.text.ParseException;
import java.text.SimpleDateFormat;


public class MainFrame  implements ActionListener{

	
	int width = Toolkit.getDefaultToolkit().getScreenSize().width;
	int height = Toolkit.getDefaultToolkit().getScreenSize().height;
	int x = 400;
	int y = 300;
	int a = 350;
	int b = 200;
	int m = 250;
	int n = 125;
	
	//������ؼ�
	JFrame main;
	Container con;
	JPanel panel1;
	JPanel panel2;
	JPanel panel3;

	//�������ǩ�ؼ�
	JLabel label1;
	JLabel label2;
	JLabel label3;

	//�����水ť�ؼ�
	JButton b1;
	JButton b2;
	JButton b3;
	JButton b4;
	JButton b5;
	JButton b6;

	//��������ؼ�
	JScrollPane scrollPane;
	JList list;
	DefaultListModel model;
	
	//������Ϣ�Ի������
	JDialog insert;
	Container con1;
	JPanel p1;
	JPanel p2;
	JPanel p3;
	JPanel p4;
	JLabel l1;
	JLabel l2;
	JLabel l3;
	JLabel l4;
	JLabel l5;
	JLabel l6;
	JTextField t1;
	JTextField t2;
	JTextField t3;
	JTextField t4;
	JTextField t5;
	JTextField t6;
	JButton confirm1;
	JButton cancel1;
	
	//�޸���Ϣ�Ի���
	JDialog update;
	Container con2;
	JPanel pa1;
	JPanel pa2;
	JPanel pa3;
	JPanel pa4;
	JLabel la1;
	JLabel la2;
	JLabel la3;
	JLabel la4;
	JLabel la5;
	JLabel la6;
	JTextField te1;
	JTextField te2;
	JTextField te3;
	JTextField te4;
	JTextField te5;
	JTextField te6;
	JButton confirm2;
	JButton cancel2;
	
	//�޸���Ϣǰѡ��ѧ�ŶԻ���
	JDialog updateBySno;
	Container con3;
	JPanel pan1;
	JPanel pan2;
	JTextField tex1;
	JButton confirm3;
	JButton cancel3;
	
	//ɾ����Ϣǰѡ��ѧ�ŶԻ���
	JDialog deleteBySno;
	Container con4;
	JPanel pane1;
	JPanel pane2;
	JTextField text1;
	JButton confirm4;
	JButton cancel4;
	
	//��ѯ��Ϣǰ��������ؼ��ֶԻ���
	JDialog keyword;
	Container con5;
	JPanel p01;
	JPanel p02;
	JTextField textf1;
	JButton confirm5;
	JButton cancel5;
	
	
	/*JDialog sno;
	Container con1;
	JPanel p1;
	JTextField t1;
	JButton confirm1;
	JButton cancel1;
	
	
	JDialog name;
	Container con2;
	JPanel p2;
	JTextField t2;
	JButton confirm2;
	JButton cancel2;
	
	JDialog sex;
	Container con3;
	JPanel p3;
	JTextField t3;
	JButton confirm3;
	JButton cancel3;
	
	
	JDialog age;
	Container con4;
	JPanel p4;
	JTextField t4;
	JButton confirm4;
	JButton cancel4;	
	
	
	JDialog birthday;
	Container con5;
	JPanel p5;
	JTextField t5;
	JButton confirm5;
	JButton cancel5;	
	
	JDialog phoneNum;
	Container con6;
	JPanel p6;
	JTextField t6;
	JButton confirm6;
	JButton cancel6;
	
	JDialog keyWord;
	Container con7;
	JPanel p7;
	JTextField t7;
	JButton confirm7;
	JButton cancel7;*/
	
	
	public MainFrame(){
		//������ʵ����
		main = new JFrame("JAVA+MYSQLѧ��ͨѶ¼");
		con = new Container();
		con.setLayout(new FlowLayout());
		panel1 = new JPanel(new FlowLayout());
		panel2 = new JPanel(new FlowLayout());
		panel3 = new JPanel(new FlowLayout());
		label1 = new JLabel("JAVA+MYSQLѧ��ͨѶ¼");
		label2 = new JLabel("0000001");
		label3 = new JLabel("���͢");
		b1 = new JButton("������Ϣ");
		b1.addActionListener(this);
		b2 = new JButton("�޸���Ϣ");
		b2.addActionListener(this);
		b3 = new JButton("ɾ����Ϣ");
		b3.addActionListener(this);
		b4 = new JButton("�鿴��Ϣ");
		b4.addActionListener(this);
		b5 = new JButton("��ѯ��Ϣ");
		b5.addActionListener(this);
		b6 = new JButton("�˳�ϵͳ");	
		b6.addActionListener(this);
		model = new DefaultListModel();
		list = new JList(model);
		scrollPane = new JScrollPane(list);
		list.setVisible(true);
		//���container��panel
		main.add(con);
		con.add(panel1);
		con.add(panel2);
		con.add(panel3);
		con.add(scrollPane);
		//panel��ӿؼ�
		panel1.add(label1);
		panel1.add(label2);
		panel1.add(label3);
		panel2.add(b1);
		panel2.add(b2);
		panel2.add(b3);
		panel3.add(b4);
		panel3.add(b5);
		panel3.add(b6);
		//�������趨
		main.setSize(x,y);
		main.setLocation((width-x)/2,(height-y)/2);
		main.setVisible(true);
		main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
		
		
/*		sno = new JDialog(main,"������ѧ��");
		con1 = new Container();
		con1 = sno.getContentPane();
		con1.setLayout(new FlowLayout());
		p1 = new JPanel(new FlowLayout());
		t1 = new JTextField("",20);
		confirm1 = new JButton("ȷ��");
		confirm1.addActionListener(this);
		cancel1 = new JButton("ȡ��");
		cancel1.addActionListener(this);
		con1.add(t1);
		con1.add(p1);
		p1.add(confirm1);
		p1.add(cancel1);
		sno.setSize(a,b);
		sno.setLocation((width-x)/2,(height-y)/2);
		sno.setVisible(false);
		
		
		name = new JDialog(main,"����������");
		con2 = new Container();
		con2 = name.getContentPane();
		con2.setLayout(new FlowLayout());
		p2 = new JPanel(new FlowLayout());
		t2 = new JTextField("",20);
		confirm2 = new JButton("ȷ��");
		confirm2.addActionListener(this);
		cancel2 = new JButton("ȡ��");
		cancel2.addActionListener(this);
		con2.add(t2);
		con2.add(p2);
		p2.add(confirm2);
		p2.add(cancel2);
		name.setSize(a,b);
		name.setLocation((width-x)/2,(height-y)/2);
		name.setVisible(false);
		
		
		sex = new JDialog(main,"�������Ա�");
		con3 = new Container();
		con3 = sex.getContentPane();
		con3.setLayout(new FlowLayout());
		p3 = new JPanel(new FlowLayout());
		t3 = new JTextField("",20);
		confirm3 = new JButton("ȷ��");
		confirm3.addActionListener(this);
		cancel3 = new JButton("ȡ��");
		cancel3.addActionListener(this);
		con3.add(t3);
		con3.add(p3);
		p3.add(confirm3);
		p3.add(cancel3);
		sex.setSize(a,b);
		sex.setLocation((width-x)/2,(height-y)/2);
		sex.setVisible(false);
		
		
		age = new JDialog(main,"����������");
		con4 = new Container();
		con4 = age.getContentPane();
		con4.setLayout(new FlowLayout());
		p4 = new JPanel(new FlowLayout());
		t4 = new JTextField("",20);
		confirm4 = new JButton("ȷ��");
		confirm4.addActionListener(this);
		cancel4 = new JButton("ȡ��");
		cancel4.addActionListener(this);
		con4.add(t4);
		con4.add(p4);
		p4.add(confirm4);
		p4.add(cancel4);
		age.setSize(a,b);
		age.setLocation((width-x)/2,(height-y)/2);
		age.setVisible(false);
		
		
		birthday = new JDialog(main,"����������");
		con5 = new Container();
		con5 = birthday.getContentPane();
		con5.setLayout(new FlowLayout());
		p5 = new JPanel(new FlowLayout());
		t5 = new JTextField("",20);
		confirm5 = new JButton("ȷ��");
		confirm5.addActionListener(this);
		cancel5 = new JButton("ȡ��");
		cancel5.addActionListener(this);
		con5.add(t5);
		con5.add(p4);
		p5.add(confirm4);
		p5.add(cancel4);
		birthday.setSize(a,b);
		birthday.setLocation((width-x)/2,(height-y)/2);
		birthday.setVisible(false);
		
		phoneNum = new JDialog(main,"������绰����");
		con6 = new Container();
		con6 = phoneNum.getContentPane();
		con6.setLayout(new FlowLayout());
		p6 = new JPanel(new FlowLayout());
		t6 = new JTextField("",20);
		confirm6 = new JButton("ȷ��");
		confirm6.addActionListener(this);
		cancel6 = new JButton("ȡ��");
		cancel6.addActionListener(this);
		con6.add(t6);
		con6.add(p6);
		p6.add(confirm6);
		p6.add(cancel6);
		phoneNum.setSize(a,b);
		phoneNum.setLocation((width-x)/2,(height-y)/2);
		phoneNum.setVisible(false);
		
		
		keyWord = new JDialog(main,"�������ѯ�Ĺؼ���");
		con7 = new Container();
		con7 = keyWord.getContentPane();
		con7.setLayout(new FlowLayout());
		p7 = new JPanel(new FlowLayout());
		t7 = new JTextField("",20);
		confirm7 = new JButton("ȷ��");
		confirm7.addActionListener(this);
		cancel7 = new JButton("ȡ��");
		cancel7.addActionListener(this);
		con7.add(t7);
		con7.add(p7);
		p7.add(confirm7);
		p7.add(cancel7);
		keyWord.setSize(a,b);
		keyWord.setLocation((width-x)/2,(height-y)/2);
		keyWord.setVisible(false);*/
		
		//������Ϣ����ʵ����
		insert = new JDialog(main,"����������");
		con1 = new Container();
		con1 = insert.getContentPane();
		con1.setLayout(new FlowLayout());
		p1 = new JPanel(new FlowLayout());
		p2 = new JPanel(new FlowLayout());
		p3 = new JPanel(new FlowLayout());
		p4 = new JPanel(new FlowLayout());
		l1 = new JLabel("ѧ��");
		l2 = new JLabel("����");
		l3 = new JLabel("�Ա�");
		l4 = new JLabel("����");
		l5 = new JLabel("����");
		l6 = new JLabel("�ֻ�");
		t1 = new JTextField("",10);
		t2 = new JTextField("",10);
		t3 = new JTextField("",10);
		t4 = new JTextField("",10);
		t5 = new JTextField("",10);
		t6 = new JTextField("",10);
		confirm1 = new JButton("ȷ��");
		confirm1.addActionListener(this);
		cancel1 = new JButton("ȡ��");
		cancel1.addActionListener(this);
		p1.add(l1);
		p1.add(t1);
		p1.add(l2);
		p1.add(t2);
		p2.add(l3);
		p2.add(t3);
		p2.add(l4);
		p2.add(t4);
		p3.add(l5);
		p3.add(t5);
		p3.add(l6);
		p3.add(t6);
		p4.add(confirm1);
		p4.add(cancel1);
		con1.add(p1);
		con1.add(p2);
		con1.add(p3);
		con1.add(p4);
		insert.setSize(a,b);
		insert.setLocation((width-a)/2,(height-b)/2);
		insert.setVisible(false);
		
		//�޸���Ϣ����ʵ����
		update = new JDialog(main,"����������");
		con2 = new Container();
		con2 = update.getContentPane();
		con2.setLayout(new FlowLayout());
		pa1 = new JPanel(new FlowLayout());
		pa2 = new JPanel(new FlowLayout());
		pa3 = new JPanel(new FlowLayout());
		pa4 = new JPanel(new FlowLayout());
		la1 = new JLabel("ѧ��");
		la2 = new JLabel("����");
		la3 = new JLabel("�Ա�");
		la4 = new JLabel("����");
		la5 = new JLabel("����");
		la6 = new JLabel("�ֻ�");
		te1 = new JTextField("",10);
		te1.setEditable(false);
		te2 = new JTextField("",10);
		te3 = new JTextField("",10);
		te4 = new JTextField("",10);
		te5 = new JTextField("",10);
		te6 = new JTextField("",10);
		confirm2 = new JButton("ȷ��");
		confirm2.addActionListener(this);
		cancel2 = new JButton("ȡ��");
		cancel2.addActionListener(this);
		pa1.add(la1);
		pa1.add(te1);
		pa1.add(la2);
		pa1.add(te2);
		pa2.add(la3);
		pa2.add(te3);
		pa2.add(la4);
		pa2.add(te4);
		pa3.add(la5);
		pa3.add(te5);
		pa3.add(la6);
		pa3.add(te6);
		pa4.add(confirm2);
		pa4.add(cancel2);
		con2.add(pa1);
		con2.add(pa2);
		con2.add(pa3);
		con2.add(pa4);
		update.setSize(a,b);
		update.setLocation((width-a)/2,(height-b)/2);
		update.setVisible(false);
		
		//�޸���Ϣǰ,ѡ��ѧ�Ž���ʵ����
		updateBySno = new JDialog(main,"������Ҫ�޸���Ϣ��ѧ��ѧ��");
		con3 = new Container();
		con3 = updateBySno.getContentPane();
		con3.setLayout(new FlowLayout());
		pan1 = new JPanel(new FlowLayout());
		pan2 = new JPanel(new FlowLayout());
		tex1 = new JTextField("",20);
		confirm3 = new JButton("ȷ��");
		confirm3.addActionListener(this);
		cancel3 = new JButton("ȡ��");
		cancel3.addActionListener(this);
		con3.add(pan1);
		con3.add(pan2);
		pan1.add(tex1);
		pan2.add(confirm3);
		pan2.add(cancel3);
		updateBySno.setSize(m,n);
		updateBySno.setLocation((width-m)/2,(height-n)/2);
		updateBySno.setVisible(false);
		
		//ɾ����Ϣǰ��ѡ��ѧ�Ž���ʵ����
		deleteBySno = new JDialog(main,"������Ҫɾ����Ϣ��ѧ��ѧ��");
		con4 = new Container();
		con4 = deleteBySno.getContentPane();
		con4.setLayout(new FlowLayout());
		pane1 = new JPanel(new FlowLayout());
		pane2 = new JPanel(new FlowLayout());
		text1 = new JTextField("",20);
		confirm4 = new JButton("ȷ��");
		confirm4.addActionListener(this);
		cancel4 = new JButton("ȡ��");
		cancel4.addActionListener(this);
		con4.add(pane1);
		con4.add(pane2);
		pane1.add(text1);
		pane2.add(confirm4);
		pane2.add(cancel4);
		deleteBySno.setSize(m,n);
		deleteBySno.setLocation((width-m)/2,(height-n)/2);
		deleteBySno.setVisible(false);
		
		
		//��ѯ��Ϣǰ����������ؼ��ֶԻ��� ʵ����
		keyword = new JDialog(main,"����������Ĺؼ���");
		con5 = new Container();
		con5 = keyword.getContentPane();
		con5.setLayout(new FlowLayout());
		p01 = new JPanel(new FlowLayout());
		p02 = new JPanel(new FlowLayout());
		textf1 = new JTextField("",20);
		confirm5 = new JButton("ȷ��");
		confirm5.addActionListener(this);
		cancel5 = new JButton("ȡ��");
		cancel5.addActionListener(this);
		con5.add(p01);
		con5.add(p02);
		p01.add(textf1);
		p02.add(confirm5);
		p02.add(cancel5);
		keyword.setSize(m,n);
		keyword.setLocation((width-m)/2,(height-n)/2);
		keyword.setVisible(false);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Student insertStu = new Student();
		// Student updateBySnoStu = new Student();
		Student updateStu = new Student();
		int snoForUpdate;
		int snoForDelete;
		
		//������Ϣ,����������Ϣ�Ի���
		if(e.getSource() == b1)
		{
			insert.setVisible(true);
		}
		//ȷ��������Ϣ
		if(e.getSource() == confirm1)
		{
			insert.setVisible(false);
			insertStu.setSno(Integer.parseInt(t1.getText()));
			insertStu.setName(t2.getText());
			insertStu.setSex(t3.getText());
			insertStu.setAge(Integer.parseInt(t4.getText()));
			try
			{
				insertStu.setBirthday(new SimpleDateFormat("yyyy-MM-dd").parse(t5.getText()));
			}
			catch(ParseException ex)
			{
				ex.printStackTrace();
				JOptionPane.showMessageDialog(null, "���ڸ�ʽ����");
			}
			insertStu.setPhoneNum(t6.getText());
			try
			{
				DAOfactory.getStudentDAOInstance().doCreate(insertStu);
				JOptionPane.showMessageDialog(null, "ѧ����Ϣ��ӳɹ���");
			}
			catch(Exception ex)
			{
				JOptionPane.showMessageDialog(null, "ѧ����Ϣ���ʧ�ܣ�");
			}
		}
		//ȡ��������Ϣ������������Ϣ�Ի���
		if(e.getSource() == cancel1)
		{
			insert.setVisible(false);
		}
		
		//�޸���Ϣ������ѡ��ѧ�ŶԻ���
		if(e.getSource() == b2)
		{
			updateBySno.setVisible(true);
		}
		
		//ȷ��ѡ��ѧ�ţ������޸���Ϣ�Ի���
		if(e.getSource() == confirm3)
		{
			snoForUpdate = Integer.parseInt(tex1.getText());
			try
			{
				updateStu = DAOfactory.getStudentDAOInstance().findById(snoForUpdate);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
			if(updateStu != null)
			{
				updateBySno.setVisible(false);
				te1.setText(updateStu.getSno()+"");
				update.setVisible(true);
			}
			else
			{
				JOptionPane.showMessageDialog(null, "û�д�ѧ����Ϣ��");
			}
		}
		//ȡ��ѡ��ѧ�ţ�����ѡ��ѧ�ŶԻ���
		if(e.getSource() == cancel3)
		{
			updateBySno.setVisible(false);
		}
		
		//ȷ���޸���Ϣ
		if(e.getSource() == confirm2)
		{
			update.setVisible(false);
			
			updateStu.setSno(Integer.parseInt(te1.getText()));			
			updateStu.setName(te2.getText());
			updateStu.setSex(te3.getText());
			updateStu.setAge(Integer.parseInt(te4.getText()));
			try
			{
				updateStu.setBirthday(new SimpleDateFormat("yyyy-MM-dd").parse(te5.getText()));
			}
			catch(ParseException ex)
			{
				ex.printStackTrace();
				JOptionPane.showMessageDialog(null, "���ڸ�ʽ����");
			}
			updateStu.setPhoneNum(te6.getText());
			try
			{
				DAOfactory.getStudentDAOInstance().doUpdate(updateStu);
				JOptionPane.showMessageDialog(null, "ѧ����Ϣ�޸ĳɹ���");
			}
			catch(Exception ex)
			{
				JOptionPane.showMessageDialog(null, "ѧ����Ϣ�޸�ʧ�ܣ�");
			}
		}
		//ȡ���޸���Ϣ
		if(e.getSource() == cancel2)
		{
			update.setVisible(false);
		}
		
		//ɾ����Ϣ������ѡ��ѧ�ŶԻ���
		if(e.getSource() == b3)
		{
			deleteBySno.setVisible(true);
		}
		if(e.getSource() == confirm4)
		{
			deleteBySno.setVisible(false);
			snoForDelete = Integer.parseInt(text1.getText());
			try
			{
				DAOfactory.getStudentDAOInstance().doDelete(snoForDelete);
				JOptionPane.showMessageDialog(null, "ѧ����Ϣɾ���ɹ���");
			}
			catch(Exception ex)
			{
				JOptionPane.showMessageDialog(null, "ѧ����Ϣɾ��ʧ�ܣ�");
			}
		}
		if(e.getSource() == cancel4)
		{
			deleteBySno.setVisible(false);
		}
		
		
		if(e.getSource() == b4)
		{
			List<Student> all = null;
			try
			{
				all = DAOfactory.getStudentDAOInstance().findAll("");
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
			
			Iterator<Student> iter = all.iterator();
			while (iter.hasNext())
			{
				Student stu = iter.next();
				model.addElement("ѧ��:"+stu.getSno()+"  ����:"+stu.getName()+"  �Ա�:"+stu.getSex()+"  ����:"+stu.getAge());
				model.addElement("����:"+stu.getBirthday()+"  �ֻ�����:"+stu.getPhoneNum());
				model.addElement(" ");
			}
		}
		
		if(e.getSource() == b5)
		{
			keyword.setVisible(true);
		}
		if(e.getSource() == confirm5)
		{
			keyword.setVisible(false);
			List<Student> all = null;
			String kw = textf1.getText();
			try
			{
				all = DAOfactory.getStudentDAOInstance().findAll(kw);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
			Iterator<Student> iter = all.iterator();
			while (iter.hasNext())
			{
				Student stu = iter.next();
				model.addElement("ѧ��:"+stu.getSno()+"  ����:"+stu.getName()+"  �Ա�:"+stu.getSex()+"  ����:"+stu.getAge());
				model.addElement("����:"+stu.getBirthday()+"  �ֻ�����:"+stu.getPhoneNum());
				model.addElement(" ");
			}
		}
		if(e.getSource() == cancel5)
		{
			keyword.setVisible(false);
		}
		
		if(e.getSource() == b6)
		{
			JOptionPane.showMessageDialog(null, "ллʹ�ã�");
			System.exit(0);
		}
		
	}
	
	
}
