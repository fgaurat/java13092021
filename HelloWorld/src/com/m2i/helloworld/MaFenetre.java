package com.m2i.helloworld;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;


public class MaFenetre extends JFrame /*implements ActionListener*/{
	JButton button;

	public MaFenetre(){
		super();
		button = new JButton("Cliquez ici !");
		button.setBounds(50,100,195,30);
		
		/*button.addActionListener(this);
		button1.addActionListener(this);*/
		/*
		ClickListener c = new ClickListener();
		button.addActionListener(c);
		*/

		/*
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Hello from anonymous !");
				
			}
		});*/
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		this.add(button);
		this.setSize(400,400);
		this.setLayout(null);
		this.setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}

	/*
	@Override
	public void actionPerformed(ActionEvent e) {
			System.out.println("Hello !");

	}
	*/
	
	
	/*
	class ClickListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.out.println("Hello !");

		}

	}	*/
	
	
}


