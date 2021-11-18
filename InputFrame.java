import java.awt.*;
import javax.swing.*;
import java.time.LocalDate;

public class InputFrame extends BasicFrame{
	
	// 맨 위에 입력 이미지 넣어야 하는데 어떻게 하나..?
	private ImageIcon input = new ImageIcon("images/input.png"); // 이미지 로딩
	private JLabel inputimg=new JLabel("",input,SwingConstants.CENTER); // 레이블 생성
	
	private String[] YearArray = new String[16]; // 문자열 배열 년, 월, 일 
	private String[] MonthArray = new String[12];
	private String[] DateArray = new String[31];
	private String[] CategoryArray = {"식비                            ", "독서     ", "교통비      "};
	
	private JComboBox<String> Year = new JComboBox<String>(YearArray); // 년, 월, 일 저장할 콤보박스
	private JComboBox<String> Month = new JComboBox<String>(MonthArray);
	private JComboBox<String> Date = new JComboBox<String>(DateArray);
	private JComboBox<String> Category = new JComboBox<String>(CategoryArray);
	
	private ButtonGroup KRW_USD = new ButtonGroup(); // 라디오 버튼 그룹
	

	private JRadioButton KRW = new JRadioButton(" 원화                ", true); // 라디오 버튼
	private JRadioButton USD = new JRadioButton(" 외화");
	
	
	
	
	private JLabel Calendar = new JLabel("  날짜 선택 "); // 라벨
	private JLabel YearLabel = new JLabel("년  ");
	private JLabel MonthLabel = new JLabel("월  ");
	private JLabel DateLabel = new JLabel("일");
	private JLabel CategoryLabel = new JLabel("  카테고리  ");
	
	private JTextArea ta = new JTextArea(7, 20); ////////////// 이걸로 입력
	
	public InputFrame() { // 생성자
		InitObject();
		BorderPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 30)); // 왼쪽정렬, 수직거리 30
		BorderPanel.add(Calendar); // 순서대로 저장
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
	 
	private void InitObject() { // 초기화 작업 및 초기세팅
		for(int i=0; i<16; i++) YearArray[i] = String.valueOf(i+2015); // 2015~2030년 구성
		Year = new JComboBox<String>(YearArray);
		Year.setBackground(Color.WHITE);
		Year.setForeground(Color.BLACK);
		Year.setFont(new Font("함초롱바탕", Font.BOLD, 20)); 
		
		for(int i=0; i<12; i++) MonthArray[i] = String.valueOf(i+1); // 1~12월 구성
		Month = new JComboBox<String>(MonthArray);
		Month.setBackground(Color.WHITE);
		Month.setForeground(Color.BLACK);
		Month.setFont(new Font("함초롱바탕", Font.BOLD, 20)); 
		
		for(int i=0; i<31; i++) DateArray[i] = String.valueOf(i+1); // 1~31일 구성
		Date = new JComboBox<String>(DateArray);
		Date.setBackground(Color.WHITE);
		Date.setForeground(Color.BLACK);
		Date.setFont(new Font("함초롱바탕", Font.BOLD, 20)); 
		
		Category.setBackground(Color.WHITE);
		Category.setForeground(Color.BLACK);
		Category.setFont(new Font("함초롱바탕", Font.BOLD, 20)); 
		
		// ---------------------------------------------------------------------------------콤보박스
		KRW.setBackground(Color.WHITE);
		KRW.setForeground(Color.BLACK);
		KRW.setFont(new Font("함초롱바탕", Font.BOLD, 20)); 
		USD.setBackground(Color.WHITE);
		USD.setForeground(Color.BLACK);
		USD.setFont(new Font("함초롱바탕", Font.BOLD, 20)); 
		KRW_USD.add(KRW); KRW_USD.add(USD);
		
		//----------------------------------------------------------------------------------라디오 버튼
		
		Calendar.setFont(new Font("함초롱바탕", Font.BOLD, 20)); 
		YearLabel.setFont(new Font("함초롱바탕", Font.BOLD, 20)); 
		MonthLabel.setFont(new Font("함초롱바탕", Font.BOLD, 20)); 
		DateLabel.setFont(new Font("함초롱바탕", Font.BOLD, 20)); 
		CategoryLabel.setFont(new Font("함초롱바탕", Font.BOLD, 20)); 
		
		// ---------------------------------------------------------------------------------라벨
	}
	
	private void SettingComboBox() { // 콤보박스 초기 날짜 설정(현재 날짜로)
		LocalDate now = LocalDate.now();
		Year.setSelectedIndex(now.getYear()-2015);
		Month.setSelectedIndex(now.getMonthValue()-1);
		Date.setSelectedIndex(now.getDayOfMonth()-1);
	}
	
	
}