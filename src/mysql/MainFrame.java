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
	
	//主界面控件
	JFrame main;
	Container con;
	JPanel panel1;
	JPanel panel2;
	JPanel panel3;

	//主界面标签控件
	JLabel label1;
	JLabel label2;
	JLabel label3;

	//主界面按钮控件
	JButton b1;
	JButton b2;
	JButton b3;
	JButton b4;
	JButton b5;
	JButton b6;

	//主界面表单控件
	JScrollPane scrollPane;
	JList list;
	DefaultListModel model;
	
	//增加信息对话框界面
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
	
	//修改信息对话框
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
	
	//修改信息前选择学号对话框
	JDialog updateBySno;
	Container con3;
	JPanel pan1;
	JPanel pan2;
	JTextField tex1;
	JButton confirm3;
	JButton cancel3;
	
	//删除信息前选择学号对话框
	JDialog deleteBySno;
	Container con4;
	JPanel pane1;
	JPanel pane2;
	JTextField text1;
	JButton confirm4;
	JButton cancel4;
	
	//查询信息前输入检索关键字对话框
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
		//主界面实例化
		main = new JFrame("JAVA+MYSQL学生通讯录");
		con = new Container();
		con.setLayout(new FlowLayout());
		panel1 = new JPanel(new FlowLayout());
		panel2 = new JPanel(new FlowLayout());
		panel3 = new JPanel(new FlowLayout());
		label1 = new JLabel("JAVA+MYSQL学生通讯录");
		label2 = new JLabel("0000001");
		label3 = new JLabel("朱晋廷");
		b1 = new JButton("增加信息");
		b1.addActionListener(this);
		b2 = new JButton("修改信息");
		b2.addActionListener(this);
		b3 = new JButton("删除信息");
		b3.addActionListener(this);
		b4 = new JButton("查看信息");
		b4.addActionListener(this);
		b5 = new JButton("查询信息");
		b5.addActionListener(this);
		b6 = new JButton("退出系统");	
		b6.addActionListener(this);
		model = new DefaultListModel();
		list = new JList(model);
		scrollPane = new JScrollPane(list);
		list.setVisible(true);
		//添加container和panel
		main.add(con);
		con.add(panel1);
		con.add(panel2);
		con.add(panel3);
		con.add(scrollPane);
		//panel添加控件
		panel1.add(label1);
		panel1.add(label2);
		panel1.add(label3);
		panel2.add(b1);
		panel2.add(b2);
		panel2.add(b3);
		panel3.add(b4);
		panel3.add(b5);
		panel3.add(b6);
		//主界面设定
		main.setSize(x,y);
		main.setLocation((width-x)/2,(height-y)/2);
		main.setVisible(true);
		main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
		
		
