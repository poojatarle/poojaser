package dsapp;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.WebAppContext;

public class WebAppEntry {

	public static void main(String[] args) throws Exception {
		 WebAppContext webAppContext = new WebAppContext();
		 webAppContext.setContextPath("/");
		 webAppContext.setResourceBase("src/main/webapp");
		 
		 Server server = new Server(8080);
		 server.setHandler(webAppContext);
	     server.start();
	     server.join();
	}

}
