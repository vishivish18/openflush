
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



public class GamePlay2 extends JFrame implements ActionListener,MouseListener
{
    JFrame game;
    
    int flag=0;
    JLabel bck;
    JButton min, close ;
    JLabel back;
    JButton sitin1,sitin2,sitin3,sitin4,sitin5;
    JButton ssitin1,ssitin2,ssitin3,ssitin4,ssitin5;
    JButton sitout1,sitout2,sitout3,sitout4,sitout5;
    JButton ssitout1,ssitout2,ssitout3,ssitout4,ssitout5;
    JButton player1,player2,player3,player4,player5;
    JLabel pnbb1,pnbb2,pnbb3,pnbb4,pnbb5;
    JLabel bar,table,tablebck;
    JLabel count1,count2,count3,count4,count5,count6,count7,count8,count9,count10;
    JLabel spec1,spec2,spec3,spec4,spec5,spec6,spec7,spec8,spec9,spec10;
    JButton settings,gtwww,help;
    JLabel TableNumber;
    JLabel bbar1,bbar2,SmallLogo;
    JLabel welcome,picbckgrnd,hidpicbckgrnd;
    JButton AccountInfo,Profile,Logout,accountpic,saccountpic;
    JButton sAccountInfo,sProfile,sLogout;
    JLabel dealer;
    JButton playerpic,click;
    JLabel pname1,pname2,pname3,pname4,pname5;
    JButton hsignin;
    JLabel password;
    JPasswordField hpf;
    JLabel p1c1,p1c2,p1c3,p2c1,p2c2,p2c3,p3c1,p3c2,p3c3,p4c1,p4c2,p4c3,p5c1,p5c2,p5c3;////////////cards of players
    JButton sclose, smin, ssettings, sgtwww, shelp;
    JButton plus,splus;
    JLabel cover;
    JButton selecttable,spectate,bgame,selecttables,spectates,bgames;
    JButton tableselection,tableselections;
    JLabel eye,speccount;
    ////////////PROFILE
    JPanel profpan;
    JLabel profback,profpic;
    JLabel profname,profmember,profchips,profran,profgp,profwp,profht,profmax;
    JButton profclose;
    JLabel tablevalueg;
    
    //////CHAT
    JPanel chat;
    JButton chatoff,chatmin;
    JLabel chatback;
    //////////////chips
    JLabel p1chips,p2chips,p3chips,p4chips,p5chips;
    JLabel p1chipsv,p2chipsv,p3chipsv,p4chipsv,p5chipsv;
    /////winner ribbon/////////
    
