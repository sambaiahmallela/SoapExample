package com.samples.domain;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

import com.samples.domain.DAIOptions.Documents.Document.Archive;
import com.samples.service.response.DAIResponse;

@XmlRegistry
public class ObjectFactory {
	private static final QName _DAIOptionsDocumentsDocumentArchive_QNAME = new QName(
			"", "Archive");

	public DAIOptions.Delivery.Fax createDAIOptionsDeliveryFax() {
		return new DAIOptions.Delivery.Fax();
	}

	public DAIOptions.Delivery createDAIOptionsDelivery() {
		return new DAIOptions.Delivery();
	}

	public DAIOptions.Documents createDAIOptionsDocuments() {
		return new DAIOptions.Documents();
	}

	public DAIResponse.Status.DialogueStatus createDAIResponseStatusDialogueStatus() {
		return new DAIResponse.Status.DialogueStatus();
	}

	public DAIResponse.ArchiveInformation createDAIResponseArchiveInformation() {
		return new DAIResponse.ArchiveInformation();
	}

	public DAIOptions.Documents.Document.Archive createDAIOptionsDocumentsDocumentArchive() {
		return new DAIOptions.Documents.Document.Archive();
	}

	public DAIOptions.CallerChannel createDAIOptionsCallerChannel() {
		return new DAIOptions.CallerChannel();
	}

	public DAIResponse.Status.FaxStatus createDAIResponseStatusFaxStatus() {
		return new DAIResponse.Status.FaxStatus();
	}

	public DAIResponse createDAIResponse() {
		return new DAIResponse();
	}

	public DAIResponse.ReturnDocuments.Document.DocumentData createDAIResponseReturnDocumentsDocumentDocumentData() {
		return new DAIResponse.ReturnDocuments.Document.DocumentData();
	}

	public DAIResponse.ArchiveInformation.ArchiveDocument createDAIResponseArchiveInformationArchiveDocument() {
		return new DAIResponse.ArchiveInformation.ArchiveDocument();
	}

	public DAIResponse.Status.StorageStatus createDAIResponseStatusStorageStatus() {
		return new DAIResponse.Status.StorageStatus();
	}

	public DAIResponse.ReturnDocuments.Document createDAIResponseReturnDocumentsDocument() {
		return new DAIResponse.ReturnDocuments.Document();
	}

	public DAIResponse.Status.PrintStatus createDAIResponseStatusPrintStatus() {
		return new DAIResponse.Status.PrintStatus();
	}

	public DAIOptions createDAIOptions() {
		return new DAIOptions();
	}

	public DAIResponse.ArchiveInformation.ArchiveDocument.ArchiveKey createDAIResponseArchiveInformationArchiveDocumentArchiveKey() {
		return new DAIResponse.ArchiveInformation.ArchiveDocument.ArchiveKey();
	}

	public DAIOptions.UserDetails createDAIOptionsUserDetails() {
		return new DAIOptions.UserDetails();
	}

	public DAIOptions.Documents.Document createDAIOptionsDocumentsDocument() {
		return new DAIOptions.Documents.Document();
	}

	public DAIResponse.Status.DAIStatus createDAIResponseStatusDAIStatus() {
		return new DAIResponse.Status.DAIStatus();
	}

	public DAIResponse.ReturnDocuments createDAIResponseReturnDocuments() {
		return new DAIResponse.ReturnDocuments();
	}

	public DAIOptions.Delivery.Email createDAIOptionsDeliveryEmail() {
		return new DAIOptions.Delivery.Email();
	}

	public DAIOptions.WorkflowNotification createDAIOptionsWorkflowNotification() {
		return new DAIOptions.WorkflowNotification();
	}

	public DAIOptions.Package createDAIOptionsPackage() {
		return new DAIOptions.Package();
	}

	public DAIResponse.Status createDAIResponseStatus() {
		return new DAIResponse.Status();
	}

	public DAIResponse.Status.EmailStatus createDAIResponseStatusEmailStatus() {
		return new DAIResponse.Status.EmailStatus();
	}

	@XmlElementDecl(namespace = "", name = "Archive", scope = DAIOptions.Documents.Document.class)
	public JAXBElement<DAIOptions.Documents.Document.Archive> createDAIOptionsDocumentsDocumentArchive(
			DAIOptions.Documents.Document.Archive value) {
		return new JAXBElement<Archive>(_DAIOptionsDocumentsDocumentArchive_QNAME,
				DAIOptions.Documents.Document.Archive.class,
				DAIOptions.Documents.Document.class, value);
	}
}
