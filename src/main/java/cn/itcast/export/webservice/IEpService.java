package cn.itcast.export.webservice;


import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import cn.itcast.export.vo.ExportResult;
import cn.itcast.export.vo.ExportVo;

//"http://localhost:8088/ws/export/user"
//"http://localhost:8088/ws/export/user/"+id

@Produces("*/*")   
public interface IEpService {
	@POST
	@Path("/user")
	@Consumes({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public void exportE(ExportVo export) throws Exception;
	
	@GET
	@Path("/user/{id}")
	@Consumes({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	@Produces({ MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public ExportResult getResult(@PathParam("id") String id) throws Exception;
}
