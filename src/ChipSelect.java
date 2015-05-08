import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
//import java.awt.event.MouseEvent;
//import java.awt.event.MouseListener;
import javax.swing.*;


public class ChipSelect extends JFrame implements ActionListener,MouseListener 
{     
	JFrame f;
    JLabel bck;
    JButton min, close;
    int k=0,x=0,z=0;
    JLabel back;
    int [] flag= {0,0,0,0};
    JLabel SmallLogo;    
    JButton AccountInfo, Profile, Logout, accountpic;
    JButton sAccountInfo, sProfile, sLogout, saccountpic;
    
    JButton sclose, smin, ssettings, sgtwww, shelp;
    JButton settings, gtwww, help;
    JLabel bbar1, bbar2;
    JButton plus,splus;
    
    ////////elements for chipslecet frame
    JLabel selectback;
    //JButton green,blue,yellow,red;
    JButton greenda,blueda,yellowda,redda,greena,bluea,yellowa,reda;
    JButton greens,blues,yellows,reds;
    
    JPanel greenp,bluep,yellowp,redp;
    JButton greent1,greent2,greent3,greent4;
    JButton bluet1,bluet2,bluet3,bluet4;
    JButton yellowt1,yellowt2,yellowt3,yellowt4;
    JButton redt1,redt2,redt3,redt4;
    JLabel g1500,g2500,g3500,g4500,b1000,b1500,b2000,b2500,y3000,y4000,y5000,y6000,r7000,r8000,r9000,r10000;
    JLabel t1outline,t2outline,t3outline,t4outline;

    JLabel c1,c2,c3,c4,c5;
    //JLabel clicked;
    //JLabel g1,g2,g3,g4,b1,b2,b3,b4,y1,y2,y3,y4,r1,r2,r3,r4;
    
    JLabel [] g = new JLabel[20];
    JLabel [] b = new JLabel[20];
    JLabel [] y = new JLabel[20];
    JLabel [] r = new JLabel[20];
    
Container c;
    
    public ChipSelect ()
    {
         f = new JFrame("Open Flush");
         c = f.getContentPane();
         greenp = new JPanel();
         bluep = new JPanel();
         yellowp = new JPanel();
         redp = new JPanel();
         
         
         ////////////////////player count////////////////
         c1 = new JLabel(new ImageIcon("images\\data\\c1.png"));
         c2 = new JLabel(new ImageIcon("images\\data\\c2.png"));
         c3 = new JLabel(new ImageIcon("images\\data\\c3.png"));
         c4 = new JLabel(new ImageIcon("images\\data\\c4.png"));
         c5 = new JLabel(new ImageIcon("images\\data\\c5.png"));
         
         
         for(int i=0;i<20;i++)
         {
        	 g[i] = new JLabel(new ImageIcon("images\\data\\c1.png"));
        	 b[i] = new JLabel(new ImageIcon("images\\data\\c3.png"));
        	 y[i] = new JLabel(new ImageIcon("images\\data\\c5.png"));	
        	 r[i] = new JLabel(new ImageIcon("images\\data\\c4.png"));
        	 
         }
        
         //////////////trial////////
         
       //  clicked = new JLabel(new ImageIcon("images\\data\\t1clicked.png"));
         
         
         //////////////////////////////////
         
         //////////////////////////////////table values/////////////////
         g1500 = new JLabel(new ImageIcon("images\\data\\500.png"));
         g2500 = new JLabel(new ImageIcon("images\\data\\500.png"));
         g3500 = new JLabel(new ImageIcon("images\\data\\500.png"));
         g4500 = new JLabel(new ImageIcon("images\\data\\500.png"));
         b1000 = new JLabel(new ImageIcon("images\\data\\1000.png"));
         b1500 = new JLabel(new ImageIcon("images\\data\\1500.png"));
         b2000 = new JLabel(new ImageIcon("images\\data\\2000.png"));
         b2500 = new JLabel(new ImageIcon("images\\data\\2500.png"));
         y3000 = new JLabel(new ImageIcon("images\\data\\3000.png"));
         y4000 = new JLabel(new ImageIcon("images\\data\\4000.png"));
         y5000 = new JLabel(new ImageIcon("images\\data\\5000.png"));
         y6000 = new JLabel(new ImageIcon("images\\data\\6000.png"));
         r7000 = new JLabel(new ImageIcon("images\\data\\7000.png"));
         r8000 = new JLabel(new ImageIcon("images\\data\\8000.png"));
         r9000 = new JLabel(new ImageIcon("images\\data\\9000.png"));
         r10000 = new JLabel(new ImageIcon("images\\data\\10000.png"));
         /////////////////////////////////////////////////////////////////////////////
         
         
         //////////////outlines///////////////
         t1outline = new JLabel(new ImageIcon("images\\data\\outline.png"));
         t2outline = new JLabel(new ImageIcon("images\\data\\outline.png"));
         t3outline = new JLabel(new ImageIcon("images\\data\\outline.png"));
         t4outline = new JLabel(new ImageIcon("images\\data\\outline.png"));
         
         
        ////background logo
        bck = new JLabel(new ImageIcon("images\\data\\backlogo.png"));
        ///minimmize sign
        min = new JButton(new ImageIcon("images\\data\\min.png"));
        ///maximize sign
        // max = new JButton(new ImageIcon("images\\maximize.png"));
        ///close sign
        close = new JButton(new ImageIcon("images\\data\\clo.png"));

        back = new JLabel(new ImageIcon("images\\data\\back.png"));


        plus = new JButton(new ImageIcon("images\\data\\+.png"));
        
        splus = new JButton(new ImageIcon("images\\data\\+1.png"));
        
        SmallLogo = new JLabel(new ImageIcon("images\\data\\logonew.png"));

        AccountInfo = new JButton(new ImageIcon("images\\data\\ai.png"));

        Profile = new JButton(new ImageIcon("images\\data\\ps.png"));

        Logout = new JButton(new ImageIcon("images\\data\\logout.png"));

        accountpic = new JButton(new ImageIcon("images\\data\\playerimage.png"));

        ////////////////////////////////////////////////////////////////////////////////////
        ////bottom elements
        bbar1 = new JLabel(new ImageIcon("images\\data\\barsmall.png"));
        bbar2 = new JLabel(new ImageIcon("images\\data\\barsmall.png"));
        settings = new JButton(new ImageIcon("images\\data\\sett.png"));
        gtwww = new JButton(new ImageIcon("images\\data\\gtwww.png"));
        help = new JButton(new ImageIcon("images\\data\\help.png"));
        /////////////////////////////////////////////////////////////// 




       

        //////////////////shadow buttons- Universal/////////////////
        sclose = new JButton(new ImageIcon("images\\data\\clo1.png"));
        smin = new JButton(new ImageIcon("images\\data\\min1.png"));
        ssettings = new JButton(new ImageIcon("images\\data\\sett1.png"));
        sgtwww = new JButton(new ImageIcon("images\\data\\gtwww1.png"));
        shelp = new JButton(new ImageIcon("images\\data\\help1.png"));

        //////////shadow elements account info, profile , logout
        sAccountInfo= new JButton(new ImageIcon("images\\data\\ai1.png"));
        sProfile= new JButton(new ImageIcon("images\\data\\ps1.png"));
        sLogout= new JButton(new ImageIcon("images\\data\\logout1.png"));
         //////////////////////////////////////////////////////////////
        
        
        ///////////adding select frame buttons///////////
       // green = new JButton(new ImageIcon("images\\data\\green.png"));
       // blue= new JButton(new ImageIcon("images\\data\\blue.png"));
       // yellow= new JButton(new ImageIcon("images\\data\\yellow.png"));
       // red= new JButton(new ImageIcon("images\\data\\red.png"));
        
        /////////buttons active and deactive////////
        greena = new JButton(new ImageIcon("images\\data\\gactive.png"));
        greenda = new JButton(new ImageIcon("images\\data\\gdeactive.png"));
        bluea = new JButton(new ImageIcon("images\\data\\bactive.png"));
        blueda = new JButton(new ImageIcon("images\\data\\bdeactive.png"));
        yellowa = new JButton(new ImageIcon("images\\data\\yactive.png"));
        yellowda= new JButton(new ImageIcon("images\\data\\ydeactive.png"));
        reda = new JButton(new ImageIcon("images\\data\\ractive.png"));
        redda = new JButton(new ImageIcon("images\\data\\rdeactive.png"));
        /////////////////////////////////////////////////////
        selectback=new JLabel(new ImageIcon("images\\data\\selectback.png"));
        ///////button shadows////////////
        greens = new JButton(new ImageIcon("images\\data\\gbuttonshadow.png"));
        blues= new JButton(new ImageIcon("images\\data\\bbuttonshadow.png"));
        yellows= new JButton(new ImageIcon("images\\data\\ybuttonshadow.png"));
        reds= new JButton(new ImageIcon("images\\data\\rbuttonshadow.png"));
        ////////////////////panels////////////////
        greent1 = new JButton(new ImageIcon("images\\data\\t1.png"));
        greent2 = new JButton(new ImageIcon("images\\data\\t2.png"));
        greent3 = new JButton(new ImageIcon("images\\data\\t3.png"));
        greent4 = new JButton(new ImageIcon("images\\data\\t4.png"));
        
        bluet1 = new JButton(new ImageIcon("images\\data\\t1.png"));
        bluet2 = new JButton(new ImageIcon("images\\data\\t2.png"));
        bluet3 = new JButton(new ImageIcon("images\\data\\t3.png"));
        bluet4 = new JButton(new ImageIcon("images\\data\\t4.png"));
        
        yellowt1 = new JButton(new ImageIcon("images\\data\\t1.png"));
        yellowt2 = new JButton(new ImageIcon("images\\data\\t2.png"));
        yellowt3 = new JButton(new ImageIcon("images\\data\\t3.png"));
        yellowt4 = new JButton(new ImageIcon("images\\data\\t4.png"));
        
        redt1= new JButton(new ImageIcon("images\\data\\t1.png"));
        redt2= new JButton(new ImageIcon("images\\data\\t2.png"));
        redt3= new JButton(new ImageIcon("images\\data\\t3.png"));
        redt4= new JButton(new ImageIcon("images\\data\\t4.png"));
        
        
        
        ////////////////////////////////////////////////////
        
        
        
        
        
    }

