import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Locale;
//import java.awt.event.MouseEvent;
//import java.awt.event.MouseListener;
import javax.swing.*;


public class SignIn  extends JFrame implements ActionListener,MouseListener
{
JFrame signin;
    
    
    JLabel bck;
    JButton min, close ;
    JLabel back;
    //       
    JLabel bar1,bar2,bar3,bar4,bar5;
    JLabel count1,count2,count3,count4,count5,count6,count7,count8,count9,count10;
    JLabel pcount1,pcount2,pcount3,pcount4,pcount5,pcount6,pcount7,pcount8,pcount9,pcount10;
    JButton settings,gtwww,help;
    JLabel TableNumber1,TableNumber2,TableNumber3,TableNumber4,TableNumber5;
    JLabel bbar1,bbar2,SmallLogo;
    JLabel welcome,picbckgrnd,hidpicbckgrnd;
    JButton playerpic,click;
    JLabel playername,hidpname,hidpic;
    JButton hsignin;
    JLabel password;
    JPasswordField hpf;
    JButton diffuser;
    JLabel email;
    JTextField em;
    
    
    
    //////shadows button
    JButton sclose,smin,ssettings,sgtwww,shelp;
    JButton ssignin,splayerpic;
    JButton diffusers;
    
    
    
    
    public SignIn()
    {
    
        JFrame signin = new JFrame("SignIn");
        
        bck = new JLabel(new ImageIcon("images\\data\\backlogo.png"));
        ///minimmize sign
        min = new JButton(new ImageIcon("images\\data\\min.png"));
        ///close sign
        close = new JButton(new ImageIcon("images\\data\\clo.png"));
        
        back = new JLabel(new ImageIcon("images\\data\\bck.png"));
        
        
        //SupportBar= new JLabel(new ImageIcon("images\\data\\sb.png"));
        
        SmallLogo= new JLabel(new ImageIcon("images\\data\\logo.png"));
        
        welcome= new JLabel(new ImageIcon("images\\data\\welcome.png"));
        
        picbckgrnd= new JLabel(new ImageIcon("images\\data\\picbckgrnd.png"));
        
        playerpic= new JButton(new ImageIcon("images\\data\\pic.png"));
        
        click= new JButton(new ImageIcon("images\\data\\click.png"));
        
        playername= new JLabel(new ImageIcon("images\\data\\name1.png"));
        
                
        ////////////bottom elements
       bbar1 = new JLabel(new ImageIcon("images\\data\\barsmall.png"));
       bbar2 = new JLabel(new ImageIcon("images\\data\\barsmall.png"));
       settings = new JButton(new ImageIcon("images\\data\\sett.png")); 
       gtwww= new JButton(new ImageIcon("images\\data\\gtwww.png")); 
       help= new JButton(new ImageIcon("images\\data\\help.png")); 
       ///////////////////////////////////////////////
       
       
       ///////parts hidden before click/////
       hidpicbckgrnd= new JLabel(new ImageIcon("images\\data\\hidbck.png"));
       hidpic= new JLabel(new ImageIcon("images\\data\\pic.png"));
       hidpname= new JLabel(new ImageIcon("images\\data\\hidpname.png"));
       hsignin= new JButton(new ImageIcon("images\\data\\signin.png"));
       hpf= new JPasswordField(10);
       em= new JTextField(20);
       password= new JLabel(new ImageIcon("images\\data\\password.png"));
       
       diffuser= new JButton(new ImageIcon("images\\data\\diffuser.png"));
       
       email = new JLabel(new ImageIcon("images\\data\\email.png"));

       
       
       ////////////////////////////////////////
        
        //////////////////shadow buttons/////////////////
       sclose= new JButton(new ImageIcon("images\\data\\clo1.png"));
       smin= new JButton(new ImageIcon("images\\data\\min1.png"));
       ssettings= new JButton(new ImageIcon("images\\data\\sett1.png"));
       sgtwww= new JButton(new ImageIcon("images\\data\\gtwww1.png"));
       shelp= new JButton(new ImageIcon("images\\data\\help1.png"));
       
       ssignin= new JButton(new ImageIcon("images\\data\\signin1.png"));
       splayerpic= new JButton(new ImageIcon("images\\data\\picshadow.png"));
       
       /////////////////////////////////////////////
       
        
        
        
        Container c = signin.getContentPane();
         signin.setSize(800,600);
         signin.setLocation(300,80);
         signin.setUndecorated(true);
         signin.setVisible(true);
         
         signin.setLayout(null);
         //
         
        
         
         
        
        ////adding and placing main contents
        //c.add(f);
        
        
        c.add(close);
        //signin.add(close);
        close.setBounds(760,15, 23, 19);
        close.setFocusPainted(false);
        close.setMargin(new Insets(0, 0, 0, 0));
        close.setContentAreaFilled(false);
        close.setBorderPainted(false);
        close.setOpaque(false);
        
        c.add(min);
        min.setBounds(725, 21, 22,8);
        min.setFocusPainted(false);
        min.setMargin(new Insets(0, 0, 0, 0));
        min.setContentAreaFilled(false);
        min.setBorderPainted(false);
        min.setOpaque(false);
        
        
        c.add(SmallLogo);
        SmallLogo.setBounds(0,10,160,59);
       
        
        c.add(welcome);
        welcome.setBounds(0,122,309,49);
        
        
    
//        
       
       
        
        c.add(click);
        click.setBounds(250,440,279,36);
        click.setFocusPainted(false);
        click.setMargin(new Insets(0, 0, 0, 0));
        click.setContentAreaFilled(false);
        click.setBorderPainted(false);
        click.setOpaque(false);
        
        /////layer for mouseover
//        c.add(splayerpic);
//        splayerpic.setBounds(250,170,279,283);
//        splayerpic.setVisible(true);
//        splayerpic.setFocusPainted(false);
//        splayerpic.setMargin(new Insets(0, 0, 0, 0));
//        splayerpic.setContentAreaFilled(false);
//        splayerpic.setBorderPainted(false);
//        splayerpic.setOpaque(false);
//        
        
        c.add(playerpic);
        playerpic.setBounds(250,170,279,283);
//        playerpic.setFocusPainted(false);
//        playerpic.setMargin(new Insets(0, 0, 0, 0));
//        playerpic.setContentAreaFilled(false);
//        playerpic.setBorderPainted(false);
//        playerpic.setOpaque(false);
//        
        
        
        c.add(picbckgrnd);
        picbckgrnd.setBounds(0,170,800,283);
         
        
       
        c.add(playername);
        playername.setBounds(235,490,313,29);
        
        
        c.add(settings);
        settings.setBounds(15,575,48,8);
        settings.setFocusPainted(false);
        settings.setMargin(new Insets(0, 0, 0, 0));
        settings.setContentAreaFilled(false);
        settings.setBorderPainted(false);
        settings.setOpaque(false);
        
        
        c.add(bbar1);
        bbar1.setBounds(69,572,2,14);
        
        
        c.add(gtwww);
        gtwww.setBounds(80,575,78,8);
        gtwww.setFocusPainted(false);
        gtwww.setMargin(new Insets(0, 0, 0, 0));
        gtwww.setContentAreaFilled(false);
        gtwww.setBorderPainted(false);
        gtwww.setOpaque(false);
        
        c.add(bbar2);
        bbar2.setBounds(167,572,2,14);
        
        c.add(help);
        help.setBounds(179,575,25,8);
        help.setFocusPainted(false);
        help.setMargin(new Insets(0, 0, 0, 0));
        help.setContentAreaFilled(false);
        help.setBorderPainted(false);
        help.setOpaque(false);
//        
        
        ////////adding hidden items/////////////
       
       
        
        
        c.add(hidpic);
        hidpic.setVisible(false);
        hidpic.setBounds(0,170,279,283);
         
        c.add(hidpname);
        hidpname.setVisible(false);
        hidpname.setBounds(310,230,332,31);
        
        
        
        c.add(hsignin);
        hsignin.setVisible(false);
        hsignin.setBounds(592,404,208,49);
        hsignin.setFocusPainted(false);
        hsignin.setMargin(new Insets(0, 0, 0, 0));
        hsignin.setContentAreaFilled(false);
        hsignin.setBorderPainted(false);
        hsignin.setOpaque(false);
        
        c.add(password);
        password.setVisible(false);
        password.setBounds(310,300,105,19);
       
        c.add(email);
        email.setVisible(false);
        email.setBounds(310,260,91,19);
        
        c.add(hpf);
        hpf.setVisible(false);
        hpf.setBounds(430,298,200,30);
        
        c.add(em);
        em.setVisible(false);
        em.setBounds(430,253,200,30);
        
        
        c.add(ssignin);
        ssignin.setVisible(false);
        ssignin.setBounds(574,385,245,86);
        ssignin.setFocusPainted(false);
        ssignin.setMargin(new Insets(0, 0, 0, 0));
        ssignin.setContentAreaFilled(false);
        ssignin.setBorderPainted(false);
        ssignin.setOpaque(false);
        
        
        c.add(diffuser);
        diffuser.setVisible(false);
        diffuser.setBounds(300,430,172,13);
        diffuser.setFocusPainted(false);
        diffuser.setMargin(new Insets(0, 0, 0, 0));
        diffuser.setContentAreaFilled(false);
        diffuser.setBorderPainted(false);
        diffuser.setOpaque(false);
       
        
        c.add(hidpicbckgrnd);
        hidpicbckgrnd.setVisible(false);
        hidpicbckgrnd.setBounds(0,170,800,283);
        
        
        
        
       
                
     ////////////////hidden itmes added//////////////   
        
   ////////////////adding hidden shadow buttons////////////
        c.add(sclose);
        
        sclose.setBounds(752,6, 39, 35);
        sclose.setVisible(false);
        sclose.setFocusPainted(false);
        sclose.setMargin(new Insets(0, 0, 0, 0));
        sclose.setContentAreaFilled(false);
        sclose.setBorderPainted(false);
        sclose.setOpaque(false);
        
        c.add(smin);
        smin.setBounds(717, 12, 38,24);
        smin.setVisible(false);
        smin.setFocusPainted(false);
        smin.setMargin(new Insets(0, 0, 0, 0));
        smin.setContentAreaFilled(false);
        smin.setBorderPainted(false);
        smin.setOpaque(false);
        
        c.add(ssettings);
        ssettings.setBounds(6,565,67,27);
        ssettings.setVisible(false);
        ssettings.setFocusPainted(false);
        ssettings.setMargin(new Insets(0, 0, 0, 0));
        ssettings.setContentAreaFilled(false);
        ssettings.setBorderPainted(false);
        ssettings.setOpaque(false);
        
        c.add(sgtwww);
        sgtwww.setBounds(71,565,97,27);
        sgtwww.setVisible(false);
        sgtwww.setFocusPainted(false);
        sgtwww.setMargin(new Insets(0, 0, 0, 0));
        sgtwww.setContentAreaFilled(false);
        sgtwww.setBorderPainted(false);
        sgtwww.setOpaque(false);
        
        
        c.add(shelp);
        shelp.setBounds(170,565,44,27);
        shelp.setVisible(false);
        shelp.setFocusPainted(false);
        shelp.setMargin(new Insets(0, 0, 0, 0));
        shelp.setContentAreaFilled(false);
        shelp.setBorderPainted(false);
        shelp.setOpaque(false);
        
        
        
        
        
       
        
        
        
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
        
        
        
        playerpic.addActionListener(this);    
        playerpic.addMouseListener(this);
        splayerpic.addMouseListener(this);
        
        click.addActionListener(this);
        
        ssignin.addActionListener(this);
        
        ssignin.addMouseListener(this);
        hsignin.addMouseListener(this);
        
        diffuser.addActionListener(this);
        diffuser.addMouseListener(this);
        
        
        
        
        c.add(bck);
        c.add(back);
       
        bck.setBounds(300, 50, 594, 592);
        back.setBounds(0,0,800,600);
        
        
     }
    
public static void main(String [] args)    
{

SignIn si = new SignIn();

}

