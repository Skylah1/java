import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
/*
 * ��� ���. BasicFrame ���, ������ �� ���� InitSetting()�Լ� ȣ��
 *  - ��� �κп� ��ư������ �ִ� ���
 *  1. BorderPanel ��ġ������ ����������� null�̳� gridLayout�̳� ex) BorderPanel.setLayout(null);
 *  2. BorderPanel�� add������� ex) BorderPanel.add(new JButton("�޷�"));
 *  ��!
 */
public class BasicFrame extends JFrame{
	private Container contentPane = getContentPane(); // ����Ʈ��
	
	protected JPanel BorderPanel = new JPanel(); // ��� �κ��� �г�
	private JPanel[] BlackBorder = new JPanel[4]; // �����ڸ� ������ �׵θ�

	public BasicFrame() {
		
		setTitle("������ �˶���");
		setSize(415, 700);
	}
	
	protected void InitSetting() {									
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ������ �����츦 ������ ���α׷� ����

		contentPane.setBackground(Color.WHITE);			// ���
		contentPane.setLayout(new BorderLayout());		// ��ġ������ ����
		
		BorderPanel.setBackground(Color.WHITE);			// �г� ���� ����
		for(int i=0; i<4; i++) {
			BlackBorder[i] = new JPanel();
			//BlackBorder[i].setBackground(Color.WHITE);
			BlackBorder[i].setBackground(Color.BLACK);
		}
		
		contentPane.add(BorderPanel, BorderLayout.CENTER); // BorderLayout���� �־��� �� inputPanel�� �־���� �Ұ���
		contentPane.add(BlackBorder[0], BorderLayout.NORTH);
		contentPane.add(BlackBorder[1], BorderLayout.SOUTH);
		contentPane.add(BlackBorder[2], BorderLayout.WEST);
		contentPane.add(BlackBorder[3], BorderLayout.EAST);
		
		setVisible(true);
	}
}