     public void chip()
    {
    	
    	//JFrame f;
    	
    	 Toolkit tk = Toolkit.getDefaultToolkit();
         int xSize = ((int) tk.getScreenSize().getWidth());
         int ySize = ((int) tk.getScreenSize().getHeight());
         f.setSize(xSize, ySize);
         //JFrame.setDefaultLookAndFeelDecorated(true);
         f.setUndecorated(true);
         //f.show();
         f.setVisible(true);


         //Color b = new Color(0, 150, 80);
         //Container c = f.getContentPane();
         //c.setBackground(Color.magenta);
         f.add(accountpic);
         accountpic.setBounds(1220, 0, 74, 74);
         
         c.add(plus);
         plus.setBounds(1207,68,19,19);
         plus.setFocusPainted(false);
         plus.setMargin(new Insets(0, 0, 0, 0));
         plus.setContentAreaFilled(false);
         plus.setBorderPainted(false);
         plus.setOpaque(false);
         
         
         
         ////////////to be displayed after clicking +
         c.add(AccountInfo);
         AccountInfo.setBounds(1050,6,185,15);
         AccountInfo.setVisible(false);
         
         AccountInfo.setFocusPainted(false);
         AccountInfo.setMargin(new Insets(0, 0, 0, 0));
         AccountInfo.setContentAreaFilled(false);
         AccountInfo.setBorderPainted(false);
         AccountInfo.setOpaque(false);
         
         
         
         c.add(Profile);
         Profile.setBounds(1093,18,136,39);
         Profile.setVisible(false);
         
         Profile.setFocusPainted(false);
         Profile.setMargin(new Insets(0, 0, 0, 0));
         Profile.setContentAreaFilled(false);
         Profile.setBorderPainted(false);
         Profile.setOpaque(false);
         
         
         c.add(Logout);
         Logout.setBounds(1158,51,63,18);
         Logout.setVisible(false);
         
         Logout.setFocusPainted(false);
         Logout.setMargin(new Insets(0, 0, 0, 0));
         Logout.setContentAreaFilled(false);
         Logout.setBorderPainted(false);
         Logout.setOpaque(false);
         
         
         //Profile.setBounds(800,60,200,10);
         //Logout.setBounds(800,70,200,10);



         ////adding and placing main contents




         //c.add(f);
         f.setLayout(null);
         f.add(min);
         //f.add(max);
         f.add(close);

         f.add(SmallLogo);
         //SupportBar.setBounds(0,12,10,57);
         SmallLogo.setBounds(0,9,147,57);
         min.setFocusPainted(false);
         min.setMargin(new Insets(0, 0, 0, 0));
         min.setContentAreaFilled(false);
         min.setBorderPainted(false);
         min.setOpaque(false);






         close.setFocusPainted(false);
         close.setMargin(new Insets(0, 0, 0, 0));
         close.setContentAreaFilled(false);
         close.setBorderPainted(false);
         close.setOpaque(false);


         min.setBounds(1310, 10, 22, 8);
         //max.setBounds(1270, 4,30,30);
         close.setBounds(1340, 5, 23, 19);

         min.addActionListener(this);
         //max.addActionListener(this);
         close.addActionListener(this);


         //t1player1.addMouseListener(this);

         ///////////////////////////////////////add and place bottom elemets
         c.add(settings);
         settings.setBounds(5, 745, 79, 13);
         settings.setFocusPainted(false);
         settings.setMargin(new Insets(0, 0, 0, 0));
         settings.setContentAreaFilled(false);
         settings.setBorderPainted(false);
         settings.setOpaque(false);


         c.add(bbar1);
         bbar1.setBounds(75, 745, 2, 13);




         c.add(gtwww);
         gtwww.setBounds(85, 747, 78, 8);
         gtwww.setFocusPainted(false);
         gtwww.setMargin(new Insets(0, 0, 0, 0));
         gtwww.setContentAreaFilled(false);
         gtwww.setBorderPainted(false);
         gtwww.setOpaque(false);



         c.add(bbar2);
         bbar2.setBounds(170, 745, 2, 13);







         c.add(help);
         help.setBounds(180, 747, 25, 8);
         help.setFocusPainted(false);
         help.setMargin(new Insets(0, 0, 0, 0));
         help.setContentAreaFilled(false);
         help.setBorderPainted(false);
         help.setOpaque(false);
//         







//
         
        
         





         

         ////////////////adding hidden shadow buttons////////////
//         c.add(splus);
//         splus.setBounds(1199,60,38,38);
//         splus.setVisible(false);
//         splus.setFocusPainted(false);
//         splus.setMargin(new Insets(0, 0, 0, 0));
//         splus.setContentAreaFilled(false);
//         splus.setBorderPainted(false);
//         splus.setOpaque(false);
         
         
         c.add(sclose);



         //max.setBounds(1270, 4,30,30);
         sclose.setBounds(1332, -4, 39, 35);
         sclose.setVisible(false);
         sclose.setFocusPainted(false);
         sclose.setMargin(new Insets(0, 0, 0, 0));
         sclose.setContentAreaFilled(false);
         sclose.setBorderPainted(false);
         sclose.setOpaque(false);

         c.add(smin);
         smin.setBounds(1302, 1, 38, 24);

         smin.setVisible(false);
         smin.setFocusPainted(false);
         smin.setMargin(new Insets(0, 0, 0, 0));
         smin.setContentAreaFilled(false);
         smin.setBorderPainted(false);
         smin.setOpaque(false);

         
         c.add(ssettings);
         ssettings.setBounds(11, 737, 67, 27);
         ssettings.setVisible(false);
         ssettings.setFocusPainted(false);
         ssettings.setMargin(new Insets(0, 0, 0, 0));
         ssettings.setContentAreaFilled(false);
         ssettings.setBorderPainted(false);
         ssettings.setOpaque(false);


         



         c.add(sgtwww);
         sgtwww.setBounds(76, 737, 97, 27);
         sgtwww.setVisible(false);
         sgtwww.setFocusPainted(false);
         sgtwww.setMargin(new Insets(0, 0, 0, 0));
         sgtwww.setContentAreaFilled(false);
         sgtwww.setBorderPainted(false);
         sgtwww.setOpaque(false);



        







         c.add(shelp);
         shelp.setBounds(171, 737, 44,27);
         shelp.setVisible(false);
         shelp.setFocusPainted(false);
         shelp.setMargin(new Insets(0, 0, 0, 0));
         shelp.setContentAreaFilled(false);
         shelp.setBorderPainted(false);
         shelp.setOpaque(false);
//         
         
         c.add(sAccountInfo);
         sAccountInfo.setBounds(1043, -1, 198, 28);
         sAccountInfo.setVisible(false);

         sAccountInfo.setFocusPainted(false);
         sAccountInfo.setMargin(new Insets(0, 0, 0, 0));
         sAccountInfo.setContentAreaFilled(false);
         sAccountInfo.setBorderPainted(false);
         sAccountInfo.setOpaque(false);



         c.add(sProfile);
         
         sProfile.setBounds(1088, 20, 149, 32);
         sProfile.setVisible(false);

         sProfile.setFocusPainted(false);
         sProfile.setMargin(new Insets(0, 0, 0, 0));
         sProfile.setContentAreaFilled(false);
         sProfile.setBorderPainted(false);
         sProfile.setOpaque(false);


         c.add(sLogout);
         sLogout.setBounds(1151, 43, 76, 31);
         sLogout.setVisible(false);

         sLogout.setFocusPainted(false);
         sLogout.setMargin(new Insets(0, 0, 0, 0));
         sLogout.setContentAreaFilled(false);
         sLogout.setBorderPainted(false);
         sLogout.setOpaque(false);


         ///////////////////////////////////chipslect frame//////////////
         
         
        //////////////green panel.///////////// 
         c.add(greenp);
         //greenp.setVisible(false);
         greenp.setLayout(null);
         greenp.setBounds(0,226,1366,473);
         greenp.setOpaque(false);
         
         
         
         greenp.add(greent1);
         greent1.setLayout(null);
         greent1.setBounds(45,25,295,397);
         greent1.setFocusPainted(false);
         greent1.setMargin(new Insets(0, 0, 0, 0));
         greent1.setContentAreaFilled(false);
         greent1.setBorderPainted(false);
         greent1.setOpaque(false);
         
         greent1.add(g1500);
         g1500.setBounds(100,20,93,27);
         
         greenp.add(greent2);
         greent2.setLayout(null);
         greent2.setBounds(375,25,295,397);
         
         greent2.setFocusPainted(false);
         greent2.setMargin(new Insets(0, 0, 0, 0));
         greent2.setContentAreaFilled(false);
         greent2.setBorderPainted(false);
         greent2.setOpaque(false);
         
         greent2.add(g2500);
         g2500.setBounds(100,20,93,27);
         
         greenp.add(greent3);
         greent3.setLayout(null);
         greent3.setBounds(705,25,295,397);
         
         greent3.setFocusPainted(false);
         greent3.setMargin(new Insets(0, 0, 0, 0));
         greent3.setContentAreaFilled(false);
         greent3.setBorderPainted(false);
         greent3.setOpaque(false);
         
         greent3.add(g3500);
         g3500.setBounds(100,20,93,27);
         greenp.add(greent4);
         
         
         greent4.setLayout(null);
         greent4.setBounds(1035,25,295,397);
        
         greent4.setFocusPainted(false);
         greent4.setMargin(new Insets(0, 0, 0, 0));
         greent4.setContentAreaFilled(false);
         greent4.setBorderPainted(false);
         greent4.setOpaque(false);
         
         
         greent4.add(g4500);
         g4500.setBounds(100,20,93,27);
         
         
         
        
         
         
         
        ///////////////////////////////////////blue panel
         c.add(bluep);
         bluep.setVisible(false);
         
         bluep.setLayout(null);
         bluep.setBounds(0,226,1366,473);
         bluep.setOpaque(false);
         
         
         bluep.add(bluet1);
         bluet1.setLayout(null);
         bluet1.setBounds(45,25,295,397);
         
         bluet1.setFocusPainted(false);
         bluet1.setMargin(new Insets(0, 0, 0, 0));
         bluet1.setContentAreaFilled(false);
         bluet1.setBorderPainted(false);
         bluet1.setOpaque(false);
         
         
         bluet1.add(b1000);
         b1000.setBounds(100,20,115,27);
         
         
         bluep.add(bluet2);
         bluet2.setLayout(null);
         bluet2.setBounds(375,25,295,397);
         
         bluet2.setFocusPainted(false);
         bluet2.setMargin(new Insets(0, 0, 0, 0));
         bluet2.setContentAreaFilled(false);
         bluet2.setBorderPainted(false);
         bluet2.setOpaque(false);
         
         
         bluet2.add(b1500);
         b1500.setBounds(100,20,115,27);
         
         
         bluep.add(bluet3);
         bluet3.setLayout(null);
         bluet3.setBounds(705,25,295,397);
         
         bluet3.setFocusPainted(false);
         bluet3.setMargin(new Insets(0, 0, 0, 0));
         bluet3.setContentAreaFilled(false);
         bluet3.setBorderPainted(false);
         bluet3.setOpaque(false);
         
         
         bluet3.add(b2000);
         b2000.setBounds(100,20,115,27);
         
         
         
         bluep.add(bluet4);
         bluet4.setLayout(null);
         bluet4.setBounds(1035,25,295,397);
        
         bluet4.setFocusPainted(false);
         bluet4.setMargin(new Insets(0, 0, 0, 0));
         bluet4.setContentAreaFilled(false);
         bluet4.setBorderPainted(false);
         bluet4.setOpaque(false);
        
         bluet4.add(b2500);
         b2500.setBounds(100,20,115,27);
         
         
         //////////////////////////////////////////////////////yellow panel
         
        
         
         c.add(yellowp);
         yellowp.setVisible(false);
         
         yellowp.setLayout(null);
         yellowp.setBounds(0,226,1366,473);
         yellowp.setOpaque(false);
         
         
         yellowp.add(yellowt1);
         yellowt1.setLayout(null);
         yellowt1.setBounds(45,25,295,397);
         
         yellowt1.setFocusPainted(false);
         yellowt1.setMargin(new Insets(0, 0, 0, 0));
         yellowt1.setContentAreaFilled(false);
         yellowt1.setBorderPainted(false);
         yellowt1.setOpaque(false);
         
         yellowt1.add(y3000);
         y3000.setBounds(100,20,115,27);
         
         
         
         yellowp.add(yellowt2);
         yellowt2.setLayout(null);
         yellowt2.setBounds(375,25,295,397);
         
         yellowt2.setFocusPainted(false);
         yellowt2.setMargin(new Insets(0, 0, 0, 0));
         yellowt2.setContentAreaFilled(false);
         yellowt2.setBorderPainted(false);
         yellowt2.setOpaque(false);
         
         yellowt2.add(y4000);
         y4000.setBounds(100,20,115,27);
         
         yellowp.add(yellowt3);
         yellowt3.setLayout(null);
         yellowt3.setBounds(705,25,295,397);
         
         yellowt3.setFocusPainted(false);
         yellowt3.setMargin(new Insets(0, 0, 0, 0));
         yellowt3.setContentAreaFilled(false);
         yellowt3.setBorderPainted(false);
         yellowt3.setOpaque(false);
         
         
         yellowt3.add(y5000);
         y5000.setBounds(100,20,115,27);
         
         
         yellowp.add(yellowt4);
         yellowt4.setLayout(null);
         yellowt4.setBounds(1035,25,295,397);
        
         yellowt4.setFocusPainted(false);
         yellowt4.setMargin(new Insets(0, 0, 0, 0));
         yellowt4.setContentAreaFilled(false);
         yellowt4.setBorderPainted(false);
         yellowt4.setOpaque(false);
        
         
         yellowt4.add(y6000);
         y6000.setBounds(100,20,115,27);
         
        ///////////////////////////////////////////////////red panel
         
         c.add(redp);
         
         redp.setVisible(false);
         
         redp.setLayout(null);
         redp.setBounds(0,226,1366,473);
         redp.setOpaque(false);
         
         
         redp.add(redt1);
         redt1.setLayout(null);
         redt1.setBounds(45,25,295,397);
         
         redt1.setFocusPainted(false);
         redt1.setMargin(new Insets(0, 0, 0, 0));
         redt1.setContentAreaFilled(false);
         redt1.setBorderPainted(false);
         redt1.setOpaque(false);
         
         redt1.add(r7000);
         r7000.setBounds(100,20,115,27);
         
         
         redp.add(redt2);
         redt2.setLayout(null);
         redt2.setBounds(375,25,295,397);
         
         redt2.setFocusPainted(false);
         redt2.setMargin(new Insets(0, 0, 0, 0));
         redt2.setContentAreaFilled(false);
         redt2.setBorderPainted(false);
         redt2.setOpaque(false);
         
         redt2.add(r8000);
         r8000.setBounds(100,20,115,27);
         
         redp.add(redt3);
         redt3.setLayout(null);
         redt3.setBounds(705,25,295,397);
         
         redt3.setFocusPainted(false);
         redt3.setMargin(new Insets(0, 0, 0, 0));
         redt3.setContentAreaFilled(false);
         redt3.setBorderPainted(false);
         redt3.setOpaque(false);
         
         
         redt3.add(r9000);
         r9000.setBounds(100,20,115,27);
         
         redp.add(redt4);
         redt4.setLayout(null);
         redt4.setBounds(1035,25,295,397);
        
         redt4.setFocusPainted(false);
         redt4.setMargin(new Insets(0, 0, 0, 0));
         redt4.setContentAreaFilled(false);
         redt4.setBorderPainted(false);
         redt4.setOpaque(false);
         
         redt4.add(r10000);
         r10000.setBounds(100,20,136,27);
        
         
         c.add(t1outline);
         t1outline.setBounds(53,248,290,402);
         t1outline.setVisible(false);
         
         c.add(t2outline);
         t2outline.setBounds(384,248,290,402);
         t2outline.setVisible(false);
         
         c.add(t3outline);
         t3outline.setBounds(713,248,290,402);
         t3outline.setVisible(false);
         
         c.add(t4outline);
         t4outline.setBounds(1043,248,290,402);
         t4outline.setVisible(false);
         
         
         
         
         //greent1.add(c1);
         //c1.setBounds(150,75,181,17);
         
         
         
         int sum1=89;
         int sum2=89;
         int sum3=89;
         int sum4=89;
         //////////////number of players per table///////////
         for(int i =0;i<5;i++)
         {
         greent1.add(g[i]);
         g[i].setBounds(115,sum1,138,17);
         g[i].setForeground(Color.white);
         
         bluet1.add(b[i]);
         b[i].setBounds(115,sum1,138,17);
         b[i].setForeground(Color.white);
         
         yellowt1.add(y[i]);
         y[i].setBounds(115,sum1,138,17);
         y[i].setForeground(Color.white);
         
         redt1.add(r[i]);
         r[i].setBounds(115,sum1,138,17);
         r[i].setForeground(Color.white);
         sum1=sum1+57;
         } 
        
         for(int j=5 ;j<10;j++)
         {
         
         greent2.add(g[j]);
         g[j].setBounds(115,sum2,138,17);
         g[j].setForeground(Color.white);
         
         bluet2.add(b[j]);
         b[j].setBounds(115,sum2,138,17);
         b[j].setForeground(Color.white);
         
         yellowt2.add(y[j]);
         y[j].setBounds(115,sum2,138,17);
         y[j].setForeground(Color.white);
         
         redt2.add(r[j]);
         r[j].setBounds(115,sum2,138,17);
         r[j].setForeground(Color.white);
         sum2=sum2+57;
         k++;
         
         } 
      
         for(int l=10;l<15;l++)
         {
        	 
        	 greent3.add(g[l]);
             g[l].setBounds(115,sum3,138,17);
             g[l].setForeground(Color.white);
             
             bluet3.add(b[l]);
             b[l].setBounds(115,sum3,138,17);
             b[l].setForeground(Color.white);
             
             yellowt3.add(y[l]);
             y[l].setBounds(115,sum3,138,17);
             y[l].setForeground(Color.white);
             
             redt3.add(r[l]);
             r[l].setBounds(115,sum3,138,17);
             r[l].setForeground(Color.white);
             sum3=sum3+57;
             
             x++;
        	 
        	
         }
         
         
         for(int m=15;m<20;m++)
         {
        	 
        	 greent4.add(g[m]);
             g[m].setBounds(115,sum4,138,17);
             g[m].setForeground(Color.white);
             
             bluet4.add(b[m]);
             b[m].setBounds(115,sum4,138,17);
             b[m].setForeground(Color.white);
             
             yellowt4.add(y[m]);
             y[m].setBounds(115,sum4,138,17);
             y[m].setForeground(Color.white);
             
             redt4.add(r[m]);
             r[m].setBounds(115,sum4,138,17);
             r[m].setForeground(Color.white);
             
             sum4=sum4+57;
             z++;
        	 
        	
         }
         
         
        
         ///////////////////////////////////////////////
         c.add(selectback);
         selectback.setBounds(0,226,1366,473);
         
         
         
 /////////////////button shadows/////////////
        
         
         c.add(greens);
         greens.setBounds(70,125,255,101);
         greens.setVisible(false);
         greens.setFocusPainted(false);
         greens.setMargin(new Insets(0, 0, 0, 0));
         greens.setContentAreaFilled(false);
         greens.setBorderPainted(false);
         greens.setOpaque(false);
         
        
         
         c.add(blues);
         blues.setBounds(400,125,255,101);
         blues.setVisible(false);
         blues.setFocusPainted(false);
         blues.setMargin(new Insets(0, 0, 0, 0));
         blues.setContentAreaFilled(false);
         blues.setBorderPainted(false);
         blues.setOpaque(false);
         
         
         
         c.add(yellows);
         yellows.setBounds(730,125,255,101);
         yellows.setVisible(false);
         yellows.setFocusPainted(false);
         yellows.setMargin(new Insets(0, 0, 0, 0));
         yellows.setContentAreaFilled(false);
         yellows.setBorderPainted(false);
         yellows.setOpaque(false);
         
         
         c.add(reds);
         reds.setBounds(1060,125,255,101);
         reds.setVisible(false);
         reds.setFocusPainted(false);
         reds.setMargin(new Insets(0, 0, 0, 0));
         reds.setContentAreaFilled(false);
         reds.setBorderPainted(false);
         reds.setOpaque(false);
////////////////////shadow buttons added////////////////
        
         
         c.add(greenda);
         greenda.setBounds(70,125,255,101);
         greenda.setVisible(false);
         greenda.setFocusPainted(false);
         greenda.setMargin(new Insets(0, 0, 0, 0));
         greenda.setContentAreaFilled(false);
         greenda.setBorderPainted(false);
         greenda.setOpaque(false);
         
         c.add(greena);
         greena.setBounds(70,125,255,101);
         //greena.setVisible(false);
         greena.setFocusPainted(false);
         greena.setMargin(new Insets(0, 0, 0, 0));
         greena.setContentAreaFilled(false);
         greena.setBorderPainted(false);
         greena.setOpaque(false);
         
         
         
         c.add(blueda);
         blueda.setBounds(400,125,255,101);
         blueda.setFocusPainted(false);
         blueda.setMargin(new Insets(0, 0, 0, 0));
         blueda.setContentAreaFilled(false);
         blueda.setBorderPainted(false);
         blueda.setOpaque(false);
         
         c.add(bluea);
         bluea.setBounds(400,125,255,101);
         bluea.setVisible(false);
         bluea.setFocusPainted(false);
         bluea.setMargin(new Insets(0, 0, 0, 0));
         bluea.setContentAreaFilled(false);
         bluea.setBorderPainted(false);
         bluea.setOpaque(false);
         
         
         
         c.add(yellowda);
         yellowda.setBounds(730,125,255,101);
         yellowda.setFocusPainted(false);
         yellowda.setMargin(new Insets(0, 0, 0, 0));
         yellowda.setContentAreaFilled(false);
         yellowda.setBorderPainted(false);
         yellowda.setOpaque(false);
         
         c.add(yellowa);
         yellowa.setBounds(730,125,255,101);
         yellowa.setVisible(false);
         yellowa.setFocusPainted(false);
         yellowa.setMargin(new Insets(0, 0, 0, 0));
         yellowa.setContentAreaFilled(false);
         yellowa.setBorderPainted(false);
         yellowa.setOpaque(false);
         
         
         
         c.add(redda);
         redda.setBounds(1060,125,255,101);
         redda.setFocusPainted(false);
         redda.setMargin(new Insets(0, 0, 0, 0));
         redda.setContentAreaFilled(false);
         redda.setBorderPainted(false);
         redda.setOpaque(false);
         
         c.add(reda);
         reda.setBounds(1060,125,255,101);
         reda.setVisible(false);
         reda.setFocusPainted(false);
         reda.setMargin(new Insets(0, 0, 0, 0));
         reda.setContentAreaFilled(false);
         reda.setBorderPainted(false);
         reda.setOpaque(false);
         
         
         
         
         
         
         
         
         
         
                 
         
         
        accountpic.addActionListener(this); 
        plus.addMouseListener(this);
        splus.addMouseListener(this); 
        splus.addActionListener(this);
        plus.addActionListener(this);
        


         min.addActionListener(this);
         smin.addMouseListener(this);
         min.addMouseListener(this);


         close.addMouseListener(this);
         sclose.addMouseListener(this);
         sclose.addActionListener(this);


         settings.addMouseListener(this);
         ssettings.addMouseListener(this);

         gtwww.addMouseListener(this);
         sgtwww.addMouseListener(this);

         help.addMouseListener(this);
         shelp.addMouseListener(this);

         AccountInfo.addMouseListener(this);
         sAccountInfo.addMouseListener(this);
         
         Profile.addMouseListener(this);
         sProfile.addMouseListener(this);
         
         Logout.addMouseListener(this);
         sLogout.addMouseListener(this);

         greens.addMouseListener(this);
         blues.addMouseListener(this);
         yellows.addMouseListener(this);
         reds.addMouseListener(this);
         
         greens.addActionListener(this);
         blues.addActionListener(this);
         yellows.addActionListener(this);
         reds.addActionListener(this);

         greenda.addMouseListener(this);
         blueda.addMouseListener(this);
         yellowda.addMouseListener(this);
         redda.addMouseListener(this);
         
         greent1.addMouseListener(this);
         greent1.addActionListener(this);
         
         greent2.addMouseListener(this);
         greent2.addActionListener(this);
         
         greent3.addMouseListener(this);
         greent3.addActionListener(this);
         
         greent4.addMouseListener(this);
         greent4.addActionListener(this);
         
         
         bluet1.addMouseListener(this);
         bluet1.addActionListener(this);
         
         bluet2.addMouseListener(this);
         bluet2.addActionListener(this);
         
         bluet3.addMouseListener(this);
         bluet3.addActionListener(this);
         
         bluet4.addMouseListener(this);
         bluet4.addActionListener(this);
         
         
         
         yellowt1.addMouseListener(this);
         yellowt1.addActionListener(this);
         
         yellowt2.addMouseListener(this);
         yellowt2.addActionListener(this);
         
         yellowt3.addMouseListener(this);
         yellowt3.addActionListener(this);
         
         yellowt4.addMouseListener(this);
         yellowt4.addActionListener(this);
         
         
         
         
         redt1.addMouseListener(this);
         redt1.addActionListener(this);
         
         redt2.addMouseListener(this);
         redt2.addActionListener(this);
         
         redt3.addMouseListener(this);
         redt3.addActionListener(this);
         
         redt4.addMouseListener(this);
         redt4.addActionListener(this);
         
         
         
         
         //////add background gradient
         c.add(bck);
         c.add(back);

         bck.setBounds(710, 80, 657, 684);
         back.setBounds(0, 0, xSize, ySize);
         

    	
    	
    	
    	
    }
    
     
     public static void main(String args[])
     {
    ChipSelect cs =	 new ChipSelect();
    cs.chip();
    	 
     }
     
    
     public void actionPerformed(ActionEvent e) {
         if (e.getSource() == min) 
         {
             f.setState(Frame.ICONIFIED);
             //f.setState ( Frame.ICONIFIED );

         }
         if(e.getSource()==greent1)
         {
        	 TableSelect2 ts= new TableSelect2();
        	 
         }
         if(e.getSource()==greent2)
         {
        	 TableSelect2 ts= new TableSelect2();
        	 
         }

         if(e.getSource()==greent3)
         {
        	 TableSelect2 ts= new TableSelect2();
        	 
         }

         if(e.getSource()==greent4)
         {
        	 TableSelect2 ts= new TableSelect2();
        	 
         }

         if(e.getSource()==bluet1)
         {
        	 TableSelect2 ts= new TableSelect2();
        	 
         }

         if(e.getSource()==bluet2)
         {
        	 TableSelect2 ts= new TableSelect2();
        	 
         }

         if(e.getSource()==bluet3)
         {
        	 TableSelect2 ts= new TableSelect2();
        	 
         }
         
         if(e.getSource()==bluet4)
         {
        	 TableSelect2 ts= new TableSelect2();
        	 
         }
         
         if(e.getSource()==yellowt1)
         {
        	 TableSelect2 ts= new TableSelect2();
        	 
         }

         if(e.getSource()==yellowt2)
         {
        	 TableSelect2 ts= new TableSelect2();
        	 
         }
 
         if(e.getSource()==yellowt3)
         {
        	 TableSelect2 ts= new TableSelect2();
        	 
         }
         
         if(e.getSource()==yellowt4)
         {
        	 TableSelect2 ts= new TableSelect2();
             
        	 
         }
         
         if(e.getSource()==redt1)
         {
        	 TableSelect2 ts= new TableSelect2();
        	 
         }

         if(e.getSource()==redt2)
         {
        	 TableSelect2 ts= new TableSelect2();
        	 
         }
         
         if(e.getSource()==redt3)
         {
        	 TableSelect2 ts= new TableSelect2();
        	 
         }
         
         if(e.getSource()==redt4)
         {
        	 TableSelect2 ts= new TableSelect2();
        	 
         }

        if(e.getSource()==greens)
        {
        	greenp.setVisible(true);
        	bluep.setVisible(false);
        	yellowp.setVisible(false);
        	redp.setVisible(false);
        }
        
        if(e.getSource()==blues)
        {
        	greenp.setVisible(false);
        	bluep.setVisible(true);
        	yellowp.setVisible(false);
        	redp.setVisible(false);
        }
        
        if(e.getSource()==yellows)
        {
        	greenp.setVisible(false);
        	bluep.setVisible(false);
        	yellowp.setVisible(true);
        	redp.setVisible(false);
        }
        
        if(e.getSource()==reds)
        {
        	greenp.setVisible(false);
        	bluep.setVisible(false);
        	yellowp.setVisible(false);
        	redp.setVisible(true);
        }
        


         if (e.getSource() == sclose)
         {
             System.exit(0);

         }

         if(e.getSource()==accountpic || e.getSource()==splus ||e.getSource()==plus )
         {
         AccountInfo.setVisible(true);
         Profile.setVisible(true);
         Logout.setVisible(true);
         
         }

         if(e.getSource()!=accountpic)
         {
             AccountInfo.setVisible(false);
             Profile.setVisible(false);
             Logout.setVisible(false);
         
             
         }
        
         
     }

     
     @Override
     public void mouseClicked(MouseEvent a) {
    	 if(a.getSource()==greens)
    	 {
    		flag[0]=1;
          	flag[1]=0;
          	flag[2]=0;
          	flag[3]=0;
    		 
    	 }
    	 
    	 if(a.getSource()==blues)
    	 {
    		flag[0]=0;
           	flag[1]=1;
           	flag[2]=0;
           	flag[3]=0;
    		 
    	 }
    	 
    	 if(a.getSource()==yellows)
    	 {
    		 
    		flag[0]=0;
           	flag[1]=0;
           	flag[2]=1;
           	flag[3]=0;
    	 
           	System.out.println("aadafs");
    	 }
    	 
    	 if(a.getSource()==reds)
    	 {
    		 	flag[0]=0;	
            	flag[1]=0;
            	flag[2]=0;
            	flag[3]=1;
    		 
    		 
    	 }
    	 
    	 
    		 if(flag[0]==1)
    		 {
    			 	greenda.setVisible(false);
    	         	greena.setVisible(true);
    	         	greens.setVisible(false);
    	         	
    	         	blueda.setVisible(true);
    	         	bluea.setVisible(false);
    	         	
    	         	yellowda.setVisible(true);
    	         	yellowa.setVisible(false);
    	         	
    	         	redda.setVisible(true);
    	         	reda.setVisible(false);
    		 }
    		 
    		 
    		 if(flag[1]==1)
    		 {
    			 
    			blueda.setVisible(false);
 	         	bluea.setVisible(true);
 	         	blues.setVisible(false);
    			
 	         	greenda.setVisible(true);
 	         	greena.setVisible(false);
 	         	
 	         	yellowda.setVisible(true);
	         	yellowa.setVisible(false);
	         	
	         	redda.setVisible(true);
	         	reda.setVisible(false);
 	         	
 	         	
 	         	
    		 }
    		 
    		 if(flag[2]==1)
    		 {
    			 System.out.println(flag[2]);
    			 yellowda.setVisible(false);
    			 yellowa.setVisible(true);
    			 yellows.setVisible(false);
    			 
    			 
    			greenda.setVisible(true);
  	         	greena.setVisible(false);
    			 
  	         	redda.setVisible(true);
	         	reda.setVisible(false);
 	         	 
	         	blueda.setVisible(true);
	         	bluea.setVisible(false);
	         	
	         	System.out.println("Yellow");
	         	
	         	
    		 }
    		 
    		 
    		 if(flag[3]==1)
    		 {
    			 
    			 redda.setVisible(false);
    			 reda.setVisible(true);
    			 reds.setVisible(false);
    			 
    			 
    			greenda.setVisible(true);
  	         	greena.setVisible(false);
    			 
  	         	yellowda.setVisible(true);
	         	yellowa.setVisible(false);
	         	 
	         	blueda.setVisible(true);
	         	bluea.setVisible(false);
	         	
    			 
    			 
    			 
    			 
    		 }
    		 
    	 
    	 
    	 
    	 /*if(a.getSource()==greens && flag[0]==0)
         {
         	
         	greenda.setVisible(false);
         	greena.setVisible(true);
         	greens.setVisible(false);
         	
         	flag[0]=1;
         	flag[1]=0;
         	flag[2]=0;
         	flag[3]=0;
         }
    	  
    	 if(a.getSource()==blues)
         {
         	
         	blueda.setVisible(false);
         	bluea.setVisible(true);
         	
         	
         	blues.setVisible(false);
         	
         	greenda.setVisible(true);
         	greena.setVisible(false);
         	greens.setVisible(false);
         	
         	flag[0]=0;
         	flag[1]=1;
         	flag[2]=0;
         	flag[3]=0;
         }
    	  */
         
     }

