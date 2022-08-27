/*
 * THIS IS AN EXAMPLE OF JPOPUP 
 * A MESSAGE OR DROPDOWN LIST POPS UP ON CLICKING ANYWHERE ON THE PANEL
 */
package jpopup;
import java.awt.color.*;
import java.awt.*;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.Popup;
import javax.swing.PopupFactory;


public class jpopup implements MouseListener {
JPanel panel;
 Popup jpop;
JPopupMenu jpopm;
JFrame myframe;
PopupFactory pf;
    jpopup()
    {
	pf=new PopupFactory();
	
	jpopm=new JPopupMenu("J Pop Up Demo");
	jpopm.add("File");
	jpopm.add("Folder");
	panel = new JPanel();
	myframe=new JFrame(" Popup Demo");
	Font fo = new Font("BOLD", 1, 14);
	jpopm.setFont(fo);
	myframe.setBounds(500,300,300,300);
	panel.setLayout(new GridLayout(2,1));
	
	//panel.add(label);
	panel.add(jpopm);
	myframe.add(panel);
	
	// following line creates the popup with intial position within the container
	jpop=pf.getPopup(panel, jpopm, 100, 180);
	myframe.addMouseListener(this);
	myframe.setVisible(true);
    }
    public static void main(String[] args) {
	new jpopup();
    }
    @Override
    public void mouseClicked(MouseEvent e) {
	// TODO Auto-generated method stub
	}
    @Override
    public void mousePressed(MouseEvent e) {
	//we are showing the popupmenu items at the x and y point of mouse clicked
	jpopm.show(e.getComponent(), e.getX(),e.getY());
    }
    @Override
    public void mouseReleased(MouseEvent e) {
	// TODO Auto-generated method stub
    }
    @Override
    public void mouseEntered(MouseEvent e) {
	// TODO Auto-generated method stub
    }
    @Override
    public void mouseExited(MouseEvent e) {
	// TODO Auto-generated method stub
    }
}