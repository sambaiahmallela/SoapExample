package com.samples.domain;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "callerChannelOrPackageOrDocuments" })
@XmlRootElement(name = "DAIOptions")
public class DAIOptions {

	@XmlElements({ @XmlElement(name = "Mode", type = String.class),
			@XmlElement(name = "WorkflowNotification", type = WorkflowNotification.class),
			@XmlElement(name = "Package", type = Package.class), @XmlElement(name = "Delivery", type = Delivery.class),
			@XmlElement(name = "CallerChannel", type = CallerChannel.class),
			@XmlElement(name = "Documents", type = Documents.class),
			@XmlElement(name = "UserDetails", type = UserDetails.class) })
	protected List<Object> callerChannelOrPackageOrDocuments;

	public List<Object> getCallerChannelOrPackageOrDocuments() {
		if (this.callerChannelOrPackageOrDocuments == null) {
			this.callerChannelOrPackageOrDocuments = new ArrayList();
		}
		return this.callerChannelOrPackageOrDocuments;
	}

	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "value" })
	public static class WorkflowNotification {

		@XmlValue
		protected String value;

		@XmlAttribute(name = "Channel")
		protected String channel;

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public String getChannel() {
			return this.channel;
		}

		public void setChannel(String value) {
			this.channel = value;
		}
	}

	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "userName", "userTitle", "userLANID", "userEmail" })
	public static class UserDetails {

		@XmlElement(name = "UserName",required = true)
		protected String userName;

		@XmlElement(name = "UserTitle",required = true)
		protected String userTitle;

		@XmlElement(name = "UserLANID",required = true)
		protected String userLANID;

		@XmlElement(name = "UserEmail",required = true)
		protected String userEmail;

		public String getUserName() {
			return this.userName;
		}

		public void setUserName(String value) {
			this.userName = value;
		}

		public String getUserTitle() {
			return this.userTitle;
		}

		public void setUserTitle(String value) {
			this.userTitle = value;
		}

		public String getUserLANID() {
			return this.userLANID;
		}

		public void setUserLANID(String value) {
			this.userLANID = value;
		}

		public String getUserEmail() {
			return this.userEmail;
		}

		public void setUserEmail(String value) {
			this.userEmail = value;
		}
	}

	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = {})
	public static class Package {

		@XmlElement(name = "PackageName",required = true)
		protected String packageName;

		@XmlElement(name = "PackageVersion",required = true)
		protected String packageVersion;

		public String getPackageName() {
			return this.packageName;
		}

		public void setPackageName(String value) {
			this.packageName = value;
		}

		public String getPackageVersion() {
			return this.packageVersion;
		}

		public void setPackageVersion(String value) {
			this.packageVersion = value;
		}
	}

	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "document" })
	public static class Documents {

		@XmlElement(name = "Document",required = true)
		protected List<Document> document;

		public List<Document> getDocument() {
			if (this.document == null) {
				this.document = new ArrayList();
			}
			return this.document;
		}

		@XmlAccessorType(XmlAccessType.FIELD)
		@XmlType(name = "", propOrder = {})
		public static class Document {

			@XmlElement(name = "Return",required = true)
			protected String _return;

			@XmlElement(name = "Print",required = true)
			protected String print;

			@XmlElementRef(name = "Archive", type = JAXBElement.class)
			protected JAXBElement<Archive> archive;

			@XmlAttribute(name = "Type")
			protected String type;

			@XmlAttribute(name = "Send")
			protected String send;

			public String getReturn() {
				return this._return;
			}

			public void setReturn(String value) {
				this._return = value;
			}

			public String getPrint() {
				return this.print;
			}

			public void setPrint(String value) {
				this.print = value;
			}

			public JAXBElement<Archive> getArchive() {
				return this.archive;
			}

			public void setArchive(JAXBElement<Archive> value) {
				this.archive = value;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String value) {
				this.type = value;
			}

			public String getSend() {
				return this.send;
			}

			public void setSend(String value) {
				this.send = value;
			}

			@XmlAccessorType(XmlAccessType.FIELD)
			@XmlType(name = "", propOrder = { "value" })
			public static class Archive {

				@XmlValue
				protected String value;

				@XmlAttribute(name = "Expiry")
				protected String expiry;

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}

				public String getExpiry() {
					return this.expiry;
				}

				public void setExpiry(String value) {
					this.expiry = value;
				}
			}
		}
	}

	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "email", "fax" })
	public static class Delivery {

		@XmlElement(name = "Email",required = true)
		protected List<Email> email;

		@XmlElement(name = "Fax",required = true)
		protected List<Fax> fax;

		public List<Email> getEmail() {
			if (this.email == null) {
				this.email = new ArrayList();
			}
			return this.email;
		}

		public List<Fax> getFax() {
			if (this.fax == null) {
				this.fax = new ArrayList();
			}
			return this.fax;
		}

		@XmlAccessorType(XmlAccessType.FIELD)
		@XmlType(name = "")
		public static class Fax {

			@XmlAttribute(name = "IncludeFaxFile")
			protected String includeFaxFile;

			public String getIncludeFaxFile() {
				return this.includeFaxFile;
			}

			public void setIncludeFaxFile(String value) {
				this.includeFaxFile = value;
			}
		}

		@XmlAccessorType(XmlAccessType.FIELD)
		@XmlType(name = "")
		public static class Email {

			@XmlAttribute(name = "AttachEmailFile")
			protected String attachEmailFile;

			public String getAttachEmailFile() {
				return this.attachEmailFile;
			}

			public void setAttachEmailFile(String value) {
				this.attachEmailFile = value;
			}
		}
	}

	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = {})
	public static class CallerChannel {

		@XmlElement(name = "ChannelID",required = true)
		protected String channelID;

		@XmlElement(name = "UniqueID",required = true)
		protected String uniqueID;

		@XmlElement(name = "BusinessID",required = true)
		protected String businessID;

		public String getChannelID() {
			return this.channelID;
		}

		public void setChannelID(String value) {
			this.channelID = value;
		}

		public String getUniqueID() {
			return this.uniqueID;
		}

		public void setUniqueID(String value) {
			this.uniqueID = value;
		}

		public String getBusinessID() {
			return this.businessID;
		}

		public void setBusinessID(String value) {
			this.businessID = value;
		}
	}
}