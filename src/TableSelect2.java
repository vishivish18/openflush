
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
//import java.awt.event.MouseEvent;
//import java.awt.event.MouseListener;
import javax.swing.*;

public class TableSelect2 extends JFrame implements ActionListener, MouseListener {

    JFrame f;
    JLabel bck;// bckbar1, bckbar2, bckbar3, bckbar4, bckbar5, bckbar6, bckbar7, bckbar8, bckbar9, bckbar10;
    JButton min, close;
    JLabel back;
    
    
    
    JLabel pcount1, pcount2, pcount3, pcount4, pcount5, pcount6, pcount7, pcount8, pcount9, pcount10;
    JButton t1gtt, t2gtt, t3gtt, t4gtt, t5gtt;
    JButton t1sgtt, t2sgtt, t3sgtt, t4sgtt, t5sgtt;
    //JLabel TableNumber1, TableNumber2, TableNumber3, TableNumber4, TableNumber5;
    JLabel SmallLogo;    
    JButton AccountInfo, Profile, Logout, accountpic;
    JButton sAccountInfo, sProfile, sLogout, saccountpic;
   // JLabel table1, table2, table3, table4, table5;
    JLabel t1player1, t1player2, t1player3, t1player4, t1player5;
    JLabel t2player1, t2player2, t2player3, t2player4, t2player5;
    JLabel t3player1, t3player2, t3player3, t3player4, t3player5;
    JLabel t4player1, t4player2, t4player3, t4player4, t4player5;
    JLabel t5player1, t5player2, t5player3, t5player4, t5player5;
    JLabel t1p1bar, t1p2bar, t1p3bar, t1p4bar, t1p5bar;
    JLabel p1name,p2name,p3name,p4name,p5name;
    JButton sclose, smin, ssettings, sgtwww, shelp;
    JButton settings, gtwww, help;
    JLabel bbar1, bbar2;
    JButton plus,splus;
    JLabel tablevalue,bckgrnd;
    JButton back2select,back2selects;
    JLabel tablechoice;
    JLabel namebbt1,namebbt2,namebbt3,namebbt4,namebbt5;
    
