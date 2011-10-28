package org.hpccsystems.internal.wsworkunit;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import wsworkunits.ws.hpccsystems.ArrayOfEspException;
import wsworkunits.ws.hpccsystems.ECLWorkunit;
import wsworkunits.ws.hpccsystems.WUQuery;
import wsworkunits.ws.hpccsystems.WUQueryResponse;
import wsworkunits.ws.hpccsystems.WsWorkunitsLocator;
import wsworkunits.ws.hpccsystems.WsWorkunitsServiceSoap;

public class Server {

	Server(String url, String user, String password) {
		/*
		WsWorkunitsLocator locator = new WsWorkunitsLocator();
		try {
			URL endPoint = new URL(fAddressText.getText() + "WsWorkunits");
			WsWorkunitsServiceSoap server = locator.getWsWorkunitsServiceSoap(endPoint);
			WUQuery request = new WUQuery();
			request.setLastNDays(7);
			WUQueryResponse response = server.WUQuery(request);
			ECLWorkunit wus[] = response.getWorkunits();
			for (int i = 0; i < wus.length; ++i) {
				System.out.println(wus[i].toString());
			}
		} catch (ArrayOfEspException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
	
	}
}
