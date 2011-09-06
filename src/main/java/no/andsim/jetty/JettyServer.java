package no.andsim.jetty;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.WebAppContext;
public class JettyServer
{
    public static void main(String[] args) throws Exception
    {
        Server server = new Server(9090);
        
        WebAppContext context = new WebAppContext();
        context.setResourceBase("../vareservice/src/main/webapp");
        context.setContextPath("/");
        context.setParentLoaderPriority(true);
 
        server.setHandler(context);
        
        server.start();
        server.join();
        
    }
}