    public TableSelect2() {
        JFrame f = new JFrame("Open Flush");
        Container c = f.getContentPane();

        
        
        
        
        ///////////name back bar/////////
        namebbt1=new JLabel(new ImageIcon("images\\data\\nameback.png"));
        namebbt2=new JLabel(new ImageIcon("images\\data\\nameback.png"));
        namebbt3=new JLabel(new ImageIcon("images\\data\\nameback.png"));
        namebbt4=new JLabel(new ImageIcon("images\\data\\nameback.png"));
        namebbt5=new JLabel(new ImageIcon("images\\data\\nameback.png"));
        
        
        
        
        
        tablevalue=new JLabel(new ImageIcon("images\\data\\500t.png"));
        bckgrnd=new JLabel(new ImageIcon("images\\data\\bckgrnd.png"));
        back2select=new JButton(new ImageIcon("images\\data\\back2select.png"));
        back2selects=new JButton(new ImageIcon("images\\data\\back2selects.png"));
        /////////////////////back with table number and strip///////////
        tablechoice = new JLabel(new ImageIcon("images\\data\\tablechoice16.png"));
        /////background logo
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
        saccountpic = new JButton(new ImageIcon("images\\data\\saccountpic.png"));
        ////////////////////////////////////////////////////////////////////////////////////
        ////bottom elements
        bbar1 = new JLabel(new ImageIcon("images\\data\\barsmall.png"));
        bbar2 = new JLabel(new ImageIcon("images\\data\\barsmall.png"));
        settings = new JButton(new ImageIcon("images\\data\\sett.png"));
        gtwww = new JButton(new ImageIcon("images\\data\\gtwww.png"));
        help = new JButton(new ImageIcon("images\\data\\help.png"));
        /////////////////////////////////////////////////////////////// 




        //contents for table 1: Back bar, Table Number,Player Icons and Sitin Sitout
        //bckbar1 = new JLabel(new ImageIcon("images\\data\\bb.png"));
        //table1 = new JLabel(new ImageIcon("images\\data\\table.png"));
        //TableNumber1 = new JLabel(new ImageIcon("images\\data\\1.png"));
        t1player1 = new JLabel(new ImageIcon("images\\data\\player.png"));
        t1player2 = new JLabel(new ImageIcon("images\\data\\dummy.png"));
        t1player3 = new JLabel(new ImageIcon("images\\data\\dummy.png"));
        t1player4 = new JLabel(new ImageIcon("images\\data\\dummy.png"));
        t1player5 = new JLabel(new ImageIcon("images\\data\\dummy.png"));
       
        t1p1bar = new JLabel(new ImageIcon("images\\data\\nameback.png"));
        t1p2bar = new JLabel(new ImageIcon("images\\data\\nameback.png"));
        t1p3bar = new JLabel(new ImageIcon("images\\data\\nameback.png"));
        t1p4bar = new JLabel(new ImageIcon("images\\data\\nameback.png"));
        t1p5bar = new JLabel(new ImageIcon("images\\data\\nameback.png"));
        
        p1name = new JLabel("abcde");
        p2name = new JLabel("dsgsdg");
        p3name = new JLabel("dgdfg");
        p4name = new JLabel("@#$%#%");
        p5name = new JLabel("fghhsrs");
        
        t1gtt = new JButton(new ImageIcon("images\\data\\gtt.png"));
        t1sgtt = new JButton(new ImageIcon("images\\data\\gtts.png"));
      
        //t1so =new JButton(new ImageIcon("images\\so.png"));
        //t1pon=new JButton(new ImageIcon("images\\pof.png"));
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////

        /////contents for table 2 : Back bar, Table Number,Player Icons and Sitin Sitout

        //bckbar2 = new JLabel(new ImageIcon("images\\data\\bb.png"));
        //table2 = new JLabel(new ImageIcon("images\\data\\table.png"));
        //TableNumber2 = new JLabel(new ImageIcon("images\\data\\2.png"));
        t2player1 = new JLabel(new ImageIcon("images\\data\\dummy.png"));
        t2player2 = new JLabel(new ImageIcon("images\\data\\dummy.png"));
        t2player3 = new JLabel(new ImageIcon("images\\data\\dummy.png"));
        t2player4 = new JLabel(new ImageIcon("images\\data\\dummy.png"));
        t2player5 = new JLabel(new ImageIcon("images\\data\\dummy.png"));
        t2gtt = new JButton(new ImageIcon("images\\data\\gtt.png"));
        t2sgtt = new JButton(new ImageIcon("images\\data\\gtts.png"));
      


        ////////////////////////////////////////////////////////////////////////////////////////////////////////////

        /////contents for table 3 : Back bar, Table Number,Player Icons and Sitin Sitout

        //bckbar3 = new JLabel(new ImageIcon("images\\data\\bb.png"));
        //table3 = new JLabel(new ImageIcon("images\\data\\table.png"));
        //TableNumber3 = new JLabel(new ImageIcon("images\\data\\3.png"));
        t3player1 = new JLabel(new ImageIcon("images\\data\\dummy.png"));
        t3player2 = new JLabel(new ImageIcon("images\\data\\dummy.png"));
        t3player3 = new JLabel(new ImageIcon("images\\data\\dummy.png"));
        t3player4 = new JLabel(new ImageIcon("images\\data\\dummy.png"));
        t3player5 = new JLabel(new ImageIcon("images\\data\\dummy.png"));
        t3gtt = new JButton(new ImageIcon("images\\data\\gtt.png"));
        t3sgtt = new JButton(new ImageIcon("images\\data\\gtts.png"));
              ////////////////////////////////////////////////////////////////////////////////////////////////////////////


        /////contents for table 4 : Back bar, Table Number,Player Icons and Sitin Sitout

        //bckbar4 = new JLabel(new ImageIcon("images\\data\\bb.png"));
        //table4 = new JLabel(new ImageIcon("images\\data\\table.png"));
        //TableNumber4 = new JLabel(new ImageIcon("images\\data\\4.png"));
        t4player1 = new JLabel(new ImageIcon("images\\data\\dummy.png"));
        t4player2 = new JLabel(new ImageIcon("images\\data\\dummy.png"));
        t4player3 = new JLabel(new ImageIcon("images\\data\\dummy.png"));
        t4player4 = new JLabel(new ImageIcon("images\\data\\dummy.png"));
        t4player5 = new JLabel(new ImageIcon("images\\data\\dummy.png"));
        t4gtt = new JButton(new ImageIcon("images\\data\\gtt.png"));
        t4sgtt = new JButton(new ImageIcon("images\\data\\gtts.png"));
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////

        /////contents for table 5 : Back bar, Table Number,Player Icons and Sitin Sitout
        //bckbar5 = new JLabel(new ImageIcon("images\\data\\bb.png"));
        //table5 = new JLabel(new ImageIcon("images\\data\\table.png"));
        //TableNumber5 = new JLabel(new ImageIcon("images\\data\\5.png"));
        t5player1 = new JLabel(new ImageIcon("images\\data\\dummy.png"));
        t5player2 = new JLabel(new ImageIcon("images\\data\\dummy.png"));
        t5player3 = new JLabel(new ImageIcon("images\\data\\dummy.png"));
        t5player4 = new JLabel(new ImageIcon("images\\data\\dummy.png"));
        t5player5 = new JLabel(new ImageIcon("images\\data\\dummy.png"));
        t5gtt = new JButton(new ImageIcon("images\\data\\gtt.png"));
        t5sgtt = new JButton(new ImageIcon("images\\data\\gtts.png"));
              ////////////////////////////////////////////////////////////////////////////////////////////////////////////


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
        c.add(saccountpic);
        saccountpic.setVisible(false);
        saccountpic.setBounds(1220, 0, 74, 74);
        saccountpic.setFocusPainted(false);
        saccountpic.setMargin(new Insets(0, 0, 0, 0));
        saccountpic.setContentAreaFilled(false);
        saccountpic.setBorderPainted(false);
        saccountpic.setOpaque(false);
        
        c.add(accountpic);
        //accountpic.setVisible(false);
        accountpic.setBounds(1220, 0, 74, 74);
        accountpic.setFocusPainted(false);
        accountpic.setMargin(new Insets(0, 0, 0, 0));
        accountpic.setContentAreaFilled(false);
        accountpic.setBorderPainted(false);
        accountpic.setOpaque(false);

        
      
        
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







////////////////////table value and back button/////////////////////
        
        c.add(tablevalue);
        tablevalue.setBounds(530,131,207,82);

       

        c.add(back2select);
        back2select.setBounds(769,142,63,62);
        back2select.setFocusPainted(false);
        back2select.setMargin(new Insets(0, 0, 0, 0));
        back2select.setContentAreaFilled(false);
        back2select.setBorderPainted(false);
        back2select.setOpaque(false);
        
        c.add(back2selects);
        back2selects.setBounds(756,128,88,88);
        back2selects.setVisible(false);
        back2selects.setFocusPainted(false);
        back2selects.setMargin(new Insets(0, 0, 0, 0));
        back2selects.setContentAreaFilled(false);
        back2selects.setBorderPainted(false);
        back2selects.setOpaque(false);
        
        c.add(bckgrnd);
        bckgrnd.setBounds(755,131,89,82);


        
        
        ////add and place table 1 contents


        //f.add(count1);
        //f.add(pcount1);
        //c.add(table1);
        c.add(t1player1);
        c.add(t1player2);
        c.add(t1player3);
        c.add(t1player4);
        c.add(t1player5);
        //f.add(eye1);
        //eye1.setBounds(950, 218, 52, 23);
        //f.add(count1);
        //count1.setBounds(1020, 218, 69, 26);
        //f.add(t1pon);
        //c.add(TableNumber1);
        //TableNumber1.setBounds(270, 197, 26, 63);
        c.add(t1gtt);
        t1gtt.setBounds(900, 218, 53, 53);
        c.add(t1sgtt);
        t1sgtt.setVisible(false);
        t1sgtt.setBounds(885,202, 84, 84);
        
        c.add(t1p1bar);
        c.add(t1p2bar);
        c.add(t1p3bar);
        c.add(t1p4bar);
        f.add(t1p5bar);
        t1player1.setBounds(505,213,64,64);
        t1player2.setBounds(580,213,64,64);
        t1player3.setBounds(655,213,64,64);
        t1player4.setBounds(730,213,64,64);
        t1player5.setBounds(805,213,64,64);

        c.add(namebbt1);
        namebbt1.setBounds(505,277,64,15);
        c.add(namebbt2);
        namebbt2.setBounds(580,370,64,15);
        c.add(namebbt3);
        namebbt3.setBounds(655,464,64,15);
        c.add(namebbt4);
        namebbt4.setBounds(730,560,64,15);
        c.add(namebbt5);
        namebbt5.setBounds(805,654,64,15);
        
        
        
        c.add(p1name);
        p1name.setBounds(505, 278,100,15);

        c.add(p2name);
        p2name.setBounds(580, 278,100,15);

        c.add(p3name);
        p3name.setBounds(655, 278,100,15);

        c.add(p4name);
        p4name.setBounds(730, 278,100,15);

        c.add(p5name);
        p5name.setBounds(805, 278,100,15);

        
        
        // t1player6.setBounds(1005,148,35,35);

        //t1gtt.setBounds(850,203,53,53);
        //t1so.setBounds(830,150,30,30);
        //t1pon.setBounds(890,150,30,30);

        //count1.setBounds(790,150,50,30);
        //pcount1.setBounds(660,150,50,30);



        t1gtt.setFocusPainted(false);
        t1gtt.setMargin(new Insets(0, 0, 0, 0));
        t1gtt.setContentAreaFilled(false);
        t1gtt.setBorderPainted(false);
        t1gtt.setOpaque(false);
        t1gtt.addActionListener(this);

        t1gtt.addMouseListener(this);


        t1sgtt.setFocusPainted(false);
        t1sgtt.setMargin(new Insets(0, 0, 0, 0));
        t1sgtt.setContentAreaFilled(false);
        t1sgtt.setBorderPainted(false);
        t1sgtt.setOpaque(false);
        t1sgtt.addActionListener(this);

        t1sgtt.addMouseListener(this);

        ////////////////////////////////////////////////////////////////////////////////////////////////////////////



        c.add(t2player1);
        c.add(t2player2);
        c.add(t2player3);
        c.add(t2player4);
        c.add(t2player5);
       
        
        t2player1.setBounds(505, 306, 64, 64);
        t2player2.setBounds(580, 306, 64, 64);
        t2player3.setBounds(655, 306, 64, 64);
        t2player4.setBounds(730, 306, 64, 64);
        t2player5.setBounds(805, 306, 64, 64);
       
        
        
        c.add(t2gtt);
        t2gtt.setBounds(900, 312, 53, 53);
        c.add(t2sgtt);
        t2sgtt.setVisible(false);
        t2sgtt.setBounds(885,296, 84, 84);
        
        

        t2gtt.setFocusPainted(false);
        t2gtt.setMargin(new Insets(0, 0, 0, 0));
        t2gtt.setContentAreaFilled(false);
        t2gtt.setBorderPainted(false);
        t2gtt.setOpaque(false);
        
        t2gtt.addMouseListener(this);
        
        
        
        t2sgtt.setFocusPainted(false);
        t2sgtt.setMargin(new Insets(0, 0, 0, 0));
        t2sgtt.setContentAreaFilled(false);
        t2sgtt.setBorderPainted(false);
        t2sgtt.setOpaque(false);
        t2sgtt.addActionListener(this);

        t2sgtt.addMouseListener(this);

        ////////////////////////////////////////////////////////////////////////////////////////////////////////////


        ////add table 3 contents

        // f.add(eye3);
        //  f.add(count3);
        // f.add(pcount3);
        //c.add(table3);
        c.add(t3player1);
        f.add(t3player2);
        c.add(t3player3);
        c.add(t3player4);
        c.add(t3player5);
        //f.add(t3si);f.add(t3so);
        //f.add(t3pon);
        //c.add(TableNumber3);
        //TableNumber3.setBounds(320, 387, 42, 65);
        

        c.add(t3gtt);
        t3gtt.setBounds(900, 406, 53, 53);
        c.add(t3sgtt);
        t3sgtt.setVisible(false);
        t3sgtt.setBounds(885,390, 84, 84);
        


        //c.add(bckbar3);
        //table3.setBounds(300, 387, 16, 66);
        //bckbar3.setBounds(0, 370, 1377, 100);
        t3player1.setBounds(505, 400, 64, 64);
        t3player2.setBounds(580, 400, 64, 64);
        t3player3.setBounds(655, 400, 64, 64);
        t3player4.setBounds(730, 400, 64, 64);
        t3player5.setBounds(805, 400, 64, 64);


        t3gtt.setFocusPainted(false);
        t3gtt.setMargin(new Insets(0, 0, 0, 0));
        t3gtt.setContentAreaFilled(false);
        t3gtt.setBorderPainted(false);
        t3gtt.setOpaque(false);

        t3gtt.addMouseListener(this);
        
        
        
        t3sgtt.setFocusPainted(false);
        t3sgtt.setMargin(new Insets(0, 0, 0, 0));
        t3sgtt.setContentAreaFilled(false);
        t3sgtt.setBorderPainted(false);
        t3sgtt.setOpaque(false);
        t3sgtt.addActionListener(this);

        t3sgtt.addMouseListener(this);

        //t3pon.setOpaque(false);



        ////////////////////////////////////////////////////////////////////////////////////////////////////////////


        ////add table 4 contents

        //f.add(eye4);
        //f.add(count4);
        //f.add(pcount4);

        //c.add(table4);
        c.add(t4player1);
        c.add(t4player2);
        c.add(t4player3);
        c.add(t4player4);
        c.add(t4player5);
        //f.add(t4si);f.add(t4so);
        //f.add(t4pon);
        //c.add(TableNumber4);
        //TableNumber4.setBounds(320, 482, 48, 63);
        
        c.add(t4gtt);
        t4gtt.setBounds(900,500,53,53);
        c.add(t4sgtt);
        t4sgtt.setVisible(false);
        t4sgtt.setBounds(885,484,84,84);
        

        //c.add(bckbar4);
        //table4.setBounds(300, 482, 16, 66);
        //bckbar4.setBounds(0, 465, 1377, 100);
        t4player1.setBounds(505, 494, 64, 64);
        t4player2.setBounds(580, 494, 64, 64);
        t4player3.setBounds(655, 494, 64, 64);
        t4player4.setBounds(730, 494, 64, 64);
        t4player5.setBounds(805, 494, 64, 64);


        t4gtt.setFocusPainted(false);
        t4gtt.setMargin(new Insets(0, 0, 0, 0));
        t4gtt.setContentAreaFilled(false);
        t4gtt.setBorderPainted(false);
        t4gtt.setOpaque(false);
        t4gtt.addMouseListener(this);
        
        
       
        
        t4sgtt.setFocusPainted(false);
        t4sgtt.setMargin(new Insets(0, 0, 0, 0));
        t4sgtt.setContentAreaFilled(false);
        t4sgtt.setBorderPainted(false);
        t4sgtt.setOpaque(false);
        t4sgtt.addActionListener(this);

        t4sgtt.addMouseListener(this);

        

        // t4pon.setOpaque(false);




        ////////////////////////////////////////////////////////////////////////////////////////////////////////////

        ////add table 5 contents

        //f.add(eye5);
        //f.add(count5);
        //f.add(pcount5);

        //c.add(table5);
        c.add(t5player1);
        c.add(t5player2);
        c.add(t5player3);
        c.add(t5player4);
        c.add(t5player5);
        //f.add(t5si);f.add(t5so);
        //f.add(t5pon);
        //c.add(TableNumber5);
        //TableNumber5.setBounds(325, 577, 42, 64);
        


        c.add(t5gtt);
        t5gtt.setBounds(900,594, 53, 53);
        c.add(t5sgtt);
        t5sgtt.setVisible(false);
        t5sgtt.setBounds(885,578, 84, 84);
        
        //c.add(bckbar5);
        //table5.setBounds(300, 577, 16, 66);
        //bckbar5.setBounds(0, 560, 1377, 100);
        t5player1.setBounds(505, 588, 64, 64);
        t5player2.setBounds(580, 588, 64, 64);
        t5player3.setBounds(655, 588, 64, 64);
        t5player4.setBounds(735, 588, 64, 64);
        t5player5.setBounds(810, 588, 64, 64);

        t5gtt.setFocusPainted(false);
        t5gtt.setMargin(new Insets(0, 0, 0, 0));
        t5gtt.setContentAreaFilled(false);
        t5gtt.setBorderPainted(false);
        t5gtt.setOpaque(false);
        t5gtt.addMouseListener(this);
        
       
       
        t5sgtt.setFocusPainted(false);
        t5sgtt.setMargin(new Insets(0, 0, 0, 0));
        t5sgtt.setContentAreaFilled(false);
        t5sgtt.setBorderPainted(false);
        t5sgtt.setOpaque(false);
        t5sgtt.addActionListener(this);

        t5sgtt.addMouseListener(this);

        
        
        //t5pon.setOpaque(false);

        ////////////////////////////////////////////////////////////////////////////////////////////////////////////



        ////////////////adding hidden shadow buttons////////////
//        c.add(splus);
//        splus.setBounds(1199,60,38,38);
//        splus.setVisible(false);
//        splus.setFocusPainted(false);
//        splus.setMargin(new Insets(0, 0, 0, 0));
//        splus.setContentAreaFilled(false);
//        splus.setBorderPainted(false);
//        splus.setOpaque(false);
        
        
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


        
        
        
        
        
        
        
       accountpic.addActionListener(this);
       saccountpic.addActionListener(this); 
       accountpic.addMouseListener(this);
       saccountpic.addMouseListener(this);
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

        back2selects.addMouseListener(this);
        back2select.addMouseListener(this);
        
        back2selects.addActionListener(this);

        ////////////////adding strip for tables/////////////
        c.add(tablechoice);
        tablechoice.setBounds(0,0,1366,768);
        


        //////add background gradient
        c.add(bck);
        c.add(back);

        bck.setBounds(710, 80, 657, 684);
        back.setBounds(0, 0, xSize, ySize);
        //f.setState ( Frame.ICONIFIED );

    }

