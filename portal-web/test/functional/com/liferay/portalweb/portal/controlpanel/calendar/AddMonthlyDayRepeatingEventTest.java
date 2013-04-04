/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.portalweb.portal.controlpanel.calendar;

import com.liferay.portalweb.portal.BaseTestCase;
import com.liferay.portalweb.portal.util.RuntimeVariables;

/**
 * @author Brian Wing Shun Chan
 */
public class AddMonthlyDayRepeatingEventTest extends BaseTestCase {
	public void testAddMonthlyDayRepeatingEvent() throws Exception {
		selenium.selectWindow("null");
		selenium.selectFrame("relative=top");
		selenium.open("/web/guest/home/");
		selenium.clickAt("//div[@id='dockbar']",
			RuntimeVariables.replace("Dockbar"));
		selenium.waitForElementPresent(
			"//script[contains(@src,'/aui/aui-editable/aui-editable-min.js')]	");
		assertEquals(RuntimeVariables.replace("Go to"),
			selenium.getText("//li[@id='_145_mySites']/a/span"));
		selenium.mouseOver("//li[@id='_145_mySites']/a/span");
		selenium.waitForVisible("link=Control Panel");
		selenium.clickAt("link=Control Panel",
			RuntimeVariables.replace("Control Panel"));
		selenium.waitForPageToLoad("30000");
		selenium.clickAt("link=Calendar", RuntimeVariables.replace("Calendar"));
		selenium.waitForPageToLoad("30000");
		selenium.clickAt("link=Events", RuntimeVariables.replace("Events"));
		selenium.waitForPageToLoad("30000");
		assertTrue(selenium.isVisible(
				"//span[@title='Actions']/ul/li/strong/a/span"));
		selenium.clickAt("//span[@title='Actions']/ul/li/strong/a/span",
			RuntimeVariables.replace("Actions"));
		selenium.waitForVisible(
			"//div[@class='lfr-component lfr-menu-list']/ul/li/a[contains(.,'Edit')]");
		assertEquals(RuntimeVariables.replace("Edit"),
			selenium.getText(
				"//div[@class='lfr-component lfr-menu-list']/ul/li/a[contains(.,'Edit')]"));
		selenium.clickAt("//div[@class='lfr-component lfr-menu-list']/ul/li/a[contains(.,'Edit')]",
			RuntimeVariables.replace("Edit"));
		selenium.waitForPageToLoad("30000");
		selenium.clickAt("//div/div/span[4]/span/span/input",
			RuntimeVariables.replace("Repeat Monthly"));
		selenium.waitForVisible("//input[@name='_8_monthlyType']");
		selenium.clickAt("//input[@name='_8_monthlyType']",
			RuntimeVariables.replace("Day"));
		selenium.type("//input[@id='_8_monthlyDay0']",
			RuntimeVariables.replace("15"));
		selenium.type("//input[@id='_8_monthlyInterval0']",
			RuntimeVariables.replace("1"));
		selenium.select("//select[@id='_8_enddatemonth']",
			RuntimeVariables.replace("January"));
		selenium.select("//select[@id='_8_enddateday']",
			RuntimeVariables.replace("1"));
		selenium.select("//select[@id='_8_enddateyear']",
			RuntimeVariables.replace("2011"));
		selenium.clickAt("//input[@value='Save']",
			RuntimeVariables.replace("Save"));
		selenium.waitForPageToLoad("30000");
		assertEquals(RuntimeVariables.replace(
				"Your request completed successfully."),
			selenium.getText("//div[@class='portlet-msg-success']"));
		selenium.clickAt("link=Year", RuntimeVariables.replace("Year"));
		selenium.waitForPageToLoad("30000");
		selenium.waitForPartialText("//select[@id='_8_yearSelector']", "2010");
		selenium.select("//select[@id='_8_yearSelector']",
			RuntimeVariables.replace("2010"));
		selenium.waitForPageToLoad("30000");
		selenium.waitForVisible(
			"//a[contains(@href, 'javascript:_8_updateCalendar(2, 15, 2010);')]");
		selenium.clickAt("//a[contains(@href, 'javascript:_8_updateCalendar(2, 15, 2010);')]",
			RuntimeVariables.replace(""));
		selenium.waitForPageToLoad("30000");
		assertEquals(RuntimeVariables.replace("Repeating Test Event"),
			selenium.getText("//div[@class='event-title']/a"));
		selenium.clickAt("link=Year", RuntimeVariables.replace("Year"));
		selenium.waitForPageToLoad("30000");
		selenium.waitForPartialText("//select[@id='_8_yearSelector']", "2010");
		selenium.select("//select[@id='_8_yearSelector']",
			RuntimeVariables.replace("2010"));
		selenium.waitForVisible(
			"//a[contains(@href, 'javascript:_8_updateCalendar(4, 15, 2010);')]");
		selenium.clickAt("//a[contains(@href, 'javascript:_8_updateCalendar(4, 15, 2010);')]",
			RuntimeVariables.replace(""));
		selenium.waitForPageToLoad("30000");
		assertEquals(RuntimeVariables.replace("Repeating Test Event"),
			selenium.getText("//div[@class='event-title']/a"));
		selenium.clickAt("link=Year", RuntimeVariables.replace("Year"));
		selenium.waitForPageToLoad("30000");
		selenium.waitForPartialText("//select[@id='_8_yearSelector']", "2010");
		selenium.select("//select[@id='_8_yearSelector']",
			RuntimeVariables.replace("2010"));
		selenium.waitForVisible(
			"//a[contains(@href, 'javascript:_8_updateCalendar(2, 16, 2010);')]");
		selenium.clickAt("//a[contains(@href, 'javascript:_8_updateCalendar(2, 16, 2010);')]",
			RuntimeVariables.replace(""));
		selenium.waitForPageToLoad("30000");
		assertTrue(selenium.isElementNotPresent("//div[@class='event-title']/a"));
	}
}