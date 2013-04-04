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

package com.liferay.portlet.journal.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.GroupedModel;
import com.liferay.portal.model.StagedModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the JournalFeed service. Represents a row in the &quot;JournalFeed&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.portlet.journal.model.impl.JournalFeedModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.portlet.journal.model.impl.JournalFeedImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see JournalFeed
 * @see com.liferay.portlet.journal.model.impl.JournalFeedImpl
 * @see com.liferay.portlet.journal.model.impl.JournalFeedModelImpl
 * @generated
 */
public interface JournalFeedModel extends BaseModel<JournalFeed>, GroupedModel,
	StagedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a journal feed model instance should use the {@link JournalFeed} interface instead.
	 */

	/**
	 * Returns the primary key of this journal feed.
	 *
	 * @return the primary key of this journal feed
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this journal feed.
	 *
	 * @param primaryKey the primary key of this journal feed
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this journal feed.
	 *
	 * @return the uuid of this journal feed
	 */
	@AutoEscape
	public String getUuid();

	/**
	 * Sets the uuid of this journal feed.
	 *
	 * @param uuid the uuid of this journal feed
	 */
	public void setUuid(String uuid);

	/**
	 * Returns the ID of this journal feed.
	 *
	 * @return the ID of this journal feed
	 */
	public long getId();

	/**
	 * Sets the ID of this journal feed.
	 *
	 * @param id the ID of this journal feed
	 */
	public void setId(long id);

	/**
	 * Returns the group ID of this journal feed.
	 *
	 * @return the group ID of this journal feed
	 */
	public long getGroupId();

	/**
	 * Sets the group ID of this journal feed.
	 *
	 * @param groupId the group ID of this journal feed
	 */
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this journal feed.
	 *
	 * @return the company ID of this journal feed
	 */
	public long getCompanyId();

	/**
	 * Sets the company ID of this journal feed.
	 *
	 * @param companyId the company ID of this journal feed
	 */
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this journal feed.
	 *
	 * @return the user ID of this journal feed
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this journal feed.
	 *
	 * @param userId the user ID of this journal feed
	 */
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this journal feed.
	 *
	 * @return the user uuid of this journal feed
	 * @throws SystemException if a system exception occurred
	 */
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this journal feed.
	 *
	 * @param userUuid the user uuid of this journal feed
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this journal feed.
	 *
	 * @return the user name of this journal feed
	 */
	@AutoEscape
	public String getUserName();

	/**
	 * Sets the user name of this journal feed.
	 *
	 * @param userName the user name of this journal feed
	 */
	public void setUserName(String userName);

	/**
	 * Returns the create date of this journal feed.
	 *
	 * @return the create date of this journal feed
	 */
	public Date getCreateDate();

	/**
	 * Sets the create date of this journal feed.
	 *
	 * @param createDate the create date of this journal feed
	 */
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this journal feed.
	 *
	 * @return the modified date of this journal feed
	 */
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this journal feed.
	 *
	 * @param modifiedDate the modified date of this journal feed
	 */
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the feed ID of this journal feed.
	 *
	 * @return the feed ID of this journal feed
	 */
	public String getFeedId();

	/**
	 * Sets the feed ID of this journal feed.
	 *
	 * @param feedId the feed ID of this journal feed
	 */
	public void setFeedId(String feedId);

	/**
	 * Returns the name of this journal feed.
	 *
	 * @return the name of this journal feed
	 */
	@AutoEscape
	public String getName();

	/**
	 * Sets the name of this journal feed.
	 *
	 * @param name the name of this journal feed
	 */
	public void setName(String name);

	/**
	 * Returns the description of this journal feed.
	 *
	 * @return the description of this journal feed
	 */
	@AutoEscape
	public String getDescription();

	/**
	 * Sets the description of this journal feed.
	 *
	 * @param description the description of this journal feed
	 */
	public void setDescription(String description);

	/**
	 * Returns the type of this journal feed.
	 *
	 * @return the type of this journal feed
	 */
	@AutoEscape
	public String getType();

	/**
	 * Sets the type of this journal feed.
	 *
	 * @param type the type of this journal feed
	 */
	public void setType(String type);

	/**
	 * Returns the structure ID of this journal feed.
	 *
	 * @return the structure ID of this journal feed
	 */
	public String getStructureId();

	/**
	 * Sets the structure ID of this journal feed.
	 *
	 * @param structureId the structure ID of this journal feed
	 */
	public void setStructureId(String structureId);

	/**
	 * Returns the template ID of this journal feed.
	 *
	 * @return the template ID of this journal feed
	 */
	public String getTemplateId();

	/**
	 * Sets the template ID of this journal feed.
	 *
	 * @param templateId the template ID of this journal feed
	 */
	public void setTemplateId(String templateId);

	/**
	 * Returns the renderer template ID of this journal feed.
	 *
	 * @return the renderer template ID of this journal feed
	 */
	@AutoEscape
	public String getRendererTemplateId();

	/**
	 * Sets the renderer template ID of this journal feed.
	 *
	 * @param rendererTemplateId the renderer template ID of this journal feed
	 */
	public void setRendererTemplateId(String rendererTemplateId);

	/**
	 * Returns the delta of this journal feed.
	 *
	 * @return the delta of this journal feed
	 */
	public int getDelta();

	/**
	 * Sets the delta of this journal feed.
	 *
	 * @param delta the delta of this journal feed
	 */
	public void setDelta(int delta);

	/**
	 * Returns the order by col of this journal feed.
	 *
	 * @return the order by col of this journal feed
	 */
	@AutoEscape
	public String getOrderByCol();

	/**
	 * Sets the order by col of this journal feed.
	 *
	 * @param orderByCol the order by col of this journal feed
	 */
	public void setOrderByCol(String orderByCol);

	/**
	 * Returns the order by type of this journal feed.
	 *
	 * @return the order by type of this journal feed
	 */
	@AutoEscape
	public String getOrderByType();

	/**
	 * Sets the order by type of this journal feed.
	 *
	 * @param orderByType the order by type of this journal feed
	 */
	public void setOrderByType(String orderByType);

	/**
	 * Returns the target layout friendly url of this journal feed.
	 *
	 * @return the target layout friendly url of this journal feed
	 */
	@AutoEscape
	public String getTargetLayoutFriendlyUrl();

	/**
	 * Sets the target layout friendly url of this journal feed.
	 *
	 * @param targetLayoutFriendlyUrl the target layout friendly url of this journal feed
	 */
	public void setTargetLayoutFriendlyUrl(String targetLayoutFriendlyUrl);

	/**
	 * Returns the target portlet ID of this journal feed.
	 *
	 * @return the target portlet ID of this journal feed
	 */
	@AutoEscape
	public String getTargetPortletId();

	/**
	 * Sets the target portlet ID of this journal feed.
	 *
	 * @param targetPortletId the target portlet ID of this journal feed
	 */
	public void setTargetPortletId(String targetPortletId);

	/**
	 * Returns the content field of this journal feed.
	 *
	 * @return the content field of this journal feed
	 */
	@AutoEscape
	public String getContentField();

	/**
	 * Sets the content field of this journal feed.
	 *
	 * @param contentField the content field of this journal feed
	 */
	public void setContentField(String contentField);

	/**
	 * Returns the feed format of this journal feed.
	 *
	 * @return the feed format of this journal feed
	 */
	@AutoEscape
	public String getFeedFormat();

	/**
	 * Sets the feed format of this journal feed.
	 *
	 * @param feedFormat the feed format of this journal feed
	 */
	public void setFeedFormat(String feedFormat);

	/**
	 * Returns the feed version of this journal feed.
	 *
	 * @return the feed version of this journal feed
	 */
	public double getFeedVersion();

	/**
	 * Sets the feed version of this journal feed.
	 *
	 * @param feedVersion the feed version of this journal feed
	 */
	public void setFeedVersion(double feedVersion);

	public boolean isNew();

	public void setNew(boolean n);

	public boolean isCachedModel();

	public void setCachedModel(boolean cachedModel);

	public boolean isEscapedModel();

	public Serializable getPrimaryKeyObj();

	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	public ExpandoBridge getExpandoBridge();

	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	public Object clone();

	public int compareTo(JournalFeed journalFeed);

	public int hashCode();

	public CacheModel<JournalFeed> toCacheModel();

	public JournalFeed toEscapedModel();

	public JournalFeed toUnescapedModel();

	public String toString();

	public String toXmlString();
}