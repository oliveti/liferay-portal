/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
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

package com.liferay.portalweb.portal.controlpanel.users.useradditionalemailaddress.adduseradditionalemailaddressmultiple;

import com.liferay.portalweb.portal.BaseTestCase;
import com.liferay.portalweb.portal.util.RuntimeVariables;

/**
 * @author Brian Wing Shun Chan
 */
public class AddUserAdditionalEmailAddress2Test extends BaseTestCase {
	public void testAddUserAdditionalEmailAddress2() throws Exception {
		selenium.selectWindow("null");
		selenium.selectFrame("relative=top");
		selenium.open("/web/guest/home/");
		selenium.waitForElementPresent("link=Control Panel");
		selenium.clickAt("link=Control Panel",
			RuntimeVariables.replace("Control Panel"));
		selenium.waitForPageToLoad("30000");
		selenium.clickAt("link=Users and Organizations",
			RuntimeVariables.replace("Users and Organizations"));
		selenium.waitForPageToLoad("30000");
		selenium.type("//input[@id='_125_keywords']",
			RuntimeVariables.replace("selen01"));
		selenium.clickAt("//input[@value='Search']",
			RuntimeVariables.replace("Search"));
		selenium.waitForPageToLoad("30000");
		selenium.clickAt("//td[2]/a", RuntimeVariables.replace("User Name"));
		selenium.waitForPageToLoad("30000");
		selenium.waitForVisible("//a[@id='_125_additionalEmailAddressesLink']");
		assertTrue(selenium.isPartialText(
				"//a[@id='_125_additionalEmailAddressesLink']",
				"Additional Email Addresses"));
		selenium.clickAt("//a[@id='_125_additionalEmailAddressesLink']",
			RuntimeVariables.replace("Additional Email Addresses"));
		selenium.waitForVisible(
			"//div[11]/fieldset/div[2]/div/span/span/button[1]");
		selenium.clickAt("//div[11]/fieldset/div[2]/div/span/span/button[1]",
			RuntimeVariables.replace("Add Row"));
		selenium.waitForVisible("//input[@id='_125_emailAddressAddress2']");
		selenium.type("//input[@id='_125_emailAddressAddress2']",
			RuntimeVariables.replace("testuser01@selenium.com"));
		selenium.select("//select[@id='_125_emailAddressTypeId2']",
			RuntimeVariables.replace("label=Email Address 2"));
		selenium.clickAt("//input[@value='Save']",
			RuntimeVariables.replace("Save"));
		selenium.waitForPageToLoad("30000");
		selenium.waitForVisible("//div[@class='portlet-msg-success']");
		assertEquals(RuntimeVariables.replace(
				"Your request completed successfully."),
			selenium.getText("//div[@class='portlet-msg-success']"));
		assertEquals("testuser01@selenium.com",
			selenium.getValue("//input[@id='_125_emailAddressAddress1']"));
		assertEquals("Email Address 2",
			selenium.getSelectedLabel(
				"//select[@id='_125_emailAddressTypeId1']"));
	}
}