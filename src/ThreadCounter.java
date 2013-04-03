import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class ThreadCounter extends Applet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int count;
	private Button onOff = new Button("Toggle");
	private Button start = new Button("Start");
	
	
	private TextField t = new TextField(10);
	
	private boolean runFlag = true;
	
	public void init(){
		add(t);
		start.addActionListener(new startL());
		add(start);
		onOff.addActionListener(new onOffL());
		add(onOff);
		
	}
	
	class startL implements ActionListener{
		public void actionPerformed(ActionEvent e){
			go();
		}
	}

	class onOffL implements ActionListener{
		public void actionPerformed(ActionEvent e){
			runFlag = false;
		}
	}
	
	public void go(){
		while(true){
			try{
				Thread.currentThread().sleep(1000);
				System.out.println("Count"+count);
			}catch(InterruptedException e){
				
			}
			if(runFlag){
				t.setText(Integer.toString(count++));
			}
		}
	}
	
	public static void main(String[] args){
		ThreadCounter count = new ThreadCounter();
		Frame aframe = new Frame();
		aframe.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
		aframe.add(count, BorderLayout.CENTER);
		aframe.setSize(300, 200);
		count.init();
		count.start();
		aframe.setVisible(true);
	}
}