     @Override
     public void mousePressed(MouseEvent a) 
     {
    	
     }

     @Override
     public void mouseReleased(MouseEvent a) 
     {
    	
     }

     @Override
     public void mouseEntered(MouseEvent a) {

    	 if(a.getSource()==greent1 || a.getSource()==bluet1 || a.getSource()==yellowt1 || a.getSource()==redt1)
    	 {
    		 t1outline.setVisible(true);
    		 
    	 }
    	 
    	 if(a.getSource()==greent2 || a.getSource()==bluet2 || a.getSource()==yellowt2 || a.getSource()==redt2)
    	 {
    		 t2outline.setVisible(true);
    		 
    	 }
    	 if(a.getSource()==greent3 || a.getSource()==bluet3 || a.getSource()==yellowt3 || a.getSource()==redt3)
    	 {
    		 t3outline.setVisible(true);
    		 
    	 }
    	 if(a.getSource()==greent4 || a.getSource()==bluet4 || a.getSource()==yellowt4 || a.getSource()==redt4)
    	 {
    		 t4outline.setVisible(true);
    		 
    	 }
    	
    	 
    	 
    	 if(a.getSource()==greenda && flag[0] ==0)
         {
        	 
        	 greenda.setVisible(false);
        	 greens.setVisible(true);
        	 
         }
    	
    	
    	 if(a.getSource()==redda && flag[3]==0)
         {
        	 
        	 redda.setVisible(false);
        	 reds.setVisible(true);
        	 
         }
    	 
         if(a.getSource()==blueda && flag[1] ==0)
         {
        	 
        	 blueda.setVisible(false);
        	 blues.setVisible(true);
        	 
         }
    	
         if(a.getSource()==yellowda && flag[2] ==0)
         {
        	 
        	 yellowda.setVisible(false);
        	 yellows.setVisible(true);
        	 
         }
    	
         
         
         
         if (a.getSource() == close) 
         {
             close.setVisible(false);
             sclose.setVisible(true);
         }
         if (a.getSource() == min) {
             min.setVisible(false);
             smin.setVisible(true);
         }
         if (a.getSource() == settings) 
         {
             settings.setVisible(false);
             ssettings.setVisible(true);

         }
         if (a.getSource() == gtwww) 
         {
             gtwww.setVisible(false);
             sgtwww.setVisible(true);


         }
         if (a.getSource() == help) 
         {
             help.setVisible(false);
             shelp.setVisible(true);

         }
//         if(a.getSource()==plus)
//         {
//             plus.setVisible(false);
//             splus.setVisible(true);
//         
//         
//         }
         
         if(a.getSource()==AccountInfo)
         {
             AccountInfo.setVisible(false);
             sAccountInfo.setVisible(true);
         
         }
         if(a.getSource()==Profile)
         {
             Profile.setVisible(false);
             sProfile.setVisible(true);
         
         }
         if(a.getSource()==Logout)
         {
             Logout.setVisible(false);
             sLogout.setVisible(true);
         
         }


     }

