package com.acube.common.util;

import java.io.InputStream;
import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;

import com.acube.pvs.domain.BatchServerInfo;
import com.acube.pvs.exception.PvException;
import com.jcraft.jsch.Channel;
import com.jcraft.jsch.ChannelExec;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;


public class RemoteConnViaSsh {
	
	private final static Logger log = LoggerFactory.getLogger(RemoteConnViaSsh.class);
	
	public static String reqCommand(BatchServerInfo serverInfo, String command) {
		
		ArrayList<String> strList = new ArrayList<String>();
		
		try {
			log.error("RemoteConnViaSsh-Connecting to " +serverInfo.getSvrId()+ "@"+serverInfo.getSvrIp());
			log.error("RemoteConnViaSsh-Connection Request Command ::[" + command + "]");
			
			JSch jsch = new JSch();
			
			if ( StringUtils.isEmpty(command) ) {
				log.error("RemoteConnection :: argument is required!!");
				throw new RuntimeException("argument is required!!");
			}
			
			Session session = jsch.getSession(serverInfo.getSvrId(), serverInfo.getSvrIp(), 22);
			session.setConfig("StrictHostKeyChecking", "no");
			session.setPassword(serverInfo.getSvrPw());
			session.connect();
			
			Channel channel=session.openChannel("exec");
			((ChannelExec)channel).setCommand(command);
			channel.setInputStream(null);
			((ChannelExec)channel).setErrStream(System.err);
			
			InputStream in=channel.getInputStream();            
			channel.connect();            
			
			String response = null;
			
			byte[] tmp = new byte[1024];            
			int idx = 0;
			
			while(true){              
				while(in.available()>0){                
					int i=in.read(tmp, 0, 1024);                
					log.error("@@@@@@@@@@@!!!!");
					if(i<0)break;                
//@@@@@response = new String(tmp, 0, i);
					response = new String(tmp, 0, i);
									
					log.error(":::::"+response);
					//strList.add(new String(tmp, 0, i));
				}     
				
//				if(StringUtils.contains(response, "SUCCESS")){
//					//channel.isEOF()
//					//channel. channel.isEOF()
//					in.close();
//					break;
//				}
				//log.error("loop count"+(++idx));
				if(channel.isClosed()){               
					log.error("exit-status: "+channel.getExitStatus());                
					break;              
				}        
				try{
					Thread.sleep(1000);
				}catch(Exception ee){
					
				} 
			}
			channel.disconnect();            
			session.disconnect();
			
			//String response = org.springframework.util.StringUtils.collectionToDelimitedString(strList, "");
			log.error("RemoteConnViaSsh-Remote Shell Response::["+response+"]");
			
			return response.trim();
		} catch(JSchException e){
			log.error("\n\n [ReqCommand, Can't remote shell execute1::"+e.toString());
			throw new PvException(e.getMessage());
		} catch (Exception e) {
			log.error("\n\n [ReqCommand, Can't remote shell execute2::"+e.toString());
			throw new PvException(e.getMessage());
		}
	}
	
}
