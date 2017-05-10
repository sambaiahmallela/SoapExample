package com.samples.service.response;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "statusOrReturnDocumentsOrArchiveInformation" })
@XmlRootElement(name = "DAIResponse")
public class DAIResponse {

	@XmlElements({ @XmlElement(name = "ReturnDocuments", type = ReturnDocuments.class),
			@XmlElement(name = "Status", type = Status.class),
			@XmlElement(name = "ArchiveInformation", type = ArchiveInformation.class) })
	protected List<Object> statusOrReturnDocumentsOrArchiveInformation;

	public List<Object> getStatusOrReturnDocumentsOrArchiveInformation() {
		if (this.statusOrReturnDocumentsOrArchiveInformation == null) {
			this.statusOrReturnDocumentsOrArchiveInformation = new ArrayList<Object>();
		}
		return this.statusOrReturnDocumentsOrArchiveInformation;
	}

	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "daiStatus", "dialogueStatus", "emailStatus", "faxStatus", "printStatus",
			"storageStatus" })
	public static class Status {

		@XmlElement(name = "DAIStatus")
		protected List<DAIStatus> daiStatus;

		@XmlElement(name = "DialogueStatus")
		protected List<DialogueStatus> dialogueStatus;

		@XmlElement(name = "EmailStatus")
		protected List<EmailStatus> emailStatus;

		@XmlElement(name = "FaxStatus")
		protected List<FaxStatus> faxStatus;

		@XmlElement(name = "PrintStatus")
		protected List<PrintStatus> printStatus;

		@XmlElement(name = "StorageStatus")
		protected List<StorageStatus> storageStatus;

		public List<DAIStatus> getDAIStatus() {
			if (this.daiStatus == null) {
				this.daiStatus = new ArrayList<DAIStatus>();
			}
			return this.daiStatus;
		}

		public List<DialogueStatus> getDialogueStatus() {
			if (this.dialogueStatus == null) {
				this.dialogueStatus = new ArrayList<DialogueStatus>();
			}
			return this.dialogueStatus;
		}

		public List<EmailStatus> getEmailStatus() {
			if (this.emailStatus == null) {
				this.emailStatus = new ArrayList<EmailStatus>();
			}
			return this.emailStatus;
		}

		public List<FaxStatus> getFaxStatus() {
			if (this.faxStatus == null) {
				this.faxStatus = new ArrayList<FaxStatus>();
			}
			return this.faxStatus;
		}

		public List<PrintStatus> getPrintStatus() {
			if (this.printStatus == null) {
				this.printStatus = new ArrayList<PrintStatus>();
			}
			return this.printStatus;
		}

		public List<StorageStatus> getStorageStatus() {
			if (this.storageStatus == null) {
				this.storageStatus = new ArrayList<StorageStatus>();
			}
			return this.storageStatus;
		}

		@XmlAccessorType(XmlAccessType.FIELD)
		@XmlType(name = "", propOrder = { "statusCode", "statusMessage" })
		public static class StorageStatus {

			@XmlElement(name = "StatusCode")
			protected Integer statusCode;

			@XmlElement(name = "StatusMessage")
			protected String statusMessage;

			public Integer getStatusCode() {
				return this.statusCode;
			}

			public void setStatusCode(Integer value) {
				this.statusCode = value;
			}

			public String getStatusMessage() {
				return this.statusMessage;
			}

			public void setStatusMessage(String value) {
				this.statusMessage = value;
			}
		}

		@XmlAccessorType(XmlAccessType.FIELD)
		@XmlType(name = "", propOrder = { "statusCode", "statusMessage" })
		public static class PrintStatus {

			@XmlElement(name = "StatusCode")
			protected Integer statusCode;

			@XmlElement(name = "StatusMessage")
			protected String statusMessage;

			public Integer getStatusCode() {
				return this.statusCode;
			}

			public void setStatusCode(Integer value) {
				this.statusCode = value;
			}

			public String getStatusMessage() {
				return this.statusMessage;
			}

			public void setStatusMessage(String value) {
				this.statusMessage = value;
			}
		}

		@XmlAccessorType(XmlAccessType.FIELD)
		@XmlType(name = "", propOrder = { "statusCode", "statusMessage" })
		public static class FaxStatus {

			@XmlElement(name = "StatusCode")
			protected Integer statusCode;

			@XmlElement(name = "StatusMessage")
			protected String statusMessage;

			public Integer getStatusCode() {
				return this.statusCode;
			}

			public void setStatusCode(Integer value) {
				this.statusCode = value;
			}

			public String getStatusMessage() {
				return this.statusMessage;
			}

			public void setStatusMessage(String value) {
				this.statusMessage = value;
			}
		}

		@XmlAccessorType(XmlAccessType.FIELD)
		@XmlType(name = "", propOrder = { "statusCode", "statusMessage" })
		public static class EmailStatus {

			@XmlElement(name = "StatusCode")
			protected Integer statusCode;

			@XmlElement(name = "StatusMessage")
			protected String statusMessage;

			public Integer getStatusCode() {
				return this.statusCode;
			}

			public void setStatusCode(Integer value) {
				this.statusCode = value;
			}

			public String getStatusMessage() {
				return this.statusMessage;
			}

			public void setStatusMessage(String value) {
				this.statusMessage = value;
			}
		}

		@XmlAccessorType(XmlAccessType.FIELD)
		@XmlType(name = "", propOrder = { "statusCode", "statusMessage" })
		public static class DialogueStatus {

			@XmlElement(name = "StatusCode")
			protected Integer statusCode;

			@XmlElement(name = "StatusMessage")
			protected String statusMessage;

			public Integer getStatusCode() {
				return this.statusCode;
			}

			public void setStatusCode(Integer value) {
				this.statusCode = value;
			}

			public String getStatusMessage() {
				return this.statusMessage;
			}

			public void setStatusMessage(String value) {
				this.statusMessage = value;
			}
		}

		@XmlAccessorType(XmlAccessType.FIELD)
		@XmlType(name = "", propOrder = { "statusCode", "statusMessage" })
		public static class DAIStatus {

			@XmlElement(name = "StatusCode")
			protected Integer statusCode;

			@XmlElement(name = "StatusMessage")
			protected String statusMessage;

			public Integer getStatusCode() {
				return this.statusCode;
			}

			public void setStatusCode(Integer value) {
				this.statusCode = value;
			}

			public String getStatusMessage() {
				return this.statusMessage;
			}

			public void setStatusMessage(String value) {
				this.statusMessage = value;
			}
		}
	}

	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "document" })
	public static class ReturnDocuments {

		@XmlElement(name = "Document")
		protected List<Document> document;

		public List<Document> getDocument() {
			if (this.document == null) {
				this.document = new ArrayList<Document>();
			}
			return this.document;
		}

		@XmlAccessorType(XmlAccessType.FIELD)
		@XmlType(name = "", propOrder = { "documentData" })
		public static class Document {

			@XmlElement(name = "DocumentData", nillable = true)
			protected List<DocumentData> documentData;

			@XmlAttribute(name = "Type")
			protected String type;

			public List<DocumentData> getDocumentData() {
				if (this.documentData == null) {
					this.documentData = new ArrayList<DocumentData>();
				}
				return this.documentData;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String value) {
				this.type = value;
			}

			@XmlAccessorType(XmlAccessType.FIELD)
			@XmlType(name = "", propOrder = { "value" })
			public static class DocumentData {

				@XmlValue
				protected String value;

				@XmlAttribute(name = "Keywords")
				protected String keywords;

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}

				public String getKeywords() {
					return this.keywords;
				}

				public void setKeywords(String value) {
					this.keywords = value;
				}
			}
		}
	}

	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "archiveDocument" })
	public static class ArchiveInformation {

		@XmlElement(name = "ArchiveDocument")
		protected List<ArchiveDocument> archiveDocument;

		public List<ArchiveDocument> getArchiveDocument() {
			if (this.archiveDocument == null) {
				this.archiveDocument = new ArrayList<ArchiveDocument>();
			}
			return this.archiveDocument;
		}

		@XmlAccessorType(XmlAccessType.FIELD)
		@XmlType(name = "", propOrder = { "archiveKey" })
		public static class ArchiveDocument {

			@XmlElement(name = "ArchiveKey", nillable = true)
			protected List<ArchiveKey> archiveKey;

			@XmlAttribute(name = "Type")
			protected String type;

			public List<ArchiveKey> getArchiveKey() {
				if (this.archiveKey == null) {
					this.archiveKey = new ArrayList<ArchiveKey>();
				}
				return this.archiveKey;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String value) {
				this.type = value;
			}

			@XmlAccessorType(XmlAccessType.FIELD)
			@XmlType(name = "", propOrder = { "value" })
			public static class ArchiveKey {

				@XmlValue
				protected String value;

				@XmlAttribute(name = "Keywords")
				protected String keywords;

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}

				public String getKeywords() {
					return this.keywords;
				}

				public void setKeywords(String value) {
					this.keywords = value;
				}
			}
		}
	}
}
