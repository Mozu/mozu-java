package com.mozu.test.framework.helper;

import com.mozu.api.contracts.content.DocumentList;
import com.mozu.api.contracts.content.DocumentType;

public class DocumentGenerator {
	public static DocumentList generateDocumentList(String namespace, String name)
	{
		DocumentList documentList = new DocumentList();
		documentList.setNamespace(namespace);
		documentList.setName(name);
		documentList.setDocumentListType("image");
        return documentList;
    }
	
	public static DocumentType generateDocumentType(String namespace, String typeName)
	{
		DocumentType documentType = new DocumentType();
		documentType.setNamespace(namespace);
		documentType.setName(typeName);
		return documentType;
		
	}
}