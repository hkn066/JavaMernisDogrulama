package adapter;

import java.rmi.RemoteException;
import java.util.Locale;

import abstracts.IGamerCheckService;
import entities.Gamer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisAdapter implements IGamerCheckService {

	@Override
	public boolean CheckGamerReal(Gamer gamer) {

		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
	
		try {
			return client.TCKimlikNoDogrula(Long.parseLong(gamer.getNationalId()), gamer.getFirstName().toUpperCase(new Locale("tr")),
					gamer.getLastName().toUpperCase(new Locale("tr")), gamer.getDateOfBirth());
			
		}  catch (RemoteException e) {
			  e.printStackTrace();
			
		}
		return false;
		
	}
}