    @Override
    public void actionPerformed(ActionEvent e) 
    {
            if(e.getSource()==sclose)
            {
            System.exit(0);
            }
            if(e.getSource()==playerpic || e.getSource()==click )
            {
               
               
               playerpic.setVisible(false);
               //splayerpic.setVisible(false);
               click.setVisible(false);
               
               playername.setVisible(false);
               picbckgrnd.setVisible(false);
               hidpicbckgrnd.setVisible(true);
               hidpic.setVisible(true);
               hidpname.setVisible(true);
               hsignin.setVisible(true);
               hpf.setVisible(true);
               password.setVisible(true);
               diffuser.setVisible(true);
               
           }
           if(e.getSource()==ssignin)
           {
               
               if("SPECTA".equals(hpf.getText()))
               {
               System.out.println("Welcome");
               System.out.println(hpf.getText());
               ChipSelect cs =	 new ChipSelect();
               cs.chip();
               	 
               //TableSelect2 ts =new TableSelect2();
               
               }
               else
               {
               System.out.println("Wrong password");
               }
           
           }
           if(e.getSource()==diffuser)
           {
        	   hidpname.setVisible(false);
        	   email.setVisible(true);
        	   diffuser.setVisible(false);
        	   em.setVisible(true);
           }
    
    }

