import java.awt.*;
import javax.swing.*;



public class InitFrame extends BasicFrame {
	
	
	// �� ���� �Է� �̹��� �־�� �ϴµ� ��� �ϳ�..?
	private ImageIcon init = new ImageIcon("images/init.png"); // �̹��� �ε�
	private JLabel initimg=new JLabel("",init,SwingConstants.CENTER); // ���̺� ����
			
	private JTextField expenlimit= new JTextField(13);
	private JTextField curassetwon= new JTextField(13);
	private JTextField curassetdol= new JTextField(13);
	
	private JLabel exli = new JLabel("  ���� �ѵ�         "); // ��
	private JLabel curassw = new JLabel("\n  ���� �ڻ� (��)  ");
	private JLabel curassd = new JLabel("\n  ���� �ڻ� ($)    ");
	
	
	public InitFrame() { // ������
		InitObject();
		BorderPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 30)); // ��������, �����Ÿ� 30
		BorderPanel.add(exli); // ������� ����
		BorderPanel.add(expenlimit);
		BorderPanel.add(curassw);
		BorderPanel.add(curassetwon);
		BorderPanel.add(curassd);
		BorderPanel.add(curassetdol);
		
		InitSetting();
	}
	
	
	
	private void InitObject() { // �ʱ�ȭ �۾� �� �ʱ⼼��
		
		expenlimit.setBackground(Color.WHITE);
		expenlimit.setForeground(Color.BLACK);
		expenlimit.setFont(new Font("���ʷչ���", Font.BOLD, 18)); 
		
		
		curassetwon.setBackground(Color.WHITE);
		curassetwon.setForeground(Color.BLACK);
		curassetwon.setFont(new Font("���ʷչ���", Font.BOLD, 18));
		
		
		curassetdol.setBackground(Color.WHITE);
		curassetdol.setForeground(Color.BLACK);
		curassetdol.setFont(new Font("���ʷչ���", Font.BOLD, 18)); 
		
		// ========================================================================
		
		exli.setFont(new Font("���ʷչ���", Font.BOLD, 18)); 
		curassw.setFont(new Font("���ʷչ���", Font.BOLD, 18)); 
		curassd.setFont(new Font("���ʷչ���", Font.BOLD, 18)); 
		
	}
	
}
