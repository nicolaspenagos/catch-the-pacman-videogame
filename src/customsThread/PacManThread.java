package customsThread;
import model.PacManModel;
import ui.PacMan;
import ui.PacManController;

public class PacManThread extends Thread{
	
	private long sleep;
	private PacManModel pacMan; 
	
	public PacManThread(long i, PacManController pacManController2, PacManModel pMx, PacMan pCx) {
	
		sleep = i;
		pacMan = pMx;	
	}


	@Override
	public void run() {
		
		for(int i=0; i<50000; i++) {
			pacMan.move();
			try {
				Thread.sleep(sleep);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
			
	}
}
