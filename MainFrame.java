import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class MainFrame extends BasicFrame { // GUIƲ Frame
	enum Button{
		expenseIncomeInputButton, categoryManageButton, inquiryButton,
		manageButton, alarmButton
	}
	
	
	private JButton[] MainButton = new JButton[5]; // ��ư
	private ImageIcon bulb = new ImageIcon("images/bulb.png"); // �̹��� �ε�
	private JLabel tip = new JLabel("Today's Tip! ",bulb,SwingConstants.LEFT); // ������ �� ���̺�
	//private JLabel antProgram = new JLabel("       ������ �˶���"); // ���α׷� �̸� ���̺�
	private ImageIcon img = new ImageIcon("images/ants.png"); // �̹��� �ε�
	private JLabel antProgram=new JLabel("",img,SwingConstants.LEFT); // ���̺� ����
	
	private NextPage nextpage = new NextPage();
	
	public MainFrame() {
		MainButton[Button.expenseIncomeInputButton.ordinal()] = new JButton("��                  ��"); // 0
		MainButton[Button.categoryManageButton.ordinal()] = new JButton("��                  ȸ"); // 1
		MainButton[Button.inquiryButton.ordinal()] = new JButton("����   �ѵ�   ����"); // 2 
		MainButton[Button.manageButton.ordinal()] = new JButton("ī�װ�      ����"); // 3
		MainButton[Button.alarmButton.ordinal()] = new JButton("��                  ��"); // 4
		
		GUISetting(); // ��ư ��ġ ����
		InitSetting(); // BasicFrame�� InitSetting�̿�
	}
	
	/* BasicFrame�� �⺻���� Ʋ �̿��Ұ���
	 * �⺻���� �׵θ�, �־���� �� �г��� BasicPanel���� �غ�Ǿ� ����.
	 * ��ư���� BorderPanel�� �־���� �ϹǷ� BorderPanel�� ��ġ������ BorderPanel���� �����ϰ� ���⿡ ��ư�� �־���
	 * */
	private void GUISetting() {
		BorderPanel.setLayout(new GridLayout(7,1,1,30)); // �̰� �ۼ��Ǵ� �κ��� GridLayout(5�� 1�� vGap = 25)
		
		tip.setFont(new Font("���� ���", Font.BOLD, 17)); // �� ����
		antProgram.setFont(new Font("���� ���", Font.BOLD, 30)); // ���α׷� �̸� ����
		BorderPanel.add(antProgram); 
		
		for(int i=0; i<5; i++) { // CenterPanel�� ������ ��ư�� �߰�
			MainButton[i].setBackground(Color.BLACK);
			MainButton[i].setForeground(Color.WHITE);
			MainButton[i].setFont(new Font("���� ���", Font.BOLD, 18));
			MainButton[i].addActionListener(nextpage);
			BorderPanel.add(MainButton[i]); // ���⿡ ��ư�� GridLayout���� �߰�
		}
		BorderPanel.add(tip);
	}
	
	class NextPage implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			JButton b = (JButton)e.getSource();
			String compareText = b.getText().replace(" ", "");
			if(compareText.equals("�Է�")) { // "�Է�"�� ��� InputFrame���� �Ѿ
				new InputFrame();
				setVisible(false);
			}
			else if(compareText.equals("��ȸ")) { // "��ȸ"�� ��� InquiryFrame���� �Ѿ
				new InquiryFrame();
				setVisible(false);
			}
			else if(compareText.equals("�����ѵ�����")) { // "���� �ѵ� ����"�� ��� ManageFrame���� �Ѿ
				new ManageFrame();
				setVisible(false);
			}
			else if(compareText.equals("ī�װ�����")) { // "ī�װ� ����"�� ��� CategoryManageFrame���� �Ѿ
				new CategoryManageFrame();
				setVisible(false);
			}
			else if(compareText.equals("�˸�")) { // "ī�װ� ����"�� ��� CategoryManageFrame���� �Ѿ
				new NoticeFrame();
				setVisible(false);
			}
		}
	}
}