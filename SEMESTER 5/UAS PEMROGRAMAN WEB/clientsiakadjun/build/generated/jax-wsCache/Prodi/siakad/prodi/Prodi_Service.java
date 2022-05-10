
package siakad.prodi;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10-b140803.1500
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "Prodi", targetNamespace = "http://prodi.siakad/", wsdlLocation = "http://localhost:8080/server/Prodi?wsdl")
public class Prodi_Service
    extends Service
{

    private final static URL PRODI_WSDL_LOCATION;
    private final static WebServiceException PRODI_EXCEPTION;
    private final static QName PRODI_QNAME = new QName("http://prodi.siakad/", "Prodi");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/server/Prodi?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        PRODI_WSDL_LOCATION = url;
        PRODI_EXCEPTION = e;
    }

    public Prodi_Service() {
        super(__getWsdlLocation(), PRODI_QNAME);
    }

    public Prodi_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), PRODI_QNAME, features);
    }

    public Prodi_Service(URL wsdlLocation) {
        super(wsdlLocation, PRODI_QNAME);
    }

    public Prodi_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, PRODI_QNAME, features);
    }

    public Prodi_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Prodi_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Prodi
     */
    @WebEndpoint(name = "ProdiPort")
    public Prodi getProdiPort() {
        return super.getPort(new QName("http://prodi.siakad/", "ProdiPort"), Prodi.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Prodi
     */
    @WebEndpoint(name = "ProdiPort")
    public Prodi getProdiPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://prodi.siakad/", "ProdiPort"), Prodi.class, features);
    }

    private static URL __getWsdlLocation() {
        if (PRODI_EXCEPTION!= null) {
            throw PRODI_EXCEPTION;
        }
        return PRODI_WSDL_LOCATION;
    }

}
