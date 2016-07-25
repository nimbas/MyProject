package com.acube.pvs.mapper.monitor;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.acube.pvs.domain.monitor.PvsProcess;
import com.acube.pvs.domain.monitor.PvsProcessTree;
import com.acube.pvs.domain.monitor.SysResource;
import com.acube.pvs.domain.monitor.SysResourceTree;

public interface MonitorDao {

	public List<PvsProcessTree> getProcessStatusData(@Param("wasTime") String wasTime, @Param("processStatusValidSeconds") int processStatusValidSeconds);

	public void saveProcessHistory(PvsProcess pvsProcess);

	public List<SysResource> getLatestCpuInfo(@Param("pmsServer1") String pmsServer1, @Param("pmsServer2") String pmsServer2, @Param("start") String start, @Param("end") String end);

	public List<SysResource> getLatestDiskInfo(@Param("pmsServer1") String pmsServer1, @Param("pmsServer2") String pmsServer2, @Param("diskCount") int diskCount, @Param("start") String start,
			@Param("end") String end);

	public List<SysResource> getLatestMemInfo(@Param("pmsServer1") String pmsServer1, @Param("pmsServer2") String pmsServer2, @Param("start") String start, @Param("end") String end);

	public List<SysResourceTree> getLastestSystemSummary(@Param("diskCount") int diskCount, @Param("start") String start, @Param("end") String end);

	public List<SysResourceTree> getLastestDiskSummary(@Param("diskCount") int diskCount, @Param("start") String start, @Param("end") String end);

}