/*		sno = new JDialog(main,"请输入学号");
		con1 = new Container();
		con1 = sno.getContentPane();
		con1.setLayout(new FlowLayout());
		p1 = new JPanel(new FlowLayout());
		t1 = new JTextField("",20);
		confirm1 = new JButton("确定");
		confirm1.addActionListener(this);
		cancel1 = new JButton("取消");
		cancel1.addActionListener(this);
		con1.add(t1);
		con1.add(p1);
		p1.add(confirm1);
		p1.add(cancel1);
		sno.setSize(a,b);
		sno.setLocation((width-x)/2,(height-y)/2);
		sno.setVisible(false);
		
		
		name = new JDialog(main,"请输入姓名");
		con2 = new Container();
		con2 = name.getContentPane();
		con2.setLayout(new FlowLayout());
		p2 = new JPanel(new FlowLayout());
		t2 = new JTextField("",20);
		confirm2 = new JButton("确定");
		confirm2.addActionListener(this);
		cancel2 = new JButton("取消");
		cancel2.addActionListener(this);
		con2.add(t2);
		con2.add(p2);
		p2.add(confirm2);
		p2.add(cancel2);
		name.setSize(a,b);
		name.setLocation((width-x)/2,(height-y)/2);
		name.setVisible(false);
		
		
		sex = new JDialog(main,"请输入性别");
		con3 = new Container();
		con3 = sex.getContentPane();
		con3.setLayout(new FlowLayout());
		p3 = new JPanel(new FlowLayout());
		t3 = new JTextField("",20);
		confirm3 = new JButton("确定");
		confirm3.addActionListener(this);
		cancel3 = new JButton("取消");
		cancel3.addActionListener(this);
		con3.add(t3);
		con3.add(p3);
		p3.add(confirm3);
		p3.add(cancel3);
		sex.setSize(a,b);
		sex.setLocation((width-x)/2,(height-y)/2);
		sex.setVisible(false);
		
		
		age = new JDialog(main,"请输入年龄");
		con4 = new Container();
		con4 = age.getContentPane();
		con4.setLayout(new FlowLayout());
		p4 = new JPanel(new FlowLayout());
		t4 = new JTextField("",20);
		confirm4 = new JButton("确定");
		confirm4.addActionListener(this);
		cancel4 = new JButton("取消");
		cancel4.addActionListener(this);
		con4.add(t4);
		con4.add(p4);
		p4.add(confirm4);
		p4.add(cancel4);
		age.setSize(a,b);
		age.setLocation((width-x)/2,(height-y)/2);
		age.setVisible(false);
		
		
		birthday = new JDialog(main,"请输入生日");
		con5 = new Container();
		con5 = birthday.getContentPane();
		con5.setLayout(new FlowLayout());
		p5 = new JPanel(new FlowLayout());
		t5 = new JTextField("",20);
		confirm5 = new JButton("确定");
		confirm5.addActionListener(this);
		cancel5 = new JButton("取消");
		cancel5.addActionListener(this);
		con5.add(t5);
		con5.add(p4);
		p5.add(confirm4);
		p5.add(cancel4);
		birthday.setSize(a,b);
		birthday.setLocation((width-x)/2,(height-y)/2);
		birthday.setVisible(false);
		
		phoneNum = new JDialog(main,"请输入电话号码");
		con6 = new Container();
		con6 = phoneNum.getContentPane();
		con6.setLayout(new FlowLayout());
		p6 = new JPanel(new FlowLayout());
		t6 = new JTextField("",20);
		confirm6 = new JButton("确定");
		confirm6.addActionListener(this);
		cancel6 = new JButton("取消");
		cancel6.addActionListener(this);
		con6.add(t6);
		con6.add(p6);
		p6.add(confirm6);
		p6.add(cancel6);
		phoneNum.setSize(a,b);
		phoneNum.setLocation((width-x)/2,(height-y)/2);
		phoneNum.setVisible(false);
		
		
		keyWord = new JDialog(main,"请输入查询的关键字");
		con7 = new Container();
		con7 = keyWord.getContentPane();
		con7.setLayout(new FlowLayout());
		p7 = new JPanel(new FlowLayout());
		t7 = new JTextField("",20);
		confirm7 = new JButton("确定");
		confirm7.addActionListener(this);
		cancel7 = new JButton("取消");
		cancel7.addActionListener(this);
		con7.add(t7);
		con7.add(p7);
		p7.add(confirm7);
		p7.add(cancel7);
		keyWord.setSize(a,b);
		keyWord.setLocation((width-x)/2,(height-y)/2);
		keyWord.setVisible(false);*/
		
		//增加信息界面实例化
		insert = new JDialog(main,"请输入数据");
		con1 = new Container();
		con1 = insert.getContentPane();
		con1.setLayout(new FlowLayout());
		p1 = new JPanel(new FlowLayout());
		p2 = new JPanel(new FlowLayout());
		p3 = new JPanel(new FlowLayout());
		p4 = new JPanel(new FlowLayout());
		l1 = new JLabel("学号");
		l2 = new JLabel("姓名");
		l3 = new JLabel("性别");
		l4 = new JLabel("年龄");
		l5 = new JLabel("生日");
		l6 = new JLabel("手机");
		t1 = new JTextField("",10);
		t2 = new JTextField("",10);
		t3 = new JTextField("",10);
		t4 = new JTextField("",10);
		t5 = new JTextField("",10);
		t6 = new JTextField("",10);
		confirm1 = new JButton("确定");
		confirm1.addActionListener(this);
		cancel1 = new JButton("取消");
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
		
		//修改信息界面实例化
		update = new JDialog(main,"请输入数据");
		con2 = new Container();
		con2 = update.getContentPane();
		con2.setLayout(new FlowLayout());
		pa1 = new JPanel(new FlowLayout());
		pa2 = new JPanel(new FlowLayout());
		pa3 = new JPanel(new FlowLayout());
		pa4 = new JPanel(new FlowLayout());
		la1 = new JLabel("学号");
		la2 = new JLabel("姓名");
		la3 = new JLabel("性别");
		la4 = new JLabel("年龄");
		la5 = new JLabel("生日");
		la6 = new JLabel("手机");
		te1 = new JTextField("",10);
		te1.setEditable(false);
		te2 = new JTextField("",10);
		te3 = new JTextField("",10);
		te4 = new JTextField("",10);
		te5 = new JTextField("",10);
		te6 = new JTextField("",10);
		confirm2 = new JButton("确定");
		confirm2.addActionListener(this);
		cancel2 = new JButton("取消");
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
		
		//修改信息前,选择学号界面实例化
		updateBySno = new JDialog(main,"请输入要修改信息的学生学号");
		con3 = new Container();
		con3 = updateBySno.getContentPane();
		con3.setLayout(new FlowLayout());
		pan1 = new JPanel(new FlowLayout());
		pan2 = new JPanel(new FlowLayout());
		tex1 = new JTextField("",20);
		confirm3 = new JButton("确定");
		confirm3.addActionListener(this);
		cancel3 = new JButton("取消");
		cancel3.addActionListener(this);
		con3.add(pan1);
		con3.add(pan2);
		pan1.add(tex1);
		pan2.add(confirm3);
		pan2.add(cancel3);
		updateBySno.setSize(m,n);
		updateBySno.setLocation((width-m)/2,(height-n)/2);
		updateBySno.setVisible(false);
		
		//删除信息前，选择学号界面实例化
		deleteBySno = new JDialog(main,"请输入要删除信息的学生学号");
		con4 = new Container();
		con4 = deleteBySno.getContentPane();
		con4.setLayout(new FlowLayout());
		pane1 = new JPanel(new FlowLayout());
		pane2 = new JPanel(new FlowLayout());
		text1 = new JTextField("",20);
		confirm4 = new JButton("确定");
		confirm4.addActionListener(this);
		cancel4 = new JButton("取消");
		cancel4.addActionListener(this);
		con4.add(pane1);
		con4.add(pane2);
		pane1.add(text1);
		pane2.add(confirm4);
		pane2.add(cancel4);
		deleteBySno.setSize(m,n);
		deleteBySno.setLocation((width-m)/2,(height-n)/2);
		deleteBySno.setVisible(false);
		
		
		//查询信息前，输入检索关键字对话框 实例化
		keyword = new JDialog(main,"请输入检索的关键字");
		con5 = new Container();
		con5 = keyword.getContentPane();
		con5.setLayout(new FlowLayout());
		p01 = new JPanel(new FlowLayout());
		p02 = new JPanel(new FlowLayout());
		textf1 = new JTextField("",20);
		confirm5 = new JButton("确定");
		confirm5.addActionListener(this);
		cancel5 = new JButton("取消");
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
		
		//增加信息,弹出增加信息对话框
		if(e.getSource() == b1)
		{
			insert.setVisible(true);
		}
		//确认增加信息
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
				JOptionPane.showMessageDialog(null, "日期格式错误！");
			}
			insertStu.setPhoneNum(t6.getText());
			try
			{
				DAOfactory.getStudentDAOInstance().doCreate(insertStu);
				JOptionPane.showMessageDialog(null, "学生信息添加成功！");
			}
			catch(Exception ex)
			{
				JOptionPane.showMessageDialog(null, "学生信息添加失败！");
			}
		}
		//取消增加信息，隐藏增加信息对话框
		if(e.getSource() == cancel1)
		{
			insert.setVisible(false);
		}
		
		//修改信息，弹出选择学号对话框
		if(e.getSource() == b2)
		{
			updateBySno.setVisible(true);
		}
		
		//确定选择学号，弹出修改信息对话框
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
				JOptionPane.showMessageDialog(null, "没有此学生信息。");
			}
		}
		//取消选择学号，隐藏选择学号对话框
		if(e.getSource() == cancel3)
		{
			updateBySno.setVisible(false);
		}
		
		//确认修改信息
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
				JOptionPane.showMessageDialog(null, "日期格式错误！");
			}
			updateStu.setPhoneNum(te6.getText());
			try
			{
				DAOfactory.getStudentDAOInstance().doUpdate(updateStu);
				JOptionPane.showMessageDialog(null, "学生信息修改成功！");
			}
			catch(Exception ex)
			{
				JOptionPane.showMessageDialog(null, "学生信息修改失败！");
			}
		}
		//取消修改信息
		if(e.getSource() == cancel2)
		{
			update.setVisible(false);
		}
		
		//删除信息，弹出选择学号对话框
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
				JOptionPane.showMessageDialog(null, "学生信息删除成功！");
			}
			catch(Exception ex)
			{
				JOptionPane.showMessageDialog(null, "学生信息删除失败！");
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
				model.addElement("学号:"+stu.getSno()+"  姓名:"+stu.getName()+"  性别:"+stu.getSex()+"  年龄:"+stu.getAge());
				model.addElement("生日:"+stu.getBirthday()+"  手机号码:"+stu.getPhoneNum());
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
				model.addElement("学号:"+stu.getSno()+"  姓名:"+stu.getName()+"  性别:"+stu.getSex()+"  年龄:"+stu.getAge());
				model.addElement("生日:"+stu.getBirthday()+"  手机号码:"+stu.getPhoneNum());
				model.addElement(" ");
			}
		}
		if(e.getSource() == cancel5)
		{
			keyword.setVisible(false);
		}
		
		if(e.getSource() == b6)
		{
			JOptionPane.showMessageDialog(null, "谢谢使用！");
			System.exit(0);
		}
		
	}
	
	
}
