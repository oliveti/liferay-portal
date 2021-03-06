<%--
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
--%>

<%@ include file="/html/portlet/asset_publisher/init.jsp" %>

<%
AssetEntry assetEntry = (AssetEntry)request.getAttribute("view_add_content_application.jsp-assetEntry");
AssetRenderer assetRenderer = (AssetRenderer)request.getAttribute("view_add_content_application.jsp-assetRenderer");

String shortTitle = StringUtil.shorten(assetRenderer.getTitle(themeDisplay.getLocale()), 60);
%>

<div class="asset-preview">

	<%
	String imagePreviewURL = assetRenderer.getURLImagePreview(liferayPortletRequest);
	%>

	<c:if test="<%= Validator.isNotNull(imagePreviewURL) %>">
		<div class="asset-image-preview">
			<img alt="<%= shortTitle %>" src="<%= imagePreviewURL %>" />
		</div>
	</c:if>

	<div class="asset-title">
		<%= shortTitle %>
	</div>

	<%
	String displayDateString = StringPool.BLANK;

	if (Validator.isNotNull(assetRenderer.getDisplayDate())) {
		Format displayFormatDate = FastDateFormatFactoryUtil.getSimpleDateFormat("MMMM d, yyyy", locale, timeZone);

		displayDateString = CharPool.OPEN_PARENTHESIS + displayFormatDate.format(assetRenderer.getDisplayDate()) + CharPool.CLOSE_PARENTHESIS;
	}
	%>

	<div class="asset-information">
		<span class="user-name"><%= assetRenderer.getUserName() %></span>&nbsp; <span class="display-date"><%= displayDateString %></span>
	</div>

	<div class="asset-summary">
		<%= assetRenderer.getSummary(themeDisplay.getLocale()) %>
	</div>

	<div class="asset-metadata">
		<div class="categories">
			<liferay-ui:asset-categories-summary
				className="<%= assetEntry.getClassName() %>"
				classPK="<%= assetEntry.getClassPK () %>"
			/>
		</div>

		<div class="tags">
			<liferay-ui:asset-tags-summary
				className="<%= assetEntry.getClassName() %>"
				classPK="<%= assetEntry.getClassPK () %>"
			/>
		</div>
	</div>

	<%
	Map<String, Object> data = new HashMap<String, Object>();

	data.put("class-name", assetEntry.getClassName());
	data.put("class-pk", assetEntry.getClassPK());
	data.put("portlet-id", assetRenderer.getAddContentPortletId());
	%>

	<aui:button cssClass="add-button-preview" data="<%= data %>" value="add" />
</div>