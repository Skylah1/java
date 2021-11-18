import java.awt.*;
import javax.swing.*;
import java.time.LocalDate;

public class InputFrame extends BasicFrame{
	
	// �� ���� �Է� �̹��� �־�� �ϴµ� ��� �ϳ�..?
	private ImageIcon input = new ImageIcon("images/input.png"); // �̹��� �ε�
	private JLabel inputimg=new JLabel("",input,SwingConstants.CENTER); // ���̺� ����
	
	private String[] YearArray = new String[16]; // ���ڿ� �迭 ��, ��, �� 
	private String[] MonthArray = new String[12];
	private String[] DateArray = new String[31];
	private String[] CategoryArray = {"�ĺ�                            ", "����     ", "�����      "};
	
	private JComboBox<String> Year = new JComboBox<String>(YearArray); // ��, ��, �� ������ �޺��ڽ�
	private JComboBox<String> Month = new JComboBox<String>(MonthArray);
	private JComboBox<String> Date = new JComboBox<String>(DateArray);
	private JComboBox<String> Category = new JComboBox<String>(CategoryArray);
	
	private ButtonGroup KRW_USD = new ButtonGroup(); // ���� ��ư �׷�
	

	private JRadioButton KRW = new JRadioButton(" ��ȭ                ", true); // ���� ��ư
	private JRadioButton USD = new JRadioButton(" ��ȭ");
	
	
	
	
	private JLabel Calendar = new JLabel("  ��¥ ���� "); // ��
	private JLabel YearLabel = new JLabel("��  ");
	private JLabel MonthLabel = new JLabel("��  ");
	private JLabel DateLabel = new JLabel("��");
	private JLabel CategoryLabel = new JLabel("  ī�װ�  ");
	
	private JTextArea ta = new JTextArea(7, 20); ////////////// �̰ɷ� �Է�
	
	public InputFrame() { // ������
		InitObject();
		BorderPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 30)); // ��������, �����Ÿ� 30
		BorderPanel.add(Calendar); // ������� ����
		BorderPanel.add(Year);
		BorderPanel.add(YearLabel);
		BorderPanel.add(Month);
		BorderPanel.add(MonthLabel);
		BorderPanel.add(Date);
		BorderPanel.add(DateLabel);
		BorderPanel.add(CategoryLabel);
		BorderPanel.add(Category);
		BorderPanel.add(KRW);
		BorderPanel.add(USD);
		
		SettingComboBox();
		
		InitSetting();
	}
	 
	private void InitObject() { // �ʱ�ȭ �۾� �� �ʱ⼼��
		for(int i=0; i<16; i++) YearArray[i] = String.valueOf(i+2015); // 2015~2030�� ����
		Year = new JComboBox<String>(YearArray);
		Year.setBackground(Color.WHITE);
		Year.setForeground(Color.BLACK);
		Year.setFont(new Font("���ʷչ���", Font.BOLD, 20)); 
		
		for(int i=0; i<12; i++) MonthArray[i] = String.valueOf(i+1); // 1~12�� ����
		Month = new JComboBox<String>(MonthArray);
		Month.setBackground(Color.WHITE);
		Month.setForeground(Color.BLACK);
		Month.setFont(new Font("���ʷչ���", Font.BOLD, 20)); 
		
		for(int i=0; i<31; i++) DateArray[i] = String.valueOf(i+1); // 1~31�� ����
		Date = new JComboBox<String>(DateArray);
		Date.setBackground(Color.WHITE);
		Date.setForeground(Color.BLACK);
		Date.setFont(new Font("���ʷչ���", Font.BOLD, 20)); 
		
		Category.setBackground(Color.WHITE);
		Category.setForeground(Color.BLACK);
		Category.setFont(new Font("���ʷչ���", Font.BOLD, 20)); 
		
		// ---------------------------------------------------------------------------------�޺��ڽ�
		KRW.setBackground(Color.WHITE);
		KRW.setForeground(Color.BLACK);
		KRW.setFont(new Font("���ʷչ���", Font.BOLD, 20)); 
		USD.setBackground(Color.WHITE);
		USD.setForeground(Color.BLACK);
		USD.setFont(new Font("���ʷչ���", Font.BOLD, 20)); 
		KRW_USD.add(KRW); KRW_USD.add(USD);
		
		//----------------------------------------------------------------------------------���� ��ư
		
		Calendar.setFont(new Font("���ʷչ���", Font.BOLD, 20)); 
		YearLabel.setFont(new Font("���ʷչ���", Font.BOLD, 20)); 
		MonthLabel.setFont(new Font("���ʷչ���", Font.BOLD, 20)); 
		DateLabel.setFont(new Font("���ʷչ���", Font.BOLD, 20)); 
		CategoryLabel.setFont(new Font("���ʷչ���", Font.BOLD, 20)); 
		
		// ---------------------------------------------------------------------------------��
	}
	
	private void SettingComboBox() { // �޺��ڽ� �ʱ� ��¥ ����(���� ��¥��)
		LocalDate now = LocalDate.now();
		Year.setSelectedIndex(now.getYear()-2015);
		Month.setSelectedIndex(now.getMonthValue()-1);
		Date.setSelectedIndex(now.getDayOfMonth()-1);
	}
	
	
}