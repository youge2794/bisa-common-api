package com.bisa.health.routing.controller;

import java.io.File;
import java.io.UnsupportedEncodingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bisa.health.exce.bean.SysException;
import com.bisa.health.routing.core.DBRoutingService;
import com.bisa.health.routing.core.IRoutingService;
import com.bisa.health.routing.dto.DBRoutingDto;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

@Controller
@RequestMapping(value = "/l")
public class RoutingHandleController {
	
	
	@Value("${routing.file.path}")
	public String routingpath;
	
	@Value("${routing.file.key}")
	public String routingkey;
	
	@Autowired
	private DBRoutingService mDBRoutingService;
	
	@Autowired
	private IRoutingService mRoutingService;
	
	private final Gson gson=new Gson();
	
	@RequestMapping(value = "/routing_parse", method = RequestMethod.GET)
	public @ResponseBody String RoutingRegenerate(){
		DBRoutingDto dbRouting=mDBRoutingService.findAll("ROUTING_KEY");
		
	    String json=gson.toJson(dbRouting, new TypeToken<DBRoutingDto>(){}.getType());
		
	    if (StringUtils.isEmpty(json)) {
			throw new SysException("Routing Table parse erroor!!");
		}
		File outFile=new File(routingpath);
		
		
		String path=outFile.getPath().replaceAll(outFile.getName(), "");
		File dirFile=new File(path);
		
		if(!dirFile.exists()){
			dirFile.mkdirs();
		}
	
		if(outFile.exists()){
			outFile.delete();
		}
		byte[] inbyte;
		try {
			inbyte = json.getBytes("UTF-8");
			boolean an=mRoutingService.saveRouringService(routingkey, outFile, inbyte);
			if(an){
				return "Success";
			}else{
				return "Fail";
			}
		} catch (UnsupportedEncodingException e) {
			return "Fail";
		}
	
		
	}
}
