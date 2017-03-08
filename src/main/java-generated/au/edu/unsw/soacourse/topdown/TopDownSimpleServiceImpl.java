package au.edu.unsw.soacourse.topdown;

import javax.jws.WebService;

@WebService(endpointInterface = "au.edu.unsw.soacourse.topdown.TopDownSimpleService")
public class TopDownSimpleServiceImpl implements TopDownSimpleService {

	// TODO: create an ObjectFactory
	private ObjectFactory objectFactory = new ObjectFactory();

	@Override
	public ImportMarketDataResponse importMarketData(ImportMarketDataRequest req) {

		ImportMarketDataResponse response = new ImportMarketDataResponse();

		StringBuilder sbf = new StringBuilder();
		sbf.append("Security Code: ").append(req.sec).append("\r\n");
		sbf.append("Start date: ").append(req.startDate).append("\r\n");
		sbf.append("End date: ").append(req.endDate).append("\r\n");
		sbf.append("Data source: ").append(req.dataSource).append("\r\n");

		response.setReturnData(sbf.toString());

		return response;
	}

	@Override
	public DownloadFileResponse downloadFile(DownloadFileRequest req) {

		DownloadFileResponse response = new DownloadFileResponse();
		response.setReturnData(req.eventSetId);

		return response;
	}
}