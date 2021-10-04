package coffe;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Coffe extends JFrame {

	private JPanel contentPane;
	private JTextField Caffe_Americano_jTextField;
	private JTextField Mochaccino_jTextField;
	private JTextField cappuccino_jTextField;
	private JTextField jIrish_Coffee_TextField;
	private JTextField long_black_coffee_jTextField;
	private JTextField Cost_of_Drink_jTextField;
	private JTextField Cost_of_Cakes_jTextField;
	private JTextField Service_Charge_jTextField;
	private JTextField Tax_jTextField;
	private JTextField Black_Forest_Gateau_jTextField;
	private JTextField Pineapple_Cake_jTextField;
	private JTextField Eggless_Truffle_Cake_jTextField;
	private JTextField Streusel_Coffee_Cake_jTextField;
	private JTextField Mango_Meringue_Cake_jTextField;
	private JTextField Blueberry_Coffee_Cake_jTextField;
	private JTextField Coffe_Cake_jTextField;
	private JTextField Gluten_Free_hocolate_Cake_jTextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Coffe frame = new Coffe();
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
	public Coffe() {
		
		
		double []drink =new double[5];
		double []cakes =new double[8];
		String []Cost =new String[3];
		double []i=new double[13];
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1249, 757);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(105, 105, 105));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(160, 82, 45));
		panel.setBounds(12, 13, 1269, 86);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblCoffeLand = new JLabel("Coffe Land");
		lblCoffeLand.setHorizontalAlignment(SwingConstants.CENTER);
		lblCoffeLand.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		lblCoffeLand.setBackground(Color.RED);
		lblCoffeLand.setBounds(12, 13, 1022, 60);
		panel.add(lblCoffeLand);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(127, 255, 212));
		panel_1.setBounds(12, 107, 308, 420);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JCheckBox Caffe_Americano = new JCheckBox("Caff\u00E8 Americano ");
		Caffe_Americano.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				 double cCaffe_Americano =Double.parseDouble(Cost_of_Drink_jTextField.getText());
		         double aCaffe_Americano =Double.parseDouble(Caffe_Americano_jTextField.getText());
		         
		         Coffeprice t1 = new Coffeprice();
		         t1.setiCaffe_Americano(5000);;
		       
		        
		        if(Caffe_Americano.isSelected())
		        {
		            i[0]=(aCaffe_Americano*t1.getiCaffe_Americano())+cCaffe_Americano;
		            String pCaffe_Americano=String.format("%.2f",i[0]);
		            Cost_of_Drink_jTextField.setText(pCaffe_Americano);
		           // Caffe_Americano_jTextField.setText(pDrink);
		        }
			}
		});
		Caffe_Americano.setFont(new Font("Tahoma", Font.BOLD, 13));
		Caffe_Americano.setBounds(8, 21, 151, 44);
		panel_1.add(Caffe_Americano);
		
		JCheckBox Mochaccino = new JCheckBox("Mochaccino");
		Mochaccino.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				 double cMochaccino =Double.parseDouble(Cost_of_Drink_jTextField.getText());
		         double aMochaccino =Double.parseDouble(Mochaccino_jTextField.getText());
		         
		         Coffeprice t2 = new Coffeprice();
		         
		         t2.setiMochaccino(4000);;
		        
		        if(Mochaccino.isSelected())
		        {
		            i[1]=(aMochaccino*t2.getiMochaccino())+cMochaccino;
		            String pMochaccino=String.format("%.2f",i[1]);
		            Cost_of_Drink_jTextField.setText(pMochaccino);
		           //Mochaccino_jTextField.setText(pDrink);
		        }
			}
		});
		Mochaccino.setFont(new Font("Tahoma", Font.BOLD, 13));
		Mochaccino.setBounds(8, 86, 151, 44);
		panel_1.add(Mochaccino);
		
		JCheckBox cappuccino = new JCheckBox("cappuccino");
		cappuccino.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				 double ccappuccino =Double.parseDouble(Cost_of_Drink_jTextField.getText());
		         double acappuccino =Double.parseDouble(cappuccino_jTextField.getText());
		         
		         Coffeprice t3 = new Coffeprice();
		         t3.setIcappuccino(3000);
		        
		        if(cappuccino.isSelected())
		        {
		            i[2]=(acappuccino*t3.getIcappuccino())+ccappuccino;
		            String pcappuccino=String.format("%.2f",i[2]);
		            Cost_of_Drink_jTextField.setText(pcappuccino);
		          //cappuccino_jTextField.setText(pDrink);
		        }
			}
		});
		cappuccino.setFont(new Font("Tahoma", Font.BOLD, 13));
		cappuccino.setBounds(8, 157, 151, 44);
		panel_1.add(cappuccino);
		
		JCheckBox Irish_Coffee = new JCheckBox("Irish Coffee");
		Irish_Coffee.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				double cIrish_Coffee =Double.parseDouble(Cost_of_Drink_jTextField.getText());
		         double aIrish_Coffee =Double.parseDouble(jIrish_Coffee_TextField.getText());
		         Coffeprice t4 = new Coffeprice();
		        t4.setiIrish_Coffee(3500);
		        
		        if(Irish_Coffee.isSelected())
		        {
		            i[3]=(aIrish_Coffee*t4.getiIrish_Coffee())+cIrish_Coffee;
		            String pIrish_Coffee=String.format("%.2f",i[3]);
		            Cost_of_Drink_jTextField.setText(pIrish_Coffee);
		         // jIrish_Coffee_TextField.setText(pDrink);
		        }
			}
		});
		Irish_Coffee.setFont(new Font("Tahoma", Font.BOLD, 13));
		Irish_Coffee.setBounds(8, 235, 151, 43);
		panel_1.add(Irish_Coffee);
		
		JCheckBox long_black_coffee = new JCheckBox("long black coffee");
		long_black_coffee.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				 double clong_black_coffee =Double.parseDouble(Cost_of_Drink_jTextField.getText());
		         double along_black_coffee =Double.parseDouble(long_black_coffee_jTextField.getText());
		         Coffeprice t5 = new Coffeprice();
		        t5.setIlong_black_coffee(2500);
		        
		        if(long_black_coffee.isSelected())
		        {
		            i[4]=(along_black_coffee*t5.getIlong_black_coffee())+clong_black_coffee;
		            String plong_black_coffee=String.format("%.2f",i[4]);
		            Cost_of_Drink_jTextField.setText(plong_black_coffee);
		          //long_black_coffee_jTextField.setText(pDrink);
		        }
			}
		});
		long_black_coffee.setFont(new Font("Tahoma", Font.BOLD, 13));
		long_black_coffee.setBounds(8, 299, 151, 44);
		panel_1.add(long_black_coffee);
		
		Caffe_Americano_jTextField = new JTextField();
		Caffe_Americano_jTextField.setHorizontalAlignment(SwingConstants.CENTER);
		Caffe_Americano_jTextField.setText("0");
		Caffe_Americano_jTextField.setBounds(180, 22, 116, 43);
		panel_1.add(Caffe_Americano_jTextField);
		Caffe_Americano_jTextField.setColumns(10);
		
		Mochaccino_jTextField = new JTextField();
		Mochaccino_jTextField.setText("0");
		Mochaccino_jTextField.setHorizontalAlignment(SwingConstants.CENTER);
		Mochaccino_jTextField.setBounds(180, 87, 116, 43);
		panel_1.add(Mochaccino_jTextField);
		Mochaccino_jTextField.setColumns(10);
		
		cappuccino_jTextField = new JTextField();
		cappuccino_jTextField.setHorizontalAlignment(SwingConstants.CENTER);
		cappuccino_jTextField.setText("0");
		cappuccino_jTextField.setBounds(180, 158, 116, 43);
		panel_1.add(cappuccino_jTextField);
		cappuccino_jTextField.setColumns(10);
		
		jIrish_Coffee_TextField = new JTextField();
		jIrish_Coffee_TextField.setHorizontalAlignment(SwingConstants.CENTER);
		jIrish_Coffee_TextField.setText("0");
		jIrish_Coffee_TextField.setBounds(180, 235, 116, 44);
		panel_1.add(jIrish_Coffee_TextField);
		jIrish_Coffee_TextField.setColumns(10);
		
		long_black_coffee_jTextField = new JTextField();
		long_black_coffee_jTextField.setHorizontalAlignment(SwingConstants.CENTER);
		long_black_coffee_jTextField.setText("0");
		long_black_coffee_jTextField.setBounds(180, 299, 116, 44);
		panel_1.add(long_black_coffee_jTextField);
		long_black_coffee_jTextField.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(153, 50, 204));
		panel_2.setBounds(332, 116, 427, 524);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JCheckBox Black_Forest_Gateau = new JCheckBox("Black Forest Gateau");
		Black_Forest_Gateau.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			    double cBlack_Forest_Gateau =Double.parseDouble(Cost_of_Cakes_jTextField.getText());
		         double aBlack_Forest_Gateau =Double.parseDouble(Black_Forest_Gateau_jTextField.getText());
		         Cakeprice k1=new Cakeprice();
		         k1.setiBlack_Forest_Gateau(3000);
		       
		        
		        if(Black_Forest_Gateau.isSelected())
		        {
		            i[5]=(aBlack_Forest_Gateau*k1.getiBlack_Forest_Gateau())+cBlack_Forest_Gateau;
		            String pBlack_Forest_Gateau=String.format("%.2f",i[5]);
		            Cost_of_Cakes_jTextField.setText(pBlack_Forest_Gateau);
		         // Black_Forest_Gateau_jTextField.setText(pDrink);
		        }
			}
		});
		Black_Forest_Gateau.setFont(new Font("Tahoma", Font.BOLD, 13));
		Black_Forest_Gateau.setBounds(8, 10, 210, 40);
		panel_2.add(Black_Forest_Gateau);
		
		JCheckBox Pineapple_Cake = new JCheckBox("Pineapple Cake");
		Pineapple_Cake.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				double cPineapple_Cake =Double.parseDouble(Cost_of_Cakes_jTextField.getText());
		         double aPineapple_Cake =Double.parseDouble(Pineapple_Cake_jTextField.getText());
		         Cakeprice k2=new Cakeprice();
		         k2.setiPineapple_Cake(3500);
		       
		        if(Pineapple_Cake.isSelected())
		        {
		            i[6]=(aPineapple_Cake*k2.getiPineapple_Cake())+cPineapple_Cake;
		            String pPineapple_Cake=String.format("%.2f",i[6]);
		            Cost_of_Cakes_jTextField.setText(pPineapple_Cake);
		         // Black_Forest_Gateau_jTextField.setText(pDrink);
		        }
			}
		});
		Pineapple_Cake.setFont(new Font("Tahoma", Font.BOLD, 13));
		Pineapple_Cake.setBounds(8, 73, 210, 40);
		panel_2.add(Pineapple_Cake);
		
		JCheckBox Eggless_Truffle_Cake = new JCheckBox("Eggless Truffle Cake");
		Eggless_Truffle_Cake.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				double cEggless_Truffle_Cake =Double.parseDouble(Cost_of_Cakes_jTextField.getText());
		         double aEggless_Truffle_Cake=Double.parseDouble(Eggless_Truffle_Cake_jTextField.getText());
		         Cakeprice k3=new Cakeprice();
		         k3.setiEggless_Truffle_Cake(4000);
		      
		        
		        if(Eggless_Truffle_Cake.isSelected())
		        {
		            i[7]=(aEggless_Truffle_Cake*k3.getiEggless_Truffle_Cake())+cEggless_Truffle_Cake;
		            String pEggless_Truffle_Cake=String.format("%.2f",i[7]);
		            Cost_of_Cakes_jTextField.setText(pEggless_Truffle_Cake);
		         //Eggless_Truffle_Cake_jTextField.setText(pDrink);
		        }
			}
		});
		Eggless_Truffle_Cake.setFont(new Font("Tahoma", Font.BOLD, 13));
		Eggless_Truffle_Cake.setBounds(8, 139, 210, 40);
		panel_2.add(Eggless_Truffle_Cake);
		
		JCheckBox Streusel_Coffee_Cake = new JCheckBox("Streusel Coffee Cake");
		Streusel_Coffee_Cake.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				  double cStreusel_Coffee_Cake =Double.parseDouble(Cost_of_Cakes_jTextField.getText());
			         double aStreusel_Coffee_Cake=Double.parseDouble(Streusel_Coffee_Cake_jTextField.getText());
			         Cakeprice k4=new Cakeprice();
			         k4.setiStreusel_Coffee_Cake(2500);
			       
			        
			        if(Streusel_Coffee_Cake.isSelected())
			        {
			            i[8]=(aStreusel_Coffee_Cake*k4.getiStreusel_Coffee_Cake())+cStreusel_Coffee_Cake;
			            String pStreusel_Coffee_Cake=String.format("%.2f",i[8]);
			            Cost_of_Cakes_jTextField.setText(pStreusel_Coffee_Cake);
			         // Streusel_Coffee_Cake_jTextField.setText(pDrink);
			        }
			}
		});
		Streusel_Coffee_Cake.setFont(new Font("Tahoma", Font.BOLD, 13));
		Streusel_Coffee_Cake.setBounds(8, 197, 210, 33);
		panel_2.add(Streusel_Coffee_Cake);
		
		JCheckBox Mango_Meringue_Cake = new JCheckBox(" Mango Meringue Cake");
		Mango_Meringue_Cake.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				  double cMango_Meringue_Cake =Double.parseDouble(Cost_of_Cakes_jTextField.getText());
			         double aMango_Meringue_Cake=Double.parseDouble(Mango_Meringue_Cake_jTextField.getText());
			         Cakeprice k5=new Cakeprice();
			        k5.setiMango_Meringue_Cake(5000);
			        
			        if(Mango_Meringue_Cake.isSelected())
			        {
			            i[9]=(aMango_Meringue_Cake*k5.getiMango_Meringue_Cake())+cMango_Meringue_Cake;
			            String pMango_Meringue_Cake=String.format("%.2f",i[9]);
			            Cost_of_Cakes_jTextField.setText(pMango_Meringue_Cake);
			         // Mango_Meringue_Cake_jTextField.setText(pDrink);
			        }
			}
		});
		Mango_Meringue_Cake.setFont(new Font("Tahoma", Font.BOLD, 13));
		Mango_Meringue_Cake.setBounds(8, 252, 210, 40);
		panel_2.add(Mango_Meringue_Cake);
		
		JCheckBox Blueberry_Coffee_Cake = new JCheckBox("Blueberry Coffee Cake");
		Blueberry_Coffee_Cake.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				 double cBlueberry_Coffee_Cake =Double.parseDouble(Cost_of_Cakes_jTextField.getText());
		         double aBlueberry_Coffee_Cake=Double.parseDouble(Blueberry_Coffee_Cake_jTextField.getText());
		         Cakeprice k6=new Cakeprice();
		        k6.setiBlueberry_Coffee_Cake(4500);
		        
		        if(Blueberry_Coffee_Cake.isSelected())
		        {
		            i[10]=(aBlueberry_Coffee_Cake*k6.getiBlueberry_Coffee_Cake())+cBlueberry_Coffee_Cake;
		            String pBlueberry_Coffee_Cake=String.format("%.2f",i[10]);
		            Cost_of_Cakes_jTextField.setText(pBlueberry_Coffee_Cake);
		         // Blueberry_Coffee_Cake_jTextField.setText(pDrink);
		        }
			}
		});
		Blueberry_Coffee_Cake.setFont(new Font("Tahoma", Font.BOLD, 13));
		Blueberry_Coffee_Cake.setBounds(8, 315, 210, 40);
		panel_2.add(Blueberry_Coffee_Cake);
		
		JCheckBox Coffe_Cake = new JCheckBox("Coffee Cake ");
		Coffe_Cake.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				 double cCoffe_Cake =Double.parseDouble(Cost_of_Cakes_jTextField.getText());
		         double aCoffe_Cake=Double.parseDouble(Coffe_Cake_jTextField.getText());
		         Cakeprice k7=new Cakeprice();
		        k7.setiCoffe_Cake(3000);
		        
		        if(Coffe_Cake.isSelected())
		        {
		            i[11]=(aCoffe_Cake*k7.getiCoffe_Cake())+cCoffe_Cake;
		            String pCoffe_Cake=String.format("%.2f",i[11]);
		            Cost_of_Cakes_jTextField.setText(pCoffe_Cake);
		         // Coffe_Cake_jTextField.setText(pDrink);
		        }
			}
		});
		Coffe_Cake.setFont(new Font("Tahoma", Font.BOLD, 13));
		Coffe_Cake.setBounds(8, 376, 210, 40);
		panel_2.add(Coffe_Cake);
		
		JCheckBox Gluten_Free_hocolate_Cake = new JCheckBox("Gluten Free Chocolate Cake");
		Gluten_Free_hocolate_Cake.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				double cGluten_Free_hocolate_Cake =Double.parseDouble(Cost_of_Cakes_jTextField.getText());
		         double aGluten_Free_hocolate_Cake=Double.parseDouble(Gluten_Free_hocolate_Cake_jTextField.getText());
		         Cakeprice k8=new Cakeprice();
		        k8.setiGluten_Free_hocolate_Cake(6000);
		        
		        if(Gluten_Free_hocolate_Cake.isSelected())
		        {
		            i[12]=(aGluten_Free_hocolate_Cake*k8.getiGluten_Free_hocolate_Cake())+cGluten_Free_hocolate_Cake;
		            String pGluten_Free_hocolate_Cake=String.format("%.2f",i[12]);
		            Cost_of_Cakes_jTextField.setText(pGluten_Free_hocolate_Cake);
		         // Gluten_Free_hocolate_Cake_jTextField.setText(pDrink);
		        }
			}
		});
		Gluten_Free_hocolate_Cake.setFont(new Font("Tahoma", Font.BOLD, 13));
		Gluten_Free_hocolate_Cake.setBounds(8, 440, 210, 39);
		panel_2.add(Gluten_Free_hocolate_Cake);
		
		Black_Forest_Gateau_jTextField = new JTextField();
		Black_Forest_Gateau_jTextField.setHorizontalAlignment(SwingConstants.CENTER);
		Black_Forest_Gateau_jTextField.setText("0");
		Black_Forest_Gateau_jTextField.setBounds(299, 10, 116, 40);
		panel_2.add(Black_Forest_Gateau_jTextField);
		Black_Forest_Gateau_jTextField.setColumns(10);
		
		Pineapple_Cake_jTextField = new JTextField();
		Pineapple_Cake_jTextField.setText("0");
		Pineapple_Cake_jTextField.setHorizontalAlignment(SwingConstants.CENTER);
		Pineapple_Cake_jTextField.setBounds(299, 73, 116, 40);
		panel_2.add(Pineapple_Cake_jTextField);
		Pineapple_Cake_jTextField.setColumns(10);
		
		Eggless_Truffle_Cake_jTextField = new JTextField();
		Eggless_Truffle_Cake_jTextField.setText("0");
		Eggless_Truffle_Cake_jTextField.setHorizontalAlignment(SwingConstants.CENTER);
		Eggless_Truffle_Cake_jTextField.setBounds(299, 139, 116, 40);
		panel_2.add(Eggless_Truffle_Cake_jTextField);
		Eggless_Truffle_Cake_jTextField.setColumns(10);
		
		Streusel_Coffee_Cake_jTextField = new JTextField();
		Streusel_Coffee_Cake_jTextField.setText("0");
		Streusel_Coffee_Cake_jTextField.setHorizontalAlignment(SwingConstants.CENTER);
		Streusel_Coffee_Cake_jTextField.setBounds(299, 197, 116, 33);
		panel_2.add(Streusel_Coffee_Cake_jTextField);
		Streusel_Coffee_Cake_jTextField.setColumns(10);
		
		Mango_Meringue_Cake_jTextField = new JTextField();
		Mango_Meringue_Cake_jTextField.setText("0");
		Mango_Meringue_Cake_jTextField.setHorizontalAlignment(SwingConstants.CENTER);
		Mango_Meringue_Cake_jTextField.setBounds(299, 252, 116, 40);
		panel_2.add(Mango_Meringue_Cake_jTextField);
		Mango_Meringue_Cake_jTextField.setColumns(10);
		
		Blueberry_Coffee_Cake_jTextField = new JTextField();
		Blueberry_Coffee_Cake_jTextField.setHorizontalAlignment(SwingConstants.CENTER);
		Blueberry_Coffee_Cake_jTextField.setText("0");
		Blueberry_Coffee_Cake_jTextField.setBounds(299, 315, 116, 40);
		panel_2.add(Blueberry_Coffee_Cake_jTextField);
		Blueberry_Coffee_Cake_jTextField.setColumns(10);
		
		Coffe_Cake_jTextField = new JTextField();
		Coffe_Cake_jTextField.setText("0");
		Coffe_Cake_jTextField.setHorizontalAlignment(SwingConstants.CENTER);
		Coffe_Cake_jTextField.setBounds(299, 376, 116, 40);
		panel_2.add(Coffe_Cake_jTextField);
		Coffe_Cake_jTextField.setColumns(10);
		
		Gluten_Free_hocolate_Cake_jTextField = new JTextField();
		Gluten_Free_hocolate_Cake_jTextField.setHorizontalAlignment(SwingConstants.CENTER);
		Gluten_Free_hocolate_Cake_jTextField.setText("0");
		Gluten_Free_hocolate_Cake_jTextField.setBounds(299, 440, 116, 39);
		panel_2.add(Gluten_Free_hocolate_Cake_jTextField);
		Gluten_Free_hocolate_Cake_jTextField.setColumns(10);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(135, 206, 235));
		panel_3.setBounds(12, 540, 308, 167);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel Cost_of_Drink = new JLabel("Cost of Drink");
		Cost_of_Drink.setFont(new Font("Tahoma", Font.BOLD, 13));
		Cost_of_Drink.setBounds(12, 21, 149, 44);
		panel_3.add(Cost_of_Drink);
		
		JLabel Cost_of_Cakes = new JLabel("Cost of Cakes");
		Cost_of_Cakes.setFont(new Font("Tahoma", Font.BOLD, 13));
		Cost_of_Cakes.setBounds(12, 66, 149, 44);
		panel_3.add(Cost_of_Cakes);
		
		JLabel Service_Charge = new JLabel("Service Charge");
		Service_Charge.setFont(new Font("Tahoma", Font.BOLD, 13));
		Service_Charge.setBounds(12, 126, 149, 28);
		panel_3.add(Service_Charge);
		
		Cost_of_Drink_jTextField = new JTextField();
		Cost_of_Drink_jTextField.setText("0");
		Cost_of_Drink_jTextField.setHorizontalAlignment(SwingConstants.CENTER);
		Cost_of_Drink_jTextField.setBounds(180, 29, 116, 28);
		panel_3.add(Cost_of_Drink_jTextField);
		Cost_of_Drink_jTextField.setColumns(10);
		
		Cost_of_Cakes_jTextField = new JTextField();
		Cost_of_Cakes_jTextField.setText("0");
		Cost_of_Cakes_jTextField.setHorizontalAlignment(SwingConstants.CENTER);
		Cost_of_Cakes_jTextField.setBounds(180, 77, 116, 34);
		panel_3.add(Cost_of_Cakes_jTextField);
		Cost_of_Cakes_jTextField.setColumns(10);
		
		Service_Charge_jTextField = new JTextField();
		Service_Charge_jTextField.setHorizontalAlignment(SwingConstants.CENTER);
		Service_Charge_jTextField.setText("0");
		Service_Charge_jTextField.setBounds(180, 120, 116, 34);
		panel_3.add(Service_Charge_jTextField);
		Service_Charge_jTextField.setColumns(10);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(135, 206, 235));
		panel_4.setBounds(332, 653, 427, 54);
		contentPane.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel Tax = new JLabel("Total");
		Tax.setFont(new Font("Tahoma", Font.BOLD, 13));
		Tax.setBounds(12, 16, 96, 29);
		panel_4.add(Tax);
		
		Tax_jTextField = new JTextField();
		Tax_jTextField.setText("0");
		Tax_jTextField.setHorizontalAlignment(SwingConstants.CENTER);
		Tax_jTextField.setBounds(299, 16, 116, 29);
		panel_4.add(Tax_jTextField);
		Tax_jTextField.setColumns(10);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(72, 209, 204));
		panel_5.setBounds(771, 116, 449, 524);
		contentPane.add(panel_5);
		panel_5.setLayout(null);
		
		JTextArea Receipt_jTextArea = new JTextArea();
		Receipt_jTextArea.setBounds(12, 13, 425, 498);
		panel_5.add(Receipt_jTextArea);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(30, 144, 255));
		panel_6.setBounds(771, 653, 449, 54);
		contentPane.add(panel_6);
		panel_6.setLayout(null);
		
		JButton jButton1 = new JButton("Total");
		jButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 drink[0]=Double.parseDouble(Cost_of_Drink_jTextField.getText());
			      drink[1]=Double.parseDouble(Cost_of_Cakes_jTextField.getText());
			      
			      
			      if(drink[2]<(drink[0]+drink[1]))
			      {
			      drink[2]=Double.parseDouble(Service_Charge_jTextField.getText());
			      }
			      else
			    	  drink[2]=0;
			     
			      
			      
			      
			      double cTotal1=(drink[0]+drink[1]+drink[2]);
			      String iTaxTotal=String.format("ID%.2f", cTotal1);
			      Tax_jTextField.setText(iTaxTotal) ;
			}
		});
		jButton1.setBounds(12, 13, 98, 25);
		panel_6.add(jButton1);
		
		JButton Receipt = new JButton("Receipt");
		Receipt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 drink[0]=Double.parseDouble(Caffe_Americano_jTextField.getText());
			        drink[1]=Double.parseDouble(Mochaccino_jTextField.getText());
			        drink[2]=Double.parseDouble(cappuccino_jTextField.getText());
			        drink[3]=Double.parseDouble(jIrish_Coffee_TextField.getText());
			        drink[4]=Double.parseDouble(long_black_coffee_jTextField.getText());
			      
			    
			       cakes[0]=Double.parseDouble(Black_Forest_Gateau_jTextField.getText());
			        cakes[1]=Double.parseDouble(Pineapple_Cake_jTextField.getText());
			         cakes[2]=Double.parseDouble(Eggless_Truffle_Cake_jTextField.getText());
			          cakes[3]=Double.parseDouble(Streusel_Coffee_Cake_jTextField.getText());
			           cakes[4]=Double.parseDouble(Mango_Meringue_Cake_jTextField.getText());
			            cakes[5]=Double.parseDouble(Blueberry_Coffee_Cake_jTextField.getText());
			             cakes[6]=Double.parseDouble(Coffe_Cake_jTextField.getText());
			              cakes[7]=Double.parseDouble(Gluten_Free_hocolate_Cake_jTextField.getText());
			              Cost[0]=(Tax_jTextField.getText());
			            
			  //==========================================================================================================
			  int refs=1325+(int)(Math.random()*4238);
			 
			   //===========================================================================================
			Calendar timer=Calendar.getInstance();
			timer.getTime();
			SimpleDateFormat tTime=new SimpleDateFormat("HH:mm:SS");
			 tTime.format(timer.getTime());
			 SimpleDateFormat Tdate=new SimpleDateFormat("dd-MM-yyyy");
			 Tdate.format(timer.getTime());
			  //=============================================================================================================      
			       
			            Receipt_jTextArea.append("\t\n Caffe Mangment System:\n\n"+
			               "Reference:\t\t\t"+refs+
			                    "\n============================================\t"+
			                    "\nCaffè Americano: \t\t"+drink[0]+
			                    "\nMochaccino: \t\t\t"+drink[1]+
			                    "\ncappuccino: \t\t\t"+drink[2]+
			                   "\nIrish Coffee: \t\t\t"+drink[3]+ 
			                  "\nlong black coffee: \t\t"+drink[4] +
			                   "\n============================================\t"+
			                    
			                    "\nBlack Forest Gateau\t\t "+cakes[0]+
			                    "\nPineapple Cake:\t\t "+cakes[1]+
			                    "\nEggless Truffle Cake:\t\t "+cakes[2]+
			                    "\nStreusel Coffee Cake:\t\t "+cakes[3]+
			                     "\n Mango Meringue Cake:\t\t "+cakes[4]+
			                      "\nBlueberry Coffee Cake:\t\t "+cakes[5]+
			                        "\nCoffee Cake :\t\t\t "+cakes[6]+
			                    "\nGluten Free Chocolate Cake:\t "+cakes[7]+
			                     "\n============================================\t"+
			                             "\nTotal:\t\t\t"+Cost[0]+
			                   
			                    "\n============================================\t"+
			                    "\nDate:\t\t\t"+Tdate.format(timer.getTime())+
			                    "\nDate:\t\t\t"+tTime.format(timer.getTime())+
			                         "\n\nThanks you" );

			           
			}
		});
		Receipt.setBounds(122, 13, 97, 25);
		panel_6.add(Receipt);
		
		JButton Rest = new JButton("Rest");
		Rest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				  Cost_of_Drink_jTextField.setText("0");
			      Cost_of_Cakes_jTextField .setText("0");
			      Service_Charge_jTextField .setText("0");
			      Tax_jTextField .setText("0");
			      Receipt_jTextArea.setText(" ");
			       Black_Forest_Gateau_jTextField.setText("0");
			      Pineapple_Cake_jTextField .setText("0");
			      Eggless_Truffle_Cake_jTextField .setText("0");
			      Streusel_Coffee_Cake_jTextField .setText("0");
			      Mango_Meringue_Cake_jTextField .setText("0");
			      Blueberry_Coffee_Cake_jTextField .setText("0");
			      Coffe_Cake_jTextField  .setText("0");
			      Gluten_Free_hocolate_Cake_jTextField .setText("0");
			      Caffe_Americano_jTextField  .setText("0");
			      Mochaccino_jTextField  .setText("0");
			      cappuccino_jTextField   .setText("0");
			      jIrish_Coffee_TextField   .setText("0");
			      long_black_coffee_jTextField   .setText("0");
			      
			      Cost_of_Drink_jTextField.setText("0");
			      Cost_of_Cakes_jTextField .setText("0");
			      Service_Charge_jTextField .setText("0");
			      Tax_jTextField .setText("0");
			      
			      Black_Forest_Gateau .setSelected(false);  
			       Pineapple_Cake.setSelected(false);  
			      Eggless_Truffle_Cake .setSelected(false);  
			      Streusel_Coffee_Cake .setSelected(false);  
			     Mango_Meringue_Cake  .setSelected(false);  
			     Blueberry_Coffee_Cake  .setSelected(false);  
			     Coffe_Cake  .setSelected(false);  
			     Gluten_Free_hocolate_Cake.setSelected(false);  
			       Caffe_Americano.setSelected(false);  
			      Mochaccino .setSelected(false);  
			      cappuccino .setSelected(false);  
			      Irish_Coffee .setSelected(false);  
			      long_black_coffee .setSelected(false);  
			      Receipt.setSelected(false);
			      
			}
		});
		Rest.setBounds(231, 13, 97, 25);
		panel_6.add(Rest);
		
		JButton Exit = new JButton("Exit");
		Exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		Exit.setBounds(340, 13, 97, 25);
		panel_6.add(Exit);
	}
	
	
	    
}