    @Override
    public void mouseClicked(MouseEvent a)
    {
        
        
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
    public void mouseEntered(MouseEvent a) 
    {
       if(a.getSource()==diffuser)
       {
    	  diffuser.setBounds(300,428,172,13);
    	   
       }
    	
    	if(a.getSource()==close)
        {    
        close.setVisible(false);
        sclose.setVisible(true);
        }
        if(a.getSource()==min)
        {   
        min.setVisible(false);
        smin.setVisible(true);
        }
        if(a.getSource()==settings)
        {
            settings.setVisible(false);
            ssettings.setVisible(true);
        
        }
        if(a.getSource()==gtwww)
        {
            gtwww.setVisible(false);
            sgtwww.setVisible(true);
        
        
        }
        if(a.getSource()==help)
        {
            help.setVisible(false);
            shelp.setVisible(true);
            
        }
//        if(a.getSource()==playerpic)
//        {
//            playerpic.setVisible(true);
//            splayerpic.setVisible(false);
//        
//        }
        if(a.getSource()==hsignin)
        {
            hsignin.setVisible(false);
            ssignin.setVisible(true);
            
        
        }
        
        
    }

    @Override
    public void mouseExited(MouseEvent a) 
    {
        if(a.getSource()==diffuser)
        {
        	
        diffuser.setBounds(300,430,172,13);
        	
        }
        
    	if(a.getSource()==sclose)
        {
            close.setVisible(true);
            sclose.setVisible(false);
        }
        if(a.getSource()==smin)
        {    
        min.setVisible(true);
        smin.setVisible(false);
        }
        if(a.getSource()==ssettings)
        {
            settings.setVisible(true);
            ssettings.setVisible(false);
        
        }
        if(a.getSource()==sgtwww)
        {
            sgtwww.setVisible(false);
            gtwww.setVisible(true);
        
        
        }
        if(a.getSource()==shelp)
        {
            shelp.setVisible(false);
            help.setVisible(true);
            
        }
        
//        if(a.getSource()==playerpic)
//        {
//            playerpic.setVisible(true);
//            splayerpic.setVisible(true);
//        
//        }
//    
        if(a.getSource()==ssignin)
        {
            ssignin.setVisible(false);
            hsignin.setVisible(true);
            
        
        }
        
    }




}
