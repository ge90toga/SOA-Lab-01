package au.edu.unsw.soacourse.simple;

import javax.jws.WebService;

@WebService(endpointInterface = "au.edu.unsw.soacourse.simple.SimpleService")
public class SimpleServiceImpl implements SimpleService{

	@Override
	public String importMarketData(String sec, String startDate, String endDate, String dataSource) {
		StringBuilder sbf = new StringBuilder();
        sbf.append("Security Code: ").append(sec).append("\r\n");
        sbf.append("Start date: ").append(startDate).append("\r\n");
        sbf.append("End date: ").append(endDate).append("\r\n");
        sbf.append("Data source: ").append(dataSource).append("\r\n");

        return sbf.toString();
	}

	@Override
	public String downloadFile(String eventSetID) {
		return "EventSet Id: " + eventSetID;
	}
	
}
