package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class LostView extends JFrame{

   private JPanel contentPane;

   /**
    * Launch the application.
    */
   public static void main(String[] args) {
      EventQueue.invokeLater(new Runnable() {
         public void run() {
            try {
            	LostView frame = new LostView();
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
   public LostView() {
      //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setBounds(100, 100, 1600, 900);
      contentPane = new JPanel();
      contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
      contentPane.setLayout(null);
      setContentPane(contentPane);
      
      JLabel title = new JLabel("찾아주세요");
      contentPane.add(title, BorderLayout.NORTH);
      title.setBounds(32, 12, 285, 70);
      title.setFont(new Font("맑은 고딕",Font.BOLD,50));
      
      JLabel prop = new JLabel("분실물건 (자세히)");
      contentPane.add(prop, BorderLayout.WEST);
      prop.setBounds(103, 220, 267, 39);
      prop.setFont(new Font("맑은 고딕",Font.BOLD,30));
      
      JLabel prop2 = new JLabel("분실물건 (간략히)");
      contentPane.add(prop2);
      prop2.setBounds(103, 143, 255, 49);
      prop2.setFont(new Font("맑은 고딕",Font.BOLD,30));
      
      JLabel date = new JLabel("분실날짜");
      date.setBounds(103, 439, 184, 70);
      contentPane.add(date);
      date.setFont(new Font("맑은 고딕",Font.BOLD,30));
      
      JLabel dates = new JLabel("분실날짜");
      dates.setBounds(103, 561, 217, 73);
      contentPane.add(dates);
      dates.setFont(new Font("맑은 고딕",Font.BOLD,30));
      
      JLabel loc = new JLabel("분실장소");
      loc.setBounds(103, 353, 146, 64);
      contentPane.add(loc);
      loc.setFont(new Font("맑은 고딕",Font.BOLD,30));
      
      JLabel ddetail = new JLabel("(년, 월, 일)");
      ddetail.setBounds(103, 485, 159, 55);
      contentPane.add(ddetail);
      ddetail.setFont(new Font("맑은 고딕",Font.BOLD,30));
      
      JLabel rtime = new JLabel("(대략적인 시간)");
      rtime.setBounds(103, 620, 227, 55);
      contentPane.add(rtime);
      rtime.setFont(new Font("맑은 고딕",Font.BOLD,30));
      
      JLabel contact = new JLabel("습득시 연락처");
      contact.setBounds(103, 729, 227, 49);
      contentPane.add(contact);
      contact.setFont(new Font("맑은 고딕",Font.BOLD,30));
   }
}