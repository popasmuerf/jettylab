package jetty_lab; /**
 * Created by mdb on 9/26/17.
 * http://www.eclipse.org/jetty/documentation/9.3.x/embedding-jetty.html
 * http://www.baeldung.com/jetty-embedded
 */
import org.eclipse.jetty.server.Connector;
import org.eclipse.jetty.server.Server ;
import org.eclipse.jetty.server.ServerConnector;
import org.eclipse.jetty.servlet.ServletHandler;
import org.eclipse.jetty.servlet.ServletHandler.*;

import servlets.BlockingServlet;



public class Driver {
    public static void main(String[] args) throws Exception {

        System.out.println("running in main() Thread : " + Thread.currentThread().getName() );
        Server server = new Server();
        ServerConnector connector = new ServerConnector(server);
        connector.setPort(7070);
        server.setConnectors(new Connector[]{connector});
        ServletHandler servletHandler = new ServletHandler();
        servletHandler.addServletWithMapping(BlockingServlet.class, "/status");
        try {
            server.start();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