     @Override
     public void mouseExited(MouseEvent a) 
     {
        
    	 if(a.getSource()==greent1 || a.getSource()==bluet1 || a.getSource()==yellowt1 || a.getSource()==redt1)
    	 {
    		 t1outline.setVisible(false);
    		 
    	 }
    	 
    	 if(a.getSource()==greent2 || a.getSource()==bluet2 || a.getSource()==yellowt2 || a.getSource()==redt2)
    	 {
    		 t2outline.setVisible(false);
    		 
    	 }
    	 if(a.getSource()==greent3 || a.getSource()==bluet3 || a.getSource()==yellowt3 || a.getSource()==redt3)
    	 {
    		 t3outline.setVisible(false);
    		 
    	 }
    	 if(a.getSource()==greent4 || a.getSource()==bluet4 || a.getSource()==yellowt4 || a.getSource()==redt4)
    	 {
    		 t4outline.setVisible(false);
    		 
    	 }
    	 
    	 if(a.getSource()==greens && flag[0]==0)
         {
        	 greenda.setVisible(true);
        	 greens.setVisible(false);
        	 
         }
    	
    	if(a.getSource()==blues  && flag[1]==0 )
         {
        	 blueda.setVisible(true);
        	 blues.setVisible(false);
        	 
         }
    	 
    	 if(a.getSource()==yellows  && flag[2]==0)
         {
        	 yellowda.setVisible(true);
        	 yellows.setVisible(false);
        	 
         }
    	 
    	 
    	 
    	 if(a.getSource()==reds  && flag[3]==0)
         {
        	 redda.setVisible(true);
        	 reds.setVisible(false);
        	 
         }
    	
    	 
    	 
    	 if (a.getSource() == sclose) 
         {
             close.setVisible(true);
             sclose.setVisible(false);
         }
         if (a.getSource() == smin) 
         {
             min.setVisible(true);
             smin.setVisible(false);
         }
         if (a.getSource() == ssettings)
         {
             settings.setVisible(true);
             ssettings.setVisible(false);

         }
         if (a.getSource() == sgtwww)
         {
             sgtwww.setVisible(false);
             gtwww.setVisible(true);


         }
         if (a.getSource() == shelp) 
         {
             
             shelp.setVisible(false);
             help.setVisible(true);

         }
//          if(a.getSource()==plus)
//         {
//             splus.setVisible(false);
//             plus.setVisible(true);
//         
//         
//         }
         
          if(a.getSource()==sAccountInfo)
         {
            sAccountInfo.setVisible(false);
             AccountInfo.setVisible(true);
         
         }
         if(a.getSource()==sProfile)
         {
             sProfile.setVisible(false);
             Profile.setVisible(true);
         
         }
         if(a.getSource()==sLogout)
         {
             sLogout.setVisible(false);
             Logout.setVisible(true);
         
         }
         
     }
    

}////end of parent class