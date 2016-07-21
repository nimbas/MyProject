package com.acube.common.service;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.acube.common.AbstractApplicationContextTest;
import com.acube.security.domain.OrgLayer;
import com.acube.security.mapper.OrgRepository;

public class OrgTest extends AbstractApplicationContextTest {

	private static final Logger logger = LoggerFactory.getLogger(OrgTest.class);

	@Resource(name = "orgRepository")
	OrgRepository orgRepository;

	List<OrgLayer> orgList;

	//@Test
	public void getProcessStatusDataTest() throws Exception {

		orgList = orgRepository.getOrgnizationList(null);

		int next = 0;

		int cur = 0;

		int row = 0;

		for (int i = 0; i < orgList.size(); i++) {
			row++;
			if (row ==orgList.size() ) {
				System.out.println("</ul></ul>");
				break;
			}
			cur = Integer.parseInt(orgList.get(i).getLevel());
			next = Integer.parseInt(orgList.get(i + 1).getLevel()); // 현재 level
																	// 저장.

			StringBuilder sb = new StringBuilder();

			if (cur == 1) {
				sb.append("<ul>");
				sb.append("<li>");
				System.out.println(sb);
			} else if (next > cur) {

				sb.append("<li>");
				System.out.println(sb);

			} else if (next == cur) {
				sb.append("<li>");
				System.out.println(sb);
			} else if (next < cur) {
				sb.append("<li>");
				System.out.println(sb);
			}

			System.out.println("next=" + next + ",current=" + cur + ",nm=" + orgList.get(i).getDlrNm());

			if (cur == 1) {
				System.out.println("<ul>");
			} else if (next > cur) {
				System.out.println("<ul>");
			} else if (next == cur) {
				System.out.println("</li>");
			} else if (next < cur) {
				System.out.println("</li>");

				for (int i1 = 0 ; i1 < cur - next; i1++) {

					System.out.println("</ul></li>");

				}
			}

		}

	}

}
