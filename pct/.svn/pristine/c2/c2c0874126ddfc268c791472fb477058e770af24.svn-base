package com.acube.common.service;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.acube.common.AbstractApplicationContextTest;
import com.acube.security.domain.Elements;
import com.acube.security.mapper.ElementsRepository;

public class ElementsTest extends AbstractApplicationContextTest {

	private static final Logger logger = LoggerFactory.getLogger(ElementsTest.class);

	@Resource(name = "elementsRepository")
	ElementsRepository elementsRepository;

	List<Elements> elementsList;

	//@Test
	public void getProcessStatusDataTest() throws Exception {

		elementsList = elementsRepository.getAllElementsTreeList();

		StringBuilder sb = new StringBuilder();

		int next = 0;
		int current = 0;
		int row = 0;

		for (int i = 0; i < elementsList.size(); i++) {
			row++;

			if (row == elementsList.size()) {
				sb.append("</ul></ul>");
				break;
			}
			current = Integer.parseInt(elementsList.get(i).getLevel());
			next = Integer.parseInt(elementsList.get(i + 1).getLevel());

			if (current == 1) {
				sb.append("<ul id=\"objectTreeData\" style=\"display:none\" >");
				sb.append("<li" + " id=\"" + elementsList.get(i).getSecurityNo() + "\" >");
			} else {
				sb.append("<li" + " id=\"" + elementsList.get(i).getSecurityNo() + "\" >");
			}

			sb.append("<span><input type=\"hidden\" id=\"" + elementsList.get(i).getSecurityNo() + "\">" + elementsList.get(i).getDescription() + "</span>");

			if (current == 1) {
				sb.append("<ul>");
			} else if (next > current) {
				sb.append("<ul>");
			} else if (next == current) {
				sb.append("</li>");
			} else if (next < current) {
				sb.append("</li>");

				for (int j = 0; j < current - next; j++) {

					sb.append("</ul></li>");

				}
			}

		}

		System.out.println(sb.toString()) ;

	}

}
