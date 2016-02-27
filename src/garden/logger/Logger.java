package garden.logger;

import org.apache.log4j.RollingFileAppender;

public class Logger<E> extends RollingFileAppender {
//		   private int interval = 24; // minutes
//		   public void rollover() {
//		     if (this.interval % 5 == 0) {
//		       super.rollOver();
//		       this.interval = 0;
//		     }
//		     this.interval++;
//		   }
	
	
	private static long start = System.currentTimeMillis(); // minutes
	   private int rollOverTimeInMinutes = 24;
	 
	   @Override
	   public void rollOver()
	   {
	      long currentTime = System.currentTimeMillis();
	      int maxIntervalSinceLastLoggingInMillis = rollOverTimeInMinutes * 60 * 1000;

	      if ((currentTime - start) >= maxIntervalSinceLastLoggingInMillis)
	      {
	         super.rollOver();
	         start = System.currentTimeMillis();
	      }
	   }
	
		} 