    public static void main(String[] args) {

       TableSelect2 ts= new TableSelect2();


    }

    /* @Override
     public void mousePressed(MouseEvent e) 
     {
     if(e.getSource()==t1gtt)
     {
     System.out.println("Button pressed");    
         
     }
     if(e.getSource()==close)
     {
     System.exit(0);
        
     }
     if(e.getSource()==min)
     {
     //System.exit(0);
     f.setState (Frame.ICONIFIED);
     //Thread.sleep (5000);
             
            
        
     }
    
    
     }

     @Override
     public void mouseReleased(MouseEvent e) {
     System.out.println("Button released");    
     }

     @Override
     public void mouseEntered(MouseEvent e) 
     {
     // if(e.isPopupTrigger())
     //{
     //System.out.println("hello");
    
     // }
     System.out.println("Button entered");    
     }

     @Override
     public void mouseExited(MouseEvent e) {
     System.out.println("Button exited");    
     }

     @Override
     public void mouseClicked(MouseEvent e)
     {
       
     System.out.println("clicked");    
     }

     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == min) {
            f.setState(Frame.ICONIFIED);
            //f.setState ( Frame.ICONIFIED );

        }


       if(e.getSource()==back2selects)
       {
    	   new ChipSelect();ChipSelect cs =	 new ChipSelect();
    	    cs.chip();
    	   
       }


        if (e.getSource() == sclose)
        {
            System.exit(0);

        }

        if(e.getSource()==saccountpic || e.getSource()==splus ||e.getSource()==plus )
        {
        AccountInfo.setVisible(true);
        Profile.setVisible(true);
        Logout.setVisible(true);
        
        }

        if(e.getSource()!=saccountpic)
        {
            AccountInfo.setVisible(false);
            Profile.setVisible(false);
            Logout.setVisible(false);
        
            
        }
        if(e.getSource()==t1sgtt || e.getSource()==t2sgtt || e.getSource()==t3sgtt || e.getSource()==t4sgtt || e.getSource()==t5sgtt)
        {
        GamePlay2 gp = new GamePlay2();
        
        }
        
    }

    
    @Override
    public void mouseClicked(MouseEvent a) {
        System.out.println("click");
    }

    @Override
    public void mousePressed(MouseEvent a) {
        System.out.println("pressed");
    }

    @Override
    public void mouseReleased(MouseEvent a) {
        System.out.println("releaseed");
    }

    @Override
    public void mouseEntered(MouseEvent a) {
    	
    	if(a.getSource()==back2select)
    	{
    		back2selects.setVisible(true);
    		back2select.setVisible(false);
    	}
    	
    	
        if(a.getSource()==accountpic)
        {
        	saccountpic.setVisible(true);
        	
      
        }
    	
    	if (a.getSource() == t1gtt) 
        {
            t1gtt.setVisible(false);
            t1sgtt.setVisible(true);
        }
         if (a.getSource() == t2gtt) 
        {
            t2gtt.setVisible(false);
            t2sgtt.setVisible(true);
        }
          if (a.getSource() == t3gtt) 
        {
            t3gtt.setVisible(false);
            t3sgtt.setVisible(true);
        }
           if (a.getSource() == t4gtt) 
        {
            t4gtt.setVisible(false);
            t4sgtt.setVisible(true);
        }
            if (a.getSource() == t5gtt) 
        {
            t5gtt.setVisible(false);
            t5sgtt.setVisible(true);
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
//        if(a.getSource()==plus)
//        {
//            plus.setVisible(false);
//            splus.setVisible(true);
//        
//        
//        }
        
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
        
    	if(a.getSource()==back2selects)
    	{
    		back2select.setVisible(true);
    		back2selects.setVisible(false);
    	}
    	
    	
    	if(a.getSource()==saccountpic)
        {
        	saccountpic.setVisible(false);
        	
      
        }

    	
    	if (a.getSource() == t1sgtt) 
        {
            t1gtt.setVisible(true);
            t1sgtt.setVisible(false);
        }
         if (a.getSource() == t2sgtt) 
        {
            t2gtt.setVisible(true);
            t2sgtt.setVisible(false);
        }
          if (a.getSource() == t3sgtt) 
        {
            t3gtt.setVisible(true);
            t3sgtt.setVisible(false);
        }
           if (a.getSource() == t4sgtt) 
        {
            t4gtt.setVisible(true);
            t4sgtt.setVisible(false);
        }
            if (a.getSource() == t5sgtt) 
        {
            t5gtt.setVisible(true);
            t5sgtt.setVisible(false);
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
//         if(a.getSource()==plus)
//        {
//            splus.setVisible(false);
//            plus.setVisible(true);
//        
//        
//        }
        
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
}