    JPanel winribbon;
    JLabel winstrip;
    JButton wrsitout,wrsitouts;
    
    
    
    
    //JButton si
    public GamePlay2()
    {
    
        JFrame game = new JFrame("GamePlay");
        
        //////////////winner ribbon//////////////
        winribbon = new JPanel();
        winstrip = new JLabel(new ImageIcon("images\\data\\strip.png"));
        wrsitout= new JButton(new ImageIcon("images\\data\\wrsitout.png"));
        wrsitouts= new JButton(new ImageIcon("images\\data\\wrsitouts.png"));
        
        
        /////////playernames///////////
        pname1= new JLabel("abcde");
        pname2= new JLabel("xyzwe");
        pname3= new JLabel("dfghh");
        pname4= new JLabel("abcdefgh");
        pname5= new JLabel("@!@%$^&");
        
        
        
        
        tablevalueg= new JLabel(new ImageIcon("images\\data\\10000g.png"));
        //////////////chips////////
        p1chips = new JLabel(new ImageIcon("images\\data\\chipsvalue.png"));
        p2chips = new JLabel(new ImageIcon("images\\data\\chipsvalue.png"));
        p3chips = new JLabel(new ImageIcon("images\\data\\chipsvalue.png"));
        p4chips = new JLabel(new ImageIcon("images\\data\\chipsvalue.png"));
        p5chips = new JLabel(new ImageIcon("images\\data\\chipsvalue.png"));
        
        p1chipsv = new JLabel("2000");
        p2chipsv = new JLabel("46000");
        p3chipsv = new JLabel("00");
        p4chipsv = new JLabel("10000");
        p5chipsv = new JLabel("99990");
        
        //////////////////////////////////////////////////////////////////////////
        
        
        //////profile info/////////
          profpan= new JPanel();
          profback = new JLabel(new ImageIcon("images\\data\\profback.png"));
          profpic = new JLabel(new ImageIcon("images\\data\\playerimage.png"));
       // profdiv = new JLabel(new ImageIcon("images\\data\\new\\profdiv.png"));
        profname = new JLabel("Roshan Raj");
        profmember = new JLabel("5th April 2013");
        profchips = new JLabel("9999999");
        profran = new JLabel("100");
        profgp = new JLabel("10");
        profwp = new JLabel("0.3");
        profht= new JLabel("0");
        profmax= new JLabel("25000");
        profclose = new JButton(new ImageIcon("images\\data\\profclose.png"));
        
        
        //////////////////////////////////////////
        ///////////////chats
        chat = new JPanel();
        
        chatoff = new JButton(new ImageIcon("images\\data\\chatoff.png"));
        //chatmin = new JButton(new ImageIcon("images\\data\\new\\chatm.png"));
        chatback = new JLabel(new ImageIcon("images\\data\\chatback.png"));
        
        /////////////////////////////////////////
        
        bck = new JLabel(new ImageIcon("images\\data\\backlogo.png"));
        
        back = new JLabel(new ImageIcon("images\\data\\back.png"));
        
        ///minimmize sign
        min = new JButton(new ImageIcon("images\\data\\min.png"));
        ///close sign
        close = new JButton(new ImageIcon("images\\data\\clo.png"));
        
        
        tableselection= new JButton(new ImageIcon("images\\data\\tableselect.png"));
        tableselections= new JButton(new ImageIcon("images\\data\\tableselects.png"));
        
        SmallLogo= new JLabel(new ImageIcon("images\\data\\logonew.png"));

        plus = new JButton(new ImageIcon("images\\data\\+.png"));
        
        splus = new JButton(new ImageIcon("images\\data\\+1.png"));
        
        
        AccountInfo= new JButton(new ImageIcon("images\\data\\ai.png"));
        
        Profile= new JButton(new ImageIcon("images\\data\\ps.png"));
        
        Logout= new JButton(new ImageIcon("images\\data\\logout.png"));
        
        accountpic= new JButton(new ImageIcon("images\\data\\playerimage.png"));
        saccountpic = new JButton(new ImageIcon("images\\data\\saccountpic.png"));
        ///////////////////////////////////////////////
        
        
        
        
        
        
        
        
        
        
        ///////////spectator bar////////
        bar = new JLabel(new ImageIcon("images\\data\\bb.png"));
        table = new JLabel(new ImageIcon("images\\data\\table.png"));
        
        TableNumber =new JLabel(new ImageIcon("images\\data\\1.png"));
        spec1 = new JLabel(new ImageIcon("images\\data\\dummy.png"));
        spec2 = new JLabel(new ImageIcon("images\\data\\dummy.png"));
        spec3 = new JLabel(new ImageIcon("images\\data\\dummy.png"));
        spec4 = new JLabel(new ImageIcon("images\\data\\dummy.png"));
        spec5 = new JLabel(new ImageIcon("images\\data\\dummy.png"));
        spec6 = new JLabel(new ImageIcon("images\\data\\dummy.png"));
        spec7 = new JLabel(new ImageIcon("images\\data\\dummy.png"));
        spec8 = new JLabel(new ImageIcon("images\\data\\dummy.png"));
        spec9 = new JLabel(new ImageIcon("images\\data\\dummy.png"));
        spec10 = new JLabel(new ImageIcon("images\\data\\dummy.png"));
        eye = new JLabel(new ImageIcon("images\\data\\eye.png"));
        speccount = new JLabel(new ImageIcon("images\\data\\count.png"));
        
        
       /////////////////////////////////
        
        //////table and elements
        tablebck = new JLabel(new ImageIcon("images\\data\\tableback.png"));
        player1 = new JButton(new ImageIcon("images\\data\\playerimage.png")); 
        player2 = new JButton(new ImageIcon("images\\data\\playerimage.png")); 
        player3 = new JButton(new ImageIcon("images\\data\\playerimage.png")); 
        player4 = new JButton(new ImageIcon("images\\data\\playerimage.png")); 
        player5 = new JButton(new ImageIcon("images\\data\\playerimage.png")); 
        sitin1= new JButton(new ImageIcon("images\\data\\sitin.png")); 
        sitin2= new JButton(new ImageIcon("images\\data\\sitin.png")); 
        sitin3= new JButton(new ImageIcon("images\\data\\sitin.png")); 
        sitin4= new JButton(new ImageIcon("images\\data\\sitin.png")); 
        sitin5= new JButton(new ImageIcon("images\\data\\sitin.png")); 
        ssitin1= new JButton(new ImageIcon("images\\data\\ssitin.png")); 
        ssitin2= new JButton(new ImageIcon("images\\data\\ssitin.png")); 
        ssitin3= new JButton(new ImageIcon("images\\data\\ssitin.png")); 
        ssitin4= new JButton(new ImageIcon("images\\data\\ssitin.png")); 
        ssitin5= new JButton(new ImageIcon("images\\data\\ssitin.png")); 
        pnbb1 = new JLabel(new ImageIcon("images\\data\\namebb.png"));
        pnbb2 = new JLabel(new ImageIcon("images\\data\\namebb.png"));
        pnbb3 = new JLabel(new ImageIcon("images\\data\\namebb.png"));
        pnbb4 = new JLabel(new ImageIcon("images\\data\\namebb.png"));
        pnbb5 = new JLabel(new ImageIcon("images\\data\\namebb.png"));
        
        dealer = new JLabel(new ImageIcon("images\\data\\dealer.png"));
        
        ///////////////////////////////////////////////////////////////////
        /////////players cards/////
        
        ////player 1 cards
        p1c1 = new JLabel(new ImageIcon("images\\data\\card.png"));
        p1c2 = new JLabel(new ImageIcon("images\\data\\card.png"));
        p1c3 = new JLabel(new ImageIcon("images\\data\\card.png"));
        
        
        ////player 2 cards
        p2c1 = new JLabel(new ImageIcon("images\\data\\card.png"));
        p2c2 = new JLabel(new ImageIcon("images\\data\\card.png"));
        p2c3 = new JLabel(new ImageIcon("images\\data\\card.png"));
        
        ////player 3 cards
        p3c1 = new JLabel(new ImageIcon("images\\data\\card.png"));
        p3c2 = new JLabel(new ImageIcon("images\\data\\card.png"));
        p3c3 = new JLabel(new ImageIcon("images\\data\\card.png"));
        
        ////player 4 cards
        p4c1 = new JLabel(new ImageIcon("images\\data\\card.png"));
        p4c2 = new JLabel(new ImageIcon("images\\data\\card.png"));
        p4c3 = new JLabel(new ImageIcon("images\\data\\card.png"));
        
        
        ////player 5 cards
        p5c1 = new JLabel(new ImageIcon("images\\data\\card.png"));
        p5c2 = new JLabel(new ImageIcon("images\\data\\card.png"));
        p5c3 = new JLabel(new ImageIcon("images\\data\\card.png"));
        
        
        
        //////////////////hidden sitout button//////////////////
        sitout1=new JButton(new ImageIcon("images\\data\\sitout.png"));
        sitout2=new JButton(new ImageIcon("images\\data\\sitout.png"));
        sitout3=new JButton(new ImageIcon("images\\data\\sitout.png"));
        sitout4=new JButton(new ImageIcon("images\\data\\sitout.png"));
        sitout5=new JButton(new ImageIcon("images\\data\\sitout.png"));
      
        
        ////hidden shadow buttons for sitout///
        
        
        ssitout1=new JButton(new ImageIcon("images\\data\\sitout1.png"));
        ssitout2=new JButton(new ImageIcon("images\\data\\sitout1.png"));
        ssitout3=new JButton(new ImageIcon("images\\data\\sitout1.png"));
        ssitout4=new JButton(new ImageIcon("images\\data\\sitout1.png"));
        ssitout5=new JButton(new ImageIcon("images\\data\\sitout1.png"));
        
        
        
        
        
        
        
        
        ////////////////////////////////////////////////////////////////////////////////////
        ////bottom elements
       bbar1 = new JLabel(new ImageIcon("images\\data\\barsmall.png"));
       bbar2 = new JLabel(new ImageIcon("images\\data\\barsmall.png"));
       settings = new JButton(new ImageIcon("images\\data\\sett.png")); 
       gtwww= new JButton(new ImageIcon("images\\data\\gtwww.png")); 
       help= new JButton(new ImageIcon("images\\data\\help.png")); 
       /////////////////////////////////////////////////////////////// 
        
        //////////////////shadow buttons/////////////////
        sclose = new JButton(new ImageIcon("images\\data\\clo1.png"));
        smin = new JButton(new ImageIcon("images\\data\\min1.png"));
        ssettings = new JButton(new ImageIcon("images\\data\\sett1.png"));
        sgtwww = new JButton(new ImageIcon("images\\data\\gtwww1.png"));
        shelp = new JButton(new ImageIcon("images\\data\\help1.png"));
        
        
        
         //////////shadow elements account info, profile , logout
        sAccountInfo= new JButton(new ImageIcon("images\\data\\ai1.png"));
        sProfile= new JButton(new ImageIcon("images\\data\\ps1.png"));
        sLogout= new JButton(new ImageIcon("images\\data\\logout1.png"));
        
  
       //////////////////////////////////////labels and button after clicking sitout/////////////////
        cover= new JLabel(new ImageIcon("images\\data\\optionsback.png"));
        selecttable= new JButton(new ImageIcon("images\\data\\selectgame.png"));
        spectate= new JButton(new ImageIcon("images\\data\\spectate.png"));
        bgame= new JButton(new ImageIcon("images\\data\\back2.png"));
        selecttables= new JButton(new ImageIcon("images\\data\\selectgames.png"));
        spectates= new JButton(new ImageIcon("images\\data\\spectates.png"));
        bgames= new JButton(new ImageIcon("images\\data\\back2s.png"));
        //////////////////////////////////////////////////////////////
        
        
        
        
       Container c = game.getContentPane();
         
         
         
       
       
        Toolkit tk = Toolkit.getDefaultToolkit();
        int xSize = ((int) tk.getScreenSize().getWidth());
        int ySize = ((int) tk.getScreenSize().getHeight());
        game.setSize(xSize, ySize);
        //JFrame.setDefaultLookAndFeelDecorated(true);
        game.setUndecorated(true);
        //f.show();
        game.setVisible(true);
        game.setLayout(null); 
        
        c.add(saccountpic);
        saccountpic.setVisible(false);
        saccountpic.setBounds(1220, 0, 74, 74);
        saccountpic.setFocusPainted(false);
        saccountpic.setMargin(new Insets(0, 0, 0, 0));
        saccountpic.setContentAreaFilled(false);
        saccountpic.setBorderPainted(false);
        saccountpic.setOpaque(false);
        
        
        
        c.add(accountpic);
        accountpic.setBounds(1220,0,74,74);
        //accountpic.setVisible(false);
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
        c.setLayout(null);
        c.add(min);
        min.setBounds(1310, 10, 22,8);
        min.setFocusPainted(false);
        min.setMargin(new Insets(0, 0, 0, 0));
        min.setContentAreaFilled(false);
        min.setBorderPainted(false);
        min.setOpaque(false);
        
        //f.add(max);
        
        
        c.add(SmallLogo);
        
        SmallLogo.setBounds(0,9,147,57);
        
        
       
        
        
        c.add(close);
        close.setBounds(1340, 5, 23,19);
        close.setFocusPainted(false);
        close.setMargin(new Insets(0, 0, 0, 0));
        close.setContentAreaFilled(false);
        close.setBorderPainted(false);
        close.setOpaque(false);
        close.addActionListener(this);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        c.add(settings);
        settings.setBounds(5,745,79,13);
        
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
        //////////////profile information
       
        
        profpan.setLayout(null);
        
        profpan.setBounds(265,0,779,102);
        
        //profpan.setBackground(new Color(3,151,75));
        profpan.setOpaque(false);
        
        profpan.add(profname);
        profname.setBounds(220,4,100,30);
        profname.setForeground(Color.white);
        profpan.add(profmember);
        profmember.setForeground(Color.white);
        profmember.setBounds(220,23,100,30);
        profpan.add(profchips);
        profchips.setBounds(220,43,100,30);
        profchips.setForeground(Color.white);
        profpan.add(profran);
        profran.setBounds(220,65,100,30);
        profran.setForeground(Color.white);
        profpan.add(profgp);
        profgp.setBounds(580,4,100,30);
        profgp.setForeground(Color.white);
        profpan.add(profwp);
        profwp.setBounds(580,23,100,30);
        profwp.setForeground(Color.white);
        profpan.add(profht);
        profht.setBounds(580,43,100,30);
        profht.setForeground(Color.white);
        profpan.add(profmax);
        profmax.setBounds(580,65,100,30);
        profmax.setForeground(Color.white);
        c.add(profclose);
        profclose.setBounds(616,85, 33, 20);
        profclose.setVisible(false);
        profclose.setFocusPainted(false);
        profclose.setMargin(new Insets(0, 0, 0, 0));
        profclose.setContentAreaFilled(false);
        profclose.setBorderPainted(false);
        profclose.setOpaque(false);
        
        
        profpan.add(profpic);
        profpan.add(profback);
        
        
        
        
        profpic.setBounds(15,10,75,75);
        profback.setBounds(0,0,779,102);
        
        
        
       // profpan.setVisible(true);
        //c.add(profname);
        //c.add(profage);
        //c.add(profchips);
        //c.add(profstats);
        
        
        
        
        
        
        c.add(profpan);
        profpan.setVisible(false);
        
        
       //////////////////////////////////////////////////
        
        
        ///////////////chat contents///////////////////////
        chat.setLayout(null);
        chat.setBounds(1058,400,308,408);
        chat.setVisible(false);
        
        chat.setOpaque(false);
        //chat.setBackground(new Color (5,151,75));
        
        
        c.add(chatoff);
        chatoff.setBounds(1184,734,182,34);
        
        chatoff.setFocusPainted(false);
        chatoff.setMargin(new Insets(0, 0, 0, 0));
        chatoff.setContentAreaFilled(false);
        chatoff.setBorderPainted(false);
        chatoff.setOpaque(false);
        
        //c.add(chatmin);
        
      //  chatmin.setBounds(1093,413,211,17);
        
        //chatmin.setFocusPainted(false);
        //chatmin.setMargin(new Insets(0, 0, 0, 0));
        //chatmin.setContentAreaFilled(false);
        //chatmin.setBorderPainted(false);
        //chatmin.setOpaque(false);
        //chatmin.setVisible(false);
        
        
        chat.add(chatback);
        chatback.setBounds(0,0,308,408);
        
        
        
        c.add(chat);
        
        /////////////////////////////////////////////////////////
       //////////win ribbon///////////////
        c.add(winribbon);
        
        winribbon.setLayout(null);
        winribbon.setBounds(0,0,1366,768);
        winribbon.setOpaque(false);
        winribbon.setVisible(false);
        
        
        winribbon.add(wrsitout);
        wrsitout.setBounds(1235,345,117,118);
        wrsitout.setFocusPainted(false);
        wrsitout.setMargin(new Insets(0, 0, 0, 0));
        wrsitout.setContentAreaFilled(false);
        wrsitout.setBorderPainted(false);
        wrsitout.setOpaque(false);
        
        
        winribbon.add(wrsitouts);
        wrsitouts.setBounds(1226,335,136,137);
        wrsitouts.setFocusPainted(false);
        wrsitouts.setMargin(new Insets(0, 0, 0, 0));
        wrsitouts.setContentAreaFilled(false);
        wrsitouts.setBorderPainted(false);
        wrsitouts.setOpaque(false);
        wrsitouts.setVisible(false);
        
        
        
        winribbon.add(winstrip);
        winstrip.setBounds(0,0,1366,768);
        
        
        /////////////////adding options after sitoutclick
        c.add(selecttable);
        selecttable.setVisible(false);
        selecttable.setBounds(325,100,643,154);
        selecttable.setFocusPainted(false);
        selecttable.setMargin(new Insets(0, 0, 0, 0));
        selecttable.setContentAreaFilled(false);
        selecttable.setBorderPainted(false);
        selecttable.setOpaque(false);
        
        
        c.add(selecttables);
        selecttables.setVisible(false);
        selecttables.setBounds(325,100,643,154);
        selecttables.setFocusPainted(false);
        selecttables.setMargin(new Insets(0, 0, 0, 0));
        selecttables.setContentAreaFilled(false);
        selecttables.setBorderPainted(false);
        selecttables.setOpaque(false);
        
        
                
       
        
        c.add(spectate);
        spectate.setVisible(false);
        spectate.setBounds(210,300,865,154);
        spectate.setFocusPainted(false);
        spectate.setMargin(new Insets(0, 0, 0, 0));
        spectate.setContentAreaFilled(false);
        spectate.setBorderPainted(false);
        spectate.setOpaque(false);
        
        
        c.add(spectates);
        spectates.setVisible(false);
        spectates.setBounds(210,300,865,154);
        spectates.setFocusPainted(false);
        spectates.setMargin(new Insets(0, 0, 0, 0));
        spectates.setContentAreaFilled(false);
        spectates.setBorderPainted(false);
        spectates.setOpaque(false);
        
        c.add(bgame);
        bgame.setVisible(false);
        bgame.setBounds(325,500,643,154);
        bgame.setFocusPainted(false);
        bgame.setMargin(new Insets(0, 0, 0, 0));
        bgame.setContentAreaFilled(false);
        bgame.setBorderPainted(false);
        bgame.setOpaque(false);
        
        
        
        c.add(bgames);
        bgames.setVisible(false);
        bgames.setBounds(325,500,643,154);
        bgames.setFocusPainted(false);
        bgames.setMargin(new Insets(0, 0, 0, 0));
        bgames.setContentAreaFilled(false);
        bgames.setBorderPainted(false);
        bgames.setOpaque(false);
        
        c.add(cover);
        cover.setVisible(false);
        cover.setBounds(0,0,1366,768);
        
        
        selecttable.addMouseListener(this);
        spectate.addMouseListener(this);
        bgame.addMouseListener(this);
                
        selecttable.addActionListener(this);
        spectate.addActionListener(this);
        bgame.addActionListener(this);
        
        
        selecttables.addMouseListener(this);
        spectates.addMouseListener(this);
        bgames.addMouseListener(this);
                
        selecttables.addActionListener(this);
        spectates.addActionListener(this);
        bgames.addActionListener(this);
        
        /////////////////////////////////////////////////////////////////////////////////////
        
        //////////////////////chips///////////////
        
        
        c.add(p1chipsv);
        p1chipsv.setBounds(170,345,110,21);
        p1chipsv.setForeground(Color.white);
        c.add(p2chipsv);
        p2chipsv.setBounds(385,660,110,21);
        p2chipsv.setForeground(Color.white);
        c.add(p3chipsv);
        p3chipsv.setBounds(625,660,110,21);
        p3chipsv.setForeground(Color.white);
        c.add(p4chipsv);
        p4chipsv.setBounds(865,660,110,21);
        p4chipsv.setForeground(Color.white);
        c.add(p5chipsv);
        p5chipsv.setBounds(1075,345,110,21);
        p5chipsv.setForeground(Color.white);
        
        
        
        c.add(p1chips);
        p1chips.setBounds(145,345,115,21);
        c.add(p2chips);
        p2chips.setBounds(360,660,115,21);
        c.add(p3chips);
        p3chips.setBounds(600,660,115,21);
        c.add(p4chips);
        p4chips.setBounds(840,660,115,21);
        c.add(p5chips);
        p5chips.setBounds(1050,345,115,21);
        
        
        
        
        
        
        
        
        
        
        
        //////////////adding spectator bar contents
        
       c.add(tableselection);
       tableselection.setBounds(1070,124,53,52);
       tableselection.setFocusPainted(false);
       tableselection.setMargin(new Insets(0, 0, 0, 0));
       tableselection.setContentAreaFilled(false);
       tableselection.setBorderPainted(false);
       tableselection.setOpaque(false);
      
       
       c.add(tableselections);
       tableselections.setBounds(1055,109,84,83);
       tableselections.setVisible(false);
       tableselections.setFocusPainted(false);
       tableselections.setMargin(new Insets(0, 0, 0, 0));
       tableselections.setContentAreaFilled(false);
       tableselections.setBorderPainted(false);
       tableselections.setOpaque(false);
           
       
       
       c.add(tablevalueg);
       tablevalueg.setBounds(30,117,152,64);

       
       
       c.add(TableNumber);
        TableNumber.setBounds(220,119,26,63);
        c.add(table);
        table.setBounds(200,119,16,66);
        
        c.add(spec1);
        spec1.setBounds(277,118,64,64);
        
        c.add(spec2);
        spec2.setBounds(355,118,64,64);
        
        c.add(spec3);
        spec3.setBounds(433,118,64,64);
        
        c.add(spec4);
        spec4.setBounds(511,118,64,64);
        
        c.add(spec5);
        spec5.setBounds(589,118,64,64);
        
        c.add(spec6);
        spec6.setBounds(667,118,64,64);
        
        c.add(spec7);
        spec7.setBounds(745,118,64,64);
        
        c.add(spec8);
        spec8.setBounds(823,118,64,64);
        
        c.add(spec9);
        spec9.setBounds(901,118,64,64);
        
        c.add(spec10);
        spec10.setBounds(979,118,64,64);
        
        
       
        
        c.add(bar);
        bar.setBounds(0, 100, 1377,100);
        
        
       //////////////////////////////
        
        
       
        ////////adding cards
        
        c.add(p1c1);
        p1c1.setBounds(290,257,55,76);
        
        c.add(p1c2);
        p1c2.setBounds(350,257,55,76);
        
        c.add(p1c3);
        p1c3.setBounds(410,257,55,76);
        
        
        c.add(p2c1);
        p2c1.setBounds(320,467,55,76);
        c.add(p2c2);
        p2c2.setBounds(380,467,55,76);
        c.add(p2c3);
        p2c3.setBounds(440,467,55,76);
        
        
        c.add(p3c1);
        p3c1.setBounds(570,467,55,76);
        c.add(p3c2);
        p3c2.setBounds(630,467,55,76);
        c.add(p3c3);
        p3c3.setBounds(690,467,55,76);
        
        
        c.add(p4c1);
        p4c1.setBounds(820,467,55,76);
        c.add(p4c2);
        p4c2.setBounds(880,467,55,76);
        c.add(p4c3);
        p4c3.setBounds(940,467,55,76);
        
        
        
        
        c.add(p5c1);
        p5c1.setBounds(840,257,55,76);
        c.add(p5c2);
        p5c2.setBounds(900,257,55,76);
        c.add(p5c3);
        p5c3.setBounds(960,257,55,76);
       
        
        //////////////////////
        
        
        
        
        
        
        
        ////////////////table and elements
//        
        c.add(dealer);
        dealer.setBounds(604,180,105,151);
        
        
        
        c.add(pnbb1);
        pnbb1.setBounds(165,325,75,18);
        
        c.add(pnbb2);
        pnbb2.setBounds(380,640,75,18);
        
        c.add(pnbb3);
        pnbb3.setBounds(620,640,75,18);
        
        c.add(pnbb4);
        pnbb4.setBounds(860,640,75,18);
        
        c.add(pnbb5);
        pnbb5.setBounds(1070,325,75,18);
        
       c.add(pname1);
       pname1.setBounds(165,325,100,18);
       c.add(pname2);
       pname2.setBounds(380,640,100,18);
       c.add(pname3);
       pname3.setBounds(620,640,100,18);
       c.add(pname4);
       pname4.setBounds(860,640,100,18);
       c.add(pname5);
       pname5.setBounds(1070,325,100,18);
        
        
        c.add(tablebck);
        tablebck.setBounds(265,220,779,340);
        c.add(player1);
        player1.setBounds(165,250,75,75);
        c.add(player2);
        player2.setBounds(380,565,75,75);
        c.add(player3);
        player3.setBounds(620,565,75,75);
        c.add(player4);
        player4.setBounds(860,565,75,75);
        c.add(player5);
        player5.setBounds(1070,250,75,75);
        
//        c.add(sitin1);
//        sitin1.setBounds(114,262,54,66);
//        sitin1.setFocusPainted(false);
//        sitin1.setMargin(new Insets(0, 0, 0, 0));
//        sitin1.setContentAreaFilled(false);
//        sitin1.setBorderPainted(false);
//        sitin1.setOpaque(false);
//        
//        
//      
//        
//        c.add(sitin2);
//        sitin2.setBounds(389,664,54,66);
//        
//        sitin2.setFocusPainted(false);
//        sitin2.setMargin(new Insets(0, 0, 0, 0));
//        sitin2.setContentAreaFilled(false);
//        sitin2.setBorderPainted(false);
//        sitin2.setOpaque(false);
//        
//        c.add(sitin3);
//        sitin3.setBounds(629,664,54,66);
//        sitin3.setFocusPainted(false);
//        sitin3.setMargin(new Insets(0, 0, 0, 0));
//        sitin3.setContentAreaFilled(false);
//        sitin3.setBorderPainted(false);
//        sitin3.setOpaque(false);
//        
//        c.add(sitin4);
//        sitin4.setBounds(869,664,54,66);
//        sitin4.setFocusPainted(false);
//        sitin4.setMargin(new Insets(0, 0, 0, 0));
//        sitin4.setContentAreaFilled(false);
//        sitin4.setBorderPainted(false);
//        sitin4.setOpaque(false);
//       
//        c.add(sitin5);
//        sitin5.setBounds(1144,262,54,66);
//        sitin5.setFocusPainted(false);
//        sitin5.setMargin(new Insets(0, 0, 0, 0));
//        sitin5.setContentAreaFilled(false);
//        sitin5.setBorderPainted(false);
//        sitin5.setOpaque(false);
//
//        
//        
        
        c.add(sitout1);
        //sitout1.setVisible(false);
        sitout1.setBounds(104,262,54,66);
        sitout1.setFocusPainted(false);
        sitout1.setMargin(new Insets(0, 0, 0, 0));
        sitout1.setContentAreaFilled(false);
        sitout1.setBorderPainted(false);
        sitout1.setOpaque(false);
        
        
      
        
        c.add(sitout2);
       // sitout2.setVisible(false);
        sitout2.setBounds(389,690,54,66);
        
        sitout2.setFocusPainted(false);
        sitout2.setMargin(new Insets(0, 0, 0, 0));
        sitout2.setMargin(new Insets(0, 0, 0, 0));
        sitout2.setContentAreaFilled(false);
        sitout2.setBorderPainted(false);
        sitout2.setOpaque(false);
        
        c.add(sitout3);
       // sitout3.setVisible(false);
        sitout3.setBounds(629,690,54,66);
        sitout3.setFocusPainted(false);
        sitout3.setMargin(new Insets(0, 0, 0, 0));
        sitout3.setContentAreaFilled(false);
        sitout3.setBorderPainted(false);
        sitout3.setOpaque(false);
        
        c.add(sitout4);
       // sitout4.setVisible(false);
        sitout4.setBounds(869,690,54,66);
        sitout4.setFocusPainted(false);
        sitout4.setMargin(new Insets(0, 0, 0, 0));
        sitout4.setContentAreaFilled(false);
        sitout4.setBorderPainted(false);
        sitout4.setOpaque(false);
       
        c.add(sitout5);
       // sitout5.setVisible(false);
        sitout5.setBounds(1151,262,54,66);
        sitout5.setFocusPainted(false);
        sitout5.setMargin(new Insets(0, 0, 0, 0));
        sitout5.setContentAreaFilled(false);
        sitout5.setBorderPainted(false);
        sitout5.setOpaque(false);

        
        
        
        ///////////////////////////////table elements added 
        
         //////////////adding hidden shadow buttons////////////
        c.add(splus);
        splus.setBounds(1207,68,19,19);
        splus.setVisible(false);
        splus.setFocusPainted(false);
        splus.setMargin(new Insets(0, 0, 0, 0));
        splus.setContentAreaFilled(false);
        splus.setBorderPainted(false);
        splus.setOpaque(false);
        
        
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

//
//        
//        c.add(ssitin1);
//        ssitin1.setVisible(false);
//        ssitin1.setBounds(111,248,81,93);
//        ssitin1.setFocusPainted(false);
//        ssitin1.setMargin(new Insets(0, 0, 0, 0));
//        ssitin1.setContentAreaFilled(false);
//        ssitin1.setBorderPainted(false);
//        ssitin1.setOpaque(false);
//        
//        
//      
//        
//        c.add(ssitin2);
//        ssitin2.setBounds(376,650,81,93);
//        ssitin2.setVisible(false);
//        ssitin2.setFocusPainted(false);
//        ssitin2.setMargin(new Insets(0, 0, 0, 0));
//        ssitin2.setContentAreaFilled(false);
//        ssitin2.setBorderPainted(false);
//        ssitin2.setOpaque(false);
//        
//        c.add(ssitin3);
//        ssitin3.setVisible(false);
//        ssitin3.setBounds(616,650,81,93);
//        ssitin3.setFocusPainted(false);
//        ssitin3.setMargin(new Insets(0, 0, 0, 0));
//        ssitin3.setContentAreaFilled(false);
//        ssitin3.setBorderPainted(false);
//        ssitin3.setOpaque(false);
//        
//        c.add(ssitin4);
//        ssitin4.setVisible(false);
//        ssitin4.setBounds(856,650,81,93);
//        ssitin4.setFocusPainted(false);
//        ssitin4.setMargin(new Insets(0, 0, 0, 0));
//        ssitin4.setContentAreaFilled(false);
//        ssitin4.setBorderPainted(false);
//        ssitin4.setOpaque(false);
//       
//        c.add(ssitin5);
//        ssitin5.setVisible(false);
//        ssitin5.setBounds(1121,248,81,93);
//        ssitin5.setFocusPainted(false);
//        ssitin5.setMargin(new Insets(0, 0, 0, 0));
//        ssitin5.setContentAreaFilled(false);
//        ssitin5.setBorderPainted(false);
//        ssitin5.setOpaque(false);
//
//        //////////////////////////////////////////////////////////////////
        
        c.add(ssitout1);
        ssitout1.setVisible(false);
        ssitout1.setBounds(92,248,80,93);
        ssitout1.setFocusPainted(false);
        ssitout1.setMargin(new Insets(0, 0, 0, 0));
        ssitout1.setContentAreaFilled(false);
        ssitout1.setBorderPainted(false);
        ssitout1.setOpaque(false);
        
        
      
        
        c.add(ssitout2);
        ssitout2.setBounds(377,676,80,93);
        ssitout2.setVisible(false);
        ssitout2.setFocusPainted(false);
        ssitout2.setMargin(new Insets(0, 0, 0, 0));
        ssitout2.setMargin(new Insets(0, 0, 0, 0));
        ssitout2.setContentAreaFilled(false);
        ssitout2.setBorderPainted(false);
        ssitout2.setOpaque(false);
        
        c.add(ssitout3);
        ssitout3.setBounds(617,676,80,93);
        ssitout3.setVisible(false);
        ssitout3.setFocusPainted(false);
        ssitout3.setMargin(new Insets(0, 0, 0, 0));
        ssitout3.setContentAreaFilled(false);
        ssitout3.setBorderPainted(false);
        ssitout3.setOpaque(false);
        
        c.add(ssitout4);
        ssitout4.setBounds(857,676,80,93);
        ssitout4.setVisible(false);
        ssitout4.setFocusPainted(false);
        ssitout4.setMargin(new Insets(0, 0, 0, 0));
        ssitout4.setContentAreaFilled(false);
        ssitout4.setBorderPainted(false);
        ssitout4.setOpaque(false);
       
        c.add(ssitout5);
        ssitout5.setBounds(1139,248,80,93);
        ssitout5.setVisible(false);
        ssitout5.setFocusPainted(false);
        ssitout5.setMargin(new Insets(0, 0, 0, 0));
        ssitout5.setContentAreaFilled(false);
        ssitout5.setBorderPainted(false);
        ssitout5.setOpaque(false);

       //////////////////////////////////////////////////////////////////////
        
                
        
        
        
        
        
        
        sitin1.addMouseListener(this);
        ssitin1.addMouseListener(this);
        
        
        sitin2.addMouseListener(this);
        ssitin2.addMouseListener(this);
        
        sitin3.addMouseListener(this);
        ssitin3.addMouseListener(this);
        
        sitin4.addMouseListener(this);
        ssitin4.addMouseListener(this);
        
        sitin5.addMouseListener(this);
        ssitin5.addMouseListener(this);
        
        
        ssitin1.addActionListener(this);
        ssitin2.addActionListener(this);
        ssitin3.addActionListener(this);
        ssitin4.addActionListener(this);
        ssitin5.addActionListener(this);
        
        
        sitout1.addMouseListener(this);
        sitout2.addMouseListener(this);
        sitout3.addMouseListener(this);
        sitout4.addMouseListener(this);
        sitout5.addMouseListener(this);
        
        
        ssitout1.addMouseListener(this);
        ssitout2.addMouseListener(this);
        ssitout3.addMouseListener(this);
        ssitout4.addMouseListener(this);
        ssitout5.addMouseListener(this);
        
        
        ssitout1.addActionListener(this);
        ssitout2.addActionListener(this);
        ssitout3.addActionListener(this);
        ssitout4.addActionListener(this);
        ssitout5.addActionListener(this);
        
        
        player1.addActionListener(this);
        player2.addActionListener(this);
        player3.addActionListener(this);
        player4.addActionListener(this);
        player5.addActionListener(this);
        
        
       
        
        
        AccountInfo.addMouseListener(this);
        sAccountInfo.addMouseListener(this);
        
        Profile.addMouseListener(this);
        sProfile.addMouseListener(this);
        
        Logout.addMouseListener(this);
        sLogout.addMouseListener(this);

        
        
        
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

        
        chatoff.addActionListener(this);
        chatoff.addMouseListener(this);
        //chatmin.addActionListener(this);
        //chatmin.addMouseListener(this);
        tableselection.addActionListener(this);
        tableselection.addMouseListener(this);
        
        tableselections.addActionListener(this);
        tableselections.addMouseListener(this);
        
        profclose.addActionListener(this);
        profclose.addMouseListener(this);
        
       wrsitout.addMouseListener(this);
       wrsitouts.addMouseListener(this);
       //wrsitout.addActionListener(this);
       wrsitouts.addActionListener(this);
       
        c.add(bck);
        c.add(back);
        
        bck.setBounds(710, 80, 657, 684);
        back.setBounds(0,0,xSize,ySize);
       
       
       
       
       
       
       
       
       
    }


public static void main(String[] args)
{

GamePlay2 gp = new GamePlay2();


}

   

@Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == min) {
            game.setState(Frame.ICONIFIED);
            //f.setState ( Frame.ICONIFIED );

        }

        
        
        if(e.getSource()==profclose)
        {
        	profpan.setVisible(false);
        	profclose.setVisible(false);
        	
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
        /////////////action on sitin click///////////////
        if(e.getSource()==ssitin1)
        {
            ssitin1.setVisible(false);
            sitin1.setVisible(false);
            sitout1.setVisible(true);
        
        }
        
        
        
        ////////////action on sitout click////////////
        if(e.getSource()==ssitout1  || e.getSource()==ssitout2 || e.getSource()==ssitout3  || e.getSource()==ssitout4 || e.getSource()==ssitout5  )
        {
        selecttable.setVisible(true);
        spectate.setVisible(true);
        bgame.setVisible(true);
        cover.setVisible(true);
        profpan.setVisible(false);
        chat.setVisible(false);
        chatoff.setVisible(false);
        //chatmin.setVisible(false);
        profclose.setVisible(false);
        }
        if(e.getSource()==selecttables)
        {
        
        	ChipSelect cs =	 new ChipSelect();
            cs.chip();
            	 
        
        
        }
        if(e.getSource()==spectates)
        {
        	GamePlay2 gp = new GamePlay2();
        
        
        }
        if(e.getSource()==bgames)
        {
        
        	GamePlay2 gp = new GamePlay2();
        }
        if(e.getSource()==player1)
        {
        	if(flag==0)
        	{
        		flag=1;
        		profpan.setVisible(true);
        		profclose.setVisible(true);
        		
        	}
        	else
        	{
        		flag=0;
        		profpan.setVisible(false);
        		profclose.setVisible(false);
        	}
        	
        }
       if(e.getSource()==player2)
        {
        	if(flag==0)
        	{
        		flag=1;
        		profpan.setVisible(true);
        		profclose.setVisible(true);
        	}
        	else
        	{
        		flag=0;
        		profpan.setVisible(false);
        		profclose.setVisible(false);
        	}
        	
        }
        if(e.getSource()==player3)
        {
        	if(flag==0)
        	{
        		flag=1;
        		profpan.setVisible(true);
        		profclose.setVisible(true);
        	}
        	else
        	{
        		flag=0;
        		profpan.setVisible(false);
        		profclose.setVisible(false);
        	}	
        }
        if(e.getSource()==player4)
        {
        	if(flag==0)
        	{
        		flag=1;
        		profpan.setVisible(true);
        		profclose.setVisible(true);
        		
        	}
        	else
        	{
        		flag=0;
        		profpan.setVisible(false);
        		profclose.setVisible(false);
        	}
        	
        }
        if(e.getSource()==player5)
        {
        	if(flag==0)
        	{
        		flag=1;
        		profpan.setVisible(true);
        		profclose.setVisible(true);
        	}
        	else
        	{
        		flag=0;
        		profpan.setVisible(false);
        		profclose.setVisible(false);
        	}
        	
        }
        if(e.getSource()==chatoff)
        {
        	chatoff.setVisible(false);
        	chat.setVisible(true);
        	//chatmin.setVisible(true);
        }
       // if(e.getSource()==chatmin)
        ///{
        	
        	//chat.setVisible(false);
        	//chatmin.setVisible(false);
        	//chatoff.setVisible(true);
        	
       // }
        if(e.getSource()==tableselections)
        {
        	new TableSelect2();
        	
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
    	
    	if(a.getSource()==wrsitout)
        {
        	wrsitout.setVisible(false);
        	wrsitouts.setVisible(true);
        	
        }
    	
    	if(a.getSource()==accountpic)
        {
        	saccountpic.setVisible(true);
        	System.out.println("hellllll");
      
        }
    	
    	if(a.getSource()==profclose)
    	{
    		profclose.setBounds(616,83, 33, 20);
    				
    	}

        if(a.getSource()==tableselection)
        {
        tableselection.setVisible(false);
        tableselections.setVisible(true);	
        }
    	if(a.getSource()==spectate)
        {
        	spectate.setVisible(false);
        	spectates.setVisible(true);
        	
        }
        if(a.getSource()==selecttable)
        {
        	selecttable.setVisible(false);
        	selecttables.setVisible(true);
        }
        if(a.getSource()==bgame)
        {
        	bgame.setVisible(false);
        	bgames.setVisible(true);
        }
    	
        
    	//if(a.getSource()==chatmin)
        //{
        	
        	//chatmin.setBounds(1093,411,211,17);
        	
       // }
        if(a.getSource()==chatoff)
        {
        	chatoff.setBounds(1184,733,182,34);
        	
        	
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
        
        if(a.getSource()==sitin1)
        {
            sitin1.setVisible(false);
            ssitin1.setVisible(true);
                  
        }
        if(a.getSource()==sitin2)
        {
            sitin2.setVisible(false);
            ssitin2.setVisible(true);
                  
        }
        if(a.getSource()==sitin3)
        {
            sitin3.setVisible(false);
            ssitin3.setVisible(true);
                  
        }
        if(a.getSource()==sitin4)
        {
            sitin4.setVisible(false);
            ssitin4.setVisible(true);
                  
        }
        if(a.getSource()==sitin5)
        {
            sitin5.setVisible(false);
            ssitin5.setVisible(true);
                  
        }
        
        if(a.getSource()==sitout1)
        {
            sitout1.setVisible(false);
            ssitout1.setVisible(true);
        
        
        }
        if(a.getSource()==sitout2)
        {
            sitout2.setVisible(false);
            ssitout2.setVisible(true);
        
        
        }
        if(a.getSource()==sitout3)
        {
            sitout3.setVisible(false);
            ssitout3.setVisible(true);
        
        
        }
           if(a.getSource()==sitout4)
        {
            sitout4.setVisible(false);
            ssitout4.setVisible(true);
        
        
        }
           if(a.getSource()==sitout5)
        {
            sitout5.setVisible(false);
            ssitout5.setVisible(true);
        
        
        }
           

 }

    @Override
    public void mouseExited(MouseEvent a) 
    {
    	if(a.getSource()==wrsitouts)
        {
        	wrsitouts.setVisible(false);
        	wrsitout.setVisible(true);
        	
        }
    	
    	
    	
    	if(a.getSource()==saccountpic)
        {
        	saccountpic.setVisible(false);
        	
      
        }
    	
    	if(a.getSource()==profclose)
    	{
    		profclose.setBounds(616,85, 33, 20);
    				
    	}
    	
    	 if(a.getSource()==tableselections)
         {
         tableselections.setVisible(false);
         tableselection.setVisible(true);	
         }
    	if(a.getSource()==spectates)
        {
        	spectates.setVisible(false);
        	spectate.setVisible(true);
        	
        }
        if(a.getSource()==selecttables)
        {
        	selecttables.setVisible(false);
        	selecttable.setVisible(true);
        }
        if(a.getSource()==bgames)
        {
        	bgames.setVisible(false);
        	bgame.setVisible(true);
        }
    	
    	//if(a.getSource()==chatmin)
      // {
    	   
    	//   chatmin.setBounds(1093,413,211,17);
    	   
    //   }
    	
        if(a.getSource()==chatoff)
        {
        	chatoff.setBounds(1184,734,182,34);
        	
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
        
        if(a.getSource()==ssitin1)
        {
            ssitin1.setVisible(false);
            sitin1.setVisible(true);
                  
        }
        if(a.getSource()==ssitin2)
        {
            ssitin2.setVisible(false);
            sitin2.setVisible(true);
                  
        }
        if(a.getSource()==ssitin3)
        {
            ssitin3.setVisible(false);
            sitin3.setVisible(true);
                  
        }
        if(a.getSource()==ssitin4)
        {
            ssitin4.setVisible(false);
            sitin4.setVisible(true);
                  
        }
        if(a.getSource()==ssitin5)
        {
            ssitin5.setVisible(false);
            sitin5.setVisible(true);
                  
        }
        if(a.getSource()==ssitout1)
        {
            ssitout1.setVisible(false);
            sitout1.setVisible(true);
        
        }
        if(a.getSource()==ssitout2)
        {
            ssitout2.setVisible(false);
            sitout2.setVisible(true);
        
        }
        if(a.getSource()==ssitout3)
        {
            ssitout3.setVisible(false);
            sitout3.setVisible(true);
        
        }
        if(a.getSource()==ssitout4)
        {
            ssitout4.setVisible(false);
            sitout4.setVisible(true);
        
        }
        if(a.getSource()==ssitout5)
        {
            ssitout5.setVisible(false);
            sitout5.setVisible(true);
        
        }
    }

}