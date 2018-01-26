package mq;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MQ extends JFrame{
/*height and width*/
    static final int HEIGHT=1000;
    static final int WIDTH=1000; 
    
    public static void main(String[] args) {
JFrame jf=new JFrame();
jf.setTitle("MQ");
jf.setSize(HEIGHT,WIDTH);


/*create panel*/
Panel p=new Panel();
     p.setLayout(null);
/*textarea*/
JTextArea t1=new JTextArea();
p.add(t1);
   t1.setBounds(100,50,800,100);
 jf.add(p);  
 /*encrypt button*/     
JButton b1=new JButton("Encrypt");
                        p.add(b1);                         
                        b1.setBounds(300,200,100,30);
 jf.add(p);   
  /*decrypt button*/     
JButton b2=new JButton("Decrypt");
                        p.add(b2);                         
                        b2.setBounds(600,200,100,30);
 jf.add(p); 
 /*cipher*/
 JTextArea t2=new JTextArea();
p.add(t2);
          t2.setBounds(100,300,800,100);
 jf.add(p); 
  /*key*/
 JTextArea t3=new JTextArea();
p.add(t3);
          t3.setBounds(100,500,800,100);
 jf.add(p); 
   /*c5*/
 JTextArea t4=new JTextArea();
p.add(t4);
          t4.setBounds(1000,10,280,350);
 jf.add(p); 
 /*show the frame*/
jf.show();

t1.setLineWrap(true);   t2.setLineWrap(true);   //change the line
t1.setWrapStyleWord(true); t2.setWrapStyleWord(true);  //no breaking the word

b1.addActionListener(new ActionListener()
{
 public void actionPerformed(ActionEvent event){
    String s=t1.getText(),s1="",s3="",s5="";
    char[]A=s.toCharArray();
    for(char c:A){
        int i=(int)c;
        int r1=(int)(Math.random()*99)+7,
 r2=(int)(Math.random()*r1)+9;   
                int k=i*r2+r2;
                    String s2=String.valueOf(k+" ");  
char[]A5=s2.toCharArray();
for(char c5:A5){
    /*random character*/
String sc5=t4.getText();
sc5=sc5.replaceAll(" ","");
char[]Asc5=sc5.toCharArray();
for(int isc5=0;isc5<Asc5.length;isc5++){;
if(c5=='0'){c5=Asc5[0];}
if(c5=='1'){c5=Asc5[1];}
if(c5=='2'){c5=Asc5[2];}
if(c5=='3'){c5=Asc5[3];}
if(c5=='4'){c5=Asc5[4];}
if(c5=='5'){c5=Asc5[5];}
if(c5=='6'){c5=Asc5[6];}
if(c5=='7'){c5=Asc5[7];}
if(c5=='8'){c5=Asc5[8];}
if(c5=='9'){c5=Asc5[9];}
}
  String s6=String.valueOf(c5); 
s6=s6.toUpperCase();
      s1+=s6;
      t2.setText(s1);
}
         String s4=String.valueOf(r2+" ");     
        s3+=s4;

          t3.setText(s3);
        
    }
    
 }   
});
/*decrypt*/
b2.addActionListener(new ActionListener()
{
 public void actionPerformed(ActionEvent event){
     /*key2*/
     String sk=t4.getText(),sk2=sk.replaceAll(" ","");
char Ak[]=sk2.toCharArray();
for(int k=0;k<Ak.length;k++){
   
     /*chage cipher to numbers*/
String s=t2.getText(),str="";
s=s.toLowerCase();
char A[]=s.toCharArray();
for(char c:A){
       if(c==Ak[0]){c='0';}
    if(c==Ak[1]){c='1';}
    if(c==Ak[2]){c='2';}
if(c==Ak[3]){c='3';}
if(c==Ak[4]){c='4';}
if(c==Ak[5]){c='5';}
if(c==Ak[6]){c='6';}
if(c==Ak[7]){c='7';}
if(c==Ak[8]){c='8';}
if(c==Ak[9]){c='9';}
    String s1=String.valueOf(c);
    str+=s1; 
}
/*plain*/

    String    st2=t3.getText(),sa1="";
String[]sa=str.split(" ");String[]sa2=st2.split(" ");
for(int i=0;i<sa.length;i++){
int ip=Integer.parseInt(sa[i]),
 ip2=Integer.parseInt(sa2[i]);
ip=(ip-ip2)/ip2;
char cip=(char)ip;
String sip=String.valueOf(cip);
sa1+=sip;
}
t1.setText(sa1);

}  
 }
});
    }
}


