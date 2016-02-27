package gardening;

import org.apache.log4j.Logger;

public class RandomEvents implements Runnable {
	private static final Logger logger = Logger.getLogger("Random class");
	@Override
	public void run() {
		logger.info("Generating Random events");
		
	}

}
