import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
class RakamlarPuzzle extends JFrame implements ActionListener{
JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,sample,starB;
Icon star,star2;
Icon ic0=new ImageIcon("pic/selected0.jpg");
Icon ic10=new ImageIcon("pic/selected1.jpg");
Icon ic20=new ImageIcon("pic/selected2.jpg");
Icon ic30=new ImageIcon("pic/selected3.jpg");
Icon ic40=new ImageIcon("pic/selected4.jpg");
Icon ic50=new ImageIcon("pic/selected5.jpg");
Icon ic60=new ImageIcon("pic/selected6.jpg");
Icon ic70=new ImageIcon("pic/selected7.jpg");
Icon ic80=new ImageIcon("pic/selected8.jpg");
Icon ic90=new ImageIcon("pic/selected9.jpg");

Icon samicon1=new ImageIcon("pic/main.jpg");
Icon samicon2=new ImageIcon("pic/main1.jpg");
Icon samicon3=new ImageIcon("pic/main2.jpg");
Icon samicon4=new ImageIcon("pic/main3.jpg");
Icon samicon5=new ImageIcon("pic/main4.jpg");
Icon samicon6=new ImageIcon("pic/main5.jpg");
Icon samicon7=new ImageIcon("pic/main6.jpg");
Icon samicon8=new ImageIcon("pic/main7.jpg");
Icon samicon9=new ImageIcon("pic/main8.jpg");
Icon samicon10=new ImageIcon("pic/main9.jpg");


Icon ic1=new ImageIcon("pic/02.jpg");
Icon ic2=new ImageIcon("pic/05.jpg");
Icon ic3=new ImageIcon("pic/03.jpg");
Icon ic4=new ImageIcon("pic/01.jpg");
Icon ic5=new ImageIcon("pic/04.jpg");
Icon ic6=new ImageIcon("pic/09.jpg");
Icon ic7=new ImageIcon("pic/07.jpg");
Icon ic8=new ImageIcon("pic/06.jpg");
Icon ic9=new ImageIcon("pic/08.jpg");

Icon ic11=new ImageIcon("pic/12.jpg");
Icon ic12=new ImageIcon("pic/13.jpg");
Icon ic13=new ImageIcon("pic/16.jpg");
Icon ic14=new ImageIcon("pic/15.jpg");
Icon ic15=new ImageIcon("pic/11.jpg");
Icon ic16=new ImageIcon("pic/19.jpg");
Icon ic17=new ImageIcon("pic/14.jpg");
Icon ic18=new ImageIcon("pic/17.jpg");
Icon ic19=new ImageIcon("pic/18.jpg");

Icon ic21=new ImageIcon("pic/21.jpg");
Icon ic22=new ImageIcon("pic/25.jpg");
Icon ic23=new ImageIcon("pic/24.jpg");
Icon ic24=new ImageIcon("pic/27.jpg");
Icon ic25=new ImageIcon("pic/23.jpg");
Icon ic26=new ImageIcon("pic/29.jpg");
Icon ic27=new ImageIcon("pic/28.jpg");
Icon ic28=new ImageIcon("pic/22.jpg");
Icon ic29=new ImageIcon("pic/26.jpg");

Icon ic31=new ImageIcon("pic/31.jpg");
Icon ic32=new ImageIcon("pic/35.jpg");
Icon ic33=new ImageIcon("pic/34.jpg");
Icon ic34=new ImageIcon("pic/37.jpg");
Icon ic35=new ImageIcon("pic/33.jpg");
Icon ic36=new ImageIcon("pic/39.jpg");
Icon ic37=new ImageIcon("pic/38.jpg");
Icon ic38=new ImageIcon("pic/32.jpg");
Icon ic39=new ImageIcon("pic/36.jpg");

Icon ic41=new ImageIcon("pic/41.jpg");
Icon ic42=new ImageIcon("pic/45.jpg");
Icon ic43=new ImageIcon("pic/44.jpg");
Icon ic44=new ImageIcon("pic/47.jpg");
Icon ic45=new ImageIcon("pic/43.jpg");
Icon ic46=new ImageIcon("pic/49.jpg");
Icon ic47=new ImageIcon("pic/48.jpg");
Icon ic48=new ImageIcon("pic/42.jpg");
Icon ic49=new ImageIcon("pic/46.jpg");

Icon ic51=new ImageIcon("pic/51.jpg");
Icon ic52=new ImageIcon("pic/55.jpg");
Icon ic53=new ImageIcon("pic/54.jpg");
Icon ic54=new ImageIcon("pic/57.jpg");
Icon ic55=new ImageIcon("pic/53.jpg");
Icon ic56=new ImageIcon("pic/59.jpg");
Icon ic57=new ImageIcon("pic/58.jpg");
Icon ic58=new ImageIcon("pic/52.jpg");
Icon ic59=new ImageIcon("pic/56.jpg");

Icon ic61=new ImageIcon("pic/61.jpg");
Icon ic62=new ImageIcon("pic/65.jpg");
Icon ic63=new ImageIcon("pic/64.jpg");
Icon ic64=new ImageIcon("pic/67.jpg");
Icon ic65=new ImageIcon("pic/63.jpg");
Icon ic66=new ImageIcon("pic/69.jpg");
Icon ic67=new ImageIcon("pic/68.jpg");
Icon ic68=new ImageIcon("pic/62.jpg");
Icon ic69=new ImageIcon("pic/66.jpg");

Icon ic71=new ImageIcon("pic/71.jpg");
Icon ic72=new ImageIcon("pic/75.jpg");
Icon ic73=new ImageIcon("pic/74.jpg");
Icon ic74=new ImageIcon("pic/77.jpg");
Icon ic75=new ImageIcon("pic/73.jpg");
Icon ic76=new ImageIcon("pic/79.jpg");
Icon ic77=new ImageIcon("pic/78.jpg");
Icon ic78=new ImageIcon("pic/72.jpg");
Icon ic79=new ImageIcon("pic/76.jpg");

Icon ic81=new ImageIcon("pic/81.jpg");
Icon ic82=new ImageIcon("pic/85.jpg");
Icon ic83=new ImageIcon("pic/84.jpg");
Icon ic84=new ImageIcon("pic/87.jpg");
Icon ic85=new ImageIcon("pic/83.jpg");
Icon ic86=new ImageIcon("pic/89.jpg");
Icon ic87=new ImageIcon("pic/88.jpg");
Icon ic88=new ImageIcon("pic/82.jpg");
Icon ic89=new ImageIcon("pic/86.jpg");

Icon ic91=new ImageIcon("pic/91.jpg");
Icon ic92=new ImageIcon("pic/95.jpg");
Icon ic93=new ImageIcon("pic/94.jpg");
Icon ic94=new ImageIcon("pic/97.jpg");
Icon ic95=new ImageIcon("pic/93.jpg");
Icon ic96=new ImageIcon("pic/99.jpg");
Icon ic97=new ImageIcon("pic/98.jpg");
Icon ic98=new ImageIcon("pic/92.jpg");
Icon ic99=new ImageIcon("pic/96.jpg");




RakamlarPuzzle(){

super("Rakamlar Puzzle");
b1 =new JButton(ic1);
b1.setBounds(20,80,143,143);
b2=new JButton(ic2);
b2.setBounds(150,80,143,143);
b3=new JButton(ic3);
b3.setBounds(286,80,143,143);
b4=new JButton(ic4);
b4.setBounds(20,210,143,143);
b5=new JButton(ic5);
b5.setBounds(150,210,143,143);
b6=new JButton(ic6);
b6.setBounds(286,210,143,143);
b7=new JButton(ic7);
b7.setBounds(20,355,143,143);
b8=new JButton(ic8);
b8.setBounds(150,355,143,143);
b9=new JButton(ic9);
b9.setBounds(286,355,143,143);
sample=new JButton(samicon1);
sample.setBounds(800,100,400,400);


JLabel l1=new JLabel("Hareket Eden Parça -->");
l1.setBounds(35,15,500,20);
JLabel l2=new JLabel("Bir Sonraki Puzzle'a Geç -->");
l2.setBounds(480,320,2200,20);
l2.setForeground(Color.magenta);

starB=new JButton(ic0);
starB.setBounds(230,5,50,50);
star=b4.getIcon();




add(b1);add(b2);add(b3);add(b4);add(b5);add(b6);add(b7);add(b8);add(b9);add(sample);add(l1);add(l2);add(starB);
b1.addActionListener(this); b2.addActionListener(this); b3.addActionListener(this); b4.addActionListener(this); b5.addActionListener(this); b6.addActionListener(this); b7.addActionListener(this); b8.addActionListener(this); b9.addActionListener(this); 
sample.addActionListener(this);
setLayout(null);
setSize(2000,900);
setVisible(true);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}

public void actionPerformed(ActionEvent e){
if(e.getSource()==b1){
    Icon s1=b1.getIcon();
      if(b2.getIcon()==star){
        b2.setIcon(s1);
        b1.setIcon(star);
      } else if(b4.getIcon()==star){
                    b4.setIcon(s1);
                    b1.setIcon(star);
                   }
  }

if(e.getSource()==b2){
    Icon s1=b2.getIcon();
      if(b1.getIcon()==star){
        b1.setIcon(s1);
        b2.setIcon(star);
      } else if(b5.getIcon()==star){
                    b5.setIcon(s1);
                    b2.setIcon(star);
                   }
         else if(b3.getIcon()==star){
                    b3.setIcon(s1);
                    b2.setIcon(star);
                   }
  }

if(e.getSource()==b3){
    Icon s1=b3.getIcon();
      if(b2.getIcon()==star){
        b2.setIcon(s1);
        b3.setIcon(star);
      } else if(b6.getIcon()==star){
                    b6.setIcon(s1);
                    b3.setIcon(star);
                   }
  }

if(e.getSource()==b4){
    Icon s1=b4.getIcon();
      if(b1.getIcon()==star){
        b1.setIcon(s1);
        b4.setIcon(star);
      } else if(b5.getIcon()==star){
                    b5.setIcon(s1);
                    b4.setIcon(star);
                   }
         else if(b7.getIcon()==star){
                    b7.setIcon(s1);
                    b4.setIcon(star);
                   }
  }

if(e.getSource()==b5){
    Icon s1=b5.getIcon();
      if(b2.getIcon()==star){
        b2.setIcon(s1);
        b5.setIcon(star);
      } else if(b4.getIcon()==star){
                    b4.setIcon(s1);
                    b5.setIcon(star);
                   }
         else if(b6.getIcon()==star){
                    b6.setIcon(s1);
                    b5.setIcon(star);
                   }
          else if(b8.getIcon()==star){
                    b8.setIcon(s1);
                    b5.setIcon(star);
                   }
  }

if(e.getSource()==b6){
    Icon s1=b6.getIcon();
      if(b3.getIcon()==star){
        b3.setIcon(s1);
        b6.setIcon(star);
      } else if(b5.getIcon()==star){
                    b5.setIcon(s1);
                    b6.setIcon(star);
                   }
         else if(b9.getIcon()==star){
                    b9.setIcon(s1);
                    b6.setIcon(star);
                   }
}

if(e.getSource()==b7){
    Icon s1=b7.getIcon();
      if(b4.getIcon()==star){
        b4.setIcon(s1);
        b7.setIcon(star);
      } else if(b8.getIcon()==star){
                    b8.setIcon(s1);
                    b7.setIcon(star);
                   }
 }

   if(e.getSource()==b8){
    Icon s1=b8.getIcon();
      if(b7.getIcon()==star){
        b7.setIcon(s1);
        b8.setIcon(star);
      } else if(b5.getIcon()==star){
                    b5.setIcon(s1);
                    b8.setIcon(star);
                   }
         else if(b9.getIcon()==star){
                    b9.setIcon(s1);
                    b8.setIcon(star);
                   }

  }

 if(e.getSource()==b9){
    Icon s1=b9.getIcon();
      if(b8.getIcon()==star){
        b8.setIcon(s1);
        b9.setIcon(star);
      } else if(b6.getIcon()==star){
                    b6.setIcon(s1);
                    b9.setIcon(star);
                   }
  }

if(e.getSource()==sample){
Icon s1=sample.getIcon();
 if(s1==samicon10){
sample.setIcon(samicon1);
b1.setIcon(ic1);
b2.setIcon(ic2);
b3.setIcon(ic3);
b4.setIcon(ic4);
b5.setIcon(ic5);
b6.setIcon(ic6);
b7.setIcon(ic7);
b8.setIcon(ic8);
b9.setIcon(ic9);
star=b4.getIcon();
starB.setIcon(ic0);
}
else if(s1==samicon1){
sample.setIcon(samicon2);
b1.setIcon(ic11);
b2.setIcon(ic12);
b3.setIcon(ic13);
b4.setIcon(ic14);
b5.setIcon(ic15);
b6.setIcon(ic16);
b7.setIcon(ic17);
b8.setIcon(ic18);
b9.setIcon(ic19);
star=b5.getIcon();
starB.setIcon(ic10);
}
else if(s1==samicon2){
sample.setIcon(samicon3);
b1.setIcon(ic21);
b2.setIcon(ic22);
b3.setIcon(ic23);
b4.setIcon(ic24);
b5.setIcon(ic25);
b6.setIcon(ic26);
b7.setIcon(ic27);
b8.setIcon(ic28);
b9.setIcon(ic29);
star=b1.getIcon();
starB.setIcon(ic20);
}
else if(s1==samicon3){
sample.setIcon(samicon4);
b1.setIcon(ic31);
b2.setIcon(ic32);
b3.setIcon(ic33);
b4.setIcon(ic34);
b5.setIcon(ic35);
b6.setIcon(ic36);
b7.setIcon(ic37);
b8.setIcon(ic38);
b9.setIcon(ic39);
star=b1.getIcon();
starB.setIcon(ic30);
}
else if(s1==samicon4){
sample.setIcon(samicon5);
b1.setIcon(ic41);
b2.setIcon(ic42);
b3.setIcon(ic43);
b4.setIcon(ic44);
b5.setIcon(ic45);
b6.setIcon(ic46);
b7.setIcon(ic47);
b8.setIcon(ic48);
b9.setIcon(ic49);
star=b1.getIcon();
starB.setIcon(ic40);
}
else if(s1==samicon5){
sample.setIcon(samicon6);
b1.setIcon(ic51);
b2.setIcon(ic52);
b3.setIcon(ic53);
b4.setIcon(ic54);
b5.setIcon(ic55);
b6.setIcon(ic56);
b7.setIcon(ic57);
b8.setIcon(ic58);
b9.setIcon(ic59);
star=b1.getIcon();
starB.setIcon(ic50);
}
else if(s1==samicon6){
sample.setIcon(samicon7);
b1.setIcon(ic61);
b2.setIcon(ic62);
b3.setIcon(ic63);
b4.setIcon(ic64);
b5.setIcon(ic65);
b6.setIcon(ic66);
b7.setIcon(ic67);
b8.setIcon(ic68);
b9.setIcon(ic69);
star=b1.getIcon();
starB.setIcon(ic60);
}
else if(s1==samicon7){
sample.setIcon(samicon8);
b1.setIcon(ic71);
b2.setIcon(ic72);
b3.setIcon(ic73);
b4.setIcon(ic74);
b5.setIcon(ic75);
b6.setIcon(ic76);
b7.setIcon(ic77);
b8.setIcon(ic78);
b9.setIcon(ic79);
star=b1.getIcon();
starB.setIcon(ic70);
}
else if(s1==samicon8){
sample.setIcon(samicon9);
b1.setIcon(ic81);
b2.setIcon(ic82);
b3.setIcon(ic83);
b4.setIcon(ic84);
b5.setIcon(ic85);
b6.setIcon(ic86);
b7.setIcon(ic87);
b8.setIcon(ic88);
b9.setIcon(ic89);
star=b1.getIcon();
starB.setIcon(ic80);
}
else{
sample.setIcon(samicon10);
b1.setIcon(ic91);
b2.setIcon(ic92);
b3.setIcon(ic93);
b4.setIcon(ic94);
b5.setIcon(ic95);
b6.setIcon(ic96);
b7.setIcon(ic97);
b8.setIcon(ic98);
b9.setIcon(ic99);
star=b1.getIcon();
starB.setIcon(ic90);
}
}
}
public static void main(String args[]){
new RakamlarPuzzle();
}
}