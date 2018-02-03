package reflection.app_interfaces;

import java.io.IOException;

/**
 * Created by mikeyb on 2/2/18.
 *
 *
 *
 *
 */
public interface PresentationInterface {
    public void initializePresentation(ProxyInterface proxy);
    public void output(String text) throws IOException;
    public void finalizePresentation() throws IOException ;
}
