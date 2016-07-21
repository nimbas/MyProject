package com.acube.pvs.service.monitor;

import java.util.List;

import com.acube.common.domain.jqgrid.JQueryGrid;
import com.acube.pvs.domain.PsUiAlarmConf;
import com.acube.pvs.domain.monitor.PvsProcessTree;
import com.acube.pvs.domain.monitor.SysResource;
import com.acube.pvs.domain.monitor.SysResourceTree;

public interface MonitorService {

	public JQueryGrid<PvsProcessTree> getProcessStatusData();

	public void processHandling(String command);

	public JQueryGrid<SysResourceTree> getLastestSysResources();

	public JQueryGrid<SysResourceTree> getLastestDiskResources();

	public List<SysResource> getLastestCpuResources(String pmsServer1, String pmsServer2);

	public List<SysResource> getLastestMemoryResources(String pmsServer1, String pmsServer2);

	public void updateAlarmConf(PsUiAlarmConf[] list);


}
