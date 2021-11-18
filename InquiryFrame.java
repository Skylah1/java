import java.awt.*;
import javax.swing.*;



public class InquiryFrame extends BasicFrame {
		// �� ���� �Է� �̹��� �־�� �ϴµ� ��� �ϳ�..?
		private ImageIcon inquiry = new ImageIcon("images/inquiry.png"); // �̹��� �ε�
		private JLabel inquiryimg=new JLabel("",inquiry,SwingConstants.CENTER); // ���̺� ����
		
		
		
		private String[] NumberArr = {"(���� ����)          ", "������ ���� ����/���� �ݾ� ��ȸ", "�̹��� ���� ����/���� �ݾ� ��ȸ "};
		private String[] ChartArr = {"(���� ����)          ", "������ ���� ����/���� �ݾ� ��ȸ", "�̹��� ���� ����/���� �ݾ� ��ȸ "};
		
		private JComboBox<String> Number = new JComboBox<String>(NumberArr); // ��ġ ������ �޺��ڽ�
		private JComboBox<String> Chart = new JComboBox<String>(ChartArr); // ��Ʈ ������ �޺��ڽ�
		
		private JLabel chNum = new JLabel("  ��ġ  "); // ��
		private JLabel chChart = new JLabel("\n  ��Ʈ  ");
		
		// ========================================================================================
		
		private JCheckBox income=new JCheckBox(" ����                    ",true); // ���� ������ üũ�ڽ� ����
		private JCheckBox expenses=new JCheckBox(" ���� ");
		
		
		public InquiryFrame() { // ������
			InitObject();
			BorderPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 30)); // ��������, �����Ÿ� 30
			BorderPanel.add(chNum); // ������� ����
			BorderPanel.add(Number);
			BorderPanel.add(chChart);
			BorderPanel.add(Chart);
			BorderPanel.add(income);
			BorderPanel.add(expenses);
			
			InitSetting();
		}
		
		
		
		private void InitObject() { // �ʱ�ȭ �۾� �� �ʱ⼼��
			
			Number = new JComboBox<String>(NumberArr);
			Number.setBackground(Color.WHITE);
			Number.setForeground(Color.BLACK);
			Number.setFont(new Font("���ʷչ���", Font.BOLD, 18)); 
			
			
			Chart = new JComboBox<String>(ChartArr);
			Chart.setBackground(Color.WHITE);
			Chart.setForeground(Color.BLACK);
			Chart.setFont(new Font("���ʷչ���", Font.BOLD, 18));
			
			// ========================================================================
			
			
			income.setBackground(Color.WHITE);
			income.setForeground(Color.BLACK);
			income.setFont(new Font("���ʷչ���", Font.BOLD, 18)); 
			
			expenses.setBackground(Color.WHITE);
			expenses.setForeground(Color.BLACK);
			expenses.setFont(new Font("���ʷչ���", Font.BOLD, 18)); 
			
			// ========================================================================
			
			chNum.setFont(new Font("���ʷչ���", Font.BOLD, 18)); 
			chChart.setFont(new Font("���ʷչ���", Font.BOLD, 18)); 
			
		}
